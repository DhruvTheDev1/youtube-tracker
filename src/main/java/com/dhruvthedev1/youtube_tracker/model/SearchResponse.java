package com.dhruvthedev1.youtube_tracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

// model based on results when searching a youtube name
public class SearchResponse {
  @JsonProperty("channelId")
  private String channelID;
  @JsonProperty("title")
  private String channelName;
  @JsonProperty("thumbnails")
  private String thumbnail;

  public SearchResponse() {
  }

  public SearchResponse(String channelID, String channelName, String thumbnail) {
    this.channelID = channelID;
    this.channelName = channelName;
    this.thumbnail = thumbnail;
  }

  public String getChannelID() {
    return channelID;
  }

  public void setChannelID(String channelID) {
    this.channelID = channelID;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }
}
