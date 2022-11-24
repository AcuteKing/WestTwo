package WestTwo.Round2.Problem1;

import java.time.LocalTime;
import java.util.ArrayList;

public class ShopTest {
    public static void main(String[] args) {

        // 初始化店铺
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        MyAnimalShop myAnimalShop = new MyAnimalShop(500, animalList, customerList);

        Dog dog1 = new Dog("小狗一号", 1, "雄性", 100, 200, true);
        Dog dog2 = new Dog("小狗二号", 1, "雌性", 100, 200, true);
        Cat cat1 = new Cat("猫咪一号", 1, "雄性", 200, 300);
        Cat cat2 = new Cat("猫咪二号", 1, "雌性", 200, 300);
        // 为店铺买动物
        try {
            myAnimalShop.purchase(dog1);
            myAnimalShop.purchase(dog2);
            myAnimalShop.purchase(cat1);
            myAnimalShop.purchase(cat2);;
        } catch (InsufficientBalanceException e) {
            System.out.println("店铺资金余额不足，目前只剩 ¥" + e.getBalance());
        }


        // 招待客户
        Customer A = new Customer("A");
        Customer B = new Customer("B");
        Customer C = new Customer("C");
        myAnimalShop.serve(A, LocalTime.of(10, 30));
        myAnimalShop.serve(B, LocalTime.of(14, 30));
        myAnimalShop.serve(C, LocalTime.of(16, 0));
        // 再次来访
        myAnimalShop.serve(A, LocalTime.of(17, 0));


        // 卖出动物
        System.out.println();
        try {
            myAnimalShop.sellPet(dog1);
            myAnimalShop.sellPet(dog2);
            myAnimalShop.sellPet(cat1);
            myAnimalShop.sellPet(cat2);
        }catch (AnimalNotFountException e){
            System.out.println("本店没有售卖："+ e.getAnimalName());
        }


        // 歇业
        System.out.println();
        LocalTime time = LocalTime.of(19, 30);
        if (time.getHour() >= 19) {

            myAnimalShop.closeShop();
        }
    }
}
