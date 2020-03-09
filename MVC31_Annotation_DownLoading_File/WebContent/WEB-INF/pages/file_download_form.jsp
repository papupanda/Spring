<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <h1 style="color:red;text-align: center">Choose File Download</h1>
    <c:choose>
    <c:when test="${!empty Listfiles}">
    <table border="1" width="100" height="100" style="background:blue;" >
    <c:forEach var="file" items="${Listfiles}">
    <tr>
    <th>name</th>
    <th>operation</th>
    <td>${file}</td>
     <td><a href="download.htm?file=${file}">download</a> </td>
    </tr>
    </c:forEach>
    </table>
    </c:when>
    <c:otherwise>
     <h1>No files found to download</h1> 
    </c:otherwise>
    </c:choose>
