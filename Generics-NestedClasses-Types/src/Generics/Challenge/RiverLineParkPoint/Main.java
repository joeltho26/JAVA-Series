package Generics.Challenge.RiverLineParkPoint;

public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{new Park("44.4882, -110.5916","Yellowstone"),
                                        new Park("36.0636, -112.1079", "Grand Canyon"),
                                        new Park("37.8855, -119.5360", "Yosemite")};

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorRivers = new River[] {new River("Mississippi","47.2160, -95.2348",
                                                                                "29.1566, -89.2495",
                                                                                "35.1556, -90.0659"),
                                        new River("Missouri","45.9239, -111.4983",
                                                "38.8146, -90.1218")};

        Layer<River> riverLayer = new Layer<>(majorRivers);
        riverLayer.addElements(new River("Colorado","40.4708, -105.8286",
                                                                                    "31.7811, -114.7724"),
                                            new River("Delaware","42.2026, -75.00836",
                                                                                    "39.4955, -75.5592"));
        riverLayer.renderLayer();
    }
}
