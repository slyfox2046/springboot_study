# spring boot 学习



## spring-boot-04-web-restfulcrud

### 32.视频链接：https://www.bilibili.com/video/av23478787/?p=32

**注意事项**：

1. 版本：

   thymeleaf注入自定义版本

   ```xml
   <thymeleaf.version>3.0.10.RELEASE</thymeleaf.version>
   	<!-- 布局功能的支持程序  thymeleaf3主程序  layout2以上版本 -->
   	<!-- thymeleaf2   layout1-->
   <thymeleaf-layout-dialect.version>2.2.2</thymeleaf-layout-dialect.version>
   ```

2. 注意：

- Controller中使用@Controller注释，不要使用@RestController注释 （springboot版本2.0需要特别注意）
- 方法代码中也不要加@ResponseBoby ,估计返回的不需要是json格式



### 视频链接：https://www.bilibili.com/video/av23478787/?p=33

**注意事项：**

```java
//WebMvcConfigurerAdapter 已经启用，使用WebMvcConfigurer 接口，进行实现
public class MyMvcConfig implements WebMvcConfigurer {
    //使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("abc").setViewName("success");
    }
```













