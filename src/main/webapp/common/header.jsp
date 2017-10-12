<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<%
	String path = request.getContextPath();
	String basepath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="public-html-header">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="author" content="Fei">
    <link href="<%=basepath %>public/css/bootstrap.min.css" rel="stylesheet">
	<link href="<%=basepath %>public/css/signin.css" rel="stylesheet">
	<link href="<%=basepath %>public/css/bootstrap-theme.min.css"
		rel="stylesheet">
	<link href="<%=basepath %>public/css/ie10-viewport-bug-workaround.css"
		rel="stylesheet">
	<link href="<%=basepath %>public/css/theme.css" rel="stylesheet">
	<script src="<%=basepath %>public/js/ie-emulation-modes-warning.js"></script>
	<link href="<%=basepath %>public/css/dashboard.css" rel="stylesheet">
