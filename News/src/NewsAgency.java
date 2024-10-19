import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Observable{
    private List<Observer> observers;
    private String latestHeadline;

    public NewsAgency(){
        observers = new ArrayList<>();
    }
    public void setLatestHeadline(String headline){
        this.latestHeadline = headline;
        notifyObservers();
    }
    public String getLatestHeadline(){
        return latestHeadline;
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(latestHeadline);
        }
    }

}
