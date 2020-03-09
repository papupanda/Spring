<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${!empty listjobs }">
<table>
<tr><th>NO</th><th>NAME</th><th>Address</th><th>AGE</th><th>SKILL</th><th>EXPERINCE</th><th></th>LOCATION</tr>
<c:forEach var="dto" items="${listjobs }">
<tr>
<td>${dto.no}</td>
<td>${dto.name}</td>
<td>${dto.addrs }</td>
<td>${dto.age }</td>
<td>${dto.skill}</td>
<td>${dto.experience}</td>
<td>${dto.location }</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">No record Found</h1>
</c:otherwise>
</c:choose>