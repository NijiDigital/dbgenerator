package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Required;

public class Shop extends RealmObject {

    public static final class Attributes {
        public static final String NAME = "name";
        public static final String READ_ONLY = "readOnly";

        private Attributes() {
            // Hide constructor
        }
    }

    public static final class Relationships {
        public static final String OWNER = "owner";
        public static final String PRODUCTS = "products";

        private Relationships() {
            // Hide constructor
        }
    }

    @Ignore
    private String ignored;
    @Ignore
    private String ignored2;
    @Required
    private String name;
    private Owner owner;
    private RealmList<Product> products;

    public String getIgnored() {
        return ignored;
    }

    public void setIgnored(final String ignored) {
        this.ignored = ignored;
    }

    public String getIgnored2() {
        return ignored2;
    }

    public void setIgnored2(final String ignored2) {
        this.ignored2 = ignored2;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public RealmList<Product> getProducts() {
        return products;
    }

    public void setProducts(final RealmList<Product> products) {
        this.products = products;
    }
}
