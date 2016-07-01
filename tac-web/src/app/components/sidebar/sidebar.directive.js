(function() {
  'use strict';

  angular
    .module('tacWeb')
    .directive('sidebar', sidebar);

  /** @ngInject */
  function sidebar() {
    var directive = {
      restrict: 'E',
      templateUrl: 'app/components/sidebar/sidebar.html',
      scope: {
        creationDate: '='
      },
      controller: SidebarController,
      controllerAs: 'vm',
      bindToController: true
    };

    return directive;

    /** @ngInject */
    function SidebarController($rootScope, $state) {
      var vm = this;
      vm.cerrarMenu = function() {
        $rootScope.mostrar = '';
      };

      vm.menuItems = [{
        "sref": ".parametros",
        "label": $rootScope.labels.parametros,
        "iconClass": "menu-icon glyphicon glyphicon-dashboard"
      }, {
        "sref": ".centrosCosto",
        "label": $rootScope.labels.cscos,
        "iconClass": "menu-icon glyphicon glyphicon-list-alt"
      }, {
        "sref": ".areas",
        "label": $rootScope.labels.areas,
        "iconClass": "menu-icon glyphicon glyphicon-list-alt"
      }];

      vm.selectMenuItem = function(sref) {
        var lState = $state.$current.name;
        var classReturn = (lState.substr(lState.length - sref.length,   sref.length) === sref) ? 'selectMenuItem' : '';
        return classReturn;
      };

    }
  }

})();
