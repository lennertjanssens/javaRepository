import java.util.Objects;

public abstract class Persoon {

    private String id;
    private String naam;

    public Persoon(String naam ,String id) {
        StringBuilder finalID = new StringBuilder();
        for (int i = 0; i < id.length(); i++) {
            if (finalID.length() < 3) {
                Character j = id.charAt(i);
                if (j > 64 && j < 91 || j > 96 && j < 123) {
                    finalID.append(Character.toUpperCase(j));
                }
            }

        }
        this.id = finalID.toString();
        this.naam = naam;

    }


    public String getId() {
        return this.id;
    }
    @Override
    public String toString() {
        return String.format("[%s] %s", this.id, this.naam);

    }
    public String getNaam() {
        return this.naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(id, persoon.id) &&
                Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, naam);
    }
}
