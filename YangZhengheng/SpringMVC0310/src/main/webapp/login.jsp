
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>


<div id="vid">

    <span>用户：{{name}}</span><p/>
    <span>密码：{{pwd}}</span><p/>
    <span>年龄：{{age}}</span><p/>
    <input type="button" value="LOOK" @click="getUser()" />


</div>
<form action="addUserInfo">
   职位： <input type="text" name="job">
   工资： <input type="text" name="money">
    <input type="submit" value="提交">
</form>


<script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>
<!--AJAX-->
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>

<script>
    new Vue({
        el:"#vid",
        data:{

            name:"",
            pwd:"",
            age:""
        },
        methods:{
            getUser:function (str) {
                //发送get请求
                this.$http.get("login").then(function(result){
                    var r= result.body;
                    //把json字符串转换为json对象
                    var json_r=   JSON.parse(r);
                    //填充数据
                    this.name=json_r.name;
                    this.pwd=json_r.pwd;
                    this.age=json_r.age;
                },function(){
                    console.log('请求失败处理');
                });
            }
        }
    });
</script>
</body>
</html>
