# DuckDuckGoSearch

* This is a java program to use RESTful api DuckDuckGo (https://rapidapi.com/Glavier/api/duckduckgo8/) and GET results of search queries.
* Specific field are extracted from the response body to display relevant data to the user.
* The user is asked to chose a link from a list of link to open.
* The fields of the chosen link number are extracted, they include title, url, description of the chosen query link.

Below are the screenshots of how the Java program executes:


The user is asked for a search query input. The api responds back with a JSON body which is printed on the screen
<img width="1333" alt="Screen Shot 2022-10-12 at 5 35 36 PM" src="https://user-images.githubusercontent.com/99782175/195469386-a3b2447c-e7a6-4c23-9ab3-209d3858b981.png">

User is asked to choose any of the 20 links given by the api
<img width="1339" alt="Screen Shot 2022-10-12 at 5 36 41 PM" src="https://user-images.githubusercontent.com/99782175/195469376-0daad8e6-01db-44cb-a682-ba1eb13da2f4.png">

From the response body, the user chosen link is accepted and only url, title and description from the JSON is displayed to the user
<img width="1350" alt="Screen Shot 2022-10-12 at 6 14 03 PM" src="https://user-images.githubusercontent.com/99782175/195470453-07bd6cbb-e0f2-4a50-bae6-f9560f25c6e1.png">


