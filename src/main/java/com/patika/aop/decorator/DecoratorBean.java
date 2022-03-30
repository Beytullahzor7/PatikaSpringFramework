package com.patika.aop.decorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    private IEv ev;

    public String beanMethod(String data){
        return ev.boyama(data);
    }
}
