(function() {
  'use strict';

  angular
    .module('tacWeb')
    .factory('LoginService', LoginService);

  function LoginService($rootScope, $http, $state, $cookies, $log, $httpParamSerializer, $resource, $location, urlSrv, toastr) {

    function login(credentials) {
      credentials._csrf = $cookies.get('XSRF-TOKEN');

      $http.post(urlSrv + 'login', $httpParamSerializer(credentials), {
        headers: {
          "content-type": "application/x-www-form-urlencoded"
        }
      }).success(function() {
        $rootScope.authenticate(function() {
          if ($rootScope.authenticated) {
            $log.debug("Login succeeded");
            $location.path("/");
            toastr.info($rootScope.labels.bienvenido);
            $rootScope.authenticated = true;
          } else {
            $log.debug("Login failed");
            $location.path("/login");
            toastr.error($rootScope.labels.usrPassNoVal);
            $rootScope.authenticated = false;
          }
        });
      }).error(function() {
        $location.path("/login");
        toastr.error($rootScope.labels.prmInicioSession);
        $rootScope.authenticated = false;
      });

      return $rootScope.authenticated;
    }

    return {
      login: login
    };
  }
})();
