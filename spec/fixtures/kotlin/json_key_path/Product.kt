package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject

open class Product : RealmObject() {

    object Relationships {
        const val SHOP: String = "shop"
    }

    var shop: Shop? = null
}
