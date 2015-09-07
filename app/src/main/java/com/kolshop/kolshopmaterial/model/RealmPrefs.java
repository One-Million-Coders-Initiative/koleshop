package com.kolshop.kolshopmaterial.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Gundeep on 25/07/15.
 */
public class RealmPrefs extends RealmObject {

    @PrimaryKey
    private String key;
    private String value;

    public RealmPrefs() {
    }

    public RealmPrefs(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
