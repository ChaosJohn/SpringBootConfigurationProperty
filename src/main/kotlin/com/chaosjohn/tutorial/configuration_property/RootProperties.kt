package com.chaosjohn.tutorial.configuration_property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties
data class RootProperties(
    var greeting: String,
    var greetings: Map<String, String>
)