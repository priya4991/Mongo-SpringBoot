package com.priyamongo.mongodemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "test-data")
public class TestModel {
    @Id
    private String id;

    @Field
    private Long nid;

    @Field
    private String name;

    @Field
    private Long number;

    @Field
    private String address;
}
