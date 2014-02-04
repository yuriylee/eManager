<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>User: ${username}</P>
<table>
<tr>
<td>

<table>
<caption>Earnings</caption>
<tr>
<td>Number</td>
<td>Name</td>
<td>Amount</td>
<td>Time</td>
</tr>
<c:forEach items="${earnings}" var="earn">
<tr>
<td>${earn.id}</td>
<td><c:out value="${earn.name}"/></td>
<td>${earn.amount}</td>
<td>${earn.earningDate}</td>
</tr>
</c:forEach>
</table>

</td>
<td>

<table>
<caption>Expences</caption>
<tr>
<td>Number</td>
<td>Name</td>
<td>Price</td>
<td>Time</td>
</tr>
<c:forEach items="${expences}" var="expence">
<tr>
<td>${expence.id}</td>
<td>${expence.name}</td>
<td>${expence.price}</td>
<td>${expence.expenceDate}</td>
</tr>
</c:forEach>
</table>

</td>
</tr>
</table>

</body>
</html>
