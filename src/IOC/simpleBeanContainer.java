package IOC;

import java.util.HashMap;
import java.util.Map;

public class simpleBeanContainer {
    private Map<String,Object> beanMap=new HashMap<>();
    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }
    public Object getBean(String name){
        return beanMap.get(name);
    }
}
