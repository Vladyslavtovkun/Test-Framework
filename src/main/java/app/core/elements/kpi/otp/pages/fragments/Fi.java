package app.core.elements.kpi.otp.pages.fragments;

public class Fi {

    public static void main(String[] args) {
        int [] mass = new int [20];

        for(int i=0; i<=20; i++) {
            if(i%3==0) {
                System.out.println("Fiz");
            }
            if(i%5==0) {
                System.out.println("Bazz");
            }
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBazz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
