package com.company;

public class Main {

    public static void main(String[] args) {
        //11**. Вывести чётные и нечётные числа через while and if
 
        int numb =  345645678;
        int c = numb;
        //Вывод:
        //4.6
        System.out.print("chet  ");
        while ( numb > 0) {
            int cifralast = numb % 10;
            if (cifralast % 2 == 0) {
                System.out.print(cifralast);}
            numb = numb / 10;}
        System.out.println();
        System.out.print("nechet  ");
        while ( c > 0) {
            int cifralast = c % 10;
            if (cifralast % 2 != 0) {
                System.out.print(cifralast);}
            c = c / 10;}

        }
    }

