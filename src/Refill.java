import java.util.ArrayList;
import java.util.List;


public class Refill implements Subject{
    private String inkColor;
    private InkType inkType;
    private int inkLevel;
    private List<Observer> observerList = new ArrayList<>();
    public Refill(String inkColor, InkType inkType, int inkLevel) {
        this.inkColor = inkColor;
        this.inkType = inkType;
        this.inkLevel = inkLevel;
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(this.inkLevel);
        }
    }

    public void consumeInk(int amount) {
        this.inkLevel = Math.max(0,this.inkLevel-amount);
        notifyObservers();
    }

    public String getInkColor() {
        return inkColor;
    }

    public InkType getInkType() {
        return inkType;
    }

    public int getInkLevel() {
        return inkLevel;
    }
}
