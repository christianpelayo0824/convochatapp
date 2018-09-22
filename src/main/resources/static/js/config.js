'use strict'

app.config(['$routeProvider', function ($routeProvider) {
	$routeProvider
		.when('/addUser', {
			templateUrl: 'js/component/userform/userform.html',
			controller: 'UserFormController'
		}).when('/userList', {
			templateUrl: 'js/component/userlist/userList.html',
			controller: 'UserListController'
		}).otherwise({
			redirectTo: '/userList'
		})
}]);