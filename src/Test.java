import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author dongyuhang
 * @date 2018/9/6 9:52
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        Animal animal1=new Animal("红色斑点狗",20);
        Animal animal2=new Animal("LV斑点狗",11);
        Person person1=new Person();
        person1.add2Map("1号动物",animal1);
        NewAnaiml newAnaiml = new NewAnaiml();
        newAnaiml.setAnimalMap(person1.getAnimalMap());
        person1.setAnimal(animal1);
        person1.setId(13);
        System.out.println(person1.getAnimalMap());
        System.out.println("直接复制之后的");
        System.out.println(newAnaiml.getAnimalMap());
        System.out.println("开始做操作");
        newAnaiml.doAdjust("2号动物",animal2);
        Set<Map.Entry<String, Animal>> entries = newAnaiml.getAnimalMap().entrySet();
        Iterator<Map.Entry<String, Animal>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Animal> next = iterator.next();
            System.out.print(next.getValue().getYanzhi()+"\t");
        }
        System.out.println("");
        System.out.println("复制之后");
        Set<Map.Entry<String, Animal>> entries2 = person1.getAnimalMap().entrySet();
        Iterator<Map.Entry<String, Animal>> iterator2 = entries2.iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, Animal> next = iterator2.next();
            System.out.print(next.getValue().getYanzhi()+"\t");
        }




        /*System.out.println(person1.getId());
        System.out.println(person1.getName());
        System.out.println(person1.getAnimal().getMingjiao());
        System.out.println(person1.getAnimal().getYanzhi());
        Person person2=new Person();
        BeanCopyUtil.copyBean(person1,person2);
        System.out.println(person1.equals(person2));
        System.out.println("我是copy之后的类");*/
        /*System.out.println(person2.getName()+"\t"+person2.getId()+"\t\t"+person2.getAnimal());*/

    }
}
