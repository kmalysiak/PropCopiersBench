package com.kmalysiak.propcopiersbench;

import com.kmalysiak.propcopiersbench.PersonDto.Person;
import com.kmalysiak.propcopiersbench.PersonService.*;
import org.junit.runner.RunWith;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.TimeUnit;

//@SpringBootTest
@RunWith(SpringRunner.class)
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class SomeTest extends AbstractBenchmark {



    @State(Scope.Benchmark)
    public static class MyState {
        PersonService personService;
        public GsonDeep gsonDeep;
        public JsonDeep jsonDeep;
        public MapperShallow mapperShallow;
        public SpringShallow springShallow;
        public List<Person> personsToCopy;
        public ConfigurableApplicationContext context = new SpringApplication(PropCopiersBenchApplication.class).run();

        @Setup(Level.Trial)
        public void setUp() {
            gsonDeep = context.getBean(GsonDeep.class);
            jsonDeep = context.getBean(JsonDeep.class);
            mapperShallow = context.getBean(MapperShallow.class);
            springShallow = context.getBean(SpringShallow.class);
            personService = context.getBean(PersonService.class);
            personsToCopy = personService.getPersons(100);

        }
    }

        @Benchmark
        public void gson(MyState state) {
            state.gsonDeep.getCopy(state.personsToCopy);
        }

        @Benchmark
        public void json(MyState state) {
            state.jsonDeep.getCopy(state.personsToCopy);
        }

        @Benchmark
        public void springShallow(MyState state) {
            state.springShallow.getCopy(state.personsToCopy);
        }

        @Benchmark
        public void mapperShallow(MyState state) {
            state.mapperShallow.getCopy(state.personsToCopy);
        }

}
