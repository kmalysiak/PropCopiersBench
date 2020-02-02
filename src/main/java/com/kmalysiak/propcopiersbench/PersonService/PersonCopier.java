package com.kmalysiak.propcopiersbench.PersonService;

import com.kmalysiak.propcopiersbench.PersonDto.Person;

import java.util.List;

public interface PersonCopier {
    List<Person> getCopy(List<Person> arg);
}
