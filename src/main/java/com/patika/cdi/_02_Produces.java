package com.patika.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producestuto")
@ApplicationScoped
public class _02_Produces {

    @Produces // uretir
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("Html");
        liste.add("Css");
        liste.add("JavaScript");
        liste.add("React");
        return liste;
    }
}
