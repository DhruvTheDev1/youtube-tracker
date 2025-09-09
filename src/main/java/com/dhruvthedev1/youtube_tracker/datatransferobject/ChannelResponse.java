package com.dhruvthedev1.youtube_tracker.datatransferobject;

import java.util.List;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.SearchResponse;

// encapulates both channelStats and searchResponse results
// can send either response to the controller based on user input in the frontend
public class ChannelResponse {
  private ChannelStats channelStats; // stats such as subscribers, view count, video count
  private List<SearchResponse> searchResults; // list of youtube channels

  public ChannelResponse(ChannelStats channelStats) {
    this.channelStats = channelStats;
  }

  public ChannelResponse(List<SearchResponse> searchResults) {
    this.searchResults = searchResults;
  }

  public ChannelStats getChannelStats() {
    return channelStats;
  }

  public List<SearchResponse> getSearchResults() {
    return searchResults;
  }

}
