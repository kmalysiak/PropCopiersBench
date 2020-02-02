package com.kmalysiak.propcopiersbench.PersonService;

import com.github.javafaker.Faker;
import com.kmalysiak.propcopiersbench.PersonDto.Address;
import com.kmalysiak.propcopiersbench.PersonDto.Person;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {


    private static Faker faker = new Faker();

    public List<Person> getPersons(int count) {
        List<Person> res = new ArrayList();

        for (int i = 0; i < count; i++) {
            Person per = new Person();
            per.setFirstName(faker.name().firstName());
            per.setSecondName(faker.funnyName().name());
            per.setLastName(faker.name().lastName());
            per.setBirth(faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            per.setAge(LocalDate.now().getYear() - per.getBirth().getYear());
            per.setNationality(faker.nation().nationality());
            per.setIdNumber(faker.idNumber().validSvSeSsn());
            Address address = new Address();
            address.setCity(faker.address().city());
            address.setStreet(faker.address().streetAddress());
            address.setPostCode(faker.address().zipCode());
            address.setCountry(faker.address().country());
            per.setAddress(address);
            res.add(per);
        }

        return res;
    }


}
