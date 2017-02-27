package com.model;

/**
 * Created by snaithm on 24/02/17.
 */
public class Greeting {

    //attributes
    private String message;

    private String name;

    //methods
    public void setMessage(String messageToSet) {
        message = messageToSet;
    }

    public void setName(String nameToSet) {
        name = nameToSet;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}