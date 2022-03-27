package com.patika.qualifier3class;

@QualifierMultiple2(EnumSecenekler.IKINCI)
public class Patron3 implements IPatron {

    @Override
    public String version(String data) {
        return "QualifierMultiple 2 " + data;
    }
}
