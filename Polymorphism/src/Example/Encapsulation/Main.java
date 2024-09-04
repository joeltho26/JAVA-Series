package Example.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("John");
        System.out.println(player.getWeapons());
        System.out.println(player.getHealth());
        player.loseHealth(40);
        System.out.println(player.getHealth());
        player.loseHealth(60);
        System.out.println(player.getHealth());
        player.restoreHealth(60);
        System.out.println(player.getHealth());
        player.restoreHealth(60);
        System.out.println(player.getHealth());
    }
}
