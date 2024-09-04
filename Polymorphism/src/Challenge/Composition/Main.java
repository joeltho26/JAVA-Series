package Challenge.Composition;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffee = new CoffeeMaker(true);
        DishWasher dishwasher = new DishWasher(true);
        Refrigerator refrigerator = new Refrigerator(true);
        SmartKitchen kitchen = new SmartKitchen(coffee,dishwasher,refrigerator);
        kitchen.doKitchenWork();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();

        SmartKitchen kitchen2 = new SmartKitchen();
        kitchen2.getBrewMaster().setHasWorkToDo(true);
        kitchen2.getIceBox().setHasWorkToDo(false);
        kitchen2.getDishwasher().setHasWorkToDo(true);
        kitchen2.doKitchenWork();

    }
}
