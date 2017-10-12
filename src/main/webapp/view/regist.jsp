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
<jsp:include page="../common/header.jsp"></jsp:include>
<title>注册页</title>
<link href="<%=basepath %>css/user_regist.css" rel="stylesheet">
</head>
<body>
	<div class="container bg-log">

		<form class="form-signin">
			<h2 class="form-signin-heading" align="center">注册账号</h2>
			<label for="inputUsername" class="sr-only">用户名</label> <input
				type="text" id="inputUsername" class="form-control"
				placeholder="请输入手机号" required autofocus> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required> <label for="inputPassword1"
				class="sr-only">确认密码</label> <input type="password" id="inputPassword1"
				class="form-control" placeholder="请再输入密码" required>
				<div class="check" id="checkbox">
					<span class='glyphicon glyphicon-pencil'></span><b>请正确输入用户名!</b>
				</div>
			<div class="checkbox" align="center">
				<label> 
					<a href="#"><b>已有账号，点我登录</b></a>
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block disabled" type="submit" id="btn-reg">注册</button>
		</form>

	</div>
	<!-- /container -->
	<div class="homebox">
		<img alt="home" src="../image/home1.png" id="home" class="home">
	</div>
</body>
<jsp:include page="../common/footer.jsp"></jsp:include>
<script type="text/javascript">
	$("#inputPassword1").blur(function(){
		var p1 = $("#inputPassword").val();
		var p2 = $("#inputPassword1").val();
		if(p1 != p2){
			$("#checkbox").html("<span class='glyphicon glyphicon-pencil'></span><b>两次输入密码不一致!</b>");
			$("#checkbox").show();
		}else{
			$("#checkbox").hide();
			$("#btn-reg").removeClass("disabled");
		}
	})
	
	
	$("#inputUsername").blur(function(){
		var name = $("#inputUsername").val();
		if(!/^1\d{10}$/.test(name)){
			$("#checkbox").html("<span class='glyphicon glyphicon-pencil'></span><b>请正确输入用户名!</b>");
			$("#checkbox").show();
		}else{
			$("#checkbox").hide();
		}
	})
	
</script>
</html>