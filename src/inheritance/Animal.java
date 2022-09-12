package inheritance;

public class Animal {
    private String name;
    private String breed;
    private double weight;

    Animal(){
        System.out.println("constructing animal");
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
