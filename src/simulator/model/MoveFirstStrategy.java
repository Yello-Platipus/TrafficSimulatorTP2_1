package simulator.model;

import java.util.LinkedList;
import java.util.List;

public class MoveFirstStrategy implements DequeuingStrategy{
    @Override
    public List<Vehicle> dequeue(List<Vehicle> q) {
        List<Vehicle> list = new LinkedList<Vehicle>();
        list.add(q.get(0));
        return list;
    }
}
