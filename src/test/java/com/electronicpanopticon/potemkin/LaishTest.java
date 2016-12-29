package com.electronicpanopticon.potemkin;

import com.electronicpanopticon.potemkin.example.Example;
import com.electronicpanopticon.potemkin.example.ExampleFake;
import com.electronicpanopticon.potemkin.example.ImmutableExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chris on 12/4/16.
 */
public class LaishTest {

    @Test
    public void examples() {
        Laish<ImmutableExample> lash = new Laish<>(ImmutableExample.class);

        Map<String, ImmutableExample> map = lash.read("src/test/resources/raw/examples.json");

        // assertEquals(map.get("0ef536ef-4b39-4212-ac4b-809110038de7").firstName(), "Wallace");

    }

    public static void main(String... args) throws JsonProcessingException {
        Example ex = ImmutableExample.builder().id("boop").age(19).firstName("Joe").height(6.2).lastName("Bob").weight(254.2).build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());

        String json = objectMapper.writeValueAsString(ExampleFake.fake());
        System.out.println(json);

        json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ExampleFake.fakes(14));
        System.out.println(json);
    }
}
