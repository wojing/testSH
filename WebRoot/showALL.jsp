<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s"	uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>产品列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  		
  <body>
  	<center>
  		<h2>产品列表</h2>
  		<table border="1">
  				<tr>
  					<td>产品ID </td>
  					<td>产品名称</td>
  					<td>产品价格</td>
  					<td>是否删除</td>
  					<td>是否更新</td>
  				</tr>
  				<s:iterator value="#request.all" id="product">
  				<tr>
  					<td><s:property value="#product.id"/></td>
  					<td><s:property value="#product.name"/></td>
  					<td><s:property value="#prodct.price"/></td>
  					<td><a href="delete.action?id=<s:property value='#product.id'/>">删除</a></td>
  					<td><a href="update.jsp?id=<s:property value='#product.id'/>">更新</a></td>
  				</tr>
  				</s:iterator>
  				
  		</table>
  		<a href="add.jsp">添加产品</a>
  	</center>
  </body>
</html>
