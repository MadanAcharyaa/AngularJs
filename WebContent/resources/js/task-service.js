'use strict';

myApp.factory('TaskService', [ '$http', '$q', function($http, $q) {

	return {
		fetchAllTasks : function() {
			return $http.get('http://localhost:8080/Angular/tasks');
		}
	}
}]);