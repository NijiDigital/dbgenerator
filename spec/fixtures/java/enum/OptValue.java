package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

public enum OptValue {

    OPT_VALUE_ONE("OptValueOne"),
    OPT_VALUE_TWO("OptValueTwo"),
    OPT_VALUE_THREE("OptValueThree");

    private final String jsonValue;

    OptValue(final String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public static OptValue get(final String jsonValue) {
        for (final OptValue type : OptValue.values()) {
            if (type.getJsonValue().equals(jsonValue)) {
                return type;
            }
        }
        return null;
    }

    public String getJsonValue() {
        return jsonValue;
    }
}
