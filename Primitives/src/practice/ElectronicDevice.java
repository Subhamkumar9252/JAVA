package practice;

public interface ElectronicDevice {
    boolean isRunning();

    static void work(String s){
        System.out.println("Default");
    }

}
