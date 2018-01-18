package com.example.demo

import org.springframework.stereotype.Component

//このクラスのオブジェクトがDI対象になるよう登録
@Component
class EnglishGreeter : Greeter {
    override fun hello(name: String): String = "Hello,$name!"
}