package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource("customers.txt");
//        Bank bank = new Bank(dataSource);
        //ATM atm = new ATM(bank);
        // ATMSimulator atmSimulator = new ATMSimulator(atm);
//        atmSimulator.run();
        ApplicationContext context =
                new ClassPathXmlApplicationContext("javaconfig.xml");
        ATM ATM = context.getBean("bank", javaconfig.ATM.class);
        DataSource dataSource = context.getBean("filename", DataSource.class);
        Bank bank = context.getBean("dataSource" , Bank.class);
        ATMSimulator atmSimulator =context.getBean("atm", ATMSimulator.class);
        atmSimulator.run();


    }
}