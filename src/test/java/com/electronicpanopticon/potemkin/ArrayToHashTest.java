package com.electronicpanopticon.potemkin;

import com.electronicpanopticon.potemkin.example.Example;
import com.electronicpanopticon.potemkin.example.ExampleFake;
import com.electronicpanopticon.potemkin.example.ImmutableExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

/**
 * Created by chris on 12/4/16.
 */
public class ArrayToHashTest {

    public static void main(String... args) throws JsonProcessingException {
        Example ex = ImmutableExample.builder().age(19).firstName("Joe").height(6.2).lastName("Bob").weight(254.2).build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());

        String json = objectMapper.writeValueAsString(ExampleFake.fake());
        System.out.println(json);

        json = objectMapper.writeValueAsString(ExampleFake.fakes(4));
        System.out.println(json);
    }
}
