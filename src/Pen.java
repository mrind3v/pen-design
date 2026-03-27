abstract class Pen implements Observer{
    protected Refill refill;
    protected boolean isOpen = false;

    @Override
    public void update(int inkLevel) {
        if (inkLevel==0) {
            System.out.println("Pen is out of ink...");
        } else {
            System.out.println("Ink level updated" + inkLevel);
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

    public abstract void write();
}
