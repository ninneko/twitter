<%@page pageEncoding="UTF-8"%>
<%--
pagingNavi という名前で Action から PagingNavigation が取得できることが前提。
とりあえず href に関しては、f:u()ファンクションを利用しない (URLの見た目重視)
--%>
検索結果${f:h(pagingNavi.allRecordCount)}件
<c:if test="${pagingNavi.displayPagingNavi}">
<div class="pagingnavi">
	<c:forEach var="links" items="${pagingNavi.pageNumberLinkList}">
			<span id="pageNumberElement"><s:link href="${f:h(links.pageNumberLinkHref)}">${f:h(links.pageNumberElement)}</s:link></span>
	</c:forEach>
	[${f:h(pagingNavi.currentPageNumber)}/${f:h(pagingNavi.allPageCount)}]
</div>
</c:if>
