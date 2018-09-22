'use strict'

app.controller('UserFormController', function ($scope, $location, UserService) {

    $scope.createUser = function () {
        UserService.addUser().then(function () {
            console.log("Add User");
        }).finally(function () {
            console.log("Task Finished");
        });
    }
})