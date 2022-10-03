package sshukla.designpatter.structural.factory;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public class OperatingSystemFactory {

    public OperatingSystem getInstance(OperatingSystemType operatingSystemType) {
        if (operatingSystemType.equals(OperatingSystemType.ANDROID)) {
            return new AndroidOS();
        } else if (operatingSystemType.equals(OperatingSystemType.IOS)) {
            return new IOS();
        } else {
            return new WindowsOS();
        }
    }

}
