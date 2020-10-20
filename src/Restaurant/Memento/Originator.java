package Restaurant.Memento;

public class Originator {
    int state = 0;

    public void action(){
        state += 1;
    }

    public int getState() {
        return state;
    }
}
