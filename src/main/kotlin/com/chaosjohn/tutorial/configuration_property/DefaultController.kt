package com.chaosjohn.tutorial.configuration_property

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultController(val rootProperties: RootProperties, val userProperties: UserProperties) {

    @Qualifier("getProductProperties")
    @Autowired
    lateinit var productProperties: ProductProperties

    @Value(value = "\${server.port}")
    lateinit var port: String

    @RequestMapping(value = ["/"])
    @ResponseBody
    fun root(): Any {
        return rootProperties.greeting
    }

    @RequestMapping(value = ["/port"])
    @ResponseBody
    fun port(): Any {
        return port
    }

    @RequestMapping(value = ["/greetings"])
    @ResponseBody
    fun greetings(): Any {
        return rootProperties.greetings
    }

    @RequestMapping(value = ["/greetings/{languageCode}"])
    @ResponseBody
    fun greetingByLanguageCode(@PathVariable languageCode: String): Any? {
        return rootProperties.greetings[languageCode.toUpperCase()]
    }

    @RequestMapping(value = ["/user"])
    @ResponseBody
    fun user(): Any {
        return userProperties
    }

    @RequestMapping(value = ["/user/reset-age"])
    @ResponseBody
    fun resetUserAge(): Any {
        userProperties.age = 0
        return userProperties
    }

    @RequestMapping(value = ["/product"])
    @ResponseBody
    fun product(): Any {
        return productProperties
    }

    @RequestMapping(value = ["/product/reset-price"])
    @ResponseBody
    fun resetProductPrice(): Any {
        productProperties.price = 0.0
        return productProperties
    }
}