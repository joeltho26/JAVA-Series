# Enum:
- it's a special kind of data type just like classes, String, etc

  ```
  public enum Levels = 
            {LOW, MEDIUM, HIGH};
  
  
  #calling:
  Levels level = Levels.MEDIUM;  
  System.out.println(level.name(),level.ordinal()); 
  ```

- Another example,

  ```
   public enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring" + this);
        }
    }
  ```
  
- methods within enum such as values(), ordinal(), etc.

  ```
  public enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring" + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1) % allStages.length];
    }
}
  ```