'use strict'

app.service('UserService', function ($http) {

	const BASE_LINK = 'http://localhost:8080/user';

	this.getAllUser = function () {
		return $http({
			method: 'GET',
			url: BASE_LINK + '/getAllUser'
		});
	}

	this.getUserById = function (uid) {
		return $http({
			method: 'GET',
			url: BASE_LINK + '/getUserById/' + uid
		});
	}

	this.createUser = function () {
		return $http({
			method: 'POST',
			ur: BASE_LINK + '/createUser',
			data: {
				firstname: 'Christian',
				lastname: 'Pelayo',
				email: 'chan@123',
				password: '123'
			}
		});
	}

	this.deleteUserById = function (uid) {
		return $http({
			method: 'DELETE',
			url: BASE_LINK + '/deleteUserById/' + uid
		});
	}



});