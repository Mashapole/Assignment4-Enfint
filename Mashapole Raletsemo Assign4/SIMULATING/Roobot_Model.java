/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMULATING;

/**
 *
 * @author user
 */
public abstract class Roobot_Model extends Thread
{
    public int length;
    
    public abstract String getRobotName();
    public abstract int getRobotNumber();
    public abstract int runLeangth();
}
