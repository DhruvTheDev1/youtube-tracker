package com.dhruvthedev1.youtube_tracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
/* 
 service for when user enters a youtube channel name
 returns list of matching channels with id, name and thumbnail
 does not change existing stats fetching logic as frontend will call /yt-tracker endpoint
*/
import org.springframework.web.client.RestTemplate;

import com.dhruvthedev1.youtube_tracker.model.SearchResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ChannelSearchService {
  @Value("${apiKey}")
  private String apiKey;

  public List<SearchResponse> getChannelName(String channelName) throws Exception {
    // get channelDetails - Youtube Data API
    String urlString = "https://www.googleapis.com/youtube/v3/search?part=snippet&type=channel&q=" + channelName
        + "&key=" + apiKey;

    RestTemplate restTemplate = new RestTemplate();
    String jsonResponse = restTemplate.getForObject(urlString, String.class);

    // manually mapping nested JSON
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(jsonResponse);

    List<SearchResponse> resultsList = new ArrayList<>();
    for (JsonNode item : root.get("items")) {
      String channelID = item.get("id").get("channelId").asText();
      String title = item.get("snippet").get("title").asText();
      String thumbnail = item.get("snippet").get("thumbnails").get("default").get("url").asText();

      resultsList.add(new SearchResponse(channelID, title, thumbnail));
    }

    return resultsList;
  }
}
