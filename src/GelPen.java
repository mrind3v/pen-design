public class GelPen extends Pen{
    public GelPen(Refill refill) {
        super(refill);
    }
    @Override
    public Refill getDefaultRefill() {
       return new Refill("BLUE", InkType.GEL, 100);
    }

    @Override
    public void performWriting() {
        System.out.println("Writing with gel pen...");
    }

    @Override
    public int getDefaultInkConsumptionRate() {
        return 10;
    }
}
