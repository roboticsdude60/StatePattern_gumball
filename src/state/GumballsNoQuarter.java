package state;

public class GumballsNoQuarter extends State {
    public GumballsNoQuarter(State oldState) {
        super(oldState);
    }

    @Override
    public void insertQuarter() {
        stateHolder.setState(new GumballsQuarter(this));
    }
}