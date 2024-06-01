import Users.*;
import market.*;

import java.util.ArrayList;
import java.util.List;

public class Online {

    private Admin admin;

    public List<Market> markets = new ArrayList<>();

    public Online(Admin admin) {
        this.admin = admin;
    }
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "01");
        Online online_market = new Online(admin);
        //admin.setOnline_market(online_market);
        Salesman salesman1 = new Salesman("Roga", "01234567890");
        Salesman salesman2 = new Salesman("Boba", "12312312312");
        Market market = new Market(salesman1);
        Market market1 = new Market(salesman2);
        online_market.markets.add(market);
        online_market.markets.add(market1);
        market.downloadProducts("D:\\rab_stol\\IdeaProjects\\Emilator-Online-market\\market\\products1");
        market1.downloadProducts("D:\\rab_stol\\IdeaProjects\\Emilator-Online-market\\market\\products2");


    }
}
