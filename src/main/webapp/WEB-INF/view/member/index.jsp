<%@page import="java.lang.reflect.Member"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>playSQL</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>会員一覧ページ</h1>

<html:errors/>
<s:form>

<h2>ボタンを押してね</h2>
<input type="submit" name="submit" value="会員一覧表示"/>
</s:form>
<table border="1" >
  <thead>
    <tr>
      <th>ID</th>
      <th>名称</th>
      <th>アカウント</th>
      <th>ステータスコード</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="member" varStatus="s" items="${memberList}">
      <tr style="background-color: ${s.index % 2 == 0 ? 'white' : 'lightblue'};">
        <td> ${member.memberId} </td>
        <td> ${member.memberName} </td>
        <td> ${member.memberAccount} </td>
        <td> ${member.memberStatusCode} </td>
      </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>