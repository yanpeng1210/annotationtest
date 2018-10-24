package reflectdemo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import reflectdemo.Person;
public class Test {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("reflectdemo.Person");
            Method[] method = clazz.getDeclaredMethods();
            for(Method m : method){
                System.out.println(m.toString());
            }
            Field[] field = clazz.getDeclaredFields();
            for(Field f : field){
                System.out.println(f.toString());
            }
            Constructor[] constructor = clazz.getDeclaredConstructors();
            for(Constructor con : constructor){
                System.out.println(con.toString());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
