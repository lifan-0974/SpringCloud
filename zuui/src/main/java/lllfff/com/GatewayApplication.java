package lllfff.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//包含了@enablezuulserver，设该类是网关的启动类
@EnableZuulProxy
//帮助springboot应用将所有符合条件的@configuration配置加载到当前springboot创建并使用的IOC容器中
@EnableAutoConfiguration
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
