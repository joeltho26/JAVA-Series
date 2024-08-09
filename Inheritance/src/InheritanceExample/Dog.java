package InheritanceExample;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog () {
        super("Hound","Thin",20);
    }

    public Dog(String earShape, String tailShape) {
        this("German Shepard",25,earShape,tailShape);
    }

    public Dog (String type, double weight) {
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<20? "Small": weight>500? "Big":"Medium", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public String getEarShape() {
        return earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    void makeNoise() {
        if (type.equals("Golden Retriever")) {
            System.out.println("quiet...");
            System.out.println();
        } else {
            bark();
            System.out.println();
        }
    }

    @Override
    void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail!");
        if (speed.equals("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    void bark() {
        System.out.println("Woof!");
    }

    void run() {
        System.out.println("Dog running...");
    }

    void walk() {
        System.out.println("Dog walking...");
    }

    void wagTail () {
        System.out.println("Dog tail waging...");
    }

}
