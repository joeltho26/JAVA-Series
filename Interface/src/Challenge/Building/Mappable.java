package Challenge.Building;

public interface Mappable {
    String JSON_PROPERTY = """
            "properties" : {%s}
            """;
    String getLabel();
    String getMarker();
    Geometry getShape();

    default String toJSON() {
        return """
                "type" : "%s", "label" : "%s", "marker" : "%s"
                """.formatted(getShape(),getLabel(),getMarker());
    }

    static void mapIt(Mappable mappings) {
        System.out.println(JSON_PROPERTY.formatted(mappings.toJSON()));
    }
}
