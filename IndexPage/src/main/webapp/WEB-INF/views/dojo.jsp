<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>
<html>
<head>
<title>Home</title>
<!-- dojo support -->
<script src="http://ajax.googleapis.com/ajax/libs/dojo/1.10.2/dojo/dojo.js"></script>
</head>
<body>
<h1 id="greeting">Hello</h1>

 
    <script>
        require([
            'dojo/dom',
            'dojo/dom-construct'
        ], function (dom, domConstruct) {
            var greetingNode = dom.byId('greeting');
            domConstruct.place('<i> Dojo!</i>', greetingNode);
        });
        
        
        
        require([
                 'dojo/dom',
                 'dojo/fx',
                 'dojo/domReady!'
             ], function (dom, fx) {
                 // The piece we had before...
                 var greeting = dom.byId('greeting');
                 greeting.innerHTML += ' from Dojo!';
              
                 // ...but now, with an animation!
                 fx.slideTo({
                     node: greeting,
                     top: 100,
                     left: 200
                 }).play();
             });
    </script>
<hr/>

</body>
</html>

