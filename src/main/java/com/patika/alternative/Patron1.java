package com.patika.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {

    @Override
    public String version(String data) {
        return "Patron 1 " + data;
    }
}
