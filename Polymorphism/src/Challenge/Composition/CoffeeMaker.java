package Challenge.Composition;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    void brewCoffee() {
        if (isHasWorkToDo()) {
            System.out.println("brewing coffee...");
            setHasWorkToDo(false);
        }
    }
}
