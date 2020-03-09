<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form method="POST" modelAttribute="phb">    
        <table >    
        <tr>  
        <td>SNO</td>    
         <td><form:input path="sno" disabled="true"/></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>EMAIL:</td>    
          <td><form:input path="email" /></td>  
         </tr>   
         <tr>    
          <td>PHONENUMBER:</td>    
          <td><form:input path="phonenumber" /></td>  
         </tr>   
           
         <tr>      
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form> 
       <b><a href="fetch.htm">Back</a></b><br>
       <b><a href="insert.htm">Home</a></b>   
    
