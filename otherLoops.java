public class otherLoops {
    public static void main(String[] args) {
        //p1(5);
//        p2(5);
        //p3(5);
//        p4(5);
        //p5();
        //p6();
//        p7();
        //p8();
        //p9();
        //p10();
        //p11();
        //p12();
        //p13();
        //p14();
        //p15();
        //p16();
        p17();
    }


    static void p1(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==2 || j==2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    static void p2(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==j || i+j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p3(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==j || j==0 || i==4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static  void p4(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i+j==n-1 || i==0 || j==0 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p5(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i ; j++) {
                if (i==n || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i ; j++) {
                if (i==j || j==i || i==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p6(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void p7(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void p8(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p9(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p10(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <i ; j++) {
                if (j==1 || i==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=i ; j++) {
                if (i==j || i ==5 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p11(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <n ; j++) {
                if (i==1 || i==j ){
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

    static void p12(){
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j =1; j <i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p13(){
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void p14(){
        int n=4;
        for (int i =1; i <=n ; i++) {
            for (int j = 1,p=1; j <=i ; j++, p+=2) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }

    static void p15(){
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%2==0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p16(){
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i ; j++) {
                if ((i+j)%2==0 || i==j){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    static void p17(){
        int n=4;
        int p=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++,p++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
