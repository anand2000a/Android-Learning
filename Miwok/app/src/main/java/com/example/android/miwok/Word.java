package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private final int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation, int audio_resource_id) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audio_resource_id;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image_resource_id, int audio_resource_id) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = image_resource_id;
        mAudioResourceId = audio_resource_id;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
