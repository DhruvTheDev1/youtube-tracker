package com.dhruvthedev1.youtube_tracker.model;

import java.util.List;

public class YoutubeAPIResponse {
  List<Item> items; // items array within the JSON

  public static class Item {
    Statistics statistics; // each item in the items array has a statistics object
  }

  public static class Statistics {
    long subscriberCount;
    long viewCount;
    long videoCount;
  }
}
