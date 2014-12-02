<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>

<html>
<head>
<title>Home</title>

<!-- dojo support -->
<script src="<c:url value="/resources/dojo-toolkit/dojo/dojo.js" />"
	data-dojo-config="async: true"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/dojo-toolkit/dijit/themes/nihilo/nihilo.css" />" />

<!--  local js-->
<script type="text/javascript"
	src="<c:url value="/resources/js/home.js" />"></script>

<!-- css -->
<link rel="stylesheet" href="<c:url value="/resources/css/home.css"/>" />

<!-- icon for this application -->
<link href="<c:url value="/resources/image/Shamrock.png"/>"
	rel="shortcut icon" type="image/x-icon" />


</head>
<body>

	<!-- header -->
	<header>
		<div class="head-content">
			<div class="home-Image">
				<a href=""><img
					src="<c:url value="/resources/image/IndexPageLogo.png"/>"
					alt="index" class="head-imge" /></a>
			</div>
			<!-- search -->
			<div class="home-search">
				<div class="home-search-input">
					<input type="text" id="Search" class="input-search" />
				</div>
				<div class="home-search-button">
					<button>search</button>
				</div>
			</div>

			<!-- login -->
			<div class="home-login">
				<a>Sign in</a>
			</div>
		</div>
	</header>

	<section class="main-nav">
		<div class="main-nav-content">
			<ul>
				<li><a href="">Reading</a></li>
				<li><a href="">Group</a></li>
				<li><a href=""> movie</a></li>
				<li><a href="">more</a></li>
			</ul>
		</div>
	</section>



	<!-- add company info -->
	<footer> </footer>
</body>
</html>
