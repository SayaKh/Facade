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
class Specialty {
    private Student state;
    
    public Specialty()
    {
        state = null;
    }
    public void setSpecialty(Student stat)
    {
        this.state=stat;
    }
    
    public Student getSpecialty()
    {
        return state;
    }
    
}
