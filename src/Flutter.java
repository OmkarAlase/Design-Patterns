import Android.AndroidUIFactory;
import Iphone.IOSUIFactory;
import UI.Platform;
import UI.UIFactory;

public class Flutter {
    public static void main(String[] args) {
        Flutter f = new Flutter();
        UIFactory factory = f.getUIFactoryByPlatform(Platform.IOS);
        factory.createButton().renderButton();
        factory.createMenu().renderMenu();
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh rate.");
    }

    public UIFactory getUIFactoryByPlatform(Platform platform){
        if(platform.equals(Platform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(Platform.IOS)){
            return new IOSUIFactory();
        }

        throw new UnsupportedOperationException("Unsupported Platform.");
    }
}