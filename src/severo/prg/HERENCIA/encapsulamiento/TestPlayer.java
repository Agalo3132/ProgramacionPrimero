package ProgramacionPrimero.src.severo.prg.HERENCIA.encapsulamiento;

public class TestPlayer {
    public static void main(String[] args) {
        Player p1 = new Player("spike","nuke");
        //p1.name = "spike";
        //p1.health = 100;
        //p1.weapon = "nuke";


        int damage = 70;
        p1.applyDamage(damage);
        System.out.println("Actual health " + p1.getHealth());

        damage = 50;
        //p1.health = 80;
        p1.applyDamage(damage);
        System.out.println("Actual health " + p1.getHealth());


    }
}
