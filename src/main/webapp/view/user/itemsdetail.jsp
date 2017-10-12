<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body class="body-fixtop">
	<nav class="nav">
		<!--mark1  -->
		<a href="#" class="nav-a">你好</a> <a href="#" class="nav-a">主页</a> <a
			href="#" class="nav-a">我的订单</a> <a href="#" class="nav-right">个人中心</a>
	</nav>

	<div>
		<div class="tubiao">
			<img src="../../image/logo.jpg" class="img-patt">
		</div>
		<div>
			<div class="search-m">
				<div class="search">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="请输入搜索的商品">
						<span class="input-group-btn">
							<button class="btn btn-default" type="button">
								<span class="glyphicon glyphicon-search"></span>搜索
							</button>
						</span>
					</div>
				</div>
			</div>

			<div class="shopcar-icon">
				<div class="shopcar-icon-btn">
					<span class="glyphicon glyphicon-shopping-cart"></span> <a
						id="shopcar-a" href="#">我的购物车</a>
				</div>
			</div>

			<div class="hot-title">
				<a href="#" class="act">华硕Y481</a> <a href="#" class="act">IPad MiNi</a> <a
					href="#" class="act">华为荣耀4X</a>
			</div>
		</div>
		
		<div class="daohang">
			<div class="masthead">
				<nav>
					<ul class="nav nav-justified daohang_item">
						<li><a href="#" class="act">推荐</a></li>
						<li><a href="#" class="act">热门手机</a></li>
						<li><a href="#" class="act">热门平板</a></li>
						<li><a href="#" class="act">热门电脑</a></li>
					</ul>
				</nav>
			</div>
		</div>
		<div class="sec">
			<!--第一列，分类菜单  -->
			<div class="fir_col">
				<ul class="cate-menu">
					<li class="cate-menu-item"><span
						class="glyphicon glyphicon-chevron-right"></span>手机</li>
					<li class="cate-menu-item"><span
						class="glyphicon glyphicon-chevron-right"></span>笔记本</li>
					<li class="cate-menu-item"><span
						class="glyphicon glyphicon-chevron-right"></span>平板电脑</li>
					<li class="cate-menu-item"><span
						class="glyphicon glyphicon-chevron-right"></span>台式电脑</li>
					<li class="cate-menu-item"><span
						class="glyphicon glyphicon-chevron-right"></span>在线服务</li>
				</ul>
			</div>

			<!--隐藏部分，子菜单  -->
			<div class="nextmenu" id="nextmenu">本区域暂未开放</div>

			<!--轮播已修复  -->
			<div class="sec-col">
				<!--图片轮播  -->
				<div class="big-pic">
					<div id="carousel-example-generic" class="carousel slide standerd"
						data-ride="carousel">
						<!-- 换图按钮 -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0"
								class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>

						<!-- 图片部分，带滑动 -->
						<div class="carousel-inner standerd" role="listbox">
							<div class="item active">
								<img src="../../image/" alt="...">
							</div>
							<div class="item">
								<img src="../../image/" alt="...">
							</div>
							<div class="item">
								<img src="../../image/" alt="...">
							</div>
						</div>

						<!-- 控制器 -->
						<a class="left carousel-control" href="#carousel-example-generic"
							role="button" data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span>
						</a> <a class="right carousel-control"
							href="#carousel-example-generic" role="button" data-slide="next">
							<span class="glyphicon glyphicon-chevron-right"
							aria-hidden="true"></span> <span class="sr-only">Next</span>
						</a>
					</div>
				</div>

				<div class="hot-image">
					<div class="left_img">
						<img alt="../../image/test1.jpg" src="../../image/test1.jpg"
							class="standerd" id="img-left">
					</div>
					<div class="right_img">
						<img alt="../../image/test2.jpg" src="../../image/test2.jpg"
							class="standerd" id="img-right">
					</div>
				</div>
			</div>

			<div class="thir-col">
				<div class="message">
					<div class="user_info">
						<div class="user_img_box">
							<img alt="x" src="../../image/tubiao.jpg" class="user_img">
						</div>
						<div class="user_img_box">
							<!--mark2  -->
							<div class="hello_text">hi,</div>
							<div class="user_do">
								<!--尚未定义a标签样式  -->
								<a class="login">注销用户</a>
							</div>
						</div>

					</div>
					<div class="user_choise">
						<a class="choise">新人福利</a> <a class="choise">充值会员</a>
					</div>
				</div>
				<div class="panel panel-primary hot-news">
		            <div class="panel-heading">
		              <h3 class="panel-title">公告</h3>
		            </div>
		            <div class="panel-body">
		              	本站建设中，暂无更多信息
		            </div>
	          	</div>
				<div class="more-servers">
					<div class="">本位暂空</div>
				</div>
			</div>
		
		</div>
		
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
<script type="text/javascript">
	$("li.cate-menu-item").mouseenter(function() {
		$("#nextmenu").show();
	});
	$("li.cate-menu-item").mouseleave(function() {
		$("#nextmenu").hide();
	});

	$("#img-left").click(function() {
		location.href = "#";
	});
	$("#img-right").click(function() {
		location.href = "#";
	});
</script>
</html>