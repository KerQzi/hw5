public class Hero {
    private String name; // Добавил для удобности
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility, String name) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
        this.name = name;
    }

    public Hero(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public String getName() {
        return name;
    }
}
