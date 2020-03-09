<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>PhoneBook List</h1>  
<table border="2" width="70%" cellpadding="2" >  
<tr><th>SNO</th><th>Name</th><th>Email</th><th>email</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="phone" items="${listdto}">   
   <tr>  
   <td>${phone.sno}</td>  
   <td>${phone.name}</td>  
   <td>${phone.email}</td>  
   <td>${phone.phonenumber}</td>  
   <td><a href="edit.htm?sno=${phone.sno}" title="edit">Edit</a></td>  
   <td><a href="delete.htm?sno=${phone.sno}" title="delete">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/> 
   <b><a href="insert.htm">Home</a></b> 
   <h1 style="color:red">${resultMsg}</h1> 
   <h1 style="color:red">${ resultMsgdelete }</h1> 
     
 
