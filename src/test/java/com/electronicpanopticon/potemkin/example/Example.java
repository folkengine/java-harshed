package com.electronicpanopticon.potemkin.example;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Example {
    public abstract String firstName();
    public abstract String lastName();
    public abstract int age();
    public abstract double height();
    public abstract double weight();
}
