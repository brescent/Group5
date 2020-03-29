<%--
  Created by IntelliJ IDEA.
  User: 69170
  Date: 2020/3/28
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="lid">
    <table border="2">
        <tr>
            <td>权限名</td>
            <td>权限地址</td>
        </tr>
        <tr v-for="power in info">
            <td>{{power.powerName}}</td>
            <td>{{power.powerUrl}}</td>
        </tr>
    </table>
</div>
<script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>
<!--AJAX-->
<script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<!--Axios-->
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

<script>
    new Vue({
        el:"#lid",
        data:{
            info:"",
        },
        mounted:function () {
            var obj=this;
            axios.get('find')
                .then(function (response) {
                    obj.info=response.data ;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

    });

</script>
</body>
</html>
