package reflectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class Demo03 {
    public static void main(String[] args) {
        {
            String path = "reflectdemo.User";
            try {
                Class<User> clazz = (Class<User>) Class.forName(path);
                /*通过反射API调用构造方法，构造对象*/
                User u =  clazz.newInstance();
                System.out.println(u);
                Constructor<User> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
                User u1 = c.newInstance(1001,20,"张数");
                System.out.println(u1.getId() + u1.getAge() + u1.getUname());
                //通过反射API调用普通方法
                User u3 = clazz.newInstance();
                Method method = clazz.getDeclaredMethod("setUname", String.class);
                method.invoke(u3,"李四");
                System.out.println(u3.getUname());

                //通过反射API操作类属性
                User u4 = clazz.newInstance();
                Field f = clazz.getDeclaredField("uname");
                f.setAccessible(true);//这个属性不需要做安全检查了，可以直接访问.
                f.set(u4,"王五"); //通过反射直接写属性
                System.out.println(u4.getUname());
                System.out.println(f.get(u4)); //通过反射直接读属性
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
