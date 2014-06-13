<%@page import="java.lang.reflect.Member"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Sgin Up</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<input name="add" value="登録"/>
<table border="1" >
  <tr>
    <th></th>
    <td><html:text property="account" /></td>
  </tr>
  <tr>
    <th></th>
    <td><html:text property="name" /></td>
  </tr>
  <tr>
    <th></th>
    <td><html:text property="password" /></td>
  </tr>
  <tr>
    <th></th>
    <td><html:text property="passwordConfirm" /></td>
  </tr>
</table>

</body>
</html>