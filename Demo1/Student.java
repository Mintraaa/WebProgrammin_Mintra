package Demo1;

public class Student {
    public String name ;
    public int age ;
    public String group ;

    public static void main(String[] args) {
        Student Somsri = new Student() ;
        /*Somsri.name = "Somsri";
        Somsri.age = 15;
        Somsri.group = "65/45";
        */
    


        Somsri.printName();
        Somsri.printAge();
        Somsri.printGroup();
        
    }
    public void printName() {
        System.out.println("Student name \\" + this.name);
    }
    public void printAge() {
        System.out.println("Student age \\" + this.age);
    }
    public void printGroup() {
        System.out.println("Student group \\" + this.group);
    }

}