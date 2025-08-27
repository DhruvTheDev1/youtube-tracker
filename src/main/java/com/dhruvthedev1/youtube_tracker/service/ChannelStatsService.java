package com.dhruvthedev1.youtube_tracker.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.YoutubeAPIResponse;

@Service
public class ChannelStatsService {
  @Value("${apiKey}")
  private String apiKey;

  public ChannelStats getChannelStats(String channelID) {
    try {
      // get channel stats - YouTube Data API
      String urlString = ;

      RestTemplate restTemplate = new RestTemplate();
      YoutubeAPIResponse response = restTemplate.getForObject(urlString, YoutubeAPIResponse.class);
      



      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

}
