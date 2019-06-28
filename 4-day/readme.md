# Spring Boot jsp

## 配置文件

```
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
```
- spring.mvc.view.prefix 指明 jsp 文件在 webapp 下的哪个目录
- spring.mvc.view.suffix 指明 jsp 以什么样的后缀结尾

## 引入依赖包

引入 jstl 和内嵌的 tomcat，jstl 是一个 JSP 标签集合，它封装了 JSP 应用的通用核心功能。tomcat-embed-jasper 主要用来支持 JSP 的解析和运行。

## 打包发布
在项目根目录执行 maven 命令：

`mvn clean package`

***实际项目中推荐使用单独的 Tomcat 来部署使用 JSP 的项目，内嵌的 Tomcat 还不是很稳定，偶尔会出现访问迟缓的现象。***

