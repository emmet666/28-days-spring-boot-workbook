## Spring Boot实现文件上传

## 实践作业需求
- 提供文件上传接口
- 提供文件下载接口
- 使用Postman测试、不写前端页面


spring Boot 利用 MultipartFile 的特性来接收和处理上传的文件，MultipartFile 是 Spring 的一个封装的接口，封装了文件上传的相关操作，利用 MultipartFile 可以方便地接收前端文件，将接收到的文件存储到本机或者其他中间件中。


## 说明

![](media/15618896430483/15618927039557.jpg)

在Postman中选form-data uploadFile参数选File类型


