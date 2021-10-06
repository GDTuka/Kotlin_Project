package com.example.test

import java.io.Serializable

data class Data(
    var name :String? = null,
    var decs : String? = null,
    val rnd : String? = null,
    val msg: String? = null
) :Serializable