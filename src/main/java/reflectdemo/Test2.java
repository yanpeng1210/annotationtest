package reflectdemo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("reflectdemo.Person");
            Person p = (Person) clazz.newInstance();
            p.setAge(23);
            p.setGender("男");
            p.setName("apple");
            System.out.println(p.toString());


            Constructor c = clazz.getDeclaredConstructor(String.class,String.class,int.class);
            Person p1 = (Person) c.newInstance("lisi","女",33);
            System.out.println(p1.toString());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
