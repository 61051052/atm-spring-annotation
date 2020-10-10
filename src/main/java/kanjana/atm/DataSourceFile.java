package kanjana.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceFile implements DataSource {

    public Map<Integer,Customer> readCustomers() {

        Map<Integer,Customer> customers = new HashMap<>();
        customers.put(1, new Customer(1, "K", 12345, 1000));
        customers.put(2, new Customer(2, "L", 67890, 2000));
        customers.put(3, new Customer(3, "M", 14785, 3000));

        return customers;
    }
}
