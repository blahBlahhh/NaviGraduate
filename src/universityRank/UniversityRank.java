/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityRank;

import java.util.Scanner;

/**
 *
 * @author wuhaijian
 */
public class UniversityRank
{
	public String[] university={"Princeton University","Harvard University","Yale University","University of Chicago","Stanford University","Columbia University","MIT","Duke University","University of Pennsylvania","John Hopkins University","Darkmouth College","Califronia Institute of Technology","Northwestern University","Brown University","Cornell University",
	        "Rice University","Vanderbilt University","University of Notre Dame","Washington University in St.Louis","Georgetown University","Emory University","UC�CBerkeley","UCLA","University of Southern California","Carnegie Mellon University","University of Virginia","Wake Forest University","University of  Michigan�CAnn Arbor","Tufts University","New York University",
	        "University of North Carolina�CChapel Hill","Boston College","College of William and Mary","Brandeis University","Georgia Institute of Technology","University of Rochester","Boston University","Case Western Reserve University","UC�CSanta Barbara","Northeastern University","Tulane University","Rensselaer Polytechnic Institute","UC�CIrvine","UC�CSan Diego","University of Florida",
	        "Lehigh University","Pepperdine University","UC�CDavis","University of Miami","University of Wisconsin�CMadison","Villanova University"};;
	public int[] upperSAT={1600,1600,1600,1600,1590,1590,1580,1580,1580,1580,1580,1600,1580,1580,1570,
	                1580,1590,1550,1580,1560,1520,1540,1520,1530,1570,1510,1480,1530,1550,1500,
	                1460,1510,1510,1520,1530,1500,1480,1520,1440,1540,1470,1540,1390,1490,1430,
	                1480,1400,1430,1450,1490,1470};
	public double[] rate={0.07,0.06,0.07,0.08,0.05,0.06,0.08,0.12,0.10,0.13,0.11,0.09,0.13,0.09,0.15,
	        0.16,0.12,0.20,0.17,0.17,0.24,0.15,0.17,0.18,0.24,0.30,0.29,0.26,0.16,0.33,
	        0.30,0.29,0.34,0.34,0.32,0.34,0.33,0.36,0.33,0.28,0.31,0.42,0.39,0.34,0.48,
	        0.30,0.38,0.38,0.38,0.49,0.48};
    
    /**
     * @param args the command line arguments
     */
    public static void SAT(String []University,int[]SAT){
         for(int i=0;i<SAT.length-1;i++) {// ����i������
            int k = i;
            for(int j=k+1;j<SAT.length;j++){// ѡ��С�ļ�¼
                if(SAT[j] > SAT[k]){ 
                    k=j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
                }
            }
            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
            if(i != k){  //����a[i]��a[k]
                int temp = SAT[i];
                String tempName = University[i];
                SAT[i] = SAT[k];
                University[i]=University[k];
                SAT[k] = temp;
                University[k]=tempName;
            }    
        }
    }
    
    public static void Rate(String []University,double[]Rate, int head ,int tail){
        //��ѧ¼ȡ������
        //�������������д˷���ʱ�������
        //Rate(University, Rate, 0, Rate.length-1)
        if (head>=tail || Rate==null || Rate.length<=1){
            return;
        }
        int i=head, j=tail; 
        double pivot=Rate[(head+tail)/2];
        while (i<=j){
            while (Rate[i]<pivot){
                ++i;
            }
            while (Rate[j]>pivot){
                --j;
            }if(i<j){
                double temp=Rate[i];
                Rate[i]=Rate[j];
                Rate[j]=temp;
                String temp2=University[i];
                University[i]=University[j];
                University[j]=temp2;
                ++i;
                --j;
            }else if (i==j){
                ++i;
            }
        }
        Rate(University,Rate, head, j);
        Rate(University,Rate, i, tail);
    }
    
    public static void main(String[] args) {
        Scanner ap=new Scanner(System.in);
        String []University={"Princeton University","Harvard University","Yale University","University of Chicago","Stanford University","Columbia University","MIT","Duke University","University of Pennsylvania","John Hopkins University","Darkmouth College","Califronia Institute of Technology","Northwestern University","Brown University","Cornell University",
            "Rice University","Vanderbilt University","University of Notre Dame","Washington University in St.Louis","Georgetown University","Emory University","UC�CBerkeley","UCLA","University of Southern California","Carnegie Mellon University","University of Virginia","Wake Forest University","University of  Michigan�CAnn Arbor","Tufts University","New York University",
        "University of North Carolina�CChapel Hill","Boston College","College of William and Mary","Brandeis University","Georgia Institute of Technology","University of Rochester","Boston University","Case Western Reserve University","UC�CSanta Barbara","Northeastern University","Tulane University","Rensselaer Polytechnic Institute","UC�CIrvine","UC�CSan Diego","University of Florida",
        "Lehigh University","Pepperdine University","UC�CDavis","University of Miami","University of Wisconsin�CMadison","Villanova University"};
        int []UpperSAT={1600,1600,1600,1600,1590,1590,1580,1580,1580,1580,1580,1600,1580,1580,1570,
        1580,1590,1550,1580,1560,1520,1540,1520,1530,1570,1510,1480,1530,1550,1500,
        1460,1510,1510,1520,1530,1500,1480,1520,1440,1540,1470,1540,1390,1490,1430,
        1480,1400,1430,1450,1490,1470};
        double []Rate={0.07,0.06,0.07,0.08,0.05,0.06,0.08,0.12,0.10,0.13,0.11,0.09,0.13,0.09,0.15,
        0.16,0.12,0.20,0.17,0.17,0.24,0.15,0.17,0.18,0.24,0.30,0.29,0.26,0.16,0.33,
        0.30,0.29,0.34,0.34,0.32,0.34,0.33,0.36,0.33,0.28,0.31,0.42,0.39,0.34,0.48,
        0.30,0.38,0.38,0.38,0.49,0.48};
        String refer=ap.next();
        if(refer.equals("Rate")){
            Rate(University, Rate, 0, Rate.length-1);
            for(int i=0;i<University.length;i++){
                System.out.print(University[i]+" ");
                System.out.println(Rate[i]+" ");
            }
        }
        
        if(refer.equals("SAT")){
            SAT(University,UpperSAT);
            for(int i=0;i<University.length;i++){
                System.out.println(University[i]+" ");
                System.out.println(UpperSAT[i]+" ");
            }
        }
    }
    
}

