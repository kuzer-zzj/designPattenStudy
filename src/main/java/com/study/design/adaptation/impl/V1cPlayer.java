package com.study.design.adaptation.impl;

import com.study.design.adaptation.interfac.AdvancedMediaPlayer;

public class V1cPlayer implements AdvancedMediaPlayer {
    public void playV1c(String fileName) {
        System.out.println("Playing v1c file name:"+fileName);
    }

    public void playMp4(String fileName) {

    }
}
