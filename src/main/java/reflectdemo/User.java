package reflectdemo;

public class User {
    private int id;
    private int age;
    private int uname;

    public User() {
    }

    public User(int id, int age, int uname) {
        this.id = id;
        this.age = age;
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUname() {
        return uname;
    }

    public void setUname(int uname) {
        this.uname = uname;
    }
}
