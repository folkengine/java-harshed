package com.electronicpanopticon.potemkin.example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.javafaker.Faker;
import org.immutables.value.Value;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonSerialize
@Value.Immutable
public abstract class Example {
    public abstract String id();
    public abstract String firstName();
    public abstract String lastName();
    public abstract int age();
    public abstract double height();
    public abstract double weight();

    public static Example fake() {
        Faker faker = new Faker(new Random());

        return ImmutableExample.builder()
                .id(UUID.randomUUID().toString())
                .age(faker.number().numberBetween(18, 70))
                .firstName(faker.name().firstName())
                .height(faker.number().randomDouble(1, 150, 220))
                .lastName(faker.name().lastName())
                .weight(faker.number().randomDouble(1, 95, 300))
                .build();
    }

    public static List<Example> fakes(int count) {
        return Stream.generate(() -> ExampleFake.fake()).limit(count).collect(Collectors.toList());
    }

    public static void main(String... args) {
        Example.fakes(10).stream().forEach(example -> System.out.println(example));
    }
}
