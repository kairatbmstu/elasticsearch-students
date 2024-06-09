package com.example.elasticsearch.elasticsearch_students.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(createIndex = true, indexName = "students")
public class Student {
    
    UUID id;

    String name;

    String age;

    String createDate;

    String content;
    
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
