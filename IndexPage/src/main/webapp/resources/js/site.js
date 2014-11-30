/*
 * angular part
 * */

(function() {
	
	var  app=angular.module('StoreMarket', []);
	
	app.factory('PageLink', function() {
		  return {
				"nav" : {
					"home" : "http://www.huangyuan3h.com/",
					"blog" : "http://blog.huangyuan3h.com/",
					"project" : "http://project.huangyuan3h.com/example/",
					"about" : "http://www.huangyuan3h.com/home/about",
				},
				"link":{
					"introduce":"http://project.huangyuan3h.com/introduce/#/First",
					"myGithub":"https://github.com/huangyuan3h",
					"spitfire":"http://project.huangyuan3h.com/spitfire-gui/",
				},
				"it":{
					"github":"https://github.com/",
					"jquery":"http://jquery.com/",
					"mvc":"http://www.asp.net/mvc",
					"django":"https://www.djangoproject.com/",
					"java":"http://www.oracle.com/technetwork/java/javaee/overview/index.html",
				}
			};
		});
	
	app.controller('headerCTRL', function($scope, PageLink) {
		  $scope.PageLink = PageLink;		  
		});
	
	app.controller('panelCTRL', function($scope, PageLink) {
		  $scope.PageLink = PageLink;		  
		});
	
	app.controller('footCTRL', function($scope, PageLink) {
		  $scope.PageLink = PageLink;		  
		});
	
	
})();

/**
 * jquery part
 */
function silde() {

	$("#creative-link").click(function() {
		$("#silde").animate({
			left : '0%'
		}, "slow");

		$(".silde-link").fadeTo(0, 0.5);
		$(this).fadeTo(0, 0.9);

	});

	$("#intelligence-link").click(function() {
		$("#silde").animate({
			left : '-100%'
		}, "slow");

		$(".silde-link").fadeTo(0, 0.5);
		$(this).fadeTo(0, 0.9);
	});

	$("#swift-link").click(function() {
		$("#silde").animate({
			left : '-200%'
		}, "slow");

		$(".silde-link").fadeTo(0, 0.5);
		$(this).fadeTo(0, 0.9);
	});

	$("#openSource-link").click(function() {
		$("#silde").animate({
			left : '-300%'
		}, "slow");

		$(".silde-link").fadeTo(0, 0.5);
		$(this).fadeTo(0, 0.9);
	});

}

/* main */
$(function() {

	silde();
});