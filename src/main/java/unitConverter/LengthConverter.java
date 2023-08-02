package unitConverter;

public class LengthConverter {

    final private double CM_TO_METER = 0.01;
    final private double MM_TO_METER = 1000.00 ;
    private double factor;




//Instrukcja if/else/switch? Jeśli jednostka x przeliczana na jednostkę y to przypadek x itd..? (wszystko w jednej metodzie?)

    public LengthConverter ( String unit){

        if (unit.equals("cm")){
            factor = CM_TO_METER;
        } else if (unit.equals("mm")) {
            factor = MM_TO_METER;
        }


    }

   public double toMeters (double measurement){
        return (measurement* factor) ;
    }

    public double fromMeters (double measurement){
        return (measurement / factor) ;
    }




}
