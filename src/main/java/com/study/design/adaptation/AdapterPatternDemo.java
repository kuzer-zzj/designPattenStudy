package com.study.design.adaptation;

import com.study.design.adaptation.impl.AudioPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer  audioPlayer= new AudioPlayer();
        audioPlayer.play("mp3","musict.mp4");
        audioPlayer.play("v","xxx.v");
        audioPlayer.play("mp4","xxx.mp3");
        audioPlayer.play("mp4123","xxx.mp3");
    }
}
