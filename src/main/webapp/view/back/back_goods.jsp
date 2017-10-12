<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../../common/header.jsp"></jsp:include>
<link href="<%=basepath %>css/back_index.css" rel="stylesheet">
<style type="text/css">
.main{
	background-color: white;
	height: 530px;
	z-index: 99;
	left: 320px;
	position: absolute;
	width: 83%;
}
</style>
<title>首页</title>
</head>
<body>
	<body class="body-fixtop">
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">京北后台管理系统</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">管理员:XX在线</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<input type="text" class="form-control" placeholder="搜索">
				</form>
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li><a href="<%=basepath %>view/back/back_index.jsp">后台系统首页<span class="sr-only">(current)</span></a></li>
					
					<li><a href="#" data-toggle="collapse"
						data-target="#user-charge" id="usercharge">用户管理</a></li>
					<div class="collapse" id="user-charge">
						<ul class="list-group">
							<li class="list-group-item">
								<button class="menu-item-left" data-target="#">
									<span class="glyphicon glyphicon-triangle-right"></span>
									<a href="<%=basepath %>user/getlist.action">用户列表</a>
								</button>
							</li>
						</ul>
					</div>
					
					<li><a href="#" data-toggle="collapse"
						data-target="#orders-charge">订单管理</a></li>
					<div class="collapse" id="orders-charge">
						<ul class="list-group">
							<li class="list-group-item">
								<button class="menu-item-left" data-target="#">
									<span class="glyphicon glyphicon-triangle-right"></span>
									<a href="<%=basepath %>order/getlist.action">全订单列表</a>
								</button>
							</li>
						</ul>
					</div>	
					
					<li><a href="#" data-toggle="collapse"
						data-target="#goods-charge">商品管理</a></li>
					<div class="collapse" id="goods-charge">
						<ul class="list-group">
							<li class="list-group-item">
								<button class="menu-item-left" data-target="#">
									<span class="glyphicon glyphicon-triangle-right"></span>
									<a href="<%=basepath %>goods/getlist.action">商品列表</a>
								</button>
								<br/>
								<button class="menu-item-left" data-target="#">
									<span class="glyphicon glyphicon-triangle-right"></span>
									<a href="#">新增商品</a>
								</button>
							</li>
						</ul>
					</div>	
					
					<li><a href="#">管理员信息</a></li>
					
					
				</ul>
			</div>
		
			<div class="main">
				<div>
					<table border="1" id="maintable">
						<tr>
							<th>id</th>
							<th>商品名</th>
							<th>商品图</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${goodslist }" var="item">
							<tr>
								<th>${item.id_goods }</th>
								<th>${item.goods_name }</th>
								<th>
									<c:if test="${ item.goods_image!=null}">
										是
									</c:if>
									<c:if test="${ item.goods_image==null}">
										否
									</c:if>
								</th>
								<th><button id="info">详细</button>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
<script type="text/javascript">
</script>
</html>