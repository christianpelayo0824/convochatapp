'use strict'


app.controller('UserListController', function ($scope, $location, UserService) {

	UserService.getAllUser()
		.then(function (response) {
			$scope.users = response.data;
			console.log('Status: ' + response.status + ' | ' + response.header);
		}).catch(function (response) {
			console.log('Error | Status: ' + response.status + ' | ' + response.header);
		}).finally(function () {
			console.log('Task Finished!');
		});

	$scope.getUserById = function (user) {
		UserService.getUserById(user.uid).then(function (response) {
			$scope.user = response.data;
			console.log(response.data);
		}).catch(function (response) {
			console.log('Error | Status: ' + response.status + ' | ' + response.header);
		}).finally(function () {
			console.log('Task Finished!');
		});
	}

	$scope.deleteUserById = function (user) {

		UserService.deleteUserById(user.uid).then(function (response) {
			console.log(response.data);
			var index = $scope.users.indexOf(user.uid);
			$scope.users.splice(index, 1);
		}).catch(function (response) {
			console.log('Error | Status: ' + response.status + ' | ' + response.header);
		}).finally(function () {
			console.log('Task Finished!');
		});
	}

	$scope.addUser =function() {
		$location.path('/addUser');
	}




});