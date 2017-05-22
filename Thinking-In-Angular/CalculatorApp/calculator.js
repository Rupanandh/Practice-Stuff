var calculatorModule = angular.module("calculatorApp", []);
calculatorModule.controller("calculatorCtrl", doCalculation);

function doCalculation($scope) {
    console.log("doCalculation")

    $scope.buttonClicked = function add(button) {
        $scope.operationType = button;
        console.log("button clicked");
    }


    $scope.calculate = function result() {
        var number1 = parseFloat($scope.userInput1);
        var number2 = parseFloat($scope.userInput2);

        if ($scope.operationType === '+') {
            $scope.result = number1 + number2;
        }
        else if ($scope.operationType === '*') {
            $scope.result = number1 * number2;
        }
        else if ($scope.operationType === '/') {
            $scope.result = number1 / number2;
        }
        else if ($scope.operationType === '-') {
            $scope.result = number1 - number2;
        }

        console.log($scope.result);
    }

}