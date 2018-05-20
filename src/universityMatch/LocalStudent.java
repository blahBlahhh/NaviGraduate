/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityMatch;

/**
 *
 * @author wuhaijian
 */
public class LocalStudent extends Student{
    private final String loc = "local";
    
    public LocalStudent(String name, int sat, double gpa){
        super(name, sat, gpa);
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getloc(){
        return loc;
    }
}
