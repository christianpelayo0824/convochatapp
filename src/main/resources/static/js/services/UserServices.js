'use strict'

app.service('UserService', function($http) {

	const BASE_LINK = 'http://localhost:8080/user';

	this.getAllUser = function() {
		return $http({
			method : 'GET',
			url : BASE_LINK + '/getAllUser'
		});
	}
});