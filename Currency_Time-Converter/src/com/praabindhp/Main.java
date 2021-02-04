package com.praabindhp;
import java.util.Scanner;

public class Main {
    public static void main(String[] m)
    {
        Main x= new Main ();
        x.calculate();
    }
    public void calculate()
    {
        double inr,USD,YEN,EURO,Meter,KM,Hr,Min,Sec;
        int ch;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        System.out.println("1.USD to INR & INR to USD\n2.EURO to INR & INR to EURO\n3.Yen to INR & INR to Yen\n4.Meter to Kilometer & Kilometer to Meter\n5.Hours to Minutes & Seconds");
        ch=in.nextInt();
        switch (ch) {
            case 1 -> {
                System.out.println("Enter USD to convert into INR");
                USD = in.nextInt();
                inr = USD * 60;
                System.out.println("USD=" + USD + " is INR=" + inr);
                System.out.println("Enter INR to convert into USD");
                inr = in.nextInt();
                USD = inr / 60;
                System.out.println("INR=" + inr + " is USD=" + USD);
            }
            case 2 -> {
                System.out.println("Enter EURO to convert into INR:");
                EURO = in.nextInt();
                inr = EURO * 80.78;
                System.out.println("EURO=" + EURO + " is INR=" + inr);
                System.out.println("Enter INR to convert into EURO:");
                inr = in.nextDouble();
                EURO = inr / 80.78;
                System.out.println("INR=" + inr + " is EURO =" + EURO);
            }
            case 3 -> {
                System.out.println("Enter YEN to convert into INR");
                YEN = in.nextDouble();
                inr = YEN / 1.64;
                System.out.println("YEN=" + YEN + " is INR=" + inr);
                System.out.println("Enter INR to convert into YEN");
                inr = in.nextDouble();
                YEN = inr * 1.64;
                System.out.println("INR=" + inr + " is YAN=" + YEN);
            }
            case 4 -> {
                System.out.println("Enter Meter to convert into Kilometer:");
                Meter = in.nextDouble();
                KM = Meter / 1000;
                System.out.println("Meter=" + Meter + " is KM=" + KM);
                System.out.println("Enter Kilometer to convert into Meter:");
                KM = in.nextDouble();
                Meter = KM * 1000;
                System.out.println("KM=" + KM + " is Meter =" + Meter);
            }
            case 5 -> {
                System.out.println("Enter Hours to convert into Minutes and seconds:");
                Hr = in.nextDouble();
                Min = Hr * 60;
                Sec = Hr * 3600;
                System.out.println("Hr=" + Hr + "is " + Min + "min and" + Sec + " Seconds ");
                System.out.println("Covert Minutes and Seconds into Hours");
                System.out.println("Enter and min");
                Min = in.nextDouble();
                Hr = Min / 60;
                System.out.println("Min=" + Min + "is" + Hr + "hr");
                System.out.println("Enter and seconds");
                Sec = in.nextDouble();
                Hr = Sec / 3600;
                System.out.println("Sec=" + Sec + "is" + Hr + "hr");
            }
        }
    }
}