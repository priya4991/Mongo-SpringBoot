package com.priyamongo.mongodemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyamongo.mongodemo.model.TestModel;
import com.priyamongo.mongodemo.repository.TestRepo;

@RestController
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    private TestRepo testRepo;

    @GetMapping
    public List<TestModel> getAll() {
        List<TestModel> res =  testRepo.findAll();
        return res;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addData(
        @RequestBody TestModel data
    ) {
        testRepo.save(data);
    }
}
