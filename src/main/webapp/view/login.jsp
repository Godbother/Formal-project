<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<jsp:include page="../common/header.jsp"></jsp:include>
<link href="<%=basepath %>css/user_login.css" rel="stylesheet">
<title>登录页</title>
</head>
<body>
	<div class="container bg-log">

		<form class="form-signin">
			<h2 class="form-signin-heading" align="center">请登录</h2>
			<label for="inputUsername" class="sr-only">用户名</label> <input
				type="email" id="inputUsername" class="form-control"
				placeholder="请输入用户名" required autofocus> <label
				for="inputPassword" class="sr-only">密码</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
					<b>记住我</b>
				</label> <label> <a href="#"><b>没有账号？点我注册</b></a>
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>

	</div>
	<!-- /container -->
	<div class="homebox">
		<img alt="home" src="../image/home1.png" id="home" class="home">
	</div>
</body>
<jsp:include page="../common/footer.jsp"></jsp:include>
</html>