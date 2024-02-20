

public class loop1 {
    public static void main(String[] args) {

        loop l=new loop();
//        l.p1();
//        System.out.println();
//        l.p2();
//        System.out.println();
//        l.p3();
//        System.out.println();
//        l.p4();
//        System.out.println();
        //l.p5();
        //l.p6();
        //l.p7();
        //l.p8();
        //l.p9();
        //l.p10();
        //l.p11();
        //l.p12();
        //l.p13();
        //l.p14();
        //l.p15();
        l.p16();

    }
}

class loop{
    //*****
    //*****
    //*****
    //*****
    //*****
    void p1(){
        for (int i=0;i<5;i++){
            for (int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*
    //**
    //***
    //****
    //*****

    void p2(){
        for (int i=0; i<5;i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*****
    //****
    //***
    //**
    //*

    void p3(){
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

    void p4(){
        for (int i=0;i<5 ;i++){
            for (int j=1; j<i+2; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //*
    //**
    //***
    //****
    //*****
    //****
    //***
    //**
    //*

    void p5(){
        int n=5;
        for (int row=0;row<2*n; row++){
            int ans= row>n? 2*n-row: row;
            for (int j=0; j<ans; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //         *
    //        **
    //       ***
    //      ****
    //     *****

    void p6(){
        for (int i=1; i<5+1; i++){
            for (int j=0;j<5; j++){
                if (j<5-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

    //*****
    //****
    //***
    //**
    //*

    void p7(){
        for (int i=1; i<5+1; i++){
            for (int j=i; j>0 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //        *
    //       ***
    //      *****
    //     *******
    //    *********

    void p8(){
        int n=5;
        for (int i=1;i<n+1; i++){
            for(int j=0;j<n-i; j++){
                System.out.print(" ");
            }
            for (int x=0; x<i ;x++){
                System.out.print("*");
            }
            for (int y=0; y<i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //    *********
    //     *******
    //      *****
    //       ***
    //        *

    void p9(){
        int n=5;
        for (int i=1; i<n+1; i++){
            for (int s=0; s<i+1; s++){
                System.out.print(" ");
            }
            for (int j=0; j<n-i ;j++){
                System.out.print("*");
            }
            System.out.print("*");
            for (int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //         *
    //        * *
    //       * * *
    //      * * * *
    //     * * * * *

    void p10(){
        int n=5;
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //     * * * * *
    //      * * * *
    //       * * *
    //        * *
    //         *

    void p11(){
        int n=5;
        for (int i = 1; i <n+1 ; i++) {
            for (int j=0;j<i; j++){
                System.out.print(" ");
            }

            for (int j=n+1; j>i ;j--){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    //     * * * * *
    //      * * * *
    //       * * *
    //        * *
    //         *
    //         *
    //        * *
    //       * * *
    //      * * * *
    //     * * * * *

    void p12(){
        int n=5;
        for (int i = 1; i < n+1; i++) {
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=n; j>i-1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<n+1; i++){
            for (int j=-1;j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //         *
    //        * *
    //       *   *
    //      *     *
    //     *********

    //not completed
    void p13(){
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i+j==n-1 || i==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            if(i>0){
                for (int j = 0; j <n ; j++) {
                    if (i==j || i==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }


            System.out.println();
        }
    }
    void p13_1(){

    }

    //     *********
    //      *     *
    //       *   *
    //        * *
    //         *

    //not completed
    void p14(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <n ; j++) {

                if (i==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                if (i==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    //         *
    //        * *
    //       *   *
    //      *     *
    //     *       *
    //      *     *
    //       *   *
    //        * *
    //         *

    void p15(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <i ; j++) {
                if (j==1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i ; j++) {
                if (i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <n ; j++) {
                if (i==j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                if (i==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //              1
    //            1   1
    //          1   2   1
    //        1   3   3   1
    //      1   4   6   4   1

    void p16(){
        loop l=new loop();
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                int temp=l.factorial(j)/ l.factorial(i)*l.factorial(j-i);
                System.out.print(temp+" ");
            }
            System.out.println();
        }

    }

    int factorial(int n){

        int ans=1;
        while(n>0){
            ans*=n;
            n--;
        }
        return ans;
    }

}
