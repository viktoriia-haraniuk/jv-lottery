package core.basesyntax;

public class Lottery {
    private static final int MAX_BOUND = 100;
    private ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }
}
