package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */


enum class Type2(val jsonValue: String) {

    TYPE2_ONE("json_type_one"),
    TYPE2_TWO("json_type_two"),
    TYPE2_THREE("json_type_three");

    companion object {
        @JvmStatic
        fun get(jsonValue: String): Type2? {
            return Type2.values().firstOrNull { it.jsonValue == jsonValue }
        }
    }
}