package ru.geekbrains.notes;

import android.os.Parcel;
import android.os.Parcelable;

public class NotesData implements Parcelable {

    private int id;
    private String caption;
    private String description;
    private String date;

    public NotesData(int id, String caption) {
        this.id = id;
        this.caption = caption;
        this.description = "ff";
        this.date = "gg";
    }

    protected NotesData(Parcel in) {
        caption = in.readString();
        description = in.readString();
        id = in.readInt();
        date = in.readString();
    }

    public static final Creator<NotesData> CREATOR = new Creator<NotesData>() {
        @Override
        public NotesData createFromParcel(Parcel in) {
            return new NotesData(in);
        }

        @Override
        public NotesData[] newArray(int size) {
            return new NotesData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(caption);
        dest.writeString(description);
        dest.writeInt(id);
        dest.writeString(date);
    }

    public String getCaption() {
        return caption;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
