import * as VueRouter from 'vue-router';

const constantRouterMap = [
    {
        path: '/',
        name: 'Default',
        redirect: '/login'
    },
    {
        path: '/login',
        name: 'Login',
        component: () => import('@/components/LoginView')
    },
    {
        path: '/register',
        name: 'register',
        component: () => import('@/components/RegisterView')
    },
    {
        path: '/sysAdmin',
        name: 'SysAdmin',
        component: () => import('@/components/sys/SysAdminList')
    }
]

const router = VueRouter.createRouter({
    history: VueRouter.createWebHashHistory(),
    routes: constantRouterMap
})


export default router