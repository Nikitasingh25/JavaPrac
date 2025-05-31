import java.util.*;
public class SimpleInterest {
public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the Principal amount = ");
     int pamount=input.nextInt();
     System.out.println("Enter the time duration= ");
     int time=input.nextInt();
     System.out.println("Enter the rate of the interest=");
     int rate=input.nextInt();
     double Sinterest= (pamount+time+rate)/100;
     System.out.println("Simple interest is ="+Sinterest);


}
}
