package com.kmalysiak.propcopiersbench.PersonService;

import com.kmalysiak.propcopiersbench.PersonDto.Person;
import com.kmalysiak.propcopiersbench.PersonDto.PersonDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapperShallow implements PersonCopier {

    @Autowired
    PersonDtoMapper mapper;

    @Override
    public List<Person> getCopy(List<Person> arg) {
        return mapper.personsToPersons(arg);
    }
}
