package com.patika.cdi;

import com.patika.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //Uretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L)
                .studentName("Beytullah")
                .studentSurname("Zor")
                .build();
        return studentDto.toString();
    }

    @Getter
    @Inject
    public String tuketilenData;

}
