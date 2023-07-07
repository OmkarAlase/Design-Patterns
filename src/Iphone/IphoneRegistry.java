package Iphone;

import java.util.HashMap;
import java.util.Map;

public class IphoneRegistry {
    private static IphoneRegistry instance;
    private Map<String,Iphone> map;
    private IphoneRegistry(){
        this.map = new HashMap<>();
    }

    public static IphoneRegistry getInstance(){
        if(instance == null){
            synchronized (IphoneRegistry.class){
                if(instance == null){
                    instance = new IphoneRegistry();
                }
            }
        }

        return instance;
    }

    public void register(String key,Iphone phone){
        this.map.put(key,phone);
    }
    public Iphone get(String key){
        return map.get(key);
    }
}
