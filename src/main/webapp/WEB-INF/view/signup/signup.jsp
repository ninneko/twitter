<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>ユーザー登録</h1>
<html:errors/>
<s:form>
  <table>
    <tr>
      <td>アカウント</td>
      <td><html:text property="account" /></td>
    </tr>
    <tr>
      <td>名前</td>
      <td><html:text property="name" /></td>
    </tr>
    <tr>
      <td>パスワード</td>
      <td><html:password property="password" redisplay="false" /></td>
    </tr>
    <tr>
      <td>
        <html:submit property="entry" value="登録" />
      </td>
    </tr>
  </table>
</s:form>
</body>
</html>