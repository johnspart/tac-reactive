(function() {
  'use strict';

  angular
    .module('tacWeb')
    .factory('ParametrosService', ParametrosService);

  function ParametrosService($http, urlSrv) {
    var parametro = {
      codigo: "",
      valor: ""
    };

    function getParametros() {
      var parametros = null;
      $http.get(urlSrv + 'parameters')
        .then(function(response) {
          parametros = response.data;
        });

      return parametros;
    }

    return {
      parametro: parametro,
      getParametros: getParametros
    }
  }
})();
