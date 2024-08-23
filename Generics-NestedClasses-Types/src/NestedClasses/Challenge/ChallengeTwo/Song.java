package NestedClasses.Challenge.ChallengeTwo;

public record Song(String title, double duration) {
    @Override
    public String toString() {
        return title() + ": " + duration();
    }
}
