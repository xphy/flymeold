<template>
  <div class="user">
    <Button type="success">Success</Button>
    <table>
      <tr>
        <td>编号</td>
        <td>真实姓名</td>
        <td>登录名</td>
      </tr>
<!--      <tr v-for="(item,index) in date">-->
<!--          <td>{{index}}</td>-->
<!--          <td>{{item.realName}}</td>-->
<!--          <td>{{item.loginName}}</td>-->
<!--      </tr>-->
    </table>
  </div>
</template>
<script>
    import { Button } from 'iview'    //用到什么组件引入什么组件
  export default {
      name:'user',
      components:{
          Button
      },
      created(){
        //   this.$axios.get("/api/user/dirUser").then(function (resp) {
        //       console.log(resp)
        // })
      },
      mounted() {
          this.getUser();
      },
      methods: {
          getUser() {
              // let url = "http://192.168.140.1:8888";
              //let url = "http://localhost:9999";
              this.$axios.get(`/api/user/dirUser`)
                  .then(res => {
                    console.log(res)
                  })
                  .catch(function (error) {
                      console.log(error);
                  });
          }
      }
  }

</script>


