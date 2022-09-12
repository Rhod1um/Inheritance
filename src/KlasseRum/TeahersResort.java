package KlasseRum;

public class TeahersResort extends Room{
    private String gameConsole;
    private String coffeeeMachine;

    TeahersResort(double roomNumber, int numberOfPersons,
                  String gameConsole, String coffeeeMachine){ //man kan sætte lange parameterliser på næste linje
        super(roomNumber, numberOfPersons); //skal stå først i konstruktør
        System.out.println("testing teachers resort");

        this.gameConsole=gameConsole;
        this.coffeeeMachine=coffeeeMachine;
    }

    @Override
    public String toString() { //toString kommer fra objektklasse, (derfor den hedder Override)
        //man kan skrive hvad som helst så længe den reurnere en string. Der behøves ikke stå Override
        return "TeahersResort{" +
                "gameConsole='" + gameConsole + '\'' +
                ", coffeeeMachine='" + coffeeeMachine + '\'' +
                '}' + super.toString(); //tager toString fra Room
    }
}
