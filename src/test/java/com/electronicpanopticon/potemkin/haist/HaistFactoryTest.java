package com.electronicpanopticon.potemkin.haist;

import com.electronicpanopticon.potemkin.example.ImmutableExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chris on 12/29/16.
 */
public class HaistFactoryTest {

    public HaistFactory<ImmutableExample> subject = new HaistFactory<>(ImmutableExample.class);

    @Test
    public void laishFactory() {
        assertEquals(ImmutableExample.class, subject.getClazz());
    }

    @Test
    public void factory() {
        Haist<ImmutableExample> haist = subject.factory("src/test/resources/raw/examples.json");

        assertEquals(ImmutableExample.class, haist.getClazz());
    }

}
