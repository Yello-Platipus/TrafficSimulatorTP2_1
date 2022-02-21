package simulator.factories;

import org.json.JSONObject;
import simulator.model.DequeuingStrategy;
import simulator.model.MoveFirstStrategy;

public class MoveAllStrategyBuilder extends Builder<DequeuingStrategy> {
    MoveAllStrategyBuilder(String type) {
        super(type);
    }

    @Override
    protected DequeuingStrategy createTheInstance(JSONObject data) {
        return new MoveFirstStrategy();
    }
}
