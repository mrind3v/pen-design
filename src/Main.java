//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pen ballPen = PenFactory.createPen(InkType.BALL, "Blue");
    Pen gelPen = PenFactory.createPen(InkType.GEL, "Black");

    System.out.println("--- Testing BallPen ---");
    ballPen.write();
    ballPen.write();

    System.out.println("\n--- Testing GelPen ---");
    gelPen.write();

    System.out.println("\n--- Testing Auto-Open Feature ---");
    gelPen.close();
    gelPen.write();

    System.out.println("\n--- Testing Ink Depletion ---");
    Refill emptyRefill = new Refill("Red", InkType.BALL, 2);
    Pen redPen = new BallPen(emptyRefill);

    redPen.write();
    redPen.write();
}
