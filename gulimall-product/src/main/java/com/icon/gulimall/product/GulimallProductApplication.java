package com.icon.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
  * 1.整合MyBatis-Plus
  *     1)导入依赖
 *             <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.4.2</version>
 *         </dependency>
 *      2)配置
 *          a.配置数据源
 *              导入数据库驱动
 *              在yml里面配置信息
 *          b.配置mybatis-plus相关的信息
 *              使用mapper-scan
 *              告诉mybatis-plus,sql映射文件在哪
  */

@MapperScan("com.icon.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
