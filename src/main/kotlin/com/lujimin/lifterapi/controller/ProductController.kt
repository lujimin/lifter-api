package com.lujimin.lifterapi.controller

import com.lujimin.lifterapi.result.R
import com.lujimin.lifterapi.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/shop/goods")
class ProductController {

    @Autowired
    private lateinit var productService: ProductService

    @GetMapping("/category/all")
    fun queryCategory(): R {
        val data = productService.queryCategory()
        return R.ok(data)
    }

    @GetMapping("/{id}")
    fun queryNameById(@PathVariable("id") id: Long): R {
        val name: String = productService.queryNameById(id)
        val temp = mapOf("12" to name)
        return R.ok(temp)
    }
}