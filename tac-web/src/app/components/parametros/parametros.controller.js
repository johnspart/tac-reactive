(function() {
  'use strict';

  angular
    .module('tacWeb')
    .controller('ParametrosController', ParametrosController);

  /** @ngInject */
  function ParametrosController($rootScope, $scope, $uibModal, $log, ParametrosService) {
    var vm = this;

    vm.edit = function(parametro) {
      ParametrosService.parametro = parametro;
      $uibModal.open({
        controller: 'ParametroModalController',
        controllerAs: 'prmM',
        animation: true,
        templateUrl: 'app/components/parametros/parametroModal.html',
        size: 'sm'
      });
    };

    vm.parametros = [{
      codigo: 'Laurent',
      valor: 'Renard'
    }, {
      codigo: 'Blandine',
      valor: 'Faivre'
    }, {
      codigo: 'Francoise',
      valor: 'Frere'
    }];
  }
})();
