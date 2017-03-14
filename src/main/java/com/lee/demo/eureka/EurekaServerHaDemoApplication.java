package com.lee.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 假设搭建2台Eureka Server构成HA集群
 * 使用方法：
 * 1）application-node1.yml和application-node2.yml
 * 2）将127.0.0.1 node1和127.0.0.1 node2配置到hosts文件中
 * 3）mvn clean package -Dmaven.test.skip=true -Drun.profiles=nodeX spring-boot:run分别启动node1和node2
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHaDemoApplication.class, args);
    }

}
