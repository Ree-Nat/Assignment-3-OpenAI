# Music Recommender System
## Team Members
Nathan Rinon
Caden Maki
Elvin Nyguen

## Project Description
A music recommender system that uses Spotify APi and Open API to recommend songs based on requested queries. 

## Features Implemented
- [x] Random Feature - Chooses songs based on a random set of strings. 
- [x] Open API request - Chooses songs based on prompt messages into open AI
- [x] Search recommendation - Chooses songs based on the given artist sent through the get request via spotify API. 

## Design Patterns Used
1. **Strategy Pattern** - The pattern that is used in this program is the strategy pattern. These patterns can be found on the random strategy and the search strategy in the file structure. These relate to these design patterns because they both serve the same function in different ways. One recommends songs based on random inputs whereas the search strategy demands similar input 
1. **DTO Pattern** - While it doesn’t follow the traditional structure of the OOP design patterns, reading and parsing the get request from spotify puts the results in an object and allows operation on the object allowing sufficient use of transferring data to the model to the UI class.
3. **Observer Pattern** - Again, although not a pure observer class, the Main controller observes the changes given to the fxml UI implemented via javafx. 

## Setup Instructions

### Prerequisites
- Java 25 or higher
- OpenAI API key

### Installation
1. Clone repository
2. Copy `config.properties.example` to `config.properties`
3. Add your OpenAI API key to `config.properties`
4. Run `Launcher.java`




## API Usage & Costs
- Model used: gpt-mini-o4 
- Estimated cost per request: $0.002
- Cost management strategies


## Future Enhancements
- If we had more time, our group would ideally like to add a more advanced recommender system that uses audio features as well as collaborative recommendation. 
