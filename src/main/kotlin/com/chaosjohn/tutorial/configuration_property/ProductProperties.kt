package com.chaosjohn.tutorial.configuration_property

import org.springframework.boot.context.properties.ConfigurationProperties
import kotlin.properties.Delegates

//@ConstructorBinding
@ConfigurationProperties(prefix = "product")
class ProductProperties {
    lateinit var name: String
    var seller: String = ""
    var price by Delegates.notNull<Double>()
    var weight: Int = 0
}