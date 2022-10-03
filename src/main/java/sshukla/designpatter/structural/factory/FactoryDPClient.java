package sshukla.designpatter.structural.factory;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */
public class FactoryDPClient {

    public static void main(String[] args) {

        OperatingSystemFactory osFactory = new OperatingSystemFactory();
        OperatingSystem androidInstance = osFactory.getInstance(OperatingSystemType.ANDROID);
        androidInstance.specification();

        OperatingSystem iosInstance = osFactory.getInstance(OperatingSystemType.IOS);
        iosInstance.specification();

        OperatingSystem windowsInstance = osFactory.getInstance(OperatingSystemType.WINDOWS);
        windowsInstance.specification();

    }

}
