package Desktop;

import Interface.Shape;
import Interface.ShapeFactory;

public class DesktopShapeFactory implements ShapeFactory {
    @Override
    public Shape generateCircle() {
        return new DesktopCircle();
    }

    @Override
    public Shape generateSquare() {
        return new DesktopSquare();
    }

    @Override
    public Shape generateTriangle() {
        return new DesktopTriangle();
    }
}
