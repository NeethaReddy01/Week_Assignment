package day14Tasks;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        // Sample products
        List<Product> productList = Arrays.asList(
            new Product(1, "Milk", "dairy", 2.0, 50.0, LocalDate.of(2023, 5, 1)),
            new Product(2, "Rice", "pulses", 5.0, 200.0, LocalDate.of(2023, 12, 31)),
            new Product(3, "Salt", "spices", 1.0, 20.0, LocalDate.of(2024, 1, 1)),
            new Product(4, "Olive Oil", "oils", 1.0, 300.0, LocalDate.of(2023, 6, 15)),
            new Product(5, "Chips", "snacks", 0.5, 10.0, LocalDate.of(2023, 4, 20))
        );

        ProductService productService = new ProductService(productList);

        System.out.println("Highest priced product: " + productService.getHighestPricedProduct().getName());
        System.out.println("Lowest priced product: " + productService.getLowestPricedProduct().getName());

        System.out.println("Expired products: ");
        productService.getExpiredProducts().forEach(product -> System.out.println(product.getName()));

        System.out.println("Products expiring in next 10 days: ");
        productService.getProductsExpiringInNext10Days().forEach(System.out::println);

        System.out.println("Product type counts: ");
        productService.getProductTypeCounts().forEach((type, count) -> System.out.println(type + ": " + count));
    }
}
