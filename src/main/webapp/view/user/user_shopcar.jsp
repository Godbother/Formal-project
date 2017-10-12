<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../../common/header.jsp"></jsp:include>
<link href="<%=basepath %>css/user_shopcar.css" rel="stylesheet">
<title>我的购物车</title>
</head>
<body>
	<nav class="nav">
		<!--mark1  -->
		<a href="#" class="nav-a">主页</a> <a
			href="#" class="nav-a">我的订单</a> <a href="#" class="nav-right">个人中心</a>
	</nav>
	<div class="container theme-showcase">
		<div class="title" align="center">
			我的购物车
		</div>
		<div>
			<span >购物车暂时为空</span>
			<hr>
			<button class="btn btn-danger">清空购物车</button>
			<button class="btn btn-success">下单</button>
		</div>
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
</html>