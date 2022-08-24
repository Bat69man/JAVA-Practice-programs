import java.util.PriorityQueue;
import java.util.Comparator;
import java.lang.Comparable;

class Student{
    private int id, marks;
    private String name;

    public Student(){}
    public Student(int id, String name, int marks){
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    
    public int   getMarks(){  return marks; }
    public int      getId(){  return id;    }
    public String getName(){  return name;  }
}

class marksComparator implements Comparator{

    public int compare(Object o1, Object o2){
        Student a = (Student) o1;
        Student b = (Student) o2;
        if( a.getMarks() > b.getMarks())
            return -1;
        return 1;
    }
}

public class PQueue {
    public static void main(String[] args) {
        
        PriorityQueue <Student> queue = new PriorityQueue <Student>(new marksComparator());

        Student s1 = new Student(28,"Dhruvin",510);
        Student s2 = new Student(33,"Dharmil",500);
        Student s3 = new Student(29,"Kano",541);
        
        queue.add(s1);
        queue.add(s2);
        queue.add(s3);

        System.out.println(" Id\tName\t\tMarks\n-----------------------------------");
        for(Student temp: queue){
            System.out.println(" "+temp.getId()+"\t"+temp.getName()+"\t\t"+temp.getMarks());
        }

        PriorityQueue <String> pq = new PriorityQueue<>();
        pq.offer("Asdsdf");
        pq.offer("sdgggdfC");
        pq.offer("Bsdfgdfg");
        pq.offer("Ddfgdf");

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}