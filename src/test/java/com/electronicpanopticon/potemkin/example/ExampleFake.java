package com.electronicpanopticon.potemkin.example;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by chris on 12/29/16.
 */
public final class ExampleFake {

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
}
