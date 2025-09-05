package com.dhruvthedev1.youtube_tracker.datatransferobject;

import java.util.List;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.SearchResponse;

public class ChannelResponse {
  private ChannelStats channelStats;
  private List<SearchResponse> searchResults;

  public ChannelResponse(ChannelStats channelStats) {
    this.channelStats = channelStats;
  }

  public ChannelResponse(List<SearchResponse> searchResults) {
    this.searchResults = searchResults;
  }

  public ChannelStats getChannelStats() {
    return channelStats;
  }

  public void setChannelStats(ChannelStats channelStats) {
    this.channelStats = channelStats;
  }

  public List<SearchResponse> getSearchResults() {
    return searchResults;
  }

  public void setSearchResults(List<SearchResponse> searchResults) {
    this.searchResults = searchResults;
  }
}
