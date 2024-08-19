package Challenge.ChallengeOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<Mappable>();
        mappables.add(new Building("Sydney Town Hall",UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House",UsageType.ENTERTAINMENT));
        mappables.add(new Building("Melbourne Cricket Stadium",UsageType.SPORTS));

        mappables.add(new UtilityLine("College Street",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Boulevard",UtilityType.WATER));

        for (var mappings: mappables) {
            Mappable.mapIt(mappings);
        }
    }
}
