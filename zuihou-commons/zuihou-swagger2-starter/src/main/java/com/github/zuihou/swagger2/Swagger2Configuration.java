package com.github.zuihou.swagger2;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zuihou
 * @date 2018/11/18 9:20
 */
@Configuration
@ConditionalOnProperty(name = "zuihou.swagger.enabled", matchIfMissing = true)
//@Import({Swagger2DocumentationConfiguration.class, SwaggerBootstrapUIConfiguration.class,
//        SecurityConfiguration.class, MarkdownFileConfiguration.class
//})
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Configuration {
}