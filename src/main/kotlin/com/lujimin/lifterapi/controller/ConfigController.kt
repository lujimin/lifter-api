package com.lujimin.lifterapi.controller

import com.lujimin.lifterapi.result.R
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/config")
class ConfigController {

    @GetMapping("/get-value")
    fun getValue(@RequestParam("key") key: String): R {
        val value = when (key) {
            "mallName" -> "剪叉车平台"
            else -> ""
        }
        return R.ok(mapOf("value" to value))
    }
}