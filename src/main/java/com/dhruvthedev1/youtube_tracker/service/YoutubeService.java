package com.dhruvthedev1.youtube_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhruvthedev1.youtube_tracker.datatransferobject.ChannelResponse;
import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.SearchResponse;

// Single unified endpoint that handles both channel ID and channel name
@Service
public class YoutubeService {
  @Autowired
  private ChannelStatsService channelStatsService;
  @Autowired
  private ChannelSearchService channelSearchService;

  public ChannelResponse getChannelData(String userInput) throws Exception {
    if (isChannelID(userInput)) {
      ChannelStats channelStats = channelStatsService.getChannelStats(userInput);
      return new ChannelResponse(channelStats);
    } else {
      List<SearchResponse> searchResults = channelSearchService.getChannelName(userInput);
      return new ChannelResponse(searchResults);
    }
  }

  private boolean isChannelID(String userInput) {
    if (userInput.startsWith("UC")) {
      return true;
    } else {
      return false;
    }
  }

}
