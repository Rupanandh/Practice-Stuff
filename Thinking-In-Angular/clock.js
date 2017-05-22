
var clockModule = angular.module("clockApp", []);
clockModule.controller("clockCtrl", fetchTime);
function fetchTime($scope) {
    var currentDate = new Date();
    $scope.currentTime = currentDate.toTimeString();
   
    console.log("in fetch time" + currentDate.toTimeString());
    $scope.updateTimeCurrentTime = function updateTime() {
        var currentDate = new Date();       
        $scope.currentTime = currentDate.toTimeString();
        console.log("Button Clicked");
    }
}


