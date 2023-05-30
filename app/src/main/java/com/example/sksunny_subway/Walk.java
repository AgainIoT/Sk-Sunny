package com.example.sksunny_subway;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Walk extends ItemTest{
    private String direction;
    private int distance;

    public Walk(String abstractClassMemberString, String direction, int distance){
        super(abstractClassMemberString);
        this.direction = direction;
        this.distance = distance;
    }
    public Walk(){
        this("2","방향", 0);
    }

    protected Walk(Parcel resouce){
        super(resouce);
        direction = resouce.readString();
        distance = resouce.readInt();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(CLASS_TYPE_TWO);
        super.writeToParcel(dest, flags);
        dest.writeString(direction);
        dest.writeInt(distance);
    }
//    public static final Parcelable.Creator<Walk> CREATOR = new Parcelable.Creator<Walk>() {
//        @Override
//        public Walk createFromParcel(Parcel in) {
//            return new Walk(in);
//        }
//
//        @Override
//        public Walk[] newArray(int size) {
//            return new Walk[size];
//        }
//    };
}
