import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int id, marks;
    private String name;

    public Student(){}
    public Student(int id,int marks, String name){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId(){ return id; }
    public int getMarks(){ return marks; }
    public String getName(){ return name; }
}

class EmpNameComp implements Comparator {

    public int compare(Object o1, Object o2) {
        Student e1 = (Student)o1;
        Student e2 = (Student)o2;
        return e1.getName().compareTo(e2.getName());
    }
}
class EmpIdComp implements Comparator {

    public int compare(Object o1, Object o2) {
        Student e1 = (Student)o1;
        Student e2 = (Student)o2;

        if(e1.getId() < e2.getId())
            return -1;
        return 1;
    }
}
class EmpMarkComp implements Comparator {

    public int compare(Object o1, Object o2) {
        Student e1 = (Student)o1;
        Student e2 = (Student)o2;

        if(e1.getMarks() < e2.getMarks())
            return -1;
        return 1;
    }
}

public class comparator2 {
    public static void main(String[] args) {
        
        Student[]e = new Student[3];

        e[0] = new Student(33,560,"Dharmil");
        e[1] = new Student(34,550,"Umang");
        e[2] = new Student(32,600,"Kulin");

        TreeSet <Student> sortById = new TreeSet<Student>(new EmpIdComp());
        TreeSet <Student> sortByName = new TreeSet<Student>(new EmpNameComp());
        TreeSet <Student> sortByMark = new TreeSet<Student>(new EmpMarkComp());

        for(int i=0 ; i<e.length ; i++){
            sortById.add(e[i]);
            sortByName.add(e[i]);
            sortByMark.add(e[i]);
        }

        System.out.println("\n---- Sort by Id ----");
        for(Student temp: sortById) {
            System.out.println(" Id: "+temp.getId()+"  => Name: "+temp.getName()+" => Marks: "+temp.getMarks());
        }
        
        System.out.println("\n---- Sort by Name ----");
        for(Student temp: sortByName) {
            System.out.println(" Id: "+temp.getId()+"  => Name: "+temp.getName()+" => Marks: "+temp.getMarks());
        }

        System.out.println("\n---- Sort by Marks ----");
        for(Student temp: sortByMark) {
            System.out.println(" Id: "+temp.getId()+"  => Name: "+temp.getName()+" => Marks: "+temp.getMarks());
        }
    }
}