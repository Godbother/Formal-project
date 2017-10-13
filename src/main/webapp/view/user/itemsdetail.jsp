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
<link href="<%=basepath %>css/user_index.css" rel="stylesheet">
<title>后台登录</title>
<style type="text/css">
#num{
	width: 35px;
}
</style>
</head>
<body class="body-fixtop">
<nav class="nav">
	<!--mark1  -->
	<a href="#" class="nav-a">你好</a> <a href="#" class="nav-a">主页</a> <a
		href="#" class="nav-a">我的订单</a> <a href="#" class="nav-right">个人中心</a>
</nav>
<div class="main-box">
	<div  class="left-box">
		<div id="carousel-example-generic" class="carousel slide"
			 data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0"
					class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="../../image/pic1.png" style="height: 500px;width: 500px"
						 alt="First slide">
				</div>

				<div class="item">
					<img src="../../image/pic2.png" style="height: 500px;width: 500px"
						 alt="Second slide">
				</div>
				<div class="item">
					<img src="../../image/pic3.png" style="height: 500px;width: 500px"
						 alt="Third slide">
				</div>
			</div>
			<a class="left carousel-control" href="#carousel-example-generic"
			   role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
		</div>
	</div>

	<div align="right" class="right-box">
		<div class="title">${goods.goods_name}</div>
		<div class="little_title">${goods.goods_comment}</div>
		<div class="pri-parm-do">
			<form class="form" action="<%=basepath%>shopcar/additem.action" method="post">
				<div class="choice-box">
					<div class="ver-choose">
						<span class="glyphicon glyphicon-play"></span>
						版本选择
					</div>
					<div class="ver"><input type="radio" name="version" value="1">标配版</div>
					<div class="ver"><input type="radio" name="version" value="2">高配版</div>
					<div class="ver"><input type="radio" name="version" value="3">尊享版</div>
				</div>
				<div style="clear: both"></div>
				<div class="price">价格：${goods.goods_price}</div>
				<div class="num">
					数量：
					<div class="numchoose">
						<a id="plus">+</a>
						<input onkeyup="this.value=this.value.replace(/\D/g,'')" 
						onafterpaste="this.value=this.value.replace(/\D/g,'')"
						value="1" id="num" name="num">
						<a id="minus">-</a>
					</div>
				</div>
				<hr/>	
				<button type="submit" class="btn-primary">加入购物车</button>
				<input type="hidden" value="${goods.id_goods}" name="gid">
			</form>
		</div>
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