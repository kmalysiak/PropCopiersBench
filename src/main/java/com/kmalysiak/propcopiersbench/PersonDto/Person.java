package com.kmalysiak.propcopiersbench.PersonDto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Person {
    private String firstName;
    private String secondName;
    private String lastName;
    private Integer age;
    private LocalDate birth;
    private String nationality;
    private String idNumber;
    private Address address;

}
