package LeetCode;

import java.util.Scanner;

public class HanoiTower {

    static void hanoiTower(int dishs, int one, int two, int three){
        if( dishs == 1)
            System.out.println("�L�q" + one + "����" + three);
        else{
            hanoiTower(dishs-1, one, three, two);//Step1.
            hanoiTower(1, one, two, three);//Step2.
            hanoiTower(dishs-1, two, one, three);//Step3.
        }
    }

    public static void main(String [] args){
    	Scanner sc=new Scanner(System.in);
    
        int dishs = 3;//�L�l��
        hanoiTower(dishs, 1, 2, 3);
    }

}