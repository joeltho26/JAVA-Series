package Challenge.Composition;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher() {

    }

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    void doDishes() {
        if (isHasWorkToDo()) {
            System.out.println("doing dishes...");
            setHasWorkToDo(false);
        }
    }
}
