package com.priyamongo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.priyamongo.mongodemo.repository.TestRepo;

@EnableMongoRepositories(basePackageClasses = TestRepo.class)
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(TestRepo testRepo) {
        return strings -> {};
    }

    @Override
    public boolean autoIndexCreation() {
        return true;
    }

    @Override
    protected String getDatabaseName() {
        // TODO Auto-generated method stub
        return "test-data";
    }
}
