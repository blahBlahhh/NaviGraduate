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
public class Student {
    private String name;
    private int sat;
    private double gpa;
    
    public Student (){};
    
    public Student(String name, int sat, double gpa){
        this.name=name;
        this.sat=sat;
        this.gpa=gpa;
    }
    
    int getSAT(){
        return this.sat;
    }
    void setSAT(int newSATScore){
        this.sat= newSATScore;
    }
    double getGPA(){
        return this.gpa;
    }
    void setGPA(double newGPA){
        this.gpa= newGPA;
    }
    @Override
    public String toString(){
    return "[" + name + "," + sat +","+gpa+ "]";
    }
}
