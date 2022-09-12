package inheritance;

public class AnimalShelter { //er en variabel protected kan child klasser se den

    void go(){
        Cat cat = new Cat("fiddie"); //når cat laves tjekker intellih om den er en
        // subklasse af noget og gå til parent class og laver den først og så child class
        System.out.println("cat name: " + cat.getName());

        Dog dog = new Dog("Fido");
        System.out.println("dog name: " + dog.getName()); //gettere skal være i parent class
    }

    public static void main(String[] args) {
        new AnimalShelter().go();
    }
}
