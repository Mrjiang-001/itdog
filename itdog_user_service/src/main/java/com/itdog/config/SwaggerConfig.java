package com.itdog.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: swagger配置
 * @author: mhqf
 * @Date: 2022-07-02 23:37
 **/
@Configuration
@EnableOpenApi  //开启swagger文档功能
//@EnableSwaggerBootstrapUI //开启Swagger增强功能
@Profile({"dev","test"})
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enable}")
    private Boolean swaggerEnable;

    @Bean
    public Docket createDocApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())  //添加文档信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itdog.controller")) //设置扫描路径  选择要显示的包 如果是下面的写法则会将所有的接口都会展示出来 无论你有没有写注解
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //设置扫描方式  而这种写法则是将所有的有注解的接口展示出来
                .paths(PathSelectors.any())
                .build()
                .enable(swaggerEnable);
    }

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("itDog开发文档")
                .contact(new Contact("itDog", "重庆", "500510"))
                .version("1.0")
                .build();
    }
}
