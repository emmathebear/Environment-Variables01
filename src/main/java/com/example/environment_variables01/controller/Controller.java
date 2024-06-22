package com.example.environment_variables01.controller;

import com.example.environment_variables01.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("properties")
public class Controller {

    @Autowired
    private PropertiesService propertiesService;

    @GetMapping
    public Collection<String> getProperties() {

        return propertiesService.getProperties();
    }
}
