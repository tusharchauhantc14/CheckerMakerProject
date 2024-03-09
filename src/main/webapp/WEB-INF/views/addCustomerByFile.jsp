<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Add Customer</title>
	<style>
.error {
color: #EF1313;
font-style: italic;
}
.center {
  margin: auto;
  width: 60%;
  border: 3px solid black;
  padding: 10px;
  margin-top:20px;
  display:flex;
flex-direction: column;
    align-items: center;
  height:500px;
  box-shadow: 10px 5px 5px black;
}
.submit-button{
display: flex;
    justify-content: center;
    margin-top: 40px;
}
.intfield{
width: 270px;
border-radius: 11px;
height: 38px;
margin-top:5px;
}
.labfield{
font-size: 20px;
  font-weight: bold;

}
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}
.input-field-de{
display:flex;
flex-direction: column;
}
</style>

</head>
<body>
 <button type="button" style="margin-top:10px;margin-left:10px" class="btn btn-info"><a href="maker" style="text-decoration:none; color:white;"><spring:message code="userform.back" text="Default Back"/></a></button>


<div class="dropdown show" style="float:right;padding-right:275px;padding-top:20px">
  <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   <spring:message code="userform.chooseslanguage" text="Default Chooses Language"/>
  </a>

  <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
  <a class="dropdown-item" href="?language=hi_IN">Hindi</a>
    <a class="dropdown-item" href="?language=en_US">English</a>
    <a class="dropdown-item" href="?language=zh_CN">Chinese</a>
    <a class="dropdown-item" href="?language=es_ES">Spanish</a>
  </div>
</div>


<div  class="center">

<h1><spring:message code="userform.title" text="Default Customer Registration Form"/></h1>

<form:form style="margin-top:25px;"  modelAttribute="file1" action="addcustomerbyfile"  enctype='multipart/form-data' method="Post">


<div class="form-div" style="display:flex;flex-direction:row; padding-left:40px;">


<div class="input-field-de">
<label class="labfield" for="inputEmail4"><spring:message code="userform.file" text="Default File :"/></label>
 <form:input type="file" path="fileData"/>
</div>


</div>

<div class="submit-button" >
 <input class="btn btn-primary" type="submit">
  <input style="margin-left:10px" class="btn btn-danger" type="Reset">

 </div>

</form:form>
</div>
</body>
</html>

