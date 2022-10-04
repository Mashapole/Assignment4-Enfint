/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMULATING;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Robot9 extends Roobot_Model
{
    LocalTime myObj2;
    public Robot9()
    {
        
    }
    public Robot9(int leng) 
    {
        this.length=leng;
    }
    public int RandomSpeed(int min, int max)
    {
     double r=Math.random();
     int rand=(int) (r*(max-min)+min);
     
     return rand;
    } 
    
    @Override
    public String getRobotName() 
    { 
     return "Robot";
    }

    @Override
    public int getRobotNumber() 
    {
     return 9;
    }

    @Override
    public int runLeangth() 
    {
     return this.length;
    }
    
    @Override
    public void run()
    {
        int speed=RandomSpeed(1,5);
        
        if(speed==1)
        {
            for(int i=0;i<runLeangth();i++)
            {
                //System.out.println("Roobot 1:"+i);
                try 
                {
                   Thread.sleep(2000);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(Robot1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
        if(speed==2)
        {
            for(int i=0;i<runLeangth();i+=2)
            {
                //System.out.println("Roobot 1:"+i);
                try 
                {
                 Thread.sleep(1000);
                } 
                catch (InterruptedException ex) 
                {
                Logger.getLogger(Robot1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
        if(speed==3)
        {
            for(int i=0;i<runLeangth();i+=3)
            {
                //System.out.println("Roobot 1:"+i);
                try 
                {
                 Thread.sleep(700);
                } catch (InterruptedException ex) 
                {
                    Logger.getLogger(Robot1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
        else
        {
            for(int i=0;i<runLeangth();i+=4)
            {
                //System.out.println("Roobot 1:"+i);
                try 
                {
                    Thread.sleep(200);
                }
                catch (InterruptedException ex) 
                {
                    Logger.getLogger(Robot1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
        //Robot 1 finished in 10.01 seconds 
        myObj2 = LocalTime.now();
        System.out.println(getRobotName()+"  "+getRobotNumber()+"  finished in"+"  "+myObj2+"  seconds"+"  With speed Level: "+speed);
    }

}
