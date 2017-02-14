package com.electronicpanopticon.potemkin.haist.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by chris on 1/3/17.
 */
public class HaistIOTest {

    @Test
    public void isDirectory() {
        assertTrue(HaistIO.isDirectory("/raw/directory/"));
    }

    @Test
    public void isDirectory_isFile_false() {
        assertFalse(HaistIO.isDirectory("/raw/examples.json"));
    }
}
