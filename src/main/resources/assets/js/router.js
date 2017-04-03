define(['backbone'], function () {

    var Router = Backbone.Router.extend({

        routes: {
            'users': 'users',
            '*actions': 'defaultAction'
        },

        //路由初始化可以做一些事
        initialize: function () {
        },

        users: function() {
            var url = 'users/controller.js';
            require([url], function (controller) {
                controller();
            });
        },

        defaultAction: function () {
            console.log('404');
            location.hash = 'users';
        }

    });

    var router = new Router();
    router.on('route', function (route, params) {
        console.log('hash change', arguments);  //这里route是路由对应的方法名
    });

    return router;    //这里必须的，让路由表执行
});