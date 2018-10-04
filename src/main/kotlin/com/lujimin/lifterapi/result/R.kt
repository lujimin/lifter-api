package com.lujimin.lifterapi.result

class R private constructor(var code: Int, var msg: String, var data: Any) {

    companion object {
        fun ok(msg: String, data: Any): R {
            return R(0, msg, data)
        }

        fun ok(msg: String): R {
            return R(0, msg, "")
        }

        fun ok(data: Any): R {
            return R(0, "success", data)
        }

        fun ok(): R {
            return R(0, "success", "")
        }

        fun error(code: Int, msg: String): R {
            return R(code, msg, "")
        }

        fun error(msg: String): R {
            return R(500, msg, "")
        }

        fun error(): R {
            return R(500, "未知错误，请联系管理员!", "")
        }
    }

}
