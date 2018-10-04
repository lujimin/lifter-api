package com.lujimin.lifterapi.mapper

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface NoticeMapper {

    @Select("SELECT id, title FROM notice WHERE is_show = 'Y'")
    fun queryNoticeList(): List<Map<String, String>>

    @Select("SELECT content FROM notice WHERE id = #{id}")
    fun queryNoticeDetail(id: String): Map<String, String>
}