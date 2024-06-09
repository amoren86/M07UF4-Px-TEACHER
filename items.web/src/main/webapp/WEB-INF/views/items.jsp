<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="sections/head.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="sections/header.jsp" />

		<div class="d-flex flex-row g-2">
			<c:forEach var="item" items="${items}">
				<div class="card m-2" style="width: 18rem;">
					<div class="card-body">
						<h5 class="card-title">${item.ref}</h5>
						<h6 class="card-subtitle mb-2 text-body-secondary">${item.name}</h6>
						<p class="card-text">There ${item.availableStock eq 1 ? 'is' : 'are'}
							${item.availableStock gt 0 ? item.availableStock : 'no'}
							items available (max=${item.maxStock})</p>
						<spring:url value="/decreaseStock" var="decreaseStock">
							<spring:param name="ref" value="${item.ref}"></spring:param>
						</spring:url>
						<spring:url value="/increaseStock" var="increaseStock">
							<spring:param name="ref" value="${item.ref}"></spring:param>
						</spring:url>
						<div class="row p-1">
							<a href="${decreaseStock}" class="btn btn-primary">Buy item</a>
						</div>
						<div class="row p-1">
							<a href="${increaseStock}" class="btn btn-primary">Reload item</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
