package WestTwo.Round2.Problem1;

import java.time.LocalTime;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    private double balance;
    private double originalBalance;
    private ArrayList<Animal> animalList;
    private ArrayList<Customer> customerList;

    public MyAnimalShop(double balance, ArrayList<Animal> animalList, ArrayList<Customer> customerList) {
        this.balance = balance;
        this.animalList = animalList;
        originalBalance = balance;
        this.customerList = customerList;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    // 买入新动物
    public void purchase(Animal animal) {
        if (balance - animal.getCostPrice() >= 0) {
            setBalance(balance - animal.getCostPrice());
            animalList.add(animal);
            setAnimalList(animalList);
            System.out.println("买入" + animal.getName() + "成功");
        } else {
            System.out.println("买入" + animal.getName() + "失败");
            throw new InsufficientBalanceException(balance);
        }
    }

    // 招待顾客
    public void serve(Customer customer, LocalTime visitTime) {
        // 移除老顾客
        for (int i =0; i< customerList.size();i++) {
            if (customerList.get(i).equals(customer)) {
                customerList.remove(i);
                i--;// 一边遍历一边remove list会出问题，需要添加这行
            }
        }
        customer.setVisitNum(customer.getVisitNum() + 1); // 老顾客来访次数自动加一
        customer.setVisitTime(visitTime); // 更新老顾客的再次来访时间
        customerList.add(customer);

    }

    // 卖出动物
    public void sellPet(Animal animal) {
        boolean animalNotFound = true;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).equals(animal)) {
                setBalance(balance + animal.getPrice());
                System.out.println("----成功卖出----\n" + animal.toString());
                animalList.remove(animalList.get(i));
                i--;
                animalNotFound = false;
                break;
            }
        }
        if (animalNotFound) {
            throw new AnimalNotFountException(animal);
        }
    }

    // 歇业
    public void closeShop() {
        System.out.println("------歇业------");
        System.out.println("今天的利润: ¥" + (balance-originalBalance)+"\n");
        System.out.println("今天的顾客信息：");
        for (Customer i : customerList) {
            System.out.println(i.toString() + "\n");
        }
    }
}
