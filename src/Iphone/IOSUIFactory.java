package Iphone;

import UI.Button;
import UI.Menu;
import UI.UIFactory;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
