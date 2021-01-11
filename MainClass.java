public class MainClass {
    public static void main(String[] args) {

        Speler p = new Speler("jef","A5s4dAx",Sport.VOETBAL);

        System.out.printf("sport: %s  naam: %s  id: %s", p.getSport(), p.getNaam(), p.getId());


        System.out.println();

    }
}
