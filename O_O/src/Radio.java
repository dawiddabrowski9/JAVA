public class Radio implements SoundPlayer{

    @Override
    public void playSound() {
        System.out.println("Playing Radio");
    }

    @Override
    public void stopSound() {
        SoundPlayer.super.stopSound();
    }
}
