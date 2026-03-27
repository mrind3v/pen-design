import java.sql.Ref;

abstract class Pen implements Observer{
    protected Refill refill;
    protected boolean isOpen = false;

    public Pen(Refill refill) {
        this.setRefill(refill);
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void update(int inkLevel) {
        if (inkLevel==0) {
            System.out.println("Pen is out of ink...");
        } else {
            System.out.println("Ink level updated: " + inkLevel);
        }
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
        refill.registerObserver(this);
    }

    public void write() {
        // generally, we need to open the pen to write and check the refill
        if (!isOpen()) {
            System.out.println("Pen is closed. Opening it...");
            open();
        }
        if (refill==null || refill.getInkLevel()==0) {
            System.out.println("Pen is out of ink or has no refill. Refilling...");
            setRefill(getDefaultRefill());
        }

        performWriting();
        refill.consumeInk(getDefaultInkConsumptionRate());
    }

    public abstract Refill getDefaultRefill();
    public abstract void performWriting();
    public abstract int getDefaultInkConsumptionRate();
}
