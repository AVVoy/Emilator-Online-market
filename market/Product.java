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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Path getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(Path pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }
}
