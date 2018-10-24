package annotation;


@SetTable("tb_student")
public class SxtStudent {
    @SetField(columnName = "id",type="int",length = 10)
    private int id;
    @SetField(columnName = "sname",type="varchar",length = 10)
    private String studentName;
    @SetField(columnName = "age",type="int",length = 3)
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }
}
