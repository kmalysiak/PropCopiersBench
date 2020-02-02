package com.kmalysiak.propcopiersbench;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropCopiersBenchApplication  implements CommandLineRunner {



    private static Logger LOG = LoggerFactory
            .getLogger(PropCopiersBenchApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(PropCopiersBenchApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
        LOG.info("Crating persons.");


    }
}
