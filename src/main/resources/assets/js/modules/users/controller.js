define(['users/user', 'users/view'], function (Model, View) {

    var controller = function () {
        var model = new Model();
        model.set({
            name:'abc'               //设置默认的属性值
        });
        var view = new View({model:model});
        view.render();      //利用Model定义的默认属性初始化界面
        model.fetch();          //拉取cgi等等，获取数据，再触发事件，界面收到消息做相应的动作
    };

    return controller;
});