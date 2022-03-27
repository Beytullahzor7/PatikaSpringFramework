package com.patika.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron patronInterface;

    public Calisan() {
        //patronInterface = new Patron(); @Inject isleminden sonra bu kısıma gerek kalmaz Ioc ve DI yapımızı olusturmus oluruz
    }

    public String getData(String data){
        return patronInterface.version(data);
    }
}
