# Spring Data JPA 和 Thymeleaf 综合实践

## 笔记


```
spring.thymeleaf.cache=false
```
- spring.Thymeleaf.cache=false 是关闭 Thymeleaf 的缓存，不然在开发过程中修改页面不会立刻生效需要重启，生产可配置为 true

- 在处理前端业务一般是使用 param 结尾的参数来处理，在项目下新建 param 包

```
BeanUtils.copyProperties(userParam,user);
```

- Param 到 module的copy

***分页查询的实现***

```
@RequestMapping("/list")
public String list(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page,
                   @RequestParam(value = "size", defaultValue = "6") Integer size) {
    Sort sort = new Sort(Sort.Direction.DESC, "id");
    Pageable pageable = PageRequest.of(page, size, sort);
    Page<User> users=userRepository.findList(pageable);
    model.addAttribute("users", users);
    return "user/list";
}
```

- @RequestParam 常用来处理简单类型的绑定，注解有三个属性：value、required 和 defaultValue；value 用来指定要传入值的 ID 名称，required 用来指示参数是否必须绑定，defaultValue 可以设置参数的默认值。


