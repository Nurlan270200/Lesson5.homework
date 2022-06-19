public class Hero {
    private int Health;
    private int Damage;
    private String Superskill;
    public Hero () {}

    public Hero (int damage, int health, String Superskill) {
        this.Damage = damage;
        this.Health = health;
        this.Superskill = Superskill;
    }
    public Hero (int health, int damage) {
        this.Health = health;
        this.Damage = damage;

    }

    public Hero(int health) {
        Health = health;
    }

    public int getHealth() {
        return Health;
    }
    public int getDamage() {
        return Damage;
    }
    public String getSuperskill () {
        return Superskill;
    }
}
