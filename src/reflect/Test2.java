package reflect;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test2 {
    public static void main(String[] args)throws Exception {
        BufferedReader br =new BufferedReader(new FileReader("D:\\package\\eclipse-jee-oxygen-1a-win32-x86_64\\project1\\src\\reflect\\a.property"));
        String s=br.readLine();
        Class clazz =Class.forName(s);
        Test1 t= (Test1) clazz.newInstance();
        System.out.println(t);
    }
}
