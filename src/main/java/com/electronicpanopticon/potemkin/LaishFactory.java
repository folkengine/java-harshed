package com.electronicpanopticon.potemkin;

/**
 * Created by chris on 12/29/16.
 */
public class LaishFactory<T> {

    private Class<T> clazz;

    public LaishFactory(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getBackedClass() {
        return clazz;
    }

    public Laish<T> factory(String filename) {
        return null;
    }
}
