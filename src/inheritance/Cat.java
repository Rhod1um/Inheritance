package inheritance;

public class Cat extends Animal { //Cat arver fra Animal. Animals attributter er her. Alt i Animal ender her
    private String catNip;
    private String typeOfCatFood;

    Cat(String name){
        // this.name = name; //kan ikke tage name i Animal pga den er private selvom Cat arver.
        // super.name = name; //super kigger i overklassen men der er samme problem, det er private
        //man kan lave en setter i overklassen
        setName(name);
        System.out.println("constructing cat");
    }

}
