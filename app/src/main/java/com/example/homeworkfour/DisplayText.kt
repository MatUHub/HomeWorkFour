package com.example.homeworkfour

import android.os.Parcelable
import android.os.Parcel
import android.os.Parcelable.Creator
import com.example.homeworkfour.DisplayText

class DisplayText : Parcelable {
    var text: String? = ""

    protected constructor(`in`: Parcel) {
        text = `in`.readString()
    }

    constructor() {}

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, i: Int) {
        parcel.writeString(text)
    }

    companion object {
        val CREATOR: Creator<DisplayText?> = object : Creator<DisplayText?> {
            override fun createFromParcel(`in`: Parcel): DisplayText? {
                return DisplayText(`in`)
            }

            override fun newArray(size: Int): Array<DisplayText?> {
                return arrayOfNulls(size)
            }
        }
    }
}