package length;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which type of unit you want to convert?" + "\n" + "Type 1 (Length), Type 2 (Mass), Type 3 (Time)");
        Scanner typeOfUnit = new Scanner(System.in);
        int unit;
        unit = typeOfUnit.nextInt();

        Scanner value = new Scanner(System.in);
        int typeValue;
        typeValue = value.nextInt();



        if (unit == 1) {
            var cmToMeter = Length.lengthConverter(typeValue);
            System.out.println(typeValue + "cm is " + cmToMeter + " meters");

        } else if (unit == 2) {
            

        }


    }


}