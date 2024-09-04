package PolymorphismExample;

public class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s...%n".repeat(3),"aliens","flying around","destroying the world");
    }

    public void watchScienceFiction() {
        System.out.println("watching science fiction...");
    }
}
