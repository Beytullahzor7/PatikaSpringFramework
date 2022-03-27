package com.patika.qualifier;

public interface IPatron {
    //@Alternative = Interfaceyi implemente eden 2 classtan 1 ini aktif etmek istedigimiz durumlarda kullanırız
    //@Qualifier = Aynı anda birden fazla proje aktif ancak default olarak calisacak projeyi secebiliyoruz

    public String version(String data);
}
