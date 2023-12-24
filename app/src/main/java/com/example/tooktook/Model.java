package com.example.tooktook;

public class Model {
    String videoUrl;
 int profile;
    String name;

    public Model(String videoUrl, int profile, String name) {
        this.videoUrl = videoUrl;
        this.profile= profile;
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return String.valueOf(Integer.parseInt(name));
    }

    public void setName(String name) {
        this.name = name;
    }
}
