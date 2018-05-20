/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityMatch;

import java.util.Scanner;

/**
 *
 * @author wuhaijian
 */
public class StudentInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student []user=new Student[100];
        
        System.out.println("请输入您的姓名，SAT分数，和GPA。由空格区分。如Jacob 1580 4.25");
        String name=sc.next();
        int SAT=sc.nextInt();
        double gpa=sc.nextDouble();
        user[1]=new LocalStudent(name,SAT,gpa);
        System.out.println(user[1]);
        System.out.println(((LocalStudent)user[1]).getloc());
    }
    
}
