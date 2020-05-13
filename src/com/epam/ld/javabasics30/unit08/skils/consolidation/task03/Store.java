package com.epam.ld.javabasics30.unit08.skils.consolidation.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Store {

    private Customer[] customers;

    public Store(Customer[] customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomerOrderedList() {
        List<Customer> orderedList = Arrays.asList(customers);
        orderedList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                int cmp;
                cmp = customer1.getSurname().compareTo(customer2.getSurname());
                if (cmp == 0) {
                    cmp = customer1.getName().compareTo(customer2.getName());
                    if (cmp == 0) {
                        cmp = customer1.getFathersName().compareTo(customer2.getFathersName());
                    }
                }
                return cmp;
            }
        });
        return orderedList;
    }

    public List<Customer> getCustomerListFilteredByCCardRange(long startRange, long endRange) {
        List<Customer> list = new ArrayList<>();
        for (Customer customer : customers) {
            if  ((customer.getCardNumber() >= startRange) && (customer.getCardNumber() <= endRange)) {
                list.add(customer);
            }
        }
        return list;
    }
}
