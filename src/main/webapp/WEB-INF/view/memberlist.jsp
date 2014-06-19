<!DOCTYPE html>
<html lang="ja">
<head>
<link rel="stylesheet" type="text/css" href="${f:url("/css/sa.css")}">
<script type="text/javascript" src="${f:url("/js/jquery-1.4.4.min.js")}"></script>
<script type="text/javascript" src="${f:url("/js/readmore.js")}"></script>
</head>
<body>

<h2>hhh</h2>
<table border="1">
  <thead>
    <tr>
      <th>ID</th>
      <th>名前</th>
    </tr>
  </thead>
<tbody id="contents">
<!--
<c:forEach var="member" items="${beanList}">
	<tr style="background-color: ${s.index % 2 == 0 ? 'white' : 'lightblue'};">
		<td>${member.memberId}</td>
		<td><s:link href="/${member.memberaccount}">${member.memberName}</s:link></td>
	</tr>
</c:forEach>
-->
</tbody>
<!--
<jsp:include page="./common/paging_navi.jsp"/>
-->
</table>
<p id='read-more'>もっと見る<p>
</body>
</html>