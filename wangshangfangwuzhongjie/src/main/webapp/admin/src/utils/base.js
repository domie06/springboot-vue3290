const base = {
    get() {
        return {
            url : "http://localhost:8080/wangshangfangwuzhongjie/",
            name: "wangshangfangwuzhongjie",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wangshangfangwuzhongjie/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上房屋中介管理系统"
        } 
    }
}
export default base
