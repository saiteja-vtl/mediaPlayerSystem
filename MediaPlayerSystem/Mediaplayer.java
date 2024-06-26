package MediaPlayerSystem;

class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing video");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video ");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video");
    }
}

class VoiceRecorder implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing recorded audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing recorded audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping recorded audio");
    }

    @Override
    public void record() {
        System.out.println("Recording audio");
    }

    @Override
    public void stopRecording() {
        System.out.println("Stopping recording");
    }
}

public class Mediaplayer {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        VoiceRecorder voiceRecorder = new VoiceRecorder();


        Playable[] players = { audioPlayer, videoPlayer, voiceRecorder };

        for (Playable player : players) {
            player.play();
            player.pause();
            player.stop();
            System.out.println();
        }

        voiceRecorder.record();
        voiceRecorder.stopRecording();
    }
}





