public class student {
    private String name="akash";
    private int rollno=2003001;
    private int mark =500;
    
    public void display(){
       
        System.out.println("mt name is " + name + "rollno is " +rollno + "marks is  :" +mark);

    }
    
}
class DemoStudent{
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}