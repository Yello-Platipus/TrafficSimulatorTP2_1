package simulator.model;

public class NewCityRoadEvent extends Event{
    public NewCityRoadEvent(int time, String id, String srcJun, String destJunc, int length, int co2Limit, int maxSpeed, Weather weather)
    {
        super(time);
    }

    @Override
    void execute(RoadMap map) {

    }
}
