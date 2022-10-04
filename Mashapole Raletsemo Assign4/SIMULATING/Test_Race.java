
package SIMULATING;

import java.time.LocalTime;
import java.util.Scanner;


public class Test_Race {

    public static void main(String[] args) 
    {
        int fixedLength;
        LocalTime myObj = LocalTime.now();
        
        while(true)
        {
            try
            {
                Scanner scan= new Scanner(System.in);
                System.out.print("Please enter the fixed length between 100-200: ");
                fixedLength=scan.nextInt();
                
                if(fixedLength>=100 && fixedLength<=200)
                {
                    StartTheRace(fixedLength,myObj);                    
                    break;
                }
                else
                {
                 System.out.print("Please enter the fixed length between 100-200: ");
                 fixedLength=scan.nextInt();  
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error: "+ex.toString());
            }
        }
    }

    private static void StartTheRace(int fixedLength,LocalTime myObj) 
    {
        System.out.println("New race started at: "+myObj);
        Robot1 rob1= new Robot1(fixedLength);
        Robot2 rob2= new Robot2(fixedLength);
        Robot3 rob3= new Robot3(fixedLength);
        Robot4 rob4= new Robot4(fixedLength);
        Robot5 rob5= new Robot5(fixedLength);
        Robot6 rob6= new Robot6(fixedLength);
        Robot7 rob7= new Robot7(fixedLength);
        Robot8 rob8= new Robot8(fixedLength);
        Robot9 rob9= new Robot9(fixedLength);
        Robot10 rob10= new Robot10(fixedLength);
        rob1.start();
        rob2.start();
        rob3.start();
        rob4.start();
        rob5.start();
        rob6.start();
        rob7.start();
        rob8.start();
        rob9.start();
        rob10.start();
    }
  
}
