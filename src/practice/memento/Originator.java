package practice.memento;

public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        // ???
        
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}
