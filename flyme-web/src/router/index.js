import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import User from '../userviews/diruser.vue'
import Home from '../userviews/Home.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    // {
    //   path: '/user',
    //   name: 'user',
    //   component: User
    // }
    {
      path: '/user',
      name: 'user',
      component: () => import('../userviews/diruser')
    }

  ]
})
