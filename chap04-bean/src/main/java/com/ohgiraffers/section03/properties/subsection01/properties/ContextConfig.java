package com.ohgiraffers.section03.properties.subsection01.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//
@PropertySource("section03/properties/product-info.properties")
public class ContextConfig {
    @Value("${food.kimchi.name}")
    private String foodname;
}
