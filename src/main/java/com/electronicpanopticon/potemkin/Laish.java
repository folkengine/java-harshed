package com.electronicpanopticon.potemkin;

import java.util.Map;

/**
 * Created by chris on 12/29/16.
 */
public class Laish<T> {

    private Class<T> tClass;

    public Laish(Class<T> tClass) {
        this.tClass = tClass;
    }

    public Map<String, T> read(String filename) {
        return null;
    }
}
