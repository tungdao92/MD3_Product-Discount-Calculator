<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/convert" method="post">
    <label>Product Description: </label><br>
    <input type="text" name="description" placeholder="DESCRIPTION"><br>
    <label>List Price: </label><br>
    <input type="text" name="listPrice" placeholder="PRICE"><br>
    <label>Discount Percent: </label><br>
    <input type="text" name="discountPercent" placeholder="DISCOUNT" ><br>
    <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>
