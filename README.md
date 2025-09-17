# Youtube-Tracker
### The web application to track Youtube Channel Stats by providing a channel ID or channel Name

<img width="2004" height="1002" alt="image" src="https://github.com/user-attachments/assets/0d0d3b06-8cba-49ab-b1f4-a1ec11e5a780" />

## Features
- Search **Youtube Channels** by ID or name
- Displays Youtube Channel Stats
  - Subscriber Count
  - View Count
  - Video Count
- **Interactive Search Results**
  - Displays Youtube Channels with thumnbails to select
  - Based on the Youtube Data API
> In the service folder there is YoutubeService.java class that is a single unified endpoint that handles both Channel ID and channel Name and contains logic to check if the input is a channelID or name.
 
## Technologies Used
- Java, Spring-Boot for the backend
- Thymeleaf, Javascript, CSS for the view
- Youtube Data V3 API

## Getting Started
- Clone the repository and open the project with your IDE
- Configure your API Key:
  - In your application.properties add your API key like this:
  - apiKey = YOUR_API_KEY
  > https://developers.google.com/youtube/v3/getting-started
- Build and run the application: **mvn spring-boot:run**
- Navigate to: **http://localhost:8080/Youtube-Tracker**

<img width="2011" height="1009" alt="image" src="https://github.com/user-attachments/assets/213f7b88-8358-416c-8c48-438e75b00138" />


<img width="2000" height="1008" alt="image" src="https://github.com/user-attachments/assets/5e6c6184-a4d1-4513-9cc9-1895a4a51ca6" />


<img width="2000" height="1012" alt="image" src="https://github.com/user-attachments/assets/5881e56f-1f89-4fa4-9093-6a7fb0bad75b" />


