package sshukla.designpatter.structural.factory.example1;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public class WindowsOS implements OperatingSystem {
    @Override
    public void specification() {
        System.out.println("I am good with laptop - OS!!!");
    }
}
