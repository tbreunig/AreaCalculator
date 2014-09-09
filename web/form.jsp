<%-- 
    Document   : form
    Created on : Sep 8, 2014, 5:37:02 PM
    Author     : Tyler
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Calculator </title>
    </head>
    <body>
        <h1>Shape Calculators</h1>
        <form id="form1" name="form1" method="POST" action="AreaCalculator">
            <p>Choose your calculator from the list below...<p>
            <p>Calculate Area of:
                <!-- the name attribute is set to 'color' which is the
                     parameter to be retrieved by the servlet -->
                <select id="shapes" name="shapes" size ="1">
                    <option value="rectangle"> Rectangle </option>
                    <option value="circle">Circle</option>
                    <option value="triangle">Triangle</option>
                </select>
            </p>

            <p>Rectangle Height:<input type="text" name="rectangleHeight"></p>
            <p>Rectangle Width:<input type="text" name="rectangleWidth"></p>

            <p>Circle Radius:<input type="text" name="cirlceRadius"></p>
          
            <p>Triangle Base:<input type="text" name="triangleBase"></p>
            <p>Triangle Height:<input type="text" name="triangleHeigth"></p>
            
            <center>
                <input id="shapeSubmit" name="shapeSubmit" type="submit" value="Calculate Area">
            </center>
        </form>
        
        <c:out value="${rectangleResults}" default=""></c:out>
        <c:out value="${circleResults}" default=""></c:out>
        <c:out value="${triangleResults}" default=""></c:out>
        
    </body>
</html>
