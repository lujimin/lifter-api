package com.lujimin.lifterapi.controller

import com.lujimin.lifterapi.result.R
import com.lujimin.lifterapi.service.NoticeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notice")
class NoticeController {
    @Autowired
    private lateinit var noticeService: NoticeService

    @GetMapping("/list")
    fun queryNoticeList(): R {
        val dataList = noticeService.queryNoticeList()
        val data = mapOf("totalRow" to 1, "totalPage" to 1, "dataList" to dataList)
        return R.ok(data)
    }

    @GetMapping("/detail")
    fun queryNoticeDetail(@RequestParam("id") id: String): R {
        val data = noticeService.queryNoticeDetail(id)
        return R.ok(data)
    }
}