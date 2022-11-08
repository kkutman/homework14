public class Main {
    public static void main(String[] args) {

        Person person = new Person("kutman","backand");
        Programmer programmer = new Programmer("kutman2","backAnd","Peaksoft");
        Dancer dancer = new Dancer("kutman","frontEnd","club");
        Singer singer = new Singer("kutman3","bakr","kko");
        Singer singer1 = new Singer("kutman3","bakr","kko");

        System.out.println(person);
        System.out.println(person.learn());
        System.out.println(person.walk());
        System.out.println(person.eat());
        System.out.println(programmer);
        System.out.println(programmer.coding());
        System.out.println(dancer);
        System.out.println(dancer.getGroupName());
        System.out.println(singer);
        System.out.println(singer.singIng());
        System.out.println(singer.playGitar());
    }
}