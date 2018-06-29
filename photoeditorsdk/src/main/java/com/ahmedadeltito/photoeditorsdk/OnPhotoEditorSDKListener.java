package com.ahmedadeltito.photoeditorsdk;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Ahmed Adel on 02/06/2017.
 */

public interface OnPhotoEditorSDKListener {

    void onEditTextChangeListener(String text, @Nullable Drawable shape, int viewId, @NonNull PhotoEditorFontInfo textInfo);

    void onAddViewListener(ViewType viewType, int numberOfAddedViews);

    void onRemoveViewListener(int numberOfAddedViews);

    void onStartViewChangeListener(ViewType viewType);

    void onStopViewChangeListener(ViewType viewType);
}
