package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
public class LocalDateApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalDateApplication.class, args);
    }

    @RestController
    class HelloController {

        @PostMapping("/user")
        public UserDto user(@RequestBody UserDto userDto) throws Exception {
            return userDto;
        }

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class UserDto {
        private String userName;
        private LocalDate birthday;

    }
}
