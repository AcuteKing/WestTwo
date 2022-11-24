package WestTwo.Round2.Problem1;

import java.time.LocalTime;

public interface AnimalShop {
    public void purchase(Animal animal);

    public void serve(Customer customer, LocalTime visitTime);

    public void closeShop();
}
