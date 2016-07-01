(function() {
  'use strict';

  angular
    .module('tacWeb')
    .config(config);

  /** @ngInject */
  function config($logProvider, toastrConfig, $httpProvider, cfpLoadingBarProvider) {
    cfpLoadingBarProvider.includeSpinner = true;
    // Enable log
    $logProvider.debugEnabled(true);

    // Set options third-party lib
    toastrConfig.allowHtml = true;
    toastrConfig.timeOut = 3000;
    toastrConfig.positionClass = 'toast-top-right';
    toastrConfig.preventDuplicates = true;
    toastrConfig.progressBar = true;

    $httpProvider.defaults.withCredentials = true;
    $httpProvider.interceptors.push('XSRFInterceptor');
    $httpProvider.defaults.useXDomain = true;
    $httpProvider.defaults.withCredentials = true;
    delete $httpProvider.defaults.headers.common["X-Requested-With"];
    $httpProvider.defaults.headers.common["Access-Control-Allow-Origin"] = "*";
  }

  angular.module('tacWeb')
    .factory('XSRFInterceptor', function($cookies, $log) {
      var XSRFInterceptor = {
        request: function(config) {
          var token = $cookies.get('XSRF-TOKEN');
          if (token) {
            config.headers['X-XSRF-TOKEN'] = token;
            config.headers['CSRF'] = token;
            $log.info("X-XSRF-TOKEN: " + token);
          }
          return config;
        }
      };
      return XSRFInterceptor;
    });

})();
