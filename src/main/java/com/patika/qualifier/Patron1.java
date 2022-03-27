package com.patika.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {

    @Override
    public String version(String data) {
        return "Patron 1 " + data;
    }
}
