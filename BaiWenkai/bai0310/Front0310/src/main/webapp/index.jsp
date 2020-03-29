<html>
<head>
    <script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>
    <script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
    <script>
        window.onload = function () {
            new Vue({
                el:"#vd",
                data:{
                    info:"hello vue",
                    id:"",
                    name:"",
                    pwd:"",
                    age:""
                },
                methods:{
                    findById:function (id) {
                        this.$http.get("user/findById/"+id).then(function(result){
                            var info = JSON.stringify(result);

                            alert(info);
                            var user = result.body;

                            var userJson = JSON.parse(user);

                            this.id=userJson.id;
                            this.name=userJson.name;
                            this.pwd=userJson.pwd;
                            this.age=userJson.age;
                        },function(result){
                            var r = JSON.stringify(result)
                            alert("fail");
                            alert(r);
                        });
                    },
                    addUser: function () {
                        this.$http.post("user/addUser",
                            {name: document.getElementById("name").value(),
                                pwd: document.getElementById("pwd").value(),
                                age: document.getElementById("age").value()},
                            {emulateJSON: true}).then(function (result) {
                                var user = result.body;
                                var userJson = JSON.parse(user);
                                this.id = userJson.id;
                                this.name = userJson.name;
                                this.pwd = userJson.pwd;
                                this.age = userJson.age
                        }, function (result) {
                                alert("fail");
                                alert(JSON.parse(result));
                        });
                    }

                }
            })
        }
    </script>
</head>
<body>
<h2>front0310:Hello World!</h2>
<div id="vd">
    {{info}}<br>
    user:<span>{{name}}</span><p/>
    pwd:<span>{{pwd}}</span><p/>
    age:<span>{{age}}</span><p/>
    <div style="display: none">
        <span>{{id}}</span>
    </div>
    <input type="button" @click="findById(1)" value="getUser"/>
    <br>
    <h4>register</h4>
    <form method="post" action="user/addUser">
    name:<input type="text" id="name"><br>
    pwd:<input type="password" id="pwd"><br>
    age:<input type="text" id="age"><br>
    <input type="button" value="addUser" @click="addUser">
    </form>
</div>
</body>
</html>
