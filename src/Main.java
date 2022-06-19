public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setBossHealth(1000);
        b1.setBossDamage(100);
        b1.setBossDefenseType("Kinetic");
        System.out.println(b1.getBossHealth() + " " + b1.getBossDamage() + " " + b1.getBossDefenseType());
    }
}