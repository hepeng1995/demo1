package reflect;

public class Test1 {
    @Override
    public String toString() {
        return "这个方法什么都没有";
    }

    public static void main(String[] args)throws Exception {
        Student s=new Student("李达康",40);
        System.out.println(s.getName()+s.getAge());
        Tool t=new Tool();
        t.update(s,"name","沙瑞金");
        System.out.println(s.getName()+s.getAge());

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
