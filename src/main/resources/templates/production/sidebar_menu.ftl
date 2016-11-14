<!-- 主页面的左边菜单 -->
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
  <div class="menu_section">
    <h3>接口信息查询</h3>
    <ul class="nav side-menu">
      <li><a><i class="fa fa-tasks"></i> 项目一览 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
        <#list projects as project>
        	<li><a href="index.html?prjid=${project.projectId}">${project.projectName}</a></li>
        </#list>
        </ul>
      </li>
      <li><a><i class="fa fa-edit"></i> 数据查询 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="/door/queryinfo">店铺基本信息</a></li>
          <li><a href="#">其他查询</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-bar-chart-o"></i> 数据分析 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="echarts.html">接口数据分析</a></li>
        </ul>
      </li>
    </ul>
  </div>
  <div class="menu_section">
    <h3>后台操作</h3>
    <ul class="nav side-menu">
      <li><a><i class="fa fa-tasks"></i> 项目信息维护 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="/door/projects">项目信息一览</a></li>
          <li><a href="/door/addProjects">增加项目</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-laptop"></i> 接口信息维护 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
          <li><a href="page_403.html">接口信息一览</a></li>
          <li><a href="page_404.html">增加接口</a></li>
        </ul>
      </li>
      <li><a><i class="fa fa-eye"></i> UMP监控信息维护 <span class="fa fa-chevron-down"></span></a>
        <ul class="nav child_menu">
            <li><a href="#level1_1">UMP监控信息一览</a>
            <li><a href="#level1_2">增加UMP监控</a>
            </li>
        </ul>
      </li>
      <li><a href="javascript:void(0)"><i class="fa fa-user"></i> 用户信息维护 <span class="label label-success pull-right">Coming Soon</span></a></li>
    </ul>
  </div>

</div>
