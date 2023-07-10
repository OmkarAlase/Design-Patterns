package Android;

import Iphone.IOSMenu;
import UI.Button;
import UI.Menu;
import UI.UIFactory;

public class AndroidUIFactory implements UIFactory {


    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
