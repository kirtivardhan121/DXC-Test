<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<html>
	<head>
		<title>Library Items</title>
	</head>
	<body>
		<h2>Library Management- Books List</h2>
		<hr />
		
		<c:choose>
			<c:when test="${books eq null }">
				<p><strong>No Books Found!</strong></p>
			</c:when>
			<c:when test="${books.size() eq 0 }">
				<p><strong>No Books Found!</strong></p>
			</c:when>
			<c:otherwise>
				<table border="1" width="100%">
					<tr>
						<th>Book Code</th>
						<th>Book Name</th>
						<th>Book Price</th>
						<th>Date Of Package</th>
						<th>Action</th>
					</tr>
					<c:forEach items="${books }" var="book">
						<tr>
						<td>${book.bcode }</td>
						<td>${book.bname }</td>
						<td>${book.price }</td>
						<td>${book.packageDate }</td>
						<td><a href="deleteBook?bcode=${book.bcode }">Delete</a></td>
					</tr>
					</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
	</body>
</html>