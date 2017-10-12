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
<link href="<%=basepath %>css/user_message.css" rel="stylesheet">
<title>后台登录</title>
</head>
<body>
	<nav class="nav">
		<!--mark1  -->
		<a href="#" class="nav-a">主页</a> <a href="#" class="nav-a">我的订单</a> <a
			href="#" class="nav-right">个人中心</a>
	</nav>
	<div class="container theme-showcase">
		<div class="user_info">
			<div class="user_img">
				<img alt="xxx" src="../../image/tubiao.jpg" class="standerd">
			</div>
			<div class="user_detail">
				<div class="user_name">你好，普通用户</div>
				<div class="user_service">
					<div class="service_list">
						<div class="list_item">
							<span class="glyphicon glyphicon-user"></span><br />
							<span>我的订单</span>
						</div>
						<div class="list_item">
							<span class="glyphicon glyphicon-shopping-cart"></span><br />
							<span>我的小车</span>
						</div>
						<div class="list_item">
							<span class="glyphicon glyphicon-bell"></span><br />
							<span>更多服务</span>
						</div>
						<div class="list_item">
							<span class="glyphicon glyphicon-user"></span><br />
							<span>独立开发</span>
						</div>
						<div class="list_item">
							<span class="glyphicon glyphicon-heart"></span><br />
							<span>流程娴熟</span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="sec_row">
			<div class="user_ads">
				<span>默认地址：XXXX</span>
				<button class="btn btn-warning pull-right mybtn" data-toggle="modal" data-target="#myModal">修改地址</button>
			</div>
		</div>

		<!-- Modal模态框 -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">默认地址修改</h4>
					</div>
					<div class="modal-body">
						<label></label>
						新地址：<input type="text">
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary">保存</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
</html>