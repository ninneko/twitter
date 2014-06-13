<!DOCTYPE html>
<html lang="ja">
<body>

<h2>login</h2>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
<s:form>
<input type="submit" name="login" value="登録" />
<table border="1" >
  <tr>
    <th>pixy</th>
    <td><html:text property="account" /></td>
  </tr>
  <tr>
    <th>aaa</th>
    <td><html:text property="password" /></td>
  </tr>
</table>
</s:form>
</body>
</html>