# Spring Boot JDBC

## 实践课程

- 推荐使用ORM，JDBC在实际的项目中应用不多，因此只做了解


## JDBC

1. JDBC（Java Data Base Connectivity，Java 数据库连接）是一种用于执行 SQL 语句的 Java API，可以为多种关系数据库提供统一访问，它由一组用 Java 语言编写的类和接口组成
2. JDBC 就是一套 Java 访问数据库的 API 规范，利用这套规范屏蔽了各种数据库 API 调用的差异性。

## JDBC 操作数据库的步骤

1. 加载数据库驱动
2. 建立数据库连接
3. 创建数据库操作对象
4. 定义操作的 SQL 语句
5. 执行数据库操作
6. 获取并操作结果集
7. 关闭对象，回收资源

