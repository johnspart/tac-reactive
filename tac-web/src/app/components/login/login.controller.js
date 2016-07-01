(function() {
  'use strict';

  angular
    .module('tacWeb')
    .controller('LoginController', LoginController);

  /** @ngInject */
  function LoginController($scope, $rootScope, $http, $cookies, urlSrv, LoginService, toastr) {
    var vm = this;
    
    vm.credentials = {
      username: "john.lopez",
      password: "1128434940"
    };
    vm.error = false;
    vm.login = function(form) {
      if (form.$valid)
        vm.error = !LoginService.login(vm.credentials);
      else {
        form.$setDirty(true);
        toastr.info($rootScope.labels.usrPassNoVal);
      }
    };



  }
})();
