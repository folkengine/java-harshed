package com.electronicpanopticon.potemkin.haist;

import java.util.Map;

/**
 * Created by chris on 12/29/16.
 */
public class Haist<T> {

    private final String filename;
    private Class<T> clazz;

    public Haist(Class<T> clazz, String filename) {
        this.clazz = clazz;
        this.filename = filename;
    }

    public Map<String, T> read() {
        return null;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public String getFilename() {
        return this.filename;
    }
}
