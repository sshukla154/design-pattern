package sshukla.designpatter.structural.singleton;

/**
 * @author 'Seemant Shukla' on '03/10/2022'
 */


import java.io.Serializable;

/**
 * - Only One objects should be created and should be reused whenever asked.
 * <p>
 * 1. Object Creation:
 * i- new operator: private constructor
 * ii- Cloning: throw exception
 * iii- Serialization: Should return the same object
 * 2. Handle multi threading
 **/
public class SingletonDP implements Serializable, Cloneable {

    private static SingletonDP SingletonDP_INSTANCE;

    public static SingletonDP getSingletonDP_INSTANCE() {
        if (SingletonDP_INSTANCE == null) {
            synchronized (SingletonDP.class) {
                if (SingletonDP_INSTANCE == null) {
                    SingletonDP_INSTANCE = new SingletonDP();
                }
            }
        }
        return SingletonDP_INSTANCE;
    }

    private SingletonDP() {
    }

    public Object readResolve() {
        return SingletonDP_INSTANCE;
    }

    @Override
    public SingletonDP clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Not allowed to create instance using cloning");
    }
}
