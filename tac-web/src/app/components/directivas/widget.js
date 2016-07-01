(function() {
  'use strict';


  angular
    .module('tacWeb')
    .directive('rdWidget', rdWidget);

  function rdWidget() {
    var directive = {
      transclude: true,
      template: '<div class="widget" ng-transclude></div>',
      restrict: 'EA'
    };
    return directive;

  }
})();
