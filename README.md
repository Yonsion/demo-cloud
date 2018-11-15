## demo-cloud
SpringCloud学习demo
# eureka集群
eureka/eureka1/eureka2这3个包分别是3个eureka服务，分别启动起来形成1个集群。
# 微服务集群
provider/provider1/provider2这3个包分别是3个相同的微服务，这3个微服务同时注册在eureka集群中，分别启动起来形成1个集群。
# Ribbon
ribbon这个是通过ribbon实现负载均衡的微服务，分别均衡的调用provider的服务。
# Feign
feign这个是通过feign实现负载均衡的微服务，分别均衡的调用provider的服务。
