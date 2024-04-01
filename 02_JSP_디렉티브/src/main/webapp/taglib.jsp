<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
   for(int k =1 ; k<=10; k++){%>
      <span style="color:blue;"><%= k %></span>
   <% }
%>


<hr>

<%-- WEB-INF > lib : jstl-xxx-impl.jar 라이브러리 추가 --%>
   <c:forEach var="k" begin="1" end="10" step="1">
      <span style="color:red;">${k}</span>
      <c:out value="${k}"></c:out>
   </c:forEach>
