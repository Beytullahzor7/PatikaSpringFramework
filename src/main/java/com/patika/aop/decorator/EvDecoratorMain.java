package com.patika.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class EvDecoratorMain implements IEv{

    private @Inject @Delegate
    IEv iEv;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator Buradaydı");
        String dataInformation = iEv.boyama(data);
        if(dataInformation.equals("Kodluyoruz")){
            dataInformation = dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
