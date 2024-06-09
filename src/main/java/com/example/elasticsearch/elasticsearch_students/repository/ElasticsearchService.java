package com.example.elasticsearch.elasticsearch_students.repository;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elasticsearch.elasticsearch_students.domain.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import jakarta.annotation.PostConstruct;

@Service
public class ElasticsearchService {
    private final ElasticsearchClient client;
    private final ObjectMapper objectMapper;

    @Autowired
    public ElasticsearchService(ElasticsearchClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }

    public String indexDocument(String index, String id, Student document) throws IOException {
        co.elastic.clients.elasticsearch.core.IndexResponse response = client.index(i -> i
            .index("students")
            .id(document.getId().toString())
            .document(document)
        );

        return "ok";
    }


    @PostConstruct 
    public void init() throws ElasticsearchException, IOException{
        // var map = new HashMap<String,Object>();
        // map.put("create_date", "");
        // client.indices().create(c -> c
        //         .index("products")
        //         .mappings( m -> m.properties(null))
        // );
    }
}
