<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <h1>Add New Employee</h1>  
       <form:form method="POST" modelAttribute="empcmd" >    
        <table > 
           <tr>    
          <td>Id : </td>   
          <td><form:input path="id"  /></td>  
         </tr>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>
          <td><a href="result.htm">Back</a></td>
          <td><a href="f.htm">Home</a></td>    
         </tr>    
        </table>    
       </form:form>     
