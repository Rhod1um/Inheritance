package KlasseRum;

public class ClassRoom extends Room { //man nedarver ikke konstruktører fra en super/parent klasse
    private double sizeOfWhiteboard;
    private String colorOfClassroom;

    ClassRoom(double roomNumber, int numberOfPersons, double sizeOfWhiteboard, String colorOfClassroom){ //hvis superklassens konstruktør tager parametre
        super(roomNumber, numberOfPersons); //super skal stå først
        //konstruktøren i superklassen kaldes her fordi konstruktører ikke nedarves
        System.out.println("test classroom");
        //super(roomNumber, numberOfPersons); ikke mulig

        setColorOfClassroom(colorOfClassroom);
        setSizeOfWhiteboard(sizeOfWhiteboard);
    }

    public void setColorOfClassroom(String colorOfClassroom) {
        this.colorOfClassroom = colorOfClassroom;
    }
    public String getColorOfClassroom() {
        return colorOfClassroom;
    }

    public void setSizeOfWhiteboard(double sizeOfWhiteboard) {
        this.sizeOfWhiteboard = sizeOfWhiteboard;
    }

    public double getSizeOfWhiteboard() {
        return sizeOfWhiteboard;
    }


    @Override
    public String toString() {
        return "ClassRoom{" +
                "sizeOfWhiteboard=" + sizeOfWhiteboard +
                ", colorOfClassroom='" + colorOfClassroom + '\'' +
                '}' + super.toString();
    }
}
