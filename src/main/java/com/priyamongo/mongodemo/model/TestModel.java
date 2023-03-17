package com.priyamongo.mongodemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "test-data")
public class TestModel {
    @Id
    private Long id;

    @Field
    private String name;

    @Field
    private int number;

    @Field
    private String address;
}
