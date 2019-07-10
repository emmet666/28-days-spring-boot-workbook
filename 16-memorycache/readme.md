# Spring Boot 操作 Memcache

## 实践课程需求

- 略
- 实际项目中使用Redis

## 笔记

### Memchae

Memcache 是一个自由和开放源代码、高性能、分配的内存对象缓存系统。简单来说，Memcache 是一个高性能的分布式内存对象的 key-value 缓存系统

### Memcache 特点

- 协议简单

- 基于 Libevent 的事件处理

- 内置内存存储方式

#### 不适应场景

- 缓存对象不能大于 1 MB
- key 的长度大于 250 字符
- Memcache 未提供任何安全策略
- 不支持持久化



