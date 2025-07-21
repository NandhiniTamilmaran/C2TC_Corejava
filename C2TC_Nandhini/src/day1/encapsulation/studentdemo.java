package day1.encapsulation;

public class studentdemo {
    public static void main(String[] args) {
      
        student s = new student();
   
        s.setId(101);
        s.setName("Nandhini");
        
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());

        System.out.println(s.toString());
    }
}
