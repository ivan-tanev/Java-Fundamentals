public class Song {
    private String listType;
    private String songName;
    private String songTime;

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

    public Song(String listType, String songName, String songTime) {
        this.listType = listType;
        this.songName = songName;
        this.songTime = songTime;
    }
}
