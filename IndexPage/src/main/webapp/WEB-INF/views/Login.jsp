
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>

	<c:if test="${sessionScope.IsLogin.level>=1}">
用户：${sessionScope.IsLogin.userName} 已经登陆
</c:if>



	<!-- login area -->
	<section id="loginController" class="login-control">
		<form:form commandName="Login" method="post">
			<table>
				<tr>
					<td><form:label path="userName">Name</form:label></td>
					<td><form:input path="userName" /></td>
					<td><form:errors path="userName"></form:errors></td>
				</tr>
				<tr>
					<td><form:label path="Password">password</form:label></td>
					<td><form:input path="Password" /></td>
					<td><form:errors path="Password"></form:errors></td>
				</tr>
				<tr>
					<td><button>ok</button></td>
					<td></td>
					<td><a href='register'>register</a></td>
				</tr>
			</table>
		</form:form>

	</section>



	<table boerder="1">
		<tr>
			<td>user</td>
			<td>password</td>
			<td>level</td>
		</tr>
		<c:forEach items="${accounts}" var="account">
			<tr>
				<td>${account.userName}</td>
				<td>${account.password}</td>
				<td>${account.level}</td>
			</tr>
		</c:forEach>
	</table>