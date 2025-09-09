package com.dhruvthedev1.youtube_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhruvthedev1.youtube_tracker.datatransferobject.ChannelResponse;
import com.dhruvthedev1.youtube_tracker.service.YoutubeService;

@Controller
public class YoutubeStatsController {
  @Autowired
  private YoutubeService youtubeService;

  @GetMapping("/Youtube-Tracker")
  public String showYoutubeTrackerPage() {
    return "YoutubeTrackerPage"; // Initial page shown to user
  }

  // endpoint for handling both ID and name
  @PostMapping("/Youtube-Tracker")
  public String getYoutubeStats(@RequestParam String userInput, Model model) throws Exception {

    try {
      ChannelResponse response = youtubeService.getChannelData(userInput);
      // if channel ID
      // stats - stats relating to that channel ID
      if (response.getChannelStats() != null) {
        model.addAttribute("stats", response.getChannelStats());
        // if channel name
        // searchResults - list of channels
      } else if (response.getSearchResults() != null) {
        model.addAttribute("searchResults", response.getSearchResults()); 
      }
    } catch (Exception e) {
      model.addAttribute("error", e.getMessage());
    }
    return "YoutubeTrackerPage";

  }

}
