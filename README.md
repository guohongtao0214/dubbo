# dubbo
创建了关于dubbo的demo，有四个工程，dubbo-parent是管理公共jar包，dubbo-api是提供了公共接口和公用的pojo，dubbo-provider作为生产者，dubbo-consumer作为消费者，其中dubbo-provider和dubbo-consumer是Spring Boo的项目。
注册中心使用了zookeeper,启动zookeeper之后，生产者提供服务，并在zookeeper注册服务，消费者获取服务，在zookeeper获取服务。
dubbo使用了动态代理和多态的特性。
