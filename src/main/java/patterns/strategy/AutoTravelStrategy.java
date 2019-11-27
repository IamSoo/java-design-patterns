package patterns.strategy;

public class AutoTravelStrategy implements AirportTravelStrategy {
    public void travel(int amountToPay) {
        System.out.printf("Travelling through auto and paying amount  :" + amountToPay);
    }
}
