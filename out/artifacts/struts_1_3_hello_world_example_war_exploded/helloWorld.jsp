<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1><bean:write name="helloWorldForm" property="greeting" /></h1>

<form role="form" action="/do/testAction" method="post">
    <button value="submit" type="submit" class="btn btn-primary">Go to the TestPage</button>
</form>
</body>
</html>