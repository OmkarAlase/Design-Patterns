package Notebook;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    private static NotebookRegistry instance;
    private Map<String, Notebook> map;
    private NotebookRegistry(){
        map = new HashMap<>();
    }

    public static NotebookRegistry getInstance(){
        if(instance == null){
            synchronized (NotebookRegistry.class){
                if(instance == null) instance = new NotebookRegistry();
            }
        }
        return instance;
    }

    public void register(String key,Notebook book){
        map.put(key,book);
    }
    public Notebook get(String key){
        return map.get(key);
    }
}
