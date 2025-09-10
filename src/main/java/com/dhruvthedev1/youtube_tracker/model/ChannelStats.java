package com.dhruvthedev1.youtube_tracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChannelStats {
  @JsonProperty("id")
  private String channelID; // channel ID
  @JsonProperty("subscriberCount")
  private long subscriberCount; // subscribers
  @JsonProperty("viewCount")
  private long viewCount; // total views
  @JsonProperty("videoCount")
  private long videoCount; // total videos

  public ChannelStats() {
  }

  public ChannelStats(String channelID, long subscriberCount, long viewCount, long videoCount) {
    this.channelID = channelID;
    this.subscriberCount = subscriberCount;
    this.viewCount = viewCount;
    this.videoCount = videoCount;
  }

  public String getChannelID() {
    return channelID;
  }

  public void setChannelID(String channelID) {
    this.channelID = channelID;
  }

  public long getSubscriberCount() {
    return subscriberCount;
  }

  public void setSubscriberCount(long subscriberCount) {
    this.subscriberCount = subscriberCount;
  }

  public long getViewCount() {
    return viewCount;
  }

  public void setViewCount(long viewCount) {
    this.viewCount = viewCount;
  }

  public long getVideoCount() {
    return videoCount;
  }

  public void setVideoCount(long videoCount) {
    this.videoCount = videoCount;
  }

  @Override
  public String toString() {
    return "Channel ID: " + this.channelID + "\n" +
        "Subscribers: " + String.format("%,d", this.subscriberCount) + "\n" +
        "Views: " + String.format("%,d", this.viewCount) + "\n" +
        "Videos: " + this.videoCount;
  }
}
