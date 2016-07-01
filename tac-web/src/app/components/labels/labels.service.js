(function() {
  'use strict';

  angular
    .module('tacWeb')
    .service('labels', labels);

  /** @ngInject */
  function labels($rootScope, $log, $resource) {
    var vm = this;
    vm.getLabels = function($rootScope, language) {
      var languageFilePath = 'fonts/labels_' + language + '.json';
      $log.debug$log, (languageFilePath);
      $resource(languageFilePath).get(function(data) {
        $rootScope.labels = data;
      });
    };


    vm.getLabel = function(label) {
      return $rootScope.labels[label]
    };
  }
})();
