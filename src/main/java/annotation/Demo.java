package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟反射的处理流程
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation.SxtStudent");
            //获得类的所有注解
            Annotation[] annotations = clazz.getAnnotations();
            for(Annotation a : annotations){
                System.out.println(a);
            }
            // 获得类的指定注解
            SetTable setTable = (SetTable) clazz.getAnnotation(SetTable.class);
            System.out.println(setTable.value());

            //获取类属性的的注解
            Field f = clazz.getDeclaredField("studentName");
            SetField setField = f.getAnnotation(SetField.class);
            System.out.println(setField.columnName()+"--"+setField.type()+"--"+setField.length());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
