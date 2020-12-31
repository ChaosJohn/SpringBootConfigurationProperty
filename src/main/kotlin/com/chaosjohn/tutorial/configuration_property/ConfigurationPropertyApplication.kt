package com.chaosjohn.tutorial.configuration_property

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(value = [RootProperties::class, UserProperties::class, ProductProperties::class])
class ConfigurationPropertyApplication

fun main(args: Array<String>) {
    runApplication<ConfigurationPropertyApplication>(*args)
}
