package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */


import io.realm.RealmList;
import io.realm.RealmObject;

public class Shop extends RealmObject {

    public static final class Attributes {
        private Attributes() {
            // Hide constructor
        }

        public static final String NAME = "name";
        public static final String TYPE = "type";
    }

    public static final class Relationships {
        private Relationships() {
            // Hide constructor
        }

        public static final String PRODUCTS = "products";
    }

    private String name;
    private String type;
    private RealmList<Product> products;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(final RealmList<Product> products) {
        this.products = products;
    }

    public TypeA getTypeEnum() {
        return TypeA.get(getType());
    }

    public void setTypeEnum(final TypeA type) {
        this.type = type.getJsonValue();
    }
}
