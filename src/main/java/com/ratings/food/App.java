package com.ratings.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World 123 from ratings client!" );
    }

    public static void main123( String[] args ) {
        SpringApplication.run(App.class, args);
        System.out.println( "Hello World 123 from ratings client!" );
    }
}