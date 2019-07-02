# Spring Boot RESTful

## 实践 
略

## RESTful 概念

RESTful 架构一个核心概念是“资源”（Resource）。从 RESTful 的角度看，网络里的任何东西都是资源，它可以是一段文本、一张图片、一首歌曲、一种服务等，每个资源都对应一个特定的 URI（统一资源定位符），并用它进行标示，访问这个 URI 就可以获得这个资源。

资源可以有多种表现形式，也就是资源的“表述”（Representation），比如一张图片可以使用 JPEG 格式也可以使用 PNG 格式。URI 只是代表了资源的实体，并不能代表它的表现形式。

这种互动只能使用无状态协议 HTTP，也就是说，服务端必须保存所有的状态，客户端可以使用 HTTP 的几个基本操作，包括 GET（获取）、POST（创建）、PUT（更新）与 DELETE（删除），使得服务端上的资源发生“状态转化”（State Transfer），也就是所谓的“表述性状态转移”

## Spring Boot 对 RESTful 的支持

- @GetMapping，处理 Get 请求
- @PostMapping，处理 Post 请求
- @PutMapping，用于更新资源
- @DeleteMapping，处理删除请求
- @PatchMapping，用于更新部分资源

> PUT 和 POST区别，PUT操作上幂等的，而POST不是



