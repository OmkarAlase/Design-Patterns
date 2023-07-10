package Web;

import Interface.Shape;
import Interface.ShapeFactory;

public class WebShapeFactory implements ShapeFactory {
    @Override
    public Shape generateCircle() {
        return new WebCircle();
    }

    @Override
    public Shape generateSquare() {
        return new WebSquare();
    }

    @Override
    public Shape generateTriangle() {
        return new WebTriangle();
    }
}
