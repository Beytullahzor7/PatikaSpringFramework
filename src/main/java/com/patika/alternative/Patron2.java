package com.patika.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements IPatron {

    @Override
    public String version(String data) {
        return "Patron 2 " + data;
    }
}
