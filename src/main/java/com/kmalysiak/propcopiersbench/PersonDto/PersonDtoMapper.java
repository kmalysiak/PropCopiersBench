package com.kmalysiak.propcopiersbench.PersonDto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
//spring: the generated mapper is a singleton-scoped Spring bean and can be retrieved via @Autowired
@Mapper(componentModel = "spring")
public interface PersonDtoMapper {
    Person personToPerson(Person person);
    List<Person> personsToPersons(List<Person> persons);
}
