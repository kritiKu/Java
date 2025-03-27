
public class student {
    String name;
    int age;
    String rollNo;
    String house;

    public student(String name, int age, String rollNo, String house){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString(){
        return "Student Details:{name:"+ name 
        + ", age:"+ age 
        + ", rollNo:" + rollNo 
        + ", house:"+ house +"}";
    }
    public static void main(String[] args){
        student stud = new student("Kriti", 22, "115", "Blue");
        System.out.println(stud);
    }
}
