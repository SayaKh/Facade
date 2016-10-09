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
public class ITStudent implements Student{

    @Override
    public void show(Specialty con) {
        System.out.println("IT Student!");
        con.setSpecialty(this);
    }
    
}
