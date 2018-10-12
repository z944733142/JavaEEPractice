package EL;

public class Address {
    String pre;
    String home;

    public Address(String pre, String home) {
        this.pre = pre;
        this.home = home;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getPre() {
        return pre;
    }

    public String getHome() {
        return home;
    }
}
