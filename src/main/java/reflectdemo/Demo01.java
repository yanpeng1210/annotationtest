package reflectdemo;

public class Demo01 {
    public static void main(String[] args) {
        String path = "reflectdemo.User";
        try {
            Class clazz = Class.forName(path);
            System.out.println(clazz.hashCode());
            Class clazz2 = Class.forName(path);
            System.out.println(clazz2.hashCode());//一个类只对应一个class对象

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
