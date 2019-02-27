package state;

public class NoGumballsQuarter extends State {
    NoGumballsQuarter(State oldState) {
        super(oldState.stateHolder,0, oldState.quarters);
    }

    @Override
    public void removeQuarter() {
        stateHolder.setState(new NoGumballsNoQuarter(this));
    }

    @Override
    public void addGumballs(int count) {
        super.addGumballs(count);
        stateHolder.setState(new GumballsQuarter(this));
    }

    @Override
    public void turnHandle() {
        quarters++;
        stateHolder.setState(new NoGumballsNoQuarter(this));
    }
}