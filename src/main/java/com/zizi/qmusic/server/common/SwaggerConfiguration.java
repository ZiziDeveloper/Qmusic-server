package com.zizi.qmusic.server.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private Boolean swaggerSwitch = true;

    @Bean
    public Docket createRestApi() {
        // http://localhost:8221/swagger-ui.html
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(swaggerSwitch)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zizi.qmusic.server.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Qmusic项目 - API文档")
                .description("Qmusic项目 - API文档")
                .build();
    }
}
