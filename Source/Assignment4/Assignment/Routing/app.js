app.config(['$urlRouterProvider','$stateProvider',function($urlRouterProvider,$stateProvider){
    
    //$urlRouterProvider.otherwise('/home');
    
    $stateProvider

    .state('home',{
            url: '/home',
            templateUrl: 'home/home.html',
           
        })

    	.state('login',{
    		url: '/login',
    		templateUrl: 'Login/Login.html',
           
    	})
        
        .state('register', {
            url: '/register',
            templateUrl: 'Register/Register.html'
        })

}]);