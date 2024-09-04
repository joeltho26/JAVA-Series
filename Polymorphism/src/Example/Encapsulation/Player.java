package Example.Encapsulation;

public class Player {
    private String name;
    private int health;
    private String weapons;

    public Player (String name) {
        this(name,100,"Knife");
    }

    public Player (String name, String weapon) {
        this(name,100,weapon);
    }

    public Player(String name, int health, String weapons) {
        this.name = name;
        if (health<=0) {
            this.health = health;
            gameOver();
        } else if (health>100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    private void gameOver () {
        if (this.health <= 0) {
            System.out.println("Game Over!");
        }
    }

    void loseHealth(int damage) {
        if (this.health-damage <= 0) {
            this.health = 0;
            gameOver();
        } else {
            this.health -= damage;
        }
    }

    void restoreHealth(int extraHealth) {

        if (this.health+ extraHealth > 100) {
            this.health = 100;
        } else {
            this.health += extraHealth;
        }
    }

    int healthRemaining() {
        return getHealth();
    }
}
