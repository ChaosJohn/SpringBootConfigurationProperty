package com.chaosjohn.tutorial.configuration_property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.Email

@Validated
@Component
//@ConstructorBinding
@ConfigurationProperties(prefix = "order", ignoreInvalidFields = true)
class OrderProperties {
    @Email
    lateinit var id: String
    var paid: Boolean = false
}