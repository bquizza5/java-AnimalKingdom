package animalKingdom;

public abstract class Animals {

    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;

    public Animals(String name, int yearDiscovered){

        maxId++;
        this.id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;

    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();


    public void eat() {
        System.out.println("yum food");
    }

    public String getName() {
        return name;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" + 
            "year Discovered: " + yearDiscovered + "\n";
    }
}