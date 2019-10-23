public class Fjord
{
    public static void main(String[] args)
    {
        Vehicle takk       = new Vehicle("Takk"       , "Sedan" , 40 , 9.5 );
        Vehicle beklager   = new Vehicle("Beklager"   , "Sedan" , 45 , 7.5 );
        Vehicle vakker     = new Vehicle("Vakker"     , "SUV"   , 60 , 7.5 );
        Vehicle stygg      = new Vehicle("Stygg"      , "SUV"   , 50 , 9   );
        Vehicle vanskellig = new Vehicle("Vanskellig" , "Truck" , 60 , 8.75);
        Vehicle lastebil   = new Vehicle("Lastebil"   , "Truck" , 70 , 5.5 );

        takk.       mpgStatement( takk       .calculateMPG() );
        beklager.   mpgStatement( beklager   .calculateMPG() );
        vakker.     mpgStatement( vakker     .calculateMPG() );
        stygg.      mpgStatement( stygg      .calculateMPG() );
        vanskellig. mpgStatement( vanskellig .calculateMPG() );
        lastebil.   mpgStatement( lastebil   .calculateMPG() );

        takk.       govStatement( takk.       govPassFail( takk       .calculateMPG() ) );
        beklager.   govStatement( beklager.   govPassFail( beklager   .calculateMPG() ) );
        vakker.     govStatement( vakker.     govPassFail( vakker     .calculateMPG() ) );
        stygg.      govStatement( stygg.      govPassFail( stygg      .calculateMPG() ) );
        vanskellig. govStatement( vanskellig. govPassFail( vanskellig .calculateMPG() ) );
        lastebil.   govStatement( lastebil.   govPassFail( lastebil   .calculateMPG() ) );
    }
}