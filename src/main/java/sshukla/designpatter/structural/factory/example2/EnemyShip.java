package sshukla.designpatter.structural.factory.example2;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public abstract class EnemyShip {

    private String name;
    private Double amtDamage;

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage());
    }

    public void setDamage(Double amtDamage) {
        System.out.println("EnemyShip.setDamage");
        this.amtDamage = amtDamage;
    }

    public Double getDamage() {
        System.out.println("EnemyShip.getDamage");
        return amtDamage.doubleValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
