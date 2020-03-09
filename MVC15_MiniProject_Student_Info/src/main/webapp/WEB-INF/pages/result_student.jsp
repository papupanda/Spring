<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <body style="background-image: image/school.jpg">
    <c:choose>
    <c:when test="${!empty listdto}">
    <table border="1">
    <caption>All Student Details</caption>
    <tr style="border: color:red;background: color:cyan">
    <td>Sid</td><td>Sname</td><td>Age</td><td>FatherName</td><td>AdharNo</td><td>Address</td><td>PhoneNumber</td><td>Batch</td>
    </tr>
    <c:forEach var="dto" items="${listdto}">
    <tr>
    <td>${dto.sid}</td>
    <td>${dto.sname}</td>
    <td>${dto.age}</td>
    <td>${dto.fathername}</td>
    <td>${dto.adharno}</td>
    <td>${dto.address}</td>
    <td>${dto.phonenumber}</td>
    <td>${dto.batch}</td>
    <td>
    <a href="Student_edit.htm?sid=${dto.sid}"><img  src="image/edit.jpg"/></a>
    &nbsp;&nbsp;&nbsp;
    <a href="Student_Delete.htm?sid=${dto.sid}"><img  src="image/delete.jpg"/></a>
    </td>
    </tr>
    </c:forEach>
    </table>
    </c:when>
    <c:otherwise>
    <h1 style="color:red;text-align:center">No record Found</h1>
    </c:otherwise>
    </c:choose>
    <a href="Insert.htm">Insert Data</a>
    <a href="home.htm">Home</a>
    </body>
