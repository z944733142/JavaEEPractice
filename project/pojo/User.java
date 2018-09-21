package project.pojo;

public class User {
    private int uid;
    private String uname;
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPwd() {
        return pwd;
    }
}
