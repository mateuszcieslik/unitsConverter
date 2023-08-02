package unitConverter;

import java.util.Scanner;

import static java.lang.System.in;

public class ConvertionCalculator {
    public static void main(String[] args) {
        /*System.out.println("Which type of unit you want to convert?" + "\n" + "Type 1 (Length), Type 2 (Mass), Type 3 (Time)");
        Scanner typeOfUnit = new Scanner(System.in);
        int unit;
        unit = typeOfUnit.nextInt();*/
        Scanner value = new Scanner(in);
        System.out.println("Convert from: ");
        String fromUnit = value.nextLine();

        System.out.println("Convert to: ");
        String toUnit = value.nextLine();

        LengthConverter from = new LengthConverter(fromUnit);
        LengthConverter to = new LengthConverter(toUnit);

        System.out.println("Value: ");
        double val = value.nextDouble();

        double meters = from.toMeters(val);
        double converted = to.toMeters(meters);

        System.out.println(val + "" + fromUnit + " = " + converted + " " + toUnit);



        /*if (unit == 1) {
            var cmToMeter = Units.lengthConverter(typeValue);
            System.out.println(typeValue + "cm is " + cmToMeter + " meters");

        } else if (unit == 2) {
            

        }*/



    }


}