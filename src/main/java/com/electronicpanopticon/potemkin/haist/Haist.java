package com.electronicpanopticon.potemkin.haist;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import java.io.IOException;
import java.util.Map;
import java.util.function.Function;

public class Haist<T> {

    private final String filename;
    private Class<T> clazz;
    private final ObjectMapper objectMapper;

    public Haist(Class<T> clazz, String filename) {
        this(clazz, filename, new ObjectMapper().registerModule(new Jdk8Module()));
    }

    public Haist(Class<T> clazz, String filename, ObjectMapper objectMapper) {
        this.clazz = clazz;
        this.filename = filename;
        this.objectMapper = objectMapper;
    }

    public Map<String, T> read(Function<Void, String> pivot) throws IOException {

//        InputStream in = this.getClass().getClassLoader().getResourceAsStream(filename);
//        String json = IOUtils.toString(in, "UTF-8");
//
//        List<T> list =
//                objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
//
//        ImmutableMap<String, T> map =
//                list.stream().collect(Collectors.toMap(pivot, pivot));
//        ImmutableMap<Integer, String> stringsByIndex = Maps.uniqueIndex(strings, new Function<String, Integer> () {
//            public Integer apply(String string) {
//                return string.length();
//            }
//        });
//
//        return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));

        return null;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public String getFilename() {
        return this.filename;
    }
}
