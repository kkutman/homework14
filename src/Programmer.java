public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    String coding(){return "coding";}

    @Override
    public String toString() {
        return "Person { "+" name: "+getName()+", designation: "+getDesignation() +" companyName: "+companyName+" }";
}}

