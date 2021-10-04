import java.util.*;

class person
{
  String name;
 String gender;
 int age;
 String address;

 person()
 {
 name=" ";
 gender=" ";
 age=0;
 address=" ";
 }

 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter the person name");
 name=sc.nextLine();
 System.out.println(" Enter the gender");
 gender=sc.nextLine();
 System.out.println(" Enter the age");
 age=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("The person name is : "+name);
 System.out.println("gender:"+gender);
 System.out.println("Age of a person :"+age);
 System.out.println("Address :"+address);
 }
}
