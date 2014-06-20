<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

aaaaaaa<br />
<table border=1 cols="80">
<tr>
<td colspan=2 nowrap><b>リクエストのオブジェクト一覧</b></td>
</tr>
<tr>
<td><b>name</b></td><td><b>中身</b></td>
</tr>
<%for(java.util.Enumeration ite = request.getParameterNames();
ite.hasMoreElements(); ){
String name = (String)ite.nextElement();
%>
<tr>
<td><%=name%></td>
<td> <%=request.getParameter(name)%></td>
</tr>
<%}%>
</table>
<br>
<table border=1 cols="80">
<tr>
<td colspan=2 nowrap><b>セッションのオブジェクト一覧</b></td>
</tr>
<tr>
<td><b>name</b></td><td><b>中身</b></td>
</tr>
<%for(java.util.Enumeration ite = session.getAttributeNames();
ite.hasMoreElements(); ){
String name = (String)ite.nextElement();
%>
<tr>
<td><%=name%></td>
<td> <%=session.getAttribute(name)%></td>
</tr>
<%}%>
</table>
<br>
<table border=1 cols="80">
<tr>
<td colspan=2 nowrap><b>Cookie一覧</b></td>
</tr>
<tr>
<td><b>name</b></td>
<td><b>Value</b></td>
<td><b>Age</b></td>
</tr>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null){
for (java.util.Iterator ite = java.util.Arrays.asList(cookies).iterator();
ite.hasNext();) {
Cookie cookie = (Cookie) ite.next();
String name = cookie.getName();
String value = cookie.getValue();
String age = cookie.getMaxAge() + "";
%>
<tr>
<td><%=name%></td>
<td> <%=value%></td>
<td> <%=age%></td>
</tr>
<%}%>
</table>
<%}%>
<br />
<br />
<% jp.bizreach.twitter.app.dto.MemberDto m = (jp.bizreach.twitter.app.dto.MemberDto)session.getAttribute("memberDto"); %>
<%= m.memberId %>
