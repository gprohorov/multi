package pro.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "pro.edu.*")
@EnableMongoRepositories(basePackages="pro.edu")
public class MultiModulesApplication {


        public static void main(String[] args) {
            SpringApplication.run(MultiModulesApplication.class, args);
        }
    }

