package CompositionChallenge;

public class SmartKitchen {
    CoffeeMaker brewMaster;
    DishWasher dishwasher;
    Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishwasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishwasher = dishwasher;
        this.iceBox = iceBox;
    }

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishwasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public void setDishwasher(DishWasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }

    void addWater() {
        brewMaster.setHasWorkToDo(true);
        System.out.println("adding water...");
    }

    void pourMilk() {
        iceBox.setHasWorkToDo(true);
        System.out.println("pouring milk...");
    }

    void loadDishwasher() {
        dishwasher.setHasWorkToDo(true);
        System.out.println("loading dishwasher...");
    }

    void setKitchenState(boolean fridge, boolean dishes, boolean coffee) {
        this.brewMaster.setHasWorkToDo(coffee);
        this.iceBox.setHasWorkToDo(fridge);
        this.dishwasher.setHasWorkToDo(dishes);
    }

    void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishwasher.doDishes();
        System.out.println("Completed! \n");
    }
}
