package state;

public class NoGumballsNoQuarter extends State {
    public NoGumballsNoQuarter(State oldState) {
        super(oldState.stateHolder, 0, oldState.quarters);
    }

    public NoGumballsNoQuarter(StateHolder container, int quarters) {
        super(container, 0, quarters);
    }

    @Override
    public void addGumballs(int count) {
        super.addGumballs(count);
        stateHolder.setState(new GumballsNoQuarter(this));
    }

    @Override
    public void insertQuarter() {
        stateHolder.setState(new NoGumballsQuarter(this));
    }
}
