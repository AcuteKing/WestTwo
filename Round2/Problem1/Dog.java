package WestTwo.Round2.Problem1;

public class Dog extends Animal {
    private boolean isVaccineInjected;

    public Dog(String name, int age, String gender, double costPrice, double price,boolean isVaccineInjected) {
        super(name, age, gender,costPrice,price);
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return super.toString() +
                "是否注射狂犬疫苗：" + isVaccineInjected;
    }
}


