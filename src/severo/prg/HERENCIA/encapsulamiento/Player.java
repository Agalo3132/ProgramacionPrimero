package ProgramacionPrimero.src.severo.prg.HERENCIA.encapsulamiento;

public class Player {

    private String name;
    private int health;
    private String weapon;

    public Player(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public void applyDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player died");
        }
    }

    public int getHealth() {
        return health;
    }
}
