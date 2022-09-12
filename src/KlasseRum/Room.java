package KlasseRum;

public class Room {
    private double roomNumber;
    public int numberOfPersons;

    Room(double roomNumber, int numberOfPersons){
        System.out.println("test room");
        this.roomNumber=roomNumber;
        this.numberOfPersons=numberOfPersons;
    }

    public double getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(double roomNumber){
        this.roomNumber=roomNumber;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }
    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfPersons=" + numberOfPersons +
                '}';
    }
}
