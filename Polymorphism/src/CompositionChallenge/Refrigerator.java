package CompositionChallenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator() {

    }
    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    void orderFood() {
        if (isHasWorkToDo()) {
            System.out.println("ordering food...");
            setHasWorkToDo(false);
        }
    }
}
