package com.kmalysiak.propcopiersbench.PersonService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kmalysiak.propcopiersbench.PersonDto.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class JsonDeep implements PersonCopier  {

    private ObjectMapper objectMapper = new ObjectMapper();
    private TypeReference listOfPersons = new TypeReference<List<Person>>(){};
    @PostConstruct
    public void setUp() {
        objectMapper.registerModule(new JavaTimeModule());
    }

        @Override
        public List<Person> getCopy(List<Person> arg) {
            try {
                return (List<Person>) objectMapper.readValue(objectMapper.writeValueAsString(arg), listOfPersons);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
        }
}

