public class BallPen extends Pen{
    @Override
    public void write() {
        if (!isOpen) {
            System.out.println("Pen is closed. Opening the cap...");
            open();
        }
        if (refill==null || refill.getInkLevel()==0) {
            System.out.println("Pen is out of ink or no refill found. Refilling...");
            // assuming a default refill type
            setRefill(new Refill("BLUE", InkType.BALL, 100));
        }
        System.out.println("Writing with blue pen...");
        refill.consumeInk(5);
    }
}
