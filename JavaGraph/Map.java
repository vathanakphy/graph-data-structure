package JavaGraph;
import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> Student = new HashMap<>();
        Student.put("Nak",10);
        Student.put("jak",20);
        Student.put("Bob",30);
        Student.put("Kelvin",40);
        for(HashMap.Entry<String, Integer> stu:Student.entrySet()){
            System.out.print(stu.getKey()+ " : ");
            System.out.println(stu.getValue());
        }   
        
    }
}
