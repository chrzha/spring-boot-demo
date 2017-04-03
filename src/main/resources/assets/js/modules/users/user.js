define([], function () {
    var User = Backbone.Model.extend({

        //模型默认的数据
        defaults: function () {
            return {
                name: 'chris',
                id:'001'
            };
        },

        // 定义一些方法
        fetch: function () {
            var o = this;
            //可以做一些http请求
            setTimeout(function(){
                o.set({name:'vivi',id:'002'});
                o.trigger('nameEvent');     //向view触发事件
            }, 1000);
        }

    });

    return User;
});