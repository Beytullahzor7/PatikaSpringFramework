package com.patika.ioc_di;

public class Patron implements IPatron {

    @Override
    public String version(String data) {
        return "Version " + data;
    }
}
