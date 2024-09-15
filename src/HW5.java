public class HW5 {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(40);
        boss.setDefenceType("Magic");

        System.out.println("Boss health : " + boss.getHealth() + " damage: " + boss.getDamage() + " defence type: " + boss.getDefenceType());
        System.out.println("-------------------------------------");

        Hero[] allHeroes = createHeroes();
        for (Hero heroes : allHeroes) {
            System.out.println(heroes.getName());
            System.out.println("Health: " + heroes.getHealth());
            System.out.println("Damage: " + heroes.getDamage());
            System.out.println("Super Ability: " + (heroes.getSuperAbility() == null ? "Not have" : heroes.getSuperAbility()));
            System.out.println("-------------------------------------");
        }
    }
    public static Hero[] createHeroes() {
        Hero mage = new Hero(150 , 25, "Fireball", "Mage");
        Hero knight = new Hero(200 , 20, "Knight");
        Hero assasin = new Hero(120 , 235, "Invisibility" , "Assassin");

        Hero[] allHeroes = {mage, knight, assasin};
            return allHeroes;
    }
}
