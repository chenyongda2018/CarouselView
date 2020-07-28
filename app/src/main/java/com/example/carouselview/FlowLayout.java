package com.example.carouselview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class FlowLayout extends ViewGroup {

    private static final int DEFAULT_HORIZONTAL_MARGIN = 5;
    private static final int DEFAULT_TEXT_MAX_LENGTH = 30;
    private static final int DEFAULT_MAX_LINES = 3;
    private static final int DEFAULT_BORDER_RADIUS = 10;
    private static final int DEFAULT_MAX_LINE = 3;
    private static final int DEFAULT_VERTICAL_MARGIN = 5;
    private int mMaxLine;
    private float mHorizontalMargin;
    private float mItemVerticalMargin;
    private int mTextMaxLength;
    private int mMaxLines;
    private int mTextColor;
    private float mBorderRadius;
    private int mBorderColor;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public FlowLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        //获取属性
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.FlowLayout);
        mMaxLine = ta.getInteger(R.styleable.FlowLayout_maxLine, DEFAULT_MAX_LINE);
        mHorizontalMargin = ta.getDimension(R.styleable.FlowLayout_itemHorizontalMargin, DEFAULT_HORIZONTAL_MARGIN);
        mItemVerticalMargin = ta.getDimension(R.styleable.FlowLayout_itemVerticalMargin, DEFAULT_VERTICAL_MARGIN);
        mTextMaxLength = ta.getInt(R.styleable.FlowLayout_textMaxLength, DEFAULT_TEXT_MAX_LENGTH);
        mMaxLines = ta.getInt(R.styleable.FlowLayout_maxLine, DEFAULT_MAX_LINES);
        mTextColor = ta.getColor(R.styleable.FlowLayout_textColor, context.getResources().getColor(R.color.text_grey));
        mBorderRadius = ta.getDimension(R.styleable.FlowLayout_borderRadius, DEFAULT_BORDER_RADIUS);
        mBorderColor = ta.getColor(R.styleable.FlowLayout_borderColor, context.getResources().getColor(R.color.text_grey));
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public int getmMaxLine() {
        return mMaxLine;
    }

    public void setmMaxLine(int mMaxLine) {
        this.mMaxLine = mMaxLine;
    }

    public float getmHorizontalMargin() {
        return mHorizontalMargin;
    }

    public void setmHorizontalMargin(float mHorizontalMargin) {
        this.mHorizontalMargin = mHorizontalMargin;
    }

    public float getmItemVerticalMargin() {
        return mItemVerticalMargin;
    }

    public void setmItemVerticalMargin(float mItemVerticalMargin) {
        this.mItemVerticalMargin = mItemVerticalMargin;
    }

    public int getmTextMaxLength() {
        return mTextMaxLength;
    }

    public void setmTextMaxLength(int mTextMaxLength) {
        this.mTextMaxLength = mTextMaxLength;
    }

    public int getmMaxLines() {
        return mMaxLines;
    }

    public void setmMaxLines(int mMaxLines) {
        this.mMaxLines = mMaxLines;
    }

    public int getmTextColor() {
        return mTextColor;
    }

    public void setmTextColor(int mTextColor) {
        this.mTextColor = mTextColor;
    }

    public float getmBorderRadius() {
        return mBorderRadius;
    }

    public void setmBorderRadius(float mBorderRadius) {
        this.mBorderRadius = mBorderRadius;
    }

    public int getmBorderColor() {
        return mBorderColor;
    }

    public void setmBorderColor(int mBorderColor) {
        this.mBorderColor = mBorderColor;
    }
}
