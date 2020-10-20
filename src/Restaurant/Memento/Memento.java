package Restaurant.Memento;

public class Memento {
    private int state;
    Originator orig;

    public Memento(Originator o){
        orig = o;
        state = orig.state;
    }

    public void restore(){
        orig.state = this.state;
    }
}
