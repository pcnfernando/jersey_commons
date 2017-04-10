package com.semicolon.rest.config;

import com.semicolon.rest.resources.HelloWorldResource;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Chiran Fernando on 10/10/2016.
 */
public class ApplicationConfig extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(HelloWorldResource.class);
        return resources;
    }
}
