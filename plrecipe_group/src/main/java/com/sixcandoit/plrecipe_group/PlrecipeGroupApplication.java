package com.sixcandoit.plrecipe_group;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class  PlrecipeGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlrecipeGroupApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
