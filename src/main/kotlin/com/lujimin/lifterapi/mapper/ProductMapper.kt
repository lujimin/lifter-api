package com.lujimin.lifterapi.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface ProductMapper {

    @Select("SELECT * FROM category WHERE is_use = 'Y'")
    fun queryCategory(): List<Map<String, String>>

    @Select("SELECT name FROM product where id = #{id}")
    fun queryNameById(@Param("id") id: Long): String
}