package market;

import java.nio.file.Path;

public class Product {
    private String name;

    private int price;

    private String description;

    private String characteristics;

    private Path pathToPhoto;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
