package patterns.strategy;

public class Travel {

    String countryName;
    int totalMoneyForTravel;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getTotalMoneyForTravel() {
        return totalMoneyForTravel;
    }

    public void setTotalMoneyForTravel(int totalMoneyForTravel) {
        this.totalMoneyForTravel = totalMoneyForTravel;
    }

    AirportTravelStrategy strategy;

    public void amountPaidForLocalTravel(AirportTravelStrategy strategy){
        strategy.travel(totalMoneyForTravel);
    }
}
