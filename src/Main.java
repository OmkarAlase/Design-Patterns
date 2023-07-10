import Desktop.DesktopShapeFactory;
import Interface.Platform;
import Interface.ShapeFactory;
import Web.WebShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shape = getShapeFactoryByPlatform(Platform.DESKTOP);
        shape.generateCircle().generateShape();

    }

    public static ShapeFactory getShapeFactoryByPlatform(Platform platform){
        if(platform.equals(Platform.DESKTOP)){
            return new DesktopShapeFactory();
        }
        else if(platform.equals(Platform.WEB)){
            return new WebShapeFactory();
        }

        throw new UnsupportedOperationException();
    }
}