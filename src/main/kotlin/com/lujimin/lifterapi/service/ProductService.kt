package com.lujimin.lifterapi.service

import com.lujimin.lifterapi.mapper.ProductMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {

    @Autowired
    private lateinit var productMapper: ProductMapper

    fun queryCategory() = productMapper.queryCategory()

    fun queryNameById(id: Long) = productMapper.queryNameById(id)
}