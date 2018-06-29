package com.ahmedadeltito.photoeditorsdk;

import android.graphics.Typeface;
import android.widget.TextView;

public class PhotoEditorFontInfo {
    private Typeface typeface;
    private Float fontSize;
    private int fontColor;

    public static PhotoEditorFontInfo fromTextView(TextView textView){
        float scale = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        return new PhotoEditorFontInfo(textView.getTypeface(), textView.getTextSize()/scale, textView.getCurrentTextColor());
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public Float getFontSize() {
        return fontSize;
    }

    public void setFontSize(Float fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontColor() {
        return fontColor;
    }

    public void setFontColor(int fontColor) {
        this.fontColor = fontColor;
    }

    public PhotoEditorFontInfo(Typeface typeface, Float fontSize, int fontColor) {
        this.typeface = typeface;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoEditorFontInfo that = (PhotoEditorFontInfo) o;

        if (fontColor != that.fontColor) return false;
        if (typeface != null ? !typeface.equals(that.typeface) : that.typeface != null)
            return false;
        return fontSize != null ? fontSize.equals(that.fontSize) : that.fontSize == null;
    }

    @Override
    public int hashCode() {
        int result = typeface != null ? typeface.hashCode() : 0;
        result = 31 * result + (fontSize != null ? fontSize.hashCode() : 0);
        result = 31 * result + fontColor;
        return result;
    }
}
