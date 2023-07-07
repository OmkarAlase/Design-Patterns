import Iphone.Iphone;
import Iphone.Iphone14;
import Iphone.Notch;
import Notebook.Notebook;
import Notebook.Rule;
import Notebook.NotebookRegistry;
import Iphone.IphoneRegistry;

import java.util.Random;

public class Main {
    private static final String IPHONE_14 = "IPHONE_14";
    public static void main(String[] args) {
        IphoneRegistry registry = setupAndGetIphoneRegistry();
        Iphone prototype = registry.get(IPHONE_14);
        for(int i = 0;i < 100;i++){
            Iphone iphone = prototype.clone();
            iphone.setIMEI((int) ((Math.random() * (999999 - 11111111)) + 9999999));
            System.out.println(iphone);
        }
    }

    private static IphoneRegistry setupAndGetIphoneRegistry(){
        IphoneRegistry registry = IphoneRegistry.getInstance();
        registry.register(IPHONE_14,new Iphone14(214,322,3201,12,"White",Notch.SMALL_NOTCH));
        return registry;
    }
}