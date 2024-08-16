public class Main {
    public static void main( String[] args ) {
        int ticketPrice = 13_676;
        int bonusRatio = 20;
        int bonusMiles = ticketPrice / bonusRatio ;

        System.out.println( "Ваши бонусные мили равны: " + bonusMiles );

    }
}
