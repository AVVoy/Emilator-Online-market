package market;

import Users.Salesman;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Market {
    private Salesman owner;

    private List<Product> products = new ArrayList<>();

    public Market(Salesman owner) {
        this.owner = owner;
    }

    public void downloadProducts(String file) {
        File path = new File(file);
        try (FileReader fr = new FileReader(path);
             BufferedReader bf = new BufferedReader(fr)) {
            while (bf.ready()) {
                String prod = bf.readLine();
                String[] strings = prod.split("!-!");
                String name = strings[0];
                int price = Integer.parseInt(strings[1]);
                String description = null;
                String characteristics = null;
                Path pathToPhoto = null;
                if (strings.length > 2) {
                    for (int i = 2; i < strings.length; i++) {
                        if (strings[i].startsWith("description: ")) {
                            description = strings[i].substring("description: ".length());
                        }
                        if (strings[i].startsWith("characteristics: ")) {
                            characteristics = strings[i].substring("characteristics: ".length());
                        }
                        if (strings[i].startsWith("pathToPhoto: ")) {
                            pathToPhoto = Path.of(strings[i].substring("pathToPhoto: ".length()));
                        }
                    }
                }
                Product product = new Product(name, price);
                if (description != null & !description.isEmpty()) product.setDescription(description);
                if (characteristics != null & !characteristics.isEmpty()) product.setCharacteristics(characteristics);
                if (pathToPhoto != null & !pathToPhoto.toString().isEmpty()) product.setPathToPhoto(pathToPhoto);
                products.add(product);
            }

        } catch (FileNotFoundException e) {
            //ignore
        } catch (IOException e) {
            //ignore
        }
    }
}
