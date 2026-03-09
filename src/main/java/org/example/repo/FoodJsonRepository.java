package org.example.repo;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Food;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FoodJsonRepository implements AutoCloseable{

//    private final ObjectMapper mapper;
//    private final Path baseDir;
//    private final Map<String, Food> cache;
//    private int dirtyChanges;
//
//    public FoodJsonRepository(Path baseDir, String file) throws IOException{
//        this.baseDir = baseDir;
//        this.baseDir.resolve(file); // Food.json
//        this.mapper = new ObjectMapper();
//        this.cache = new HashMap<>();
//        this.dirtyChanges = 0;
//    }



    @Override
    public void close() throws IOException {

    }
}
