package com.kmalysiak.propcopiersbench.PersonService;

import com.kmalysiak.propcopiersbench.PersonDto.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpringShallow implements PersonCopier {
    @Override
    public List<Person> getCopy(List<Person> persons) {
        List<Person> newPersons = new ArrayList<>();
        for(Person person : persons){
            Person newPerson = new Person();
            BeanUtils.copyProperties(person, newPerson);
            newPersons.add(newPerson);
        }
        return newPersons;
    }
}
