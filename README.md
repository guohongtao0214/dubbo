# dubbo
创建了关于dubbo的demo，有四个工程，dubbo-parent是管理公共jar包，dubbo-api是提供了公共接口和公用的pojo，dubbo-provider作为生产者，dubbo-consumer作为消费者，其中dubbo-provider和dubbo-consumer是Spring Boot的项目。
注册中心使用了zookeeper,启动zookeeper之后，生产者提供服务，并在zookeeper注册服务，消费者获取服务，在zookeeper获取服务。<br>
dubbo使用了动态代理和多态的特性。<br>
要注意一个问题：@reference的使用，可能会出现空指针的异常。原因如下：<br>
              (a)dubbo的注解扫描配置在spring的配置文件里面，也就是说实例化在spring容器里面。<br>
              (b)Controller层里的注解扫描实际上在SpringMVC里面，也就是在子容器里面，这里就产生了两个上下文。<br>
所以在controller扫描的时候，没有注入进入进去，出现了null的情况。最后把@reference注入到Service里面。
              
