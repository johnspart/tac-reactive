(function() {
  'use strict';

  angular
    .module('tacWeb')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('login', {
        url: '/login',
        templateUrl: 'app/components/login/login.html',
        controller: 'LoginController',
        controllerAs: 'lCtrl'
      })
      .state('home', {
        url: '/',
        templateUrl: 'app/main/main.html',
        controller: 'MainController',
        controllerAs: 'main',
        resolve: {
          ubicacionResolve: function($rootScope) {
            $rootScope.ubicacion = $rootScope.labels.inicio;
            //$rootScope.authenticate();
          }
        }
      }).state('home.areas', {
        url: 'areas',
        templateUrl: 'app/components/areas/areas.html',
        controller: 'AreasController',
        controllerAs: 'are',
        resolve: {
          ubicacionResolve: function($rootScope) {
            $rootScope.ubicacion = $rootScope.labels.areas;
            //$rootScope.authenticate();
          }
        }
      }).state('home.area', {
        url: 'area',
        templateUrl: 'app/components/areas/area.html',
        controller: 'AreaController',
        controllerAs: 'arCtrl',
        resolve: {
          ubicacionResolve: function($rootScope) {
            $rootScope.ubicacion = $rootScope.labels.area;
            //$rootScope.authenticate();
          }
        }
      }).state('home.parametros', {
        url: 'parametros',
        templateUrl: 'app/components/parametros/parametros.html',
        controller: 'ParametrosController',
        controllerAs: 'prm',
        resolve: {
          ubicacionResolve: function($rootScope) {
            $rootScope.ubicacion = $rootScope.labels.parametros;
            //$rootScope.authenticate();
          }
        }
      }).state('home.centrosCosto', {
        url: 'centrosCosto',
        templateUrl: 'app/components/centrosCosto/centrosCosto.html',
        controller: 'CentrosCostoController',
        controllerAs: 'cscos',
        resolve: {
          ubicacionResolve: function($rootScope) {
            $rootScope.ubicacion = $rootScope.labels.cscos;
            //$rootScope.authenticate();
          }
        }
      });

    $urlRouterProvider.otherwise('/');
  }

})();
