(function() {
  'use strict';

  angular
    .module('tacWeb')
    .service('AreasService', AreasService);

  function AreasService(rx) {

    function getAreas(){
      return rx.Observable.fromPromise($http({
        url: urlSrv + '',
        method: '',
        params:{
          
        }
      }));
    }

    return{

    };
  }
})();
