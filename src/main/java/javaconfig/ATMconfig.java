package javaconfig;

import org.springframework.context.annotation.Bean;

public class ATMconfig {
    @Bean
    public ATMSimulator atmSimulator() { return new ATMSimulator(atm()); }

    @Bean
    public ATM atm() {return new ATM(bank());}

    @Bean
    public Bank bank (){return new Bank(dataSource());}

    @Bean
    public DataSource dataSource(){return new DataSource("customers.txt");}
}