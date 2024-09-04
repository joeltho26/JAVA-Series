package Generics.Challenge.RiverLineParkPoint;

public interface Mappable {
    void render();
    static double[] StringToLatLon(String location) {
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lon = Double.parseDouble(splits[1]);
        return new double[]{lat,lon};
    }
}
