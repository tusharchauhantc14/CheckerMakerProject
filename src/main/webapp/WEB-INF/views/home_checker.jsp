<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.js"></script>
        <script>
          $(document).ready( function ()
          {
            $('#myTable').DataTable({  "language":
            {    "search": "Search By CustomerCode:"  }});
                   } );
        </script>
    <style>

    </style>
<title>checker_home</title>
</head>
<body>
<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a class="navbar-brand" style="padding-left: 37px;" href="#">Hello.. <sec:authentication property="principal.username"/></a>



    <c:url var="logout" value="/logout"></c:url>
<form:form style="margin-left:1050px;margin-top: 10px;" action="${logout }" method ="post">
	<input class="form-control mr-sm-2" type="submit" value="logout">
</form:form>

 </nav>

 <!--
<c:url var="logout" value="/logout"></c:url>
<form:form  action="${logout }" method ="post">
	<input type="submit" value="logout">
</form:form>
-->

<div  style="padding:0px,2px;margin-top:20px">

<table id="myTable" class="table table-striped table-bordered">
    <thead>
        <tr>
            <th>C.Code</th>
            <th>C.Name</th>
            <th>C.Address</th>
             <th>Status</th>
            <th>Created By</th>
             <th>Created Date</th>
            <th>Modified By</th>
              <th>Modified Date</th>
            <th>Authorized By</th>
             <th>Authorized Date</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
<c:forEach items="${newRegisterCustomerList}" var="customer">
        <tr>
             <td><c:out value="${customer.customerCode}"/></td>
                      <td><c:out value="${customer.customerName}"/></td>
                      <td><c:out value="${customer.customerAddress1}"/></td>
                      <td><c:out value="${customer.recordStatus}"/></td>
                      <td><c:out value="${customer.createdBy}"/></td>
                      <td><c:out value="${customer.createdDate}"/></td>
                      <td><c:out value="${customer.modifiedBy}"/></td>
                        <td><c:out value="${customer.modifiedDate}"/></td>
                      <td><c:out value="${customer.authorizedBy}"/></td>
                       <td><c:out value="${customer.authorizedDate}"/></td>
                      <th>
                       <div style="display: flex;flex-direction: row;">
                       <button type="button" class="btn btn-success"><a href="approveCustomer?id=<c:out value="${customer.customerId}"/>&status=<c:out value="${customer.recordStatus}"/>" style="text-decoration:none; color:white;">Approve</a></button>
                       <button type="button" class="btn btn-info"><a href="viewCustomer?id=<c:out value="${customer.customerId}"/>&T=<c:out value="temp"/>" style="text-decoration:none; color:white;">View</a></button>
                       <button type="button" class="btn btn-danger"><a href="rejectCustomer?id=<c:out value="${customer.customerId}"/>" style="text-decoration:none; color:white;">Reject</a></button>
                       </div>
                      </th>
        </tr>
</c:forEach>
    </tbody>

</table>
</div>
</body>
</html>
