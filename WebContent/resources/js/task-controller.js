myApp.controller('TaskController', [ '$scope', 'TaskService',
		function($scope, TaskService) {
			$scope.tasks = [];
			$scope.fetchAllTasks = function() {
				TaskService.fetchAllTasks().then(function(d) {
					$scope.tasks = d.data;
					/* return tasks; */
				}
				/*
				 * function(errResponse){ console.error('Error while fetching
				 * tasks'); }
				 */
				);
			};

			$scope.fetchAllTasks();
			

		} ]);
