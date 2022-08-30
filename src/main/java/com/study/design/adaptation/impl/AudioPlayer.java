package com.study.design.adaptation.impl;

import cn.hutool.core.util.StrUtil;
import com.study.design.adaptation.interfac.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

//git 创建分支
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3 file Name: "+fileName);
            return;
        }
        //git2创建
        if (StrUtil.equalsAny(audioType, "v", "mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
            return;
        }
        System.out.println("error!!!");
    }
}
