<!DOCTYPE html>
<html lang="ja">
<body>

<h2>${name}のつぶやき</h2>
<table border="1">
  <thead>
    <tr>
      <th>ついいいいいと</th>
      <th>時間</th>
    </tr>
  </thead>
<c:forEach var="tweet" items="${tweetList}">
<tbody>
<tr style="background-color: ${s.index % 2 == 0 ? 'white' : 'lightblue'};">
<td>${tweet.tweetmessage}</td>
<td>${tweet.tweetDatetie}</td>
</tr>
</c:forEach>
</tbody>
</table><br />
<jsp:include page="/common/paging_navi"/>
</body>
</html>