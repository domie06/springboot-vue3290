import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fangwu from '@/views/modules/fangwu/list'
    import fangwuCollection from '@/views/modules/fangwuCollection/list'
    import fangwuLiuyan from '@/views/modules/fangwuLiuyan/list'
    import fangwuOrder from '@/views/modules/fangwuOrder/list'
    import gonggao from '@/views/modules/gonggao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryFangwu from '@/views/modules/dictionaryFangwu/list'
    import dictionaryFangwuCollection from '@/views/modules/dictionaryFangwuCollection/list'
    import dictionaryFangwuOrder from '@/views/modules/dictionaryFangwuOrder/list'
    import dictionaryFangwuzhuangtai from '@/views/modules/dictionaryFangwuzhuangtai/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryHuxing from '@/views/modules/dictionaryHuxing/list'
    import dictionaryQuyu from '@/views/modules/dictionaryQuyu/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryFangwu',
        name: '房屋类型',
        component: dictionaryFangwu
    }
    ,{
        path: '/dictionaryFangwuCollection',
        name: '收藏表类型',
        component: dictionaryFangwuCollection
    }
    ,{
        path: '/dictionaryFangwuOrder',
        name: '订单类型',
        component: dictionaryFangwuOrder
    }
    ,{
        path: '/dictionaryFangwuzhuangtai',
        name: '房屋状态',
        component: dictionaryFangwuzhuangtai
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryHuxing',
        name: '户型',
        component: dictionaryHuxing
    }
    ,{
        path: '/dictionaryQuyu',
        name: '区域',
        component: dictionaryQuyu
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/fangwu',
        name: '房屋',
        component: fangwu
      }
    ,{
        path: '/fangwuCollection',
        name: '房屋收藏',
        component: fangwuCollection
      }
    ,{
        path: '/fangwuLiuyan',
        name: '房屋留言',
        component: fangwuLiuyan
      }
    ,{
        path: '/fangwuOrder',
        name: '房屋订单',
        component: fangwuOrder
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
