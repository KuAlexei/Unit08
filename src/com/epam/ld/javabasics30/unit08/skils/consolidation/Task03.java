package com.epam.ld.javabasics30.unit08.skils.consolidation;

import com.epam.ld.javabasics30.unit08.skils.consolidation.task01.Counter;
import com.epam.ld.javabasics30.unit08.skils.consolidation.task03.Customer;
import com.epam.ld.javabasics30.unit08.skils.consolidation.task03.Store;

import java.io.PrintStream;
import java.util.List;

public class Task03 {

    public static void main(String[] args) {
        Store store = new Store(new Customer[]{
                new Customer("CUS000001", "Пупкин", "Василий", "Петрович", "ул. Подвальная 4-20", 4675836473784900L, "BRIE281712972651932FF"),
                new Customer("CUS000002", "Иванов", "Дмитрий", "Васильевич", "ул. Новая 7-40",    4675738534584800L, "BRIE281456564567456FF"),
                new Customer("CUS000003", "Афанасьев", "Георгий", "Иванович", "ул. Широкая 5-25", 4675956745674800L, "BRIE281713563567932FF"),
                new Customer("CUS000004", "Иванов", "Василий", "Дмитриевич", "ул. Новая 7-40",    4675645463784800L, "BRIE281654372651932FF"),
                new Customer("CUS000005", "Яковлев", "Олег", "Иванович", "пр. Пушкина 1799-1837", 7675456745674800L, "BRIE281765474567932FF")
        });
        System.out.println("Ordered list:");
        for (Customer customer : store.getCustomerOrderedList()) {
            System.out.printf("%s %s %s\n", customer.getSurname(), customer.getName(), customer.getFathersName());
        }
        System.out.println("\nFiltered by CCard range list:");
        for (Customer customer : store.getCustomerListFilteredByCCardRange(4675736473784822L, 5231442423235543L)) {
            System.out.printf("%s %s %s - %d\n", customer.getSurname(), customer.getName(), customer.getFathersName(), customer.getCardNumber());
        }

    }

}
