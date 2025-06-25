public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Book", "Education"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Pen", "Stationery")
        };
        Product resultLinear = SearchOperations.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + resultLinear);
        SearchOperations.sortProductsByName(products);
        Product resultBinary = SearchOperations.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + resultBinary);
    }
}
