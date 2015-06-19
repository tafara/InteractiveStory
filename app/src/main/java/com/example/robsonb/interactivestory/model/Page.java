package com.example.robsonb.interactivestory.model;

/**
 * Created by Robsonb on 6/15/2015.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean isFinal = false;

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Page(int ImageId,String text)
    {
        mImageId = ImageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        isFinal = true;

    }

    public Page(int ImageId,String text,Choice choice1,Choice choice2)
    {
        mImageId = ImageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }



}
