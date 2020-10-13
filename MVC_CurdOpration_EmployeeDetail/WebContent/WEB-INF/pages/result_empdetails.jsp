<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2" >  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${listdto}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.salary}</td>  
   <td>${emp.designation}</td>  
   <td><a href="edit.htm?id=${emp.id}" title="edit">Edit</a></td>  
   <td><a href="delete.htm?id=${emp.id}" title="delete">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  <b><a href="home.htm">Add New Employee Detail</a></b><br>
  <b><a href="f.htm">Home</a></b>  