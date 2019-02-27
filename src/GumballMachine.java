import state.GumballsQuarter;
import state.NoGumballsNoQuarter;
import state.NoGumballsQuarter;
import state.State;

public class GumballMachine implements State.StateHolder {
    private State state = new NoGumballsNoQuarter(this, 0);

    @Override
    public void setState(State newState) {
        this.state = newState;
    }

    public void addGumballs(int count) {
        state.addGumballs(count);
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void removeQuarter() {
        state.removeQuarter();
    }
    public void turnHandle() {
        state.turnHandle();
    }

    public int getNumberOfQuarters() {
        return state.getQuarters();
    }
    public int getGumballCount() {
        return state.getGumballs();
    }
    public boolean quarterInSlot() {
        return state instanceof GumballsQuarter || state instanceof NoGumballsQuarter;
    }
}
