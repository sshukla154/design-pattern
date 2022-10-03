package sshukla.designpatter.structural.factory.example2;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public class EnemyShipFactory {

    public EnemyShip enemyShip;

    public EnemyShip getEnemyShipInstance(EnemyShipType enemyShipType) {
        if (EnemyShipType.ROCKET.equals(enemyShipType)) {
            enemyShip = new RocketEnemyShip();
        } else if (EnemyShipType.UFO.equals(enemyShipType)) {
            enemyShip = new UFOEnemyShip();
        }
        return enemyShip;
    }
}
