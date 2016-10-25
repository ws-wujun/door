package com.jd.nj.shop.door.service.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.nj.shop.door.service.internal.model.ShopDetailInfo;

public class HttpUtils {

	public static final String REQUEST_PARAM_ERROR = "PARAM ERROR";
	public static final String REQUEST_ERROR = "ERROR";

	public static String get(String url, Map<String, String> params) {
		if (StringUtils.isEmpty(url) || CollectionUtils.isEmpty(params)) {
			return REQUEST_PARAM_ERROR;
		}

		/*
		 * 处理url，参数放在了params中了。key为参数名，value为参数值。 需要把param进行encode。
		 */
		StringBuilder sb = new StringBuilder();
		int paramSize = 0;
		for (String key : params.keySet()) {
			if (paramSize > 0) {
				sb.append("&");
			}
			String value = params.get(key);
			sb.append(key);
			sb.append("=");
			try {
				sb.append(URLEncoder.encode(value, "utf-8"));
				paramSize++;
			} catch (UnsupportedEncodingException e) {
				// TODO log
				e.printStackTrace();
				return REQUEST_PARAM_ERROR;
			}
		}

		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet(url + "?" + sb.toString());
			System.out.println("Executing request " + httpget.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				@Override
				public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity, "utf-8") : null;
					} else {
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				}
			};

			String responseBody = httpclient.execute(httpget, responseHandler);
			return responseBody;
		} catch (Exception e) {
			// TODO log
			e.printStackTrace();
			return REQUEST_ERROR;
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				// TODO log
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		String url = "http://shopbeta.m.jd.care/getShopDetail";
		Map<String,String> params = new HashMap<String,String>();
		params.put("body", "{\"shopId\":\"74608\"}");
		String result = HttpUtils.get(url, params);
		System.out.println(result);
		
		Map<String,Object> map = (Map<String,Object>) JSON.parseObject(result, Map.class);
		System.out.println("code = " + map.get("code"));
		JSONObject jsonObj = (JSONObject) map.get("result");
		System.out.println(jsonObj.toString());
		ShopDetailInfo info = (ShopDetailInfo) JSON.parseObject(jsonObj.toString(), ShopDetailInfo.class);
		System.out.println("result=" + info.getVenderId());
	}
	
}
