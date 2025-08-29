package com.dhruvthedev1.youtube_tracker.model;

import java.util.List;

public class YoutubeAPIResponse {
  private List<Item> items; // items array within the JSON

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  public static class Item {
    private Statistics statistics; // each item in the items array has a statistics object

    public Statistics getStatistics() {
      return statistics;
    }

    public void setStatistics(Statistics statistics) {
      this.statistics = statistics;
    }
    
  }

  public static class Statistics {
    private long subscriberCount;
    private long viewCount;
    private long videoCount;

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
  }
}
