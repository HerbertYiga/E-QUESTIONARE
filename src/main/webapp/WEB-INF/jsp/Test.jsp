
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
						<li><a href="<c:url value="/viewPersonDetails/1"/>"
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

			<form:form class="form-horizontal" action="Form2" method="post"
				commandName="addDetails">
				<fieldset>
					<legend class="text-center">

						<label for="email" id="title"><b>Form 3a<br>
								Mulago Hospital Department of Surgery (Urology Unit) <br>Genetic
								Susceptibility to Prostate Cancer in African Men study

								QUESTIONNAIRE
						</b></label>
					</legend>
					<!--  <label class= "control-label"  id="title" ><b>PERSONAL INFORMATION</b></label>-->
					<!-- Name input-->
					<br> <br>
					<!-- sexaul partners -->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">1.What is
							your full name</label>
						<div class="col-md-5">
							<form:input id="name" name="fullNames" type="text"
								path="fullNames" placeholder="Your full Names"
								class="form-control" />
							<form:errors path="fullNames" cssStyle="color: #ff0000;" />
						</div>
					</div>



					<div class="form-group">


						<label class="col-md-3 control-label" for="name">2. What
							is your date of birth? </label>
						<div class="col-md-5">
							<form:input path="dob" type="date" class="form-control"
								data-placeholder="Response Date" required="true" />
							<form:errors path="dob" cssStyle="color: #ff0000;" />



						</div>



					</div>



					<!--furthest level of educ-->

					<div class="form-group">

						<label class="col-md-3 control-label no3 " for="name" id=" ">
							3.What is the highest level of education you have completed?</label>
						<div class="col-md-5">


							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value=" Primary School 1 to 4" />Primary School 1 to 4</label>
								<h1 style="color: #ff0000;">${educerror}</h1>






							</div>

							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="Primary School 5 to 7" />Primary School 5 to 7</label>
							</div>

							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="O level without a profession" />First cycle of
									Secondary School S1 to 4 (O level without a profession)</label>
							</div>
							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="O level professional" />O level professional</label>
							</div>
							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="Second cycle of Secondary School S5 to 6" />Second
									cycle of Secondary School S5 to 6</label>
							</div>
							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="University/Professional School" />University/Professional
									School</label>
							</div>
							<div class="radio">
								<label><form:radiobutton path="levelOfEduc"
										value="Other" />Other</label>
							</div>

						</div>
					</div>




					<!--highest occupation-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">4. What
							is the occupation that you have held for the majority of your
							life?</label>
						<div class="col-md-5">

							<form:input id="name" name="" type="text" path="occupationHeld"
								placeholder="occupation that you have held for the majority of your life"
								class="form-control" />
							<form:errors path="occupationHeld" cssStyle="color: #ff0000;" />

						</div>


					</div>

					<!--highest occupation-->

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">5.What is
							your tribe? </label>
						<div class="col-md-5">


							<form:input id="name" name="fullNames" type="text"
								path="yourTribe" placeholder="your tribe" class="form-control" />
							<form:errors path="yourTribe" cssStyle="color: #ff0000;" />

						</div>


					</div>

					<div class="form-group">


						<label class="col-md-3 control-label" for="name">6.What is
							your fathers tribe? </label>
						<div class="col-md-5">


							<form:input id="name" name="fullNames" type="text"
								path="fathersTribe" placeholder="fathers tribe"
								class="form-control" />
							<form:errors path="fathersTribe" cssStyle="color: #ff0000;" />

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











			<br> <br>







			<!--  -->



		</div>

	</div>
	<!--/panel-body-->
	</div>
	<!--/panel-->




</body>
</html>