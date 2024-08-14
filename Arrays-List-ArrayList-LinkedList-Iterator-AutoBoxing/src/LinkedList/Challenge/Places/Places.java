package LinkedList.Challenge.Places;

public record Places(String name, double distance) {

    @Override
    public String toString() {
        return name + " --> " + distance;
    }
}
