package com.electronicpanopticon.potemkin;

import com.electronicpanopticon.potemkin.example.ImmutableExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by chris on 12/29/16.
 */
public class LaishFactoryTest {

    public LaishFactory<ImmutableExample> subject = new LaishFactory<>(ImmutableExample.class);

    @Test
    public void laishFactory() {
        assertEquals(ImmutableExample.class, subject.getBackedClass());
    }

    @Test
    public void factory() {
        Laish<ImmutableExample> lash = subject.factory("src/test/resources/raw/examples.json");
    }

}
