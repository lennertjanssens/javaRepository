public final class Speler extends Persoon{

    private Sport sport;



    public Speler (String naam, String id, Sport sport) {
        super(naam, id);
        this.sport = ;
    }
    public Speler(String id) {
        this("",id,null);
    }

    public Sport getSport() {
        return sport;
    }
    @Override
    public String toString() {
        return String.format("[%s] %s (%s)",getId(), getNaam(), getSport());
    }
}
