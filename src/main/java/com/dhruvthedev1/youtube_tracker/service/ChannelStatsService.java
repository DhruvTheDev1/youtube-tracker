package com.dhruvthedev1.youtube_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dhruvthedev1.youtube_tracker.model.ChannelStats;
import com.dhruvthedev1.youtube_tracker.model.SearchResponse;
import com.dhruvthedev1.youtube_tracker.model.YoutubeAPIResponse;

@Service
public class ChannelStatsService {
  @Value("${apiKey}")
  private String apiKey;

  public ChannelStats getChannelStats(String channelID) {
    // get channel stats - YouTube Data API
    String urlString = "https://www.googleapis.com/youtube/v3/channels?part=statistics&id=" + channelID + "&key="
        + apiKey;

    // calls Youtube API
    // maps JSON into YoutubeAPIResponse model
    RestTemplate restTemplate = new RestTemplate();
    YoutubeAPIResponse response = restTemplate.getForObject(urlString, YoutubeAPIResponse.class);

    // if incorrect channel id
    if (response.getItems() != null) {
      // items is an array json data
      // takes first item
      YoutubeAPIResponse.Item item = response.getItems().get(0);
      YoutubeAPIResponse.Statistics statistics = item.getStatistics(); // retrieves the nested statitic objects

      // maps the json into the ChannelStats model
      return new ChannelStats(channelID, statistics.getSubscriberCount(), statistics.getViewCount(),
          statistics.getVideoCount());
    } else {
      throw new IllegalArgumentException("Channel not found: " + channelID);
    }
  }
}
