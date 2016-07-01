(function() {
  'use strict';

  angular
    .module('tacWeb')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log, $rootScope, $http, $cookies, $location, labels, urlSrv) {
    //Run translation if selected language changes
    //Init
    $rootScope.selectedLanguage = 'es';
    $rootScope.labels = function() {
      labels.getLabels($rootScope, $rootScope.selectedLanguage);
    };
    $rootScope.labels();

    $log.debug('runBlock end');
    /*
    $rootScope.authenticate = function(callback) {
      $http.get(urlSrv + 'user').success(function(data) {
        if (data.name) {
          $rootScope.authenticated = true;
        } else {
          $rootScope.authenticated = false;
          $location.path("/login");
        }
        callback && callback();
      }).error(function() {
        $rootScope.authenticated = false;
        callback && callback();
      });
    };
    $rootScope.logout = function() {
      $http.post(urlSrv + 'logout', {}).
      success(function() {
        $cookies.remove('XSRF-TOKEN');
        $cookies.remove('CSRF');
        $rootScope.authenticated = false;
        $location.path("/login");
      }).error(function(data) {
        $location.path("/login");
        $cookies.remove('XSRF-TOKEN');
        $cookies.remove('CSRF');
        $log.debug(data);
      });
    };*/

  }

})();
