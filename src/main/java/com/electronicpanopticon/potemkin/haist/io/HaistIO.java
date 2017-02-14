package com.electronicpanopticon.potemkin.haist.io;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.net.URL;

/**
 * Created by chris on 1/3/17.
 */
public class HaistIO {

    private static ClassLoader cl;
    private static ResourcePatternResolver resolver;

    static {
        cl = HaistIO.class.getClassLoader();
        resolver = new PathMatchingResourcePatternResolver(cl);
    }

    public static boolean isDirectory(String path) {
        URL dirURL = cl.getResource(path);
        return dirURL.getProtocol().equals("file");
    }

}
