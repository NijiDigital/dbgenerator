package com.gyro.tests;

import java.util.Date;
import io.realm.RealmObject;

/* DO NOT EDIT | Generated by gyro */

public class User extends RealmObject {

    public static final class Attributes {
        private Attributes() {
            // Hide constructor
        }

        public static final String BIRTHDAY = "birthday";
        public static final String NAME = "name";
    }

    public static class Relationships {
        private Relationships() {
            // Hide constructor
        }

        public static final String FIDELITY_CARD = "fidelityCard";
    }

    private Date birthday;
    private String name;
    private FidelityCard fidelityCard;

    @android.support.annotation.NonNull
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(@android.support.annotation.NonNull final Date birthday) {
        this.birthday = birthday;
    }

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    @android.support.annotation.NonNull
    public FidelityCard getFidelityCard() {
        return fidelityCard;
    }

    public void setFidelityCard(@android.support.annotation.NonNull final FidelityCard fidelityCard) {
        this.fidelityCard = fidelityCard;
    }
}
