public class PenFactory {
    public static Pen createPen(InkType inkType, String inkColor) {
        Refill refill = new Refill(inkColor, inkType, 100);

        switch (inkType) {
            case BALL:
                return new BallPen(refill);
            case GEL:
                return new GelPen(refill);
            default:
                throw new IllegalArgumentException("Invalid pen type!");
        }
    }
}
