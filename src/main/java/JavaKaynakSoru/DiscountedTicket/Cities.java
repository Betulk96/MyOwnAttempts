package JavaKaynakSoru.DiscountedTicket;

public enum Cities {
    B(500, "B"),
    C(700, "C"),
    D(900, "D");


    private final int distance;
    private final String cityName;

    Cities(int distance, String cityName) {
        this.distance = distance;
        this.cityName = cityName;
    }

    public int getDistance() {
        return distance;
    }

    public String getCityName() {
        return cityName;
    }
}
