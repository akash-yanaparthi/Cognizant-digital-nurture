public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product(104, "Shoes", "Footwear"),
                new Product(101, "Phone", "Electronics"),
                new Product(103, "Shirt", "Clothing"),
                new Product(102, "Laptop", "Electronics")
        };

        int searchId = 103;

        System.out.println("Performing Linear Search:");
        Product result1 = SearchUtils.linearSearch(products, searchId);
        System.out.println(result1 != null ? result1 : "Product not found.");

        SearchUtils.sortProductsById(products);
        System.out.println("\nPerforming Binary Search:");
        Product result2 = SearchUtils.binarySearch(products, searchId);
        System.out.println(result2 != null ? result2 : "Product not found.");
    }
}
