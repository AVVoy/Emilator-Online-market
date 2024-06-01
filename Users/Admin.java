package Users;

import mainPackage.Online;

public class Admin extends AbstractUser{
        private Online online_market;
    public Admin (String name, String phone) {
        super(name, phone);
    }
    public Online getOnline_market() {
        return online_market;
    }
    public void setOnline_market(Online online_market) {
        this.online_market = online_market;
    }
}
