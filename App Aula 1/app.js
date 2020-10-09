(function (){
  "use strict";

  angular
  .module('app1',[])
  .controller('controlador', function($scope){
    
    $scope.nome = ""
    $scope.contador = 10
    $scope.restantes = restantes

     function restantes(nome){
       return nome.length
     }
    
  })
  
})();

