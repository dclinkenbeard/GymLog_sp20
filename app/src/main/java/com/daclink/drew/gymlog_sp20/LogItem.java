package com.daclink.drew.gymlog_sp20;

import java.util.Date;

public class LogItem {

    private int mLogId;

    private String mExercise;

    private double mWeight;

    private int mReps;

    private Date mDate;

    public LogItem(String exercise, double weight, int reps) {
        mExercise = exercise;
        mWeight = weight;
        mReps = reps;
    }

    public int getLogId() {
        return mLogId;
    }

    public void setLogId(int logId) {
        mLogId = logId;
    }

    public String getExercise() {
        return mExercise;
    }

    public void setExercise(String exercise) {
        mExercise = exercise;
    }

    public double getWeight() {
        return mWeight;
    }

    public void setWeight(double weight) {
        mWeight = weight;
    }

    public int getReps() {
        return mReps;
    }

    public void setReps(int reps) {
        mReps = reps;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
