package PolymorphismExample;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s...%n".repeat(3),"Lol!","Ha ha Ho ho","cannot control it He he");
    }

    public void watchComedy() {
        System.out.println("watching comedy...");
    }
}
