package demoIn;
// cung cap phuong thuc so sanh 2 doi tuong
public class User implements Comparable<User> {
    String name;
    int age;
    int weight;
    int height;
//xac dinh 1 tieu chi can sap xep
    @Override
    public int compareTo(User o) {
//        if(this.age > o.age) return 1;
//        else
//            if (this.age==o.age) return 0;
//            return -1;
        return this.age - o.age;
    }

    public User() {
    }

    public User(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public User(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
