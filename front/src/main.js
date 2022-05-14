import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import router from '@/router'
import {getReq, postReq} from '@/utils/HttpApi';


const app = createApp(App);
app.config.globalProperties.$getReq = getReq;
app.config.globalProperties.$postReq = postReq;
app.use(ElementPlus)
    .use(router)
    .mount('#app')
