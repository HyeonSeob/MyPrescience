package com.myprescience.ui;

import android.graphics.Bitmap;
import android.widget.Button;

import com.myprescience.R;

/**
 * Created by hyeon-seob on 15. 3. 4..
 * 곡 정보를 저장하는 클래스
 */
public class RecommendSongData {
    public String id;
    public String albumUrl;
    public Bitmap albumArt;
    public String title;
    public String artist;
    public String genres;
    public int rating;
    public float valenceProperty;
    public float speechinessProperty;
    public float energyProperty;
    public float danceablilityProperty;
    public float acousticProperty;
    public float instrumentalnessProperty;
    public float livenessProperty;
    public boolean vocalProperty;
    public boolean studioProperty;


    public void setAlbumArt(Bitmap mAlbumArt) { albumArt = mAlbumArt; }
}
