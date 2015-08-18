<%-- 
    Document   : Registration
    Created on : Aug 19, 2015, 1:29:22 AM
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <s:form action="RegistrationAction"  enctype="multipart/form-data" namespace="/">
            <s:label value="First Name:"/>
            <s:textfield name="firstName"></s:textfield>
            <s:label value="Last Name:"/>
            <s:textfield name="lastName"></s:textfield>
            <s:label value="Email:"/>
            <s:textfield name="email"></s:textfield>
            <s:label value="Password:"/>
            <s:password name="password"></s:password>
            <s:label value="Re-type Password:"/>
            <s:password name="repassword"></s:password>
            <s:label value="Address:"/>
            <s:textfield name="address"></s:textfield>
            <s:label value="Age:"/>
            <s:textfield name="age"></s:textfield>
            <s:file name="image" label="Select a file to upload" size="40"/>
            <s:submit value="Sign up" name="submit"/>
            <s:submit value="Show Registration List" name="submit"/>
            
        </s:form>
        <div>  <s:property value="message"/> </div>
    </body>
</html>
