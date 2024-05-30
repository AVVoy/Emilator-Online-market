package market;

import Users.Salesman;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private Salesman owner;

    private List<Product> products = new ArrayList<>();

    public Market(Salesman owner) {
        this.owner = owner;
    }
}
