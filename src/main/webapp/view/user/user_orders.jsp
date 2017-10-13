<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link href="<%=basepath %>css/user_orders.css" rel="stylesheet">
<title>我的订单</title>
</head>
<body>
	<nav class="nav">
		<!--mark1  -->
		<a href="#" class="nav-a">主页</a> <a
			href="#" class="nav-a">我的订单</a> <a href="#" class="nav-right">个人中心</a>
	</nav>
	<div class="container theme-showcase">
		<div class="title" align="center">
			我的订单
		</div>
		<div>
			<div class="col-md-2 col-lg-2 standerd">订单号</div>
			<div class="col-md-5 col-lg-5 standerd">总价</div>
			<div class="col-md-5 col-lg-5 standerd">操作</div>
			<hr/>
			<c:forEach items="orderlist" var="item">
				<div class="col-md-2 col-lg-2 standerd">${item.id_orders}</div>
				<div class="col-md-5 col-lg-5 standerd">${item.orders_countprice}</div>
				<div class="col-md-5 col-lg-5 standerd">
					<button class="btn btn-danger">删除</button>
					<button class="btn btn-primary">详细</button>
				</div>
			</c:forEach>
			<span >订单暂时为空</span>
			<hr>
			<!-- <button class="btn btn-danger">清空购物车</button>
			<button class="btn btn-success">下单</button> -->
		</div>
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
</html>