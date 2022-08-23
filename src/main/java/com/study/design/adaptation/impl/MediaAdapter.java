package com.study.design.adaptation.impl;

import com.study.design.adaptation.interfac.AdvancedMediaPlayer;
import com.study.design.adaptation.interfac.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("v")) {
            advancedMediaPlayer = new V1cPlayer();
        }

        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("v")) {
            advancedMediaPlayer.playV1c(fileName);
        }

        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
