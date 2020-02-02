package com.kmalysiak.propcopiersbench.PersonService;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kmalysiak.propcopiersbench.PersonDto.Person;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class GsonDeep implements PersonCopier {
    private Gson gson = new Gson();
    Type listOfPersons = new TypeToken<ArrayList<Person>>() {}.getType();

    @Override
    public List<Person> getCopy(List<Person> arg) {
        return gson.fromJson(gson.toJson(arg), listOfPersons);
    }
}
