'use strict'

app.controller('RestController', function($scope, UserService) {

	const BASE_LINK = 'http://localhost:8080/user';

	$scope.getAllUser = function() {
		UserService.getAllUser().then(function(response) {
			$scope.users = response.data;
			console.log(response.data);
		});
	}

});
