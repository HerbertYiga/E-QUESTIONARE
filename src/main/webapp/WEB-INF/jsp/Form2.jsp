
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EQuestiannaire</title>
<!-- booot strap,css and java script files -->

<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<link href="<c:url value="/resources/css/admin.css"/>" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>





<!-- Script for validating that an image is captured -->

</head>
<body>

	<div class="navbar-wrapper">
		<div class="container-fluid">
			<nav class="navbar navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">


						<li class="active"><a href="<c:url value="/UserPanel"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-home"></i>
								Home</a></li>
						<li><a href="<c:url value="/viewUsersForEnable"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-book"></i>
								Views</a></li>


						<!--  <li><a href="<c:url value="/addStudent"/>"><i class="glyphicon glyphicon-comment"></i>  Verify Students</a></li>
                <li><a href="#"><i class="glyphicon glyphicon-user"></i> Register Student</a></li>
             -->



					</ul>
					<ul class="nav navbar-nav pull-right">
						<li><a href="<c:url value="/Logout"/>"
							style="color: #ffffff;"><i class="glyphicon glyphicon-off"></i>
								Logout</a></li>
					</ul>
				</div>
			</div>
			</nav>
		</div>
	</div>
	<br>
	<br>
	<br>
	<div class="panel panel-default">



		<div class="panel-body">
			<div class="panel-heading">
				<h4>
					<b></b>
				</h4>
			</div>
			<c:if test="${numberFormatException!= null}">
				<p>please make sure you inserted a number</p>
			</c:if>
			<form:form class="form-horizontal" action="gototest3" method="post"
				commandName="addDetails">
				<fieldset>
					<legend class="text-center">

						<label for="email" id="title"><b>BEHAVIORAL HISTORY</b></label>
					</legend>
					<!--  <label class= "control-label"  id="title" ><b>PERSONAL INFORMATION</b></label>-->
					<!-- Name input-->
					<br> <br>
					<!-- sexaul partners -->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name"> 1.Sexual partners  you had in the past 2 years </label>
						<div class="col-md-5">
							<form:input id="name" path="sexualPartners" type="text"
								placeholder="Number of sexual partners in past two years"
								class="form-control" />
							<form:errors path="sexualPartners" cssStyle="color: #ff0000;" />
							<h4 style="color: #ff0000;">${sexualPartners}</h4>
						</div>
					</div>
					<legend class="text-center">
						<label for="email" id="title"><b>MEDICAL HISTORY</b></label>
					</legend>
					<!-- weight-->


					<div class="form-group">


						<label class="col-md-3 control-label" for="name">1.
							Your current weight? in kilograms</label>
						<div class="col-md-5">
							<form:input id="name" path="weight" type="text"
								placeholder="your current weight" class="form-control" />
							<form:errors path="weight" cssStyle="color: #ff0000;" />


						</div>
						<label class="col-md-3 control-label" for="name">If you do
							not know your weight, I request that you stand on this scale so
							that we can find it out.</label>


					</div>


					<!-- Height-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">2.
							 Height</label>
						<div class="col-md-3">
							<form:input id="name" path="feet" type="text" placeholder="feet"
								class="form-control" />
							<form:errors path="feet" cssStyle="color: #ff0000;" />


						</div>
						<div class="col-md-2">
							<form:input id="name" path="inches" type="text"
								placeholder="inches" class="form-control" />
							<form:errors path="inches" cssStyle="color: #ff0000;" />
						</div>
						<label class="col-md-3 control-label" for="name">If you do
							not know your height please allow me to measure it.</label>


					</div>



					<!-- CIRCUMSIZED-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">3.Are you
							circumcised?</label>
						<div class="col-md-5">


							<label class="radio-inline"><form:radiobutton
									path="circumsised" value="1" />Yes</label> <label
								class="radio-inline"><form:radiobutton
									path="circumsised" value="2" />No</label>
							<form:errors path="circumsised" cssStyle="color: #ff0000;" />

						</div>


					</div>








					<!--if yes on circumsicion-->

					<div class="form-group">

						<label class="col-md-3 control-label no3 " for="name" id=" ">
							If yes at what age were you circumcised</label>
						<div class="col-md-5">

							<div class="radio">
								<label><form:radiobutton path="ageOfCircumsion"
										value="Neonatal" />Neonatal</label>

							</div>

							<div class="radio">
								<label><form:radiobutton path="ageOfCircumsion"
										value="Childhood" />Childhood</label>

							</div>

							<div class="radio">
								<label><form:radiobutton path="ageOfCircumsion"
										value="Adolescent" />Adolescent</label>

							</div>
							<div class="radio">
								<label><form:radiobutton path="ageOfCircumsion"
										value="Adult" />Adult</label>

							</div>
							<div class="radio">
								<label><form:radiobutton path="ageOfCircumsion"
										value="Dont know" />Dont Know</label>

							</div>

						</div>
					</div>




					<!-- vasectomy-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">4.Have
							you ever had a vasectomy?</label>
						<div class="col-md-5">


							<label class="radio-inline"><form:radiobutton
									path="hadVasectomy" value="1" />Yes</label> <label
								class="radio-inline"> <form:radiobutton
									path="hadVasectomy" value="2" />No
							</label>
							<form:errors path="hadVasectomy" cssStyle="color: #ff0000;" />


						</div>


					</div>

					<!-- ocupation -->
					<div class="form-group">
						<!-- if for vasectomy -->

						<label class="col-md-3 control-label" for="name">if
							yes,how old were you when you had a vasectomy? </label>
						<div class="col-md-5">
							<form:input id="name" path="ageofvesectomy" type="text"
								placeholder="your age at the period of vasectomy"
								class="form-control" />
							<form:errors path="ageofvesectomy" cssStyle="color: #ff0000;" />

						</div>
					</div>

					<!-- diagnised with std?? -->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">5.Have
							you ever been diagnosed with HIV? </label>
						<div class="col-md-5">

							<label class="radio-inline"><form:radiobutton
									path="diagnosedOfHiv" value="1" />Yes</label> <label
								class="radio-inline"><form:radiobutton
									path="diagnosedOfHiv" value="2" />No</label>
							<form:errors path="diagnosedOfHiv" cssStyle="color: #ff0000;" />

						</div>
					</div>

					<!-- std -->
					<div class="form-group">


						<label class="col-md-3 control-label" for="name">6. Have
							you ever been diagnosed with an STD? </label>
						<div class="col-md-5">

							<label class="radio-inline"><form:radiobutton
									path="diagnosedOfStd" value="1" />Yes</label> <label
								class="radio-inline"><form:radiobutton
									path="diagnosedOfStd" value="2" />No</label>
							<form:errors path="diagnosedOfStd" cssStyle="color: #ff0000;" />

						</div>
					</div>



					<!-- doctor saying-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">7.Has a
							doctor ever told you that you have cancer? </label>
						<div class="col-md-5">

							<label class="radio-inline"><form:radiobutton
									path="aboutCancerFromDoctr" value="1" />Yes</label> <label
								class="radio-inline"><form:radiobutton
									path="aboutCancerFromDoctr" value="2" />No</label>
							<form:errors path="aboutCancerFromDoctr"
								cssStyle="color: #ff0000;" />

						</div>
					</div>

					<div class="form-group">
						<!-- Name -->

						<label class="col-md-3 control-label" for="name">If yes,
							please list the type(s) of cancer and age (s) at diagnosis below.
							Please include prostate cancer in this list if applicable.</label>
						<div class="col-md-5">
							<form:textarea class="form-control" rows="5" id="comment"
								path="cancerTypeAndAge"
								placeholder="Enter all the types of cancers and the ages at which they were  diagnised" />
							<form:errors path="cancerTypeAndAge" cssStyle="color: #ff0000;" />



						</div>
					</div>

					<!-- Form actions -->
					<div class="form-group">
						<div class="col-md-12 text-right">


							<button type="submit" class="btn btn-primary btn-lg">Next</button>
						</div>
					</div>
				</fieldset>
			</form:form>

			<form:form action="UserPanel" method="post" commandName="addDetails">
				<div class="form-group">
					<div class="col-md-12 text-left">



						<button type="submit" class="btn btn-primary btn-lg">BACK</button>

					</div>
				</div>

			</form:form>
















			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>