package com.example.carouselview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {

    private int mMaxLine;

    public FlowLayout(Context context) {
        this(context,null);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        //获取属性
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.FlowLayout);
        mMaxLine = ta.getInteger(R.styleable.FlowLayout_maxLine, 3);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
