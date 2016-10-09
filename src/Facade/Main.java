/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_dp;

/**
 *
 * @author Ghada
 */
public class Main {
    
    public static void main (String args [])
    {
       
        Specialty sp = new Specialty();
        
        ITStudent s1 = new ITStudent();
        s1.show(sp);
        
        
        ENGStudent s2= new ENGStudent();
        s2.show(sp);
        
        ARTStudent s3 = new ARTStudent();
        s3.show(sp);
        
        
    }
    
}
