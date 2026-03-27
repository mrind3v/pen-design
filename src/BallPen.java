public class BallPen extends Pen{
    public BallPen(Refill refill) {
        super(refill);
    }

    @Override
    public Refill getDefaultRefill() {
       return new Refill("BLUE", InkType.BALL, 100);
    }

    @Override
    public void performWriting() {
        System.out.println("Writing with Ball pen...");
    }

    @Override
    public int getDefaultInkConsumptionRate() {
        return 5;
    }
}
