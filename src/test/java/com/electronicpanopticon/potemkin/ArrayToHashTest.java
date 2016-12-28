package com.electronicpanopticon.potemkin;

import com.electronicpanopticon.potemkin.example.Example;
import com.electronicpanopticon.potemkin.example.ImmutableExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

/**
 * Created by chris on 12/4/16.
 */
public class ArrayToHashTest {

    // Example ex1 = new Example
    public static void main(String... args) throws JsonProcessingException {
        Example ex = ImmutableExample.builder().age(19).firstName("Joe").height(6.2).lastName("Bob").weight(254.2).build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());

        String json = objectMapper.writeValueAsString(
                ImmutableExample.builder()
                        .age(19)
                        .firstName("Joe")
                        .height(6.2)
                        .lastName("Bob")
                        .weight(254.2)
                        .build());
        System.out.println(json);
    }
}
