# Spring Boot MyBatis


## 实践作业需求

- 由于项目中大多使用JPA模式，MyBatis 的sql编写太多，不太适合。如果不是有DBA强制要求，不太推荐。
- 因此。略

## ORM

ORM (Object Relational Mapping), 对象关系映射。是一种为了解决面向对象与关系数据库存在的互不匹配的现象的技术。ORM 是通过使用描述对象和数据库之间映射的元数据，将程序中的对象自动持久化到关系数据库中。

## MyBatis

1. 优点

- SQL 被统一提取出来，便于统一管理和优化
- SQL 和代码解耦，将业务逻辑和数据访问逻辑分离，使系统的设计更清晰、更易维护、更易单元测试
- 提供映射标签，支持对象与数据库的 ORM 字段关系映射
- 提供对象关系映射标签，支持对象关系组件维护
- 灵活书写动态 SQL，支持各种条件来动态生成不同的 SQL

2. 缺点

- 编写 SQL 语句时工作量很大，尤其是字段多、关联表多时，更是如此
- SQL 语句依赖于数据库，导致数据库移植性差


