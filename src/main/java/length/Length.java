package converter;

public class Length {


    double cm = 1;
    double meter;
//Instrukcja if/else/switch? Jeśli jednostka x przeliczana na jednostkę y to przypadek x itd..? (wszystko w jednej metodzie?)

    public static double length ( double cm){

        double meter = cm/100;
        return meter;


    }

   /* public int mass (){
        return;
    }

    public int time (){
        return;
    }

    */


}
