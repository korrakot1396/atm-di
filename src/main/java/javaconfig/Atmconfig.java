package javaconfig;

import org.springframework.context.annotation.Bean;

public class Atmconfig {
    @Bean
    public DataSource dataSource(){
        return new DataSource();
    }

    @Bean
    public Bank bank(){
        return new Bank(dataSource());
    }

    @Bean
    public ATM atm(){
        return new ATM(bank());
    }

    @Bean
    public ATMSimulator atmSimulator(){
        return new ATMSimulator(atm());
    }
}