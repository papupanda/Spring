<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <h1>Add Contact</h1> 
       <form:form method="POST" modelAttribute="pbc" >    
        <table >     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /><form:errors path="name" cssStyle="color:red"/></td>  
         </tr>    
         <tr>    
          <td>Email :</td>    
          <td><form:input path="email" /><form:errors path="email" cssStyle="color:red"/></td>  
         </tr>   
         <tr>    
          <td>PhoneNumber :</td>    
          <td><form:input path="phonenumber" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>
         </tr>    
        </table>    
       </form:form>
       <b><a href="fetch.htm">View All Contacts</a></b>
       <h1 style="color:red">${resultmsg}</h1>     
    