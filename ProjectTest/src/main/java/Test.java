package src.main.java;

public class Test {

    void pattern() {

        //To iterate the number of rows
            for (int i = 1; i <= 5; i++) {
                //To iterate the elements per row
                for (int j = 1; j <= i; j++) {
                    //To print the elements in next line/row
                    System.out.print(j + " ");
                }
                //To take the control to the next line/ row
                System.out.println();
            }
//        }

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.pattern();
    }
}