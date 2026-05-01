import java.util.*;

class Product implements Comparable<Product> {
    String name;
    double price;
    int saleId;

    public Product(String name, double price, int saleId) {
        this.name = name;
        this.price = price;
        this.saleId = saleId;
    }

    @Override
    public int compareTo(Product other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison == 0) {
            return Integer.compare(this.saleId, other.saleId);
        }
        return nameComparison;
    }

    @Override
    public String toString() {
        return "Товар: " + name + " | Цена: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> sales = new TreeSet<>();
        int idCounter = 1;

        sales.add(new Product("Яблоко", 50.5, idCounter++));
        sales.add(new Product("Хлеб", 30.0, idCounter++));
        sales.add(new Product("Яблоко", 50.5, idCounter++));
        sales.add(new Product("Апельсин", 42.5, idCounter++));
        sales.add(new Product("Молоко", 80.0, idCounter++));
        sales.add(new Product("Хлеб", 30.0, idCounter++));
        sales.add(new Product("Яблоко", 50.5, idCounter++));

        System.out.println("   Список всех проданных товаров    ");
        for (Product p : sales) {
            System.out.println(p);
        }

        double totalSum = 0;
        for (Product p : sales) {
            totalSum += p.price;
        }
        System.out.println("\nОбщая сумма продаж: " + totalSum);

        Map<String, Integer> popularityMap = new HashMap<>();
        for (Product p : sales) {
            popularityMap.put(p.name, popularityMap.getOrDefault(p.name, 0) + 1);
        }

        String mostPopular = "";
        int maxSales = 0;

        for (Map.Entry<String, Integer> entry : popularityMap.entrySet()) {
            if (entry.getValue() > maxSales) {
                maxSales = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        System.out.println("Наиболее популярный товар: " + mostPopular + " (продано: " + maxSales + ")");
    }
}