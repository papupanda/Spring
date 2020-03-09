<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:choose>
    <c:when test="${!empty listdto}">
    <table>
    <tr><th>pno</th><th>Patientname</th><th>Age</th><th>Address</th><th>Problem</th><th>Wardno</th><th>Doctor</th></tr>
    <c:forEach var="dto" items="${listdto}">
    <tr>
    <td>${dto.pno}</td>
    <td>${dto.patientname}</td>
    <td>${dto.age}</td>
    <td>${dto.addrs}</td>
    <td>${dto.problem}</td>
    <td>${dto.wardno}</td>
    <td>${dto.doctor}</td>
    </tr>
    </c:forEach>
    </table>
    </c:when>
    <c:otherwise>
    <h1 style="color:red;text-align:center">No record Found</h1>
    </c:otherwise>
    </c:choose>
