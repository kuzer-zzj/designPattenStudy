package com.study.design.adaptation.impl;

import com.study.design.adaptation.interfac.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playV1c(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
