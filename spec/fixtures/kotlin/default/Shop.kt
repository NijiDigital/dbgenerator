package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject
import io.realm.annotations.Required

class Shop : RealmObject() {

    object Attributes {
        const val ACTIVE: String = "active"
        const val BUDGET: String = "budget"
        const val IS_OPEN: String = "isOpen"
        const val NAME: String = "name"
        const val NUMBER_OF_ARRIVALS: String = "numberOfArrivals"
        const val NUMBER_OF_PRODUCTS: String = "numberOfProducts"
        const val PROMO: String = "promo"
        const val SLOGAN: String = "slogan"
    }

    @Required
    var active: Boolean = true
    @Required
    var budget: Double = 26000.35
    @Required
    var isOpen: Boolean = false
    @Required
    var name: String = ""
    @Required
    var numberOfArrivals: Int = 0
    @Required
    var numberOfProducts: Int = 155
    @Required
    var promo: Double = 0.0
    @Required
    var slogan: String = "The best place to be"
}
