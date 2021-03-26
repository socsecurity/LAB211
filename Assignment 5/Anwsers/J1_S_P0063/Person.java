
import java.util.Scanner;
public class Person {

    public static Scanner sc = new Scanner(System.in);
    private String name;
    private String address;
    private double salary;

    private Person[] persons = new Person[3];
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person(){}
    
    public Person(String a, String b, double c){
        name = a;
        address = b;
        salary = c;
    }

    Person inputPersonInfo(String name, String address, String sSalary){
        Double sa=Double.NaN;
        while (true){
            try {
                sa = Double.parseDouble(sSalary);
                if (sa<0) {
                    System.out.println("Salary is greater than zero.");
                    sSalary = sc.nextLine();
                    continue;
                } else return new Person(name, address, sa);
            } catch (NumberFormatException e) {
                System.out.println("You must input digidt.");
                sSalary = sc.nextLine();
            }
        }
    }

    void displayPersonInfo(Person person){
        System.out.println("Information of Person you have entered:");
        System.out.println("Name: " + person.name);
        System.out.println("Address: " + person.address);
        System.out.println("Salary: " + person.salary+"\n");      
    }

    Person[] sortBySalary(Person[] person){
        int i, j;
        Person temp; 
        boolean swapped; 
        for (i = 0; i < person.length - 1; i++) { 
            swapped = false; 
            for (j = 0; j < person.length - i - 1; j++)  { 
                if (person[j].salary > person[j + 1].salary) { 
                    temp = person[j]; 
                    person[j]= person[j+1]; 
                    person[j+1] = temp; 
                    swapped = true;
                } 
            } 
            if (swapped == false) break; 
        } 
        persons = person;
        return person;

    }

    public Person[] init(){
        System.out.println("=====Management Person programer=====");
        Person[] p = new Person[3];
        for (int i = 0; i<3; i++){
            System.out.println("Input Information of Person");
            System.out.print("Please input name: ");
            String name = sc.nextLine().trim();
            System.out.print("Please input address: ");
            String address = sc.nextLine().trim();
            System.out.print("Please input salary: ");
            String sSalary = sc.nextLine().trim();
            p[i] = inputPersonInfo(name, address, sSalary);
            persons = p;
        }
        System.out.println();
        return p;
    }

    void displayAll(Person[] p){
        for (Person a : p){
            displayPersonInfo(a);
        }
    }
}

