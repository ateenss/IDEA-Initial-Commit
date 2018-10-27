import java.util.HashMap;
import java.util.Map;

/**
 * @author dongyuhang
 * @date 2018/9/6 9:49
 * @Description:
 */
public class Person {
    private String name=null;
    private int Id;
    private Animal animal;
    private Map<String,Animal> animalMap=new HashMap<>();

    public void add2Map(String name,Animal animal){
        animalMap.put(name,animal);
    }

    public Map<String, Animal> getAnimalMap() {
        return animalMap;
    }

    public void setAnimalMap(Map<String, Animal> animalMap) {
        this.animalMap = animalMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
