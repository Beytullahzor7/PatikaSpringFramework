package com.patika.qualifier;

@QualifierMultiple
public class Patron2 implements IPatron {

    @Override
    public String version(String data) {
        return "QualifierMultiple 1 " + data;
    }
}
