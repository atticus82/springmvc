<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	<c:choose>
		<c:when test="${not empty springException}">
			<h1>${springException.errCode}: System Errors</h1>
			<h4>${springException.errMsg}</h4>
		</c:when>
		<c:otherwise>
			<h1>${errMsg}</h1>
		</c:otherwise>
	</c:choose>

</body>
</html>