### 1. Axios简介
- axios 前端异步请求库，类似jquery,ajax技术
- ajax 用来在页面发起异步请求到后端服务，并将后端服务响应数据渲染到页面上
- jQuery推荐ajax技术，但是在vue中不用在使用jQuery了，直接用axios来发送异步请求就可以了

- 总结：用来在前端页面发起一个异步请求，请求之后页面不动，响应回来时局部刷新页面
- 官方定义：axios异步请求库 第三方的库，特点就是简洁高效，HTTP库==》发送HTTP异步请求库
- 官网：http://www.axios-js.com/zh-cn/docs/

### 2. Axios特性
- 从浏览器创建 XMLHttpRequests
- 从node.js 发出 http 请求
- 支持 Promise API
- 拦截请求(request) 和响应(response) ★★★
- 转换请求和响应数据
- 终止请求
- 自动转换 JSON 数据
- Client 端支持防范 XSRF

### 3. 基本使用
a. 下载核心js文件
https://unpkg.com/axios/dist/axios.min.js

b. 页面引入axios核心文件
<script src="js/axios.min.js"></script>

c. 发送异步请求
- get
- post

