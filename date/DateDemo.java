import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable{
    private Date dateOfBirth, dateOfJoining;
    private String name;
    private int id, salary;
    private static Scanner sc = new Scanner(System.in);

    public Employee(){
        dateOfBirth = new Date();
        dateOfJoining = new Date();
        setData();
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setData(){
        System.out.print("\n Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print(" Enter name: ");
        name = sc.nextLine();
        System.out.print(" Enter salary: ");
        salary = sc.nextInt();
        System.out.print(" Enter Date of Birth: \n Day: ");
        int temp = sc.nextInt();
        dateOfBirth.setDate(temp);
        System.out.print(" Month: ");
        temp = sc.nextInt();
        dateOfBirth.setMonth(temp);
        System.out.print(" Year: ");
        temp = sc.nextInt();
        dateOfBirth.setYear(temp);

        LocalDate localDate = LocalDate.now();
        dateOfJoining.setDate(localDate.getDayOfMonth());
        dateOfJoining.setMonth(localDate.getMonthValue());
        dateOfJoining.setYear(localDate.getYear());
    }
    public void getData(){
        System.out.println("\n     Id: "+id);
        System.out.println("   Name: "+name);
        System.out.println(" Salary: "+salary);
        System.out.println("    DOB: "+dateOfBirth.getDate()+"/"+dateOfBirth.getMonth()+"/"+dateOfBirth.getYear());
        System.out.println("    DOJ: "+dateOfJoining.getDate()+"/"+dateOfJoining.getMonth()+"/"+dateOfJoining.getYear());
    }
    public int compareTo(Object obj){ //Default comparale for ascending sorting by Id.
        Employee employee2 = (Employee)obj;
        if(this.id < employee2.getId())
            return -1;
        else
            return 1;
    }
}

class ascendingSalaryComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Employee employee1 = (Employee)obj1;
        Employee employee2 = (Employee)obj2;
        if(employee1.getSalary() < employee2.getSalary())
            return -1;
        else
            return -1;
    }
}

class descendingIdComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Employee employee1 = (Employee)obj1;
        Employee employee2 = (Employee)obj2;
        if(employee1.getId() < employee2.getId()){
            return 1;
        }
        else{
            return -1;
        }
    }
}

class ascendingNameComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Employee employee1 = (Employee)obj1;
        Employee employee2 = (Employee)obj2;
        return employee1.getName().compareTo(employee2.getName());
    }
}


public class DateDemo{
    public static void main(String[] args) {
        
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        for(byte i=0 ; i<2 ; i++){
            employeeList.add(new Employee());
        }
        for(Employee temp: employeeList){
            temp.getData();
        }

        Collections.sort(employeeList);
        System.out.println("\n---- Ascending Id");
        for(Employee temp: employeeList){
            temp.getData();
        }
        
        System.out.println("\n---- Descending Id");
        Collections.sort(employeeList, new descendingIdComparator());
        for(Employee temp: employeeList){
            temp.getData();
        }

        System.out.println("\n---- Ascending Names");
        Collections.sort(employeeList, new ascendingNameComparator());
        for(Employee temp: employeeList){
            temp.getData();
        }

        System.out.println("\n---- Ascending Salary");
        Collections.sort(employeeList, new ascendingSalaryComparator());
        for(Employee temp: employeeList){
            temp.getData();
        }
    }
}