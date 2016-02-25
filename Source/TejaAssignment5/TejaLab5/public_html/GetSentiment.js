'use strict';
// Declare app level module which depends on views, and components
var SentimentApp = angular.module("MashApp",[]);


    SentimentApp.controller("Sentiment", function ($scope, $http) {
        $scope.venueList = new Array();
        $scope.mostRecentReview;
        
        $scope.getReviews = function (sentiText) {
		
        //This is the Alchemy API for getting the sentiment of the most recent review for a place.
        var callback = $http.get("http://gateway-a.watsonplatform.net/calls/text/TextGetTextSentiment" +
                            "?apikey=5f3b5ccd34a8fbb9203b943ce4f5f8728ae124cd" +
                            "&outputMode=json&text=" + sentiText);
                        callback.success(function (data) {
                            if(data!=null && data.docSentiment!=null)
                            {
				$scope.sentiment = data.docSentiment.type;
                            }
                        })
        }

    });
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


