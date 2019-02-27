package state;

public class GumballsQuarter extends State {
    public GumballsQuarter(State oldState) {
        super(oldState);
    }

    @Override
    public void removeQuarter() {
        stateHolder.setState(new GumballsNoQuarter(this));
    }

    @Override
    public void turnHandle() {
        if (gumballs > 1) {
            gumballs--;
            quarters++;
            stateHolder.setState(new GumballsNoQuarter(this));
        }else if (gumballs == 1){
            gumballs--;
            quarters++;
            stateHolder.setState(new NoGumballsNoQuarter(this));
        }
    }
}