(function() {
  'use strict';

  angular
    .module('tacWeb')
    .directive('navbar', navbar);

  /** @ngInject */
  function navbar() {
    var directive = {
      restrict: 'E',
      templateUrl: 'app/components/navbar/navbar.html',
      scope: {
        creationDate: '='
      },
      controller: NavbarController,
      controllerAs: 'vm',
      bindToController: true
    };

    return directive;

    /** @ngInject */
    function NavbarController($rootScope, $location, labels) {
      var vm = this;
      angular.element(document).ready(function() {
        if (angular.isDefined($location.url())) {
          $rootScope.ubicacion = labels.getLabel($location.url().substring(1));
        }
      });
      vm.abrirMenu = function() {
        $rootScope.mostrar = 'mostrar';
      };
    }
  }

})();
