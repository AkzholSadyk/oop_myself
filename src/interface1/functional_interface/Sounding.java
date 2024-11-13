package interface1.functional_interface;
@FunctionalInterface
public interface Sounding {
    public void makeSound();
//    функциональным интерфейсом считается только тот интерфейс у которого только один абстрактный метод

    default void playSound() {
        System.out.println("Playing sound");
    }

}
