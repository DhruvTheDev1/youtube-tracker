package com.dhruvthedev1.youtube_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.SearchResponse;
import com.dhruvthedev1.youtube_tracker.service.ChannelSearchService;
import com.dhruvthedev1.youtube_tracker.service.ChannelStatsService;

@Controller
public class YoutubeStatsController {
  // service to retrieve subscribers, view, video count
  // used directly when channel ID is provided
  @Autowired
  private ChannelStatsService channelStatsService;
  // service used when channel name is provided
  // user can then select a channel
  @Autowired
  private ChannelSearchService channelSearchService;

  @GetMapping("/Youtube-Tracker")
  public String showYoutubeTrackerPage() {
    return "YoutubeTrackerPage"; // This is the initial page shown to the user
  }

  // endpoint for displaying stats
  // uses channel ID and calls channelStatsSerice
  @PostMapping("/Youtube-Tracker")
  public String getYoutubeStats(@RequestParam String channelID, Model model) {

    try {
      ChannelStats channelStats = channelStatsService.getChannelStats(channelID);
      model.addAttribute("stats", channelStats);

    } catch (Exception e) {
      model.addAttribute("error", e.getMessage());
    }
    return "YoutubeTrackerPage";
  }

  // endpoint for searching youtube channel names
  // displays names, user selects channel which passes ID to /Youtube-Tracker
  @PostMapping("/Youtube-Search")
  public String searchChannel(@RequestParam String channelName, Model model) {
    try {
      List<SearchResponse> searchResults = channelSearchService.getChannelName(channelName);
      model.addAttribute("searchResults", searchResults);
      return "YoutubeChannelNames";

    } catch (Exception e) {
      model.addAttribute("error", e.getMessage());
      return "YoutubeTrackerPage";
    }
  }

}
