package com.example.android.miwok;

public class Word {

    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    /** Image for the word*/
    private int mWordImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mWordImageResourceId = 0;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageName) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mWordImageResourceId = imageName;
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
}
