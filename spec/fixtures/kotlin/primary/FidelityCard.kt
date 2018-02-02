package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required

class FidelityCard : RealmObject() {

    object Attributes {
        const val IDENTIFIER: String = "identifier"
        const val POINTS: String = "points"
    }

    object Relationships {
        const val USER: String = "user"
    }

    @PrimaryKey
    var identifier: Short = 0
    @Required
    var points: Int = 0
    var user: User? = null
}
