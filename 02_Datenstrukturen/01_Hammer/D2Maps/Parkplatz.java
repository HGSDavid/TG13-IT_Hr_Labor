class Parkplatz {
    
    String parkplatzNr;
    String Hinweis;
    
    public Parkplatz(String parkplatzNr) {
        this.parkplatzNr = parkplatzNr;
    }

    public String getParkplatzNr() {
        return parkplatzNr;
    }

    public void setParkplatzNr(String parkplatzNr) {
        this.parkplatzNr = parkplatzNr;
    }

    public String getHinweis() {
        return Hinweis;
    }

    public void setHinweis(String hinweis) {
        Hinweis = hinweis;
    }

    @Override
    public String toString() {
        return "Parkplatz [parkplatzNr=" + parkplatzNr + ", Hinweis=" + Hinweis + "]";
    }

    

}