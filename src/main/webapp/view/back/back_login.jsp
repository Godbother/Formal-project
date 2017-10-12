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
<link href="<%=basepath %>css/back_login.css" rel="stylesheet">
<title>后台登录</title>
</head>
<body>
	<div class="container bg-log">

		<form class="form-signin">
			<h2 class="form-signin-heading warmcolor" align="center">后台系统登录</h2>
			<label for="inputUsername" class="sr-only">用户名</label> <input
				type="email" id="inputUsername" class="form-control"
				placeholder="请输入管理员账户" required autofocus> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>

	</div>
	
	<div class="homebox">
		<img alt="home" src="../../image/home1.png" id="home" class="home">
	</div>
</body>
<jsp:include page="../../common/footer.jsp"></jsp:include>
<script type="text/javascript">
	$("#home").click(function(){
		location.href = "#";
	})
</script>
</html>