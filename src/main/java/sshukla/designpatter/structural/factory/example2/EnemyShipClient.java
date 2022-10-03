package sshukla.designpatter.structural.factory.example2;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public class EnemyShipClient {

    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        System.out.println("******************************************************************");

        EnemyShip rocketEnemyShipInstance = enemyShipFactory.getEnemyShipInstance(EnemyShipType.ROCKET);
        rocketEnemyShipInstance.displayEnemyShip();
        rocketEnemyShipInstance.followHeroShip();
        rocketEnemyShipInstance.enemyShipShoots();

        System.out.println("******************************************************************");
        EnemyShip ufoEnemyShipInstance = enemyShipFactory.getEnemyShipInstance(EnemyShipType.UFO);
        ufoEnemyShipInstance.displayEnemyShip();
        ufoEnemyShipInstance.followHeroShip();
        ufoEnemyShipInstance.enemyShipShoots();

    }

}
