public class GPA
{
    public static void main(String[] args)
    {
        Vehicle takk       = new Vehicle("takk"       , "Sedan" , 50 , 8   );
        Vehicle beklager   = new Vehicle("beklager"   , "Sedan" , 40 , 7.5 );
        Vehicle vakker     = new Vehicle("vakker"     , "SUV"   , 50 , 5   );
        Vehicle stygg      = new Vehicle("stygg"      , "SUV"   , 40 , 6   );
        Vehicle vanskellig = new Vehicle("vanskellig" , "Truck" , 50 , 4.75);
        Vehicle lastebil   = new Vehicle("lastebil"   , "Truck" , 40 , 5.5 );

        mpgStatement( takk       .calculateMPG()       );
        mpgStatement( beklager   .calculateMPG()   );
        mpgStatement( vakker     .calculateMPG()     );
        mpgStatement( stygg      .calculateMPG()      );
        mpgStatement( vanskellig .calculateMPG() );
        mpgStatement( lastebil   .calculateMPG()   );

        govPassFail( takk.calculateMPG()       );
        govPassFail( beklager.calculateMPG()   );
        govPassFail( vakker.calculateMPG()     );
        govPassFail( stygg.calculateMPG()      );
        govPassFail( vanskellig.calculateMPG() );
        govPassFail( lastebil.calculateMPG()   );
    }
}