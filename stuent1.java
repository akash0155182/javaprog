public class stuent1 {
    String name;
    int rollno;
    int mark;
    public void display(){
        System.out.println("my  ame is :" + name + "roll no " + rollno +"marks is "+mark);
    }
    
}
class DemoStudent{
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}
