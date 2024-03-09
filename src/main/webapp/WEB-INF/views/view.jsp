<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>Add Book</title>
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
<sec:authorize access="hasRole('CHECKER')">
 <button type="button" style="margin-top:10px;margin-left:10px" class="btn btn-info"><a href="checker" style="text-decoration:none; color:white;">Back</a></button>
<br/></sec:authorize>
<sec:authorize access="hasRole('MAKER')">
 <button type="button" style="margin-top:10px;margin-left:10px" class="btn btn-info"><a href="maker" style="text-decoration:none; color:white;">Back</a></button>
<br/></sec:authorize>

<div  class="center">
<h1>Customer Details</h1>
<div style="margin-top:25px;">

<div class="form-div" style="display:flex;flex-direction:row; padding-left: 40px;">
<div class="left" style="width:50%;margin-right:10px;padding-right:30px">
<div class="input-field-de" >
<label class="labfield"for="inputEmail4"Customer Code :
<c:out value="${customerDetails.customerCode}"/></label>

</div>
<div class="input-field-de">
<label class="labfield" for="inputEmail4">Customer Name :</label>
<c:out value="${customerDetails.customerName}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Customer Address 1 :</label>
<c:out value="${customerDetails.customerAddress1}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Customer Address 2:</label>
 <c:out value="${customerDetails.customerAddress2}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Created By :</label>
<c:out value="${customerDetails.createdBy}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Created Date :</label>
<c:out value="${customerDetails.createdDate}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Authorized By :</label>
<c:out value="${customerDetails.authorizedBy}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Authorized Date :</label>
<c:out value="${customerDetails.authorizedDate}"/>
</div>
</div >
<div class="right" style="padding-left:30px">

<div class="input-field-de">
<label class="labfield" for=inputEmail4">Pin Code :</label>
<c:out value="${customerDetails.customerPinCode}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Email Address  :</label>
<c:out value="${customerDetails.emailAddress}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Contact Number :</label>
<c:out value="${customerDetails.contactNumber}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Primary Contact Person :</label>
<c:out value="${customerDetails.primaryContactPerson}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Modified By :</label>
<c:out value="${customerDetails.modifiedBy}"/>
</div>
<div class="input-field-de">
<label class="labfield" for=inputEmail4">Modified Date :</label>
<c:out value="${customerDetails.modifiedDate}"/>
</div>



</div>
</div>


</div>
</div>

</body>
</html>

