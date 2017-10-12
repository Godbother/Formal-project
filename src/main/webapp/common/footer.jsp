<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
	<script src="<%=basepath %>public/jquery/jquery.min.js"></script>
    <script src="<%=basepath %>public/js/bootstrap.min.js"></script>
    <script src="<%=basepath %>public/js/docs.min.js"></script>
    <script src="<%=basepath %>public/js/ie10-viewport-bug-workaround.js"></script>
<body>
</body>
</html>