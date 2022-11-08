public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    String singIng(){return "singIng";}
    String playGitar(){return "playGitar";}

    @Override
    public String toString() {
        return "Person { "+" name: "+getName()+", designation: "+getDesignation() +" bandName: "+bandName+" }";
    }
}
