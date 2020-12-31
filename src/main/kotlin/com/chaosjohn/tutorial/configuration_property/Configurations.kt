package com.chaosjohn.tutorial.configuration_property

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configurations {

    @Bean
//    @Bean(value = ["getProductProperties"])
    fun getProductProperties() = ProductProperties()
}