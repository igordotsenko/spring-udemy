<?xml version="1.0" encoding="UTF-8"?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core">

<body>
    <form:form action="showStudent" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br>
        Last name: <form:input path="lastName"/>
        <br>
        <input type="submit" value="Submit" />
    </form:form>
    </body>
</html>
