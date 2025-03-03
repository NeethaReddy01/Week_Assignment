package day14Tasks;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    Integer id;
    String name;
    String type;  // e.g., dairy, pulses, spices, oils, snacks
    Double qty;
    Double price;
    LocalDate expiryDate;

    // Constructor
    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // Getters (and optionally setters)
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
