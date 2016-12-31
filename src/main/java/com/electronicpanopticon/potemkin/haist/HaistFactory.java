package com.electronicpanopticon.potemkin.haist;

/**
 * Created by chris on 12/29/16.
 */
public class HaistFactory<T> {

    private Class<T> clazz;

    public HaistFactory(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public Haist<T> factory(String filename) {
        return new Haist<T>(clazz, filename);
    }
}
