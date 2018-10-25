package reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo02 {
    public static void main(String[] args) {
        String path = "reflectdemo.User";
        try {
            Class clazz = Class.forName(path);
            //获取类名
            String name = clazz.getName();
            String simpleName = clazz.getSimpleName();
            System.out.println("包名+类名:" + name + "类名:" + simpleName );
            //获取属性
            // clazz.getFields();获得public的属性
            Field[] fields = clazz.getDeclaredFields();//获取所有属性
            for (Field f : fields){
                System.out.println("获取属性:" + f);
            }
            //获取方法
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods){
                System.out.println("获得方法：" + m);
            }
            //获取构造器
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for(Constructor c : constructors){
                System.out.println("获得构造器:" + c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
