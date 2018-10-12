package EL;

public class User {
    String name;
    int age;
    Address ad;

    public User(String name, int age, Address ad) {
        this.name = name;
        this.age = age;
        this.ad = ad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAd() {
        return ad;
    }
}
