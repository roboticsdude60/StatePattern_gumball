package state;

public class State {
    int gumballs;
    int quarters = 0;

    StateHolder stateHolder;
    State(State oldState) {
        stateHolder = oldState.stateHolder;
        gumballs = oldState.gumballs;
        quarters = oldState.quarters;
    }
    public State(StateHolder container, int gumballCount, int quarters) {
        stateHolder = container;
        this.quarters = quarters;
    }



    public void addGumballs(int count) {
        gumballs += count;
    }

    public void insertQuarter() {

    }
    public void removeQuarter() {

    }
    public void turnHandle() {

    }

    public interface StateHolder {
        public void setState(State newState);
    }

    public int getGumballs() {
        return gumballs;
    }

    public int getQuarters() {
        return quarters;
    }
}

