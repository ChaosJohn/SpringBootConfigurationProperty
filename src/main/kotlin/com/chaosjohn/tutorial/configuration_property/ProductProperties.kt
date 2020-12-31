package com.chaosjohn.tutorial.configuration_property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import kotlin.properties.Delegates

//@ConstructorBinding
@ConfigurationProperties(prefix = "product")
open class ProductProperties {
    lateinit var name: String
    var price by Delegates.notNull<Double>()
}