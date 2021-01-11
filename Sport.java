public enum Sport {
    VOETBAL, VOLLEYBAL, TENNIS;

    private int aantalSpelers;


    public void Sport(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;

    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    public String eersteDrieletters (Sport welkeSport) {
        String naarString = String.valueOf(welkeSport);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            s.append(naarString.charAt(i));
        }
        return s.toString();
    }

    @Override
    public String toString() {
        if (aantalSpelers == 11) {
            return eersteDrieletters(VOETBAL);
        }
        else if (aantalSpelers == 8) {
            return eersteDrieletters(VOLLEYBAL);
        }
        else if (aantalSpelers == 2) {
            return eersteDrieletters(TENNIS);
        }
        else {
            return "null";
        }




    }
}

