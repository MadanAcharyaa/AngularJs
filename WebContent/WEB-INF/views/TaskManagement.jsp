<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/resources/js/app.js' />"></script>
      <script src="<c:url value='/resources/js/task-service.js' />"></script>
      <script src="<c:url value='/resources/js/task-controller.js' />"></script>



<title>Task Management</title>
</head>
<body ng-app="myApp">
  <div ng-controller="TaskController">
		<table>
			<thead>
				<tr>
					<th>ID.</th>
					<th>Name</th>
					<th>Description</th>
					<th>Priority</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="u in tasks">
					<td>{{u.task_id}}</td>
					<td>{{u.task_name}}</td>
					<td>{{u.task_description}}</td>
					<td>{{u.task_priority}}</td>
					<td>{{u.task_status}}</td>
					<td>
						<button type="button" ng-click="remove(task_id)">add</button>
						<button type="button" ng-click="edit(u.task_id)">Edit</button>
						<button type="button" ng-click="remove(task_id)">Remove</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>