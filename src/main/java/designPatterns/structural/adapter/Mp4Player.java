package designPatterns.structural.adapter;

/**
 * Created by Camille on 03.10.2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file: "+ fileName);
    }
}
