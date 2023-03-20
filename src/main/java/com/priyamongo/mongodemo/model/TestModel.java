package com.priyamongo.mongodemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "test-data")
@CompoundIndex(
    name = "com-key", 
    def = "{'taxableEntityId': 1, 'incomeSourceId': 1, 'version': 1}",
    unique = true
    )
public class TestModel {
    @Id
    private String id;

    @Field
    private String taxableEntityId;

    @Field
    private String incomeSourceId;

    @Field
    private int version;
}
