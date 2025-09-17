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
