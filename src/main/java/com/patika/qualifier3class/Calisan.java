package com.patika.qualifier3class;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    //defaultta calisacak koddur
//    @Inject
//    private IPatron patronInterface;

    //Ilk secenek
    // @Inject
    // @QualifierMultiple2(EnumSecenekler.BIRINCI)
    // private IPatron patronInterface;

    //Ikinci secenek
    @Inject
    @QualifierMultiple2(EnumSecenekler.IKINCI)
    private IPatron patronInterface;

    public String getData(String data){
        return patronInterface.version(data);
    }
}
