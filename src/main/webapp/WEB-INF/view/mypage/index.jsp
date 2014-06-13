<!DOCTYPE html>
<html lang="ja">
<body>

<h2>My page</h2>
${memberDto.memberId}
<table border="1">
  <thead>
    <tr>
      <th>ID</th>
      <th>名称</th>
      <th>アカウント</th>
      <th>ついいいいいと</th>
    </tr>
  </thead>
<c:forEach var="tweet" items="${tweetList}">
<tbody>
<tr style="background-color: ${s.index % 2 == 0 ? 'white' : 'lightblue'};">
<td>${tweet.member.memberid}</td>
<td>${tweet.member.membername}</td>
<td>${tweet.member.memberaccount}</td>
<td>${tweet.tweetmessage}</td>
</tr>
</c:forEach>
</tbody>
</table><br />
</body>
</html>