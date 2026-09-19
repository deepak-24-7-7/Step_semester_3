class TrafficLight {
    private String color = "RED";
    private final String id;

    TrafficLight(String id) {
        this.id = id;
    }

    void next() {
        if (color.equals("RED"))
            color = "GREEN";
        else if (color.equals("GREEN"))
            color = "YELLOW";
        else
            color = "RED";
    }

    String getColor() {
        return color;
    }
}
