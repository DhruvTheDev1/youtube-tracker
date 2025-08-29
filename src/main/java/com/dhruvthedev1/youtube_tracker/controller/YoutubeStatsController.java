package com.dhruvthedev1.youtube_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.service.ChannelStatsService;

@Controller
public class YoutubeStatsController {
  @Autowired
  private ChannelStatsService channelStatsService;

  @GetMapping("/Youtube-Tracker")
  public String showYoutubeTrackerPage() {
    return "YoutubeTrackerPage";
  }

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

}
