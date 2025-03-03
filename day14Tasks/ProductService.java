package day14Tasks;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class ProductService {
    private List<Product> products;

    // Constructor
    public ProductService(List<Product> products) {
        this.products = products;
    }

    // List highest priced product
    public Product getHighestPricedProduct() {
        return products.stream()
                       .max(Comparator.comparing(Product::getPrice))
                       .orElse(null);
    }

    // List lowest priced product
    public Product getLowestPricedProduct() {
        return products.stream()
                       .min(Comparator.comparing(Product::getPrice))
                       .orElse(null);
    }

    // List products that already expired
    public List<Product> getExpiredProducts() {
        LocalDate today = LocalDate.now();
        return products.stream()
                       .filter(product -> product.getExpiryDate().isBefore(today))
                       .collect(Collectors.toList());
    }

    // List product names that will expire in next 10 days
    public List<String> getProductsExpiringInNext10Days() {
        LocalDate today = LocalDate.now();
        LocalDate tenDaysLater = today.plusDays(10);
        return products.stream()
                       .filter(product -> product.getExpiryDate().isAfter(today) && product.getExpiryDate().isBefore(tenDaysLater))
                       .map(Product::getName)
                       .collect(Collectors.toList());
    }

    // Display count of products of different types
    public Map<String, Long> getProductTypeCounts() {
        return products.stream()
                       .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
    }
}
