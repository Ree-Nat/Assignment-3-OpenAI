# Project Report

## Challenges I Faced

**Challenge 1: Spotify API Deprecated Features**

Problem: The spoty API features that we were planning to use – getReccomendation and getAudioFeatures – were deprecated.  
Solution: Instead of using Spotify's getReccomendation and getAudioFeatures, we decided to use Open AI to do it for us.  
We will implement 2 buttons to get song recommendations and to get audio features using Open AI.  
Learned:  
- Always check API documentation to ensure features are not deprecated  
- There are usually alternatives when features are no longer in service  

**Challenge 2: OPEN AI API Cost**

Problem: Open AI's API was not free. It costs money to use.  
Solution: Signing up with our school email instead of our personal email resolved the problem, allowing us to use Open AI's API.  
Learned:  
- Sometimes student accounts are able to access paid services for free

## Design Pattern Justifications

- **Strategy Pattern:**  For the strategy patterns, we used this design in order to simplify the process of choosing which sort of algorithm to use when we reccomend to the user. It abstracts the need to know what strategy to use in case of a function in a program that demands a strategy, not counting what sort of strategy it is.
-  **DTO Pattern:**  We used the DTO pattern in order to simplify getting data from a json file. Instead of choosing what specific item to get, we put it in a class to extract data for Track items. 
-  **Observer Pattern:**  We used the observer pattern to seperate the responsibilities between the Model files, Controller classes, and the user interface. Instead of relying on objects in the model class to change, the observer (which uses the fxml file listeners of javafx), waits for responses from the user and updates those objects and then the objects change with the display.

## AI Usage

Used ChatGPT to help set up Open AI's API key.

## Time Spent: ~20 hours


