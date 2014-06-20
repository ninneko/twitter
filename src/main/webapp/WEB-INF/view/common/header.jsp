<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<% jp.bizreach.twitter.app.dto.MemberDto m = (jp.bizreach.twitter.app.dto.MemberDto)session.getAttribute("memberDto"); %>

<c:if test="${memberDto.memberId == null}" var="flg" />

<c:if test="${flg}" >
<ul id="gNavi">
    <li>ログインしてましぇーん</li>
    <li><a href="${f:url('/login')}">ログイン</a></li>
    <li><a href="#">当サイトについて</a></li>
    <li><a href="#">リンク集</a></li>
    <li><a href="#">お問い合わせ</a></li>
</ul>
</c:if>


<c:if test="${!flg}">
<ul id="gNavi">
    <li>ログインしてまーす</li>
    <li><a href="${f:url('/logout')}">ログアウト</a></li>
    <li><a href="#">当サイトについて</a></li>
    <li><a href="#">リンク集</a></li>
    <li><a href="#">お問い合わせ</a></li>
</ul>
</c:if>

<%= m.memberId %><br />


<!--
omoide
${sessionScope.memberDto.memberId}
-->

${memberDto.memberId }
${memberDto}
<br />