package marcin.dohnalik.studia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game implements IObservable {

    private List<IObserver> observers;

    public Game() {
        this.observers = new ArrayList<IObserver>();
    }

    private String name;
    private int result;

    public String getGameName(){
        return name;
    }

    @Override
    public void addObserver(IObserver observer) {
        if(observer != null){
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if(observer != null){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<IObserver> it = observers.iterator();
        while(it.hasNext()){
            IObserver observer = it.next();
            observer.notify(this);
        }
    }

    public int getGameResult(){
        return result;
    }

    public void updateGameResult(int updatedResult){
        this.result = updatedResult;
        this.notifyObservers();
    }

    public void setName(String gameName){
        this.name = gameName;
    }
}
