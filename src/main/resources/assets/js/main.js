(function (win) {
    //配置baseUrl
    var baseUrl = document.getElementById('main').getAttribute('data-baseurl');

    /*
     * 文件依赖
     */
    var config = {
        baseUrl: baseUrl,           //依赖相对路径
        paths: {                    //如果某个前缀的依赖不是按照baseUrl拼接这么简单，就需要在这里指出
            jquery: '../assets/js/libs/jquery-3.1.1.min',
            underscore: '../assets/js/libs/underscore-1.8.3/underscore',
            backbone: '../assets/js/libs/backbone-1.1.2/backbone',
            text: '../assets/js/libs/require-2.1/text',             //用于requirejs导入html类型的依赖
            router: '../assets/js/router'
        },
        shim: {                     //引入没有使用requirejs模块写法的类库。backbone依赖underscore
            'underscore': {
                exports: '_'
            },
            'jquery': {
                exports: '$'
            },
            'backbone': {
                deps: ['underscore', 'jquery'],
                exports: 'Backbone'
            },
            'router': {
                exports : 'router'
            }
        }
    };

    require.config(config);

    //Backbone会把自己加到全局变量中
    require(['backbone', 'underscore', 'router'], function(){
        Backbone.history.start();   //开始监控url变化
    });

})(window);