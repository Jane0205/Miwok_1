package com.example.android.miwok;

/**
 * Created by 재은 on 2017-02-03.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{"+"mDefaultTranslation='"+mDefaultTranslation+'\''+
                ",mMiwokTranslation='"+mMiwokTranslation+'\''+
                ",mAudioResourceId="+mAudioResourceId+",mImageResourceId="+mImageResourceId+'}';
    }
}
