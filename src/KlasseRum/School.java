package KlasseRum;

public class School {

    void go(){
        ClassRoom c1 = new ClassRoom(242, 40,
                90.0, "yellow");
        TeahersResort heaven = new TeahersResort(666, 256,
                "Playstation", "MoccaMaster");
        System.out.println(heaven); //her får vi attributterne i subklasserne, ikke i superklassen
        System.out.println(c1.getRoomNumber());
    }

    public static void main(String[] args) {
        new School().go();
    }
}
