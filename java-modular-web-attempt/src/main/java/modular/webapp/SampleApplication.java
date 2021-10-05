package modular.webapp;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"modular.webapp", "my.consumingmodule.pub"})

public class SampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(SampleApplication.class, args);

    }

}