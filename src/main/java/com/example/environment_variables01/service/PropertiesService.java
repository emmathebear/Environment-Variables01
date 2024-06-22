package com.example.environment_variables01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class PropertiesService {

    @Autowired
    private Environment environment;

    public Collection<String> getProperties() {
        Collection<String> properties = new ArrayList<>();
        properties.add(environment.getProperty("CustomVarTree.devName"));
        properties.add(environment.getProperty("CustomVarTree.authCode"));
        return properties;
    }
}
