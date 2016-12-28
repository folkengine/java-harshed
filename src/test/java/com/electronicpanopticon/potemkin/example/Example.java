package com.electronicpanopticon.potemkin.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableExample.class)
@JsonDeserialize(as = ImmutableExample.class)
public abstract class Example {
    public abstract String firstName();
    public abstract String lastName();
    public abstract int age();
    public abstract double height();
    public abstract double weight();
}
