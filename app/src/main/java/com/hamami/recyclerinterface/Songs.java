package com.hamami.recyclerinterface;

import java.io.File;

public class Songs {
    private File fileSong;
    private String nameSong;
    private String SongLength;

    //constructor initializing values
    Songs(File fileSong, String nameSong, String SongLength) {
        this.fileSong = fileSong;
        this.nameSong = nameSong;
        this.SongLength = SongLength;
    }

    //getters
    public String getNameSong() {
        return nameSong;
    }

    public String getSongLength() {
        return SongLength;
    }
    public File getFileSong(){
        return fileSong;
    }
}
