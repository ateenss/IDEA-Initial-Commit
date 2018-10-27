import java.util.HashMap;
import java.util.Map;

/**
 * @author dongyuhang
 * @date 2018/9/6 10:34
 * @Description:
 */
public class NewAnaiml {
    private Map<String,Animal> animalMap=new HashMap<>();

    public void doAdjust(String name,Animal animal){
        animalMap.put(name,animal);
    }

    public Map<String, Animal> getAnimalMap() {
        return animalMap;
    }

    public void setAnimalMap(Map<String, Animal> animalMap) {
        this.animalMap = animalMap;
    }
}
