package sshukla.designpatter.structural;

import sshukla.designpatter.structural.singleton.SingletonDP;

import java.io.*;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */

public class StructuralDPClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*****************");
        System.out.println("*****************");
        System.out.println("Singleton Example");
        System.out.println("*****************");
        System.out.println("*****************");
        singletonTest();
    }

    private static void singletonTest() {
        SingletonDP singletonDP1 = SingletonDP.getSingletonDP_INSTANCE();
        SingletonDP singletonDP2 = SingletonDP.getSingletonDP_INSTANCE();

        System.out.println(singletonDP1.hashCode() + " , " + singletonDP2.hashCode());
        // Creating object by new operator not possible as constructor is private

        // Creating object using Serialization
        singletonSerializationTest();

        // Creating object using Cloning
        singletonCloningTest(singletonDP1);


    }

    private static void singletonCloningTest(SingletonDP singletonDP1) {
        SingletonDP singletonDPCloning = null;
        try {
            singletonDPCloning = singletonDP1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(singletonDPCloning);
    }

    private static void singletonSerializationTest() {
        try {
            SingletonDP instance1 = SingletonDP.getSingletonDP_INSTANCE();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            SingletonDP instance2 = (SingletonDP) in.readObject();
            in.close();

            System.out.println(instance1.hashCode() + " , " + instance2.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
