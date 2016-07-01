(function() {
  'use strict';

  angular
    .module('tacWeb')
    .controller('ParametroModalController', ParametroModalController);

  /** @ngInject */
  function ParametroModalController($uibModalInstance, ParametrosService) {
    var vm = this;
    vm.instance = $uibModalInstance;
    vm.parametro = ParametrosService.parametro;

    vm.ok = function() {

    };
  }
})();
