public interface SoundPlayer {
    void playSound();
    default void stopSound(){
        System.out.println("Sound Stopped");
    }
    static void getDeviceType(){
        System.out.println("Sound Device");
    }
}
