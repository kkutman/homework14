public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
    String learn(){return "learn";}
    String walk(){return "walk";}
    String eat(){return "eat";}


    @Override
    public String toString() {
        return "Person { "+" name: "+name+", designation: "+designation +" }";



    }
}
