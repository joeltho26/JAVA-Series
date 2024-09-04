package PolymorphismExample;

public class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s...%n".repeat(3),"kaboom! run","go hide","dangerous to fight");
    }

    public void watchAdventure() {
        System.out.println("watching adventure...");
    }

}
