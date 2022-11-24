package WestTwo.Round2.Problem1;

import java.time.LocalTime;

public class Customer {
    private String name;
    private int visitNum = 0;
    private LocalTime visitTime;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(int visitNum) {
        this.visitNum = visitNum;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    @Override
    public String toString() {
        return "顾客姓名：" + name + "\n" +
                "来访次数：" + visitNum + "\n" +
                "最新来访时间：" + visitTime;
    }
}
