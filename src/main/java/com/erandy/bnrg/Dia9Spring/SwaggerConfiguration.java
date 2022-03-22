/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erandy.bnrg.Dia9Spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * 
 */
@Configuration
//@EnableSwagger2
@EnableWebMvc
public class SwaggerConfiguration {

   /* @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build();
    }*/
}
