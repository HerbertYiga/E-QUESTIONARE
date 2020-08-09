
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EQuestiannaire</title>
<!-- booot strap,css and java script files -->

<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<link href="<c:url value="/resources/css/admin.css"/>" rel="stylesheet">


</head>
<body>

	<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#" style="color: #ffffff;">Dashboard</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"></li>

					<li><a href="<c:url value="/Logout"/>" style="color: #ffffff;"><i
							class="glyphicon glyphicon-lock"></i> Logout</a></li>
				</ul>
			</div>
		</div>
		<!-- /container -->
	</div>

	<!-- /Header -->

	<!-- Main -->

	<div class="col-lg-2 col-md-2 col-sm-3 col-xs-12">

		<ul class="nav nav-pills nav-stacked"
			style="border-right: 1px solid black">
			<!--<li class="nav-header"></li>-->
			<li><a href="<c:url value="/AdminPanel"/>""><i
					class="glyphicon glyphicon-dashboard"></i> Dashboard</a></li>

			<li><a href="<c:url value="/downloadExcelForPersonalDetails"/>""><i
					class="glyphicon glyphicon-download"></i> Personal details</a></li>
			<li><a href="<c:url value="/BehavioralDetailsExcel"/>""><i
					class="glyphicon glyphicon-download"></i> Behavioral Details</a></li>

			<li><a href="<c:url value="/FamilyDetailsExcel"/>""><i
					class="glyphicon glyphicon-download"></i> Family Details</a></li>
			<li><a href="<c:url value="/MedicalDetailsExcel"/>""><i
					class="glyphicon glyphicon-download"></i> Medical Details</a></li>
					<!--  <li><a href="<c:url value="/AllDetails"/>""><i
					class="glyphicon glyphicon-download"></i> AllDetails</a></li>
-->



		</ul>
	</div>
	<!-- /span-3 -->
	<div class="col-lg-10 col-md-10 col-sm-9 col-xs-12">
		<!-- Right -->

		<a href="#"><strong><span class="fa fa-dashboard"></span>
				My Dashboard</strong></a>
		<hr>



		<h1>DOWNLOAD EXCELS</h1>

	</div>
</body>
</html>