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
			<div class="col-md-1 col-lg-1 standerd">ID</div>
			<div class="col-md-4 col-lg-4 standerd">商品名</div>
			<div class="col-md-1 col-lg-1 standerd">数量</div>
			<div class="col-md-3 col-lg-3 standerd">价格</div>
			<div class="col-md-3 col-lg-3 standerd">操作</div>
			<hr/>
			<c:if test="${shopcarlist }==null">
				<span>购物车暂无商品</span>
			</c:if>
			<c:if test="${shopcarlist }!=null">
				<c:forEach items="shopcarlist" var="item">
					<div class="col-md-1 col-lg-1 standerd">${item.id_shopcar}</div>
					<div class="col-md-4 col-lg-4 standerd">${item.shopcar_itemname}</div>
					<div class="col-md-1 col-lg-1 standerd">
						<a id="plus">+</a>
						<input onkeyup="this.value=this.value.replace(/\D/g,'')" 
						onafterpaste="this.value=this.value.replace(/\D/g,'')"
						value="${item.shopcar_itemnum}" id="num" name="num">
						<a id="minus">-</a>
					</div>
					<div class="col-md-3 col-lg-3 standerd">${item.shopcar_itemprice}</div>
					<div class="col-md-3 col-lg-3 standerd">
						<button class="btn btn-danger">删除</button>
						<button class="btn btn-primary">详细</button>
					</div>
				</c:forEach>
			</c:if>
			<hr/>
			<button class="btn btn-danger">清空购物车</button>
			<button class="btn btn-success">下单</button>
		</div>
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
<script type="text/javascript">
$("#plus").click(function(){
	  var old = $("#num").val();
	  var news = parseInt(old) + 1;
	  $("#num").val(news);
});
$("#plus").css("cursor","pointer").click(function(){});
$("#minus").css("cursor","pointer").click(function(){});
$("#num").change(function(){
	var now = $("#num").val();
	if(parseInt(now)>999||parseInt(now)<=0){
		alert("数量不合法");
		$("#num").val("1");
	}
})
$("#minus").click(function(){
	  var old = $("#num").val();
	  if(parseInt(old)==1){
		  alert("已到最低值")
	  }else{
		  var news = parseInt(old) - 1;
		  $("#num").val(news);
	  }
});
</script>
</html>