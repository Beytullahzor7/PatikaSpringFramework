package com.patika.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //defaultta calisacak koddur
    //@Inject
    //private IPatron patronInterface;

    //defaultta calisacak koddur
    @Inject
    @QualifierMultiple
    private IPatron patronInterface;

    public String getData(String data){
        return patronInterface.version(data);
    }
}
