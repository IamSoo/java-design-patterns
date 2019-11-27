package patterns.strategy;

public class CabTravelStrategy implements AirportTravelStrategy {

    public void travel(int amountToPay) {
        System.out.println("Travelled through Cab and paying amount :" + amountToPay);
    }
}
