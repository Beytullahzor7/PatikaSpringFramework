package com.patika.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MyStereotype
@Data @NoArgsConstructor @AllArgsConstructor
public class StereotypeBean {
    private Long id;
    private String name = "Merhaba Stereotype";
    private String trade;
}
