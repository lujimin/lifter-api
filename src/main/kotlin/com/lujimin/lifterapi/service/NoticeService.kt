package com.lujimin.lifterapi.service

import com.lujimin.lifterapi.mapper.NoticeMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoticeService {
    @Autowired
    private lateinit var noticeMapper: NoticeMapper

    //获取公告列表
    fun queryNoticeList() = noticeMapper.queryNoticeList()

    //获取公告内容
    fun queryNoticeDetail(id: String) = noticeMapper.queryNoticeDetail(id)
}