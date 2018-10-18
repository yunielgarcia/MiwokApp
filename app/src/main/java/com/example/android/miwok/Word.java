package com.example.android.miwok;

public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    /** Image for the word*/
    private int mWordImageResourceId;

    /** Audio for the word*/
    private int mWordAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mWordImageResourceId = 0;
        mWordAudioResourceId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageName, int audioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mWordImageResourceId = imageName;
        mWordAudioResourceId = audioId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmWordImageResourceId() {
        return mWordImageResourceId;
    }

    public int getmWordAudioResourceId() {
        return mWordAudioResourceId;
    }
}
