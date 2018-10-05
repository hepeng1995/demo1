package Enmu;

public abstract class Week {
    public static final Week MON=new Week("星期一"){
        @Override
        public void show() {
            System.out.println("星期一");
        }
    };
    public static final Week TUE=new Week("星期二"){
        public void show() {
            System.out.println("星期二");
        }
    };
    public static final Week WES=new Week("星期三"){
        public void show() {
            System.out.println("星期三");
        }
    };
    private String name;
    private Week(String name){
        this.name=name;
    }
public abstract void show();
    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
