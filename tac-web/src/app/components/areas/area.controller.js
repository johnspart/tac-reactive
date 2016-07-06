(function() {
  'use strict';

  angular
    .module('tacWeb')
    .controller('AreaController', AreaController);

  function AreaController() {
    var vm = this;

    vm.area = {
      codigo: "",
      nombre: "",
      usuario: "",
      estado: false
    };

    
  }
})();
