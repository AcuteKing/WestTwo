package WestTwo.Round2.Problem1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected double costPrice; // 成本价
    protected double price; // 售价

    public Animal(String name, int age, String gender, double costPrice, double price) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.costPrice = costPrice;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "宠物名字：" + name + "\n" +
                "年龄：" + age + "\n" +
                "性别：" + gender + "\n" +
                "售价：" + price + "\n";
    }
}
