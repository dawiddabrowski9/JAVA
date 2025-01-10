public class MusicPlayer implements SoundPlayer{
    @Override
    public void playSound() {
        System.out.println("Playing music");
    }

    @Override
    public void stopSound() {
        SoundPlayer.super.stopSound();
    }

}
