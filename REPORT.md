# Project Report

## System Architecture

[![](https://mermaid.ink/img/pako:eNpdUVtrwjAU_ivlPFdJerPmYaCOgQPZ2MYYsz6E9qhlTVLSdM6J_31p2ulYnk6-a8g5Qa4KBAbbSh3yPdfGe5ln0rOHr1dtU-aexjxXAmWB2muOjUGxGQTeaHTjifXKJlQDJhzWWdZPV18zsB3uBM-1MuX2OHtc_iMeapSz5d_81xIP3XDPP_nd25WxlC1ZKGm0qirUG6fuVQPa9Orfzhwlztuysg8CH3a6LIBtedWgDwK14N0dTp0nA7NHgRkwOxZcf2SQybM11Vy-KyWAGd1am1btbn8JaeuCG7wt-U5zcUG1-4GFaqUBFpGYuhRgJ_gCFoTROIpJPA1IRAmNk8CHIzBKw3FC0jQi0ygI0yClZx--XTEZJ0GYJJM0JVMaBzGd-IBFaZRe9Yt0-zz_AFCMj3o?type=png)](https://mermaid.live/edit#pako:eNpdUVtrwjAU_ivlPFdJerPmYaCOgQPZ2MYYsz6E9qhlTVLSdM6J_31p2ulYnk6-a8g5Qa4KBAbbSh3yPdfGe5ln0rOHr1dtU-aexjxXAmWB2muOjUGxGQTeaHTjifXKJlQDJhzWWdZPV18zsB3uBM-1MuX2OHtc_iMeapSz5d_81xIP3XDPP_nd25WxlC1ZKGm0qirUG6fuVQPa9Orfzhwlztuysg8CH3a6LIBtedWgDwK14N0dTp0nA7NHgRkwOxZcf2SQybM11Vy-KyWAGd1am1btbn8JaeuCG7wt-U5zcUG1-4GFaqUBFpGYuhRgJ_gCFoTROIpJPA1IRAmNk8CHIzBKw3FC0jQi0ygI0yClZx--XTEZJ0GYJJM0JVMaBzGd-IBFaZRe9Yt0-zz_AFCMj3o)

[![](https://mermaid.ink/img/pako:eNptksFuwjAQRH_F2lMrUUQckhAfkCi0FadWLVyqXEyyQCCxqe1UUMS_1w4UKJCTvTvzdtbKFlKZITAg9tP4VaFIcZDzmeJlIlxxItek9zYkHxtt8FBbcWXyNF9xYcjHSpp8unGa6-Zg9Ho3UjxdNhf8m9_vBSiyE_rRNo-Fc-s7pqksbYubXIonMcsFXqv6UhgliwLVBfss1kO3exmEkT4vCl0vxkXmkBpJLox0SkvYQy5cxJHOwMyGNJUSmhgnInKywNTsrbfiX_tf0Pw3k8Pk01616RaNkZ5eajKV6kBwi4xXVoKajIfkWcnSvoeTQgNmKs-AGVVhA0pUJXdX2LppCZg5lpgAs8eMq2UCidhZj33hTynLP5uS1WwObMoLbW9VPenwqxyrymZE1ZeVMMAiSts1BdgW1sD8oBn4sR9GYRREHY8GDdjYKm01aUxjv0N92qZevGvATz221eyEUSdu-5EXer7vtYLdL-pA3W0?type=png)](https://mermaid.live/edit#pako:eNptksFuwjAQRH_F2lMrUUQckhAfkCi0FadWLVyqXEyyQCCxqe1UUMS_1w4UKJCTvTvzdtbKFlKZITAg9tP4VaFIcZDzmeJlIlxxItek9zYkHxtt8FBbcWXyNF9xYcjHSpp8unGa6-Zg9Ho3UjxdNhf8m9_vBSiyE_rRNo-Fc-s7pqksbYubXIonMcsFXqv6UhgliwLVBfss1kO3exmEkT4vCl0vxkXmkBpJLox0SkvYQy5cxJHOwMyGNJUSmhgnInKywNTsrbfiX_tf0Pw3k8Pk01616RaNkZ5eajKV6kBwi4xXVoKajIfkWcnSvoeTQgNmKs-AGVVhA0pUJXdX2LppCZg5lpgAs8eMq2UCidhZj33hTynLP5uS1WwObMoLbW9VPenwqxyrymZE1ZeVMMAiSts1BdgW1sD8oBn4sR9GYRREHY8GDdjYKm01aUxjv0N92qZevGvATz221eyEUSdu-5EXer7vtYLdL-pA3W0)


[![](https://mermaid.ink/img/pako:eNplkE9PwzAMxb-K5XOZ-r9dDpOmwaEXGEhcUCUUWm-tWJPiJGIw7buTbbBNIofIz877PTk7bHRLKNDQhyPV0G0v1yyHWoE_o2TbN_0olYWH5d39vHqdL6v_s4VWlvVmQ3yaXfTNbHYxCnh0xD0Z4EOasbBiPYAzxNCr0Vl_g6WthTe9PZEuZvCoK7CAJ7KOlYF55UszamUIrL56Ap9d33TgxlZan_lcYYBr7lsUlh0FOBAP8iBxdwir0XY0UI3Cl63k9xprtfcev-KL1sOfjbVbdyhWcmO8OtF_f-3cZVIt8UI7ZVGUZVweKSh2uEUR5eGkKJI8z5MyKpNsmgb45dtRMsmKOM_SIk6jOIr2AX4fc8NJWWRhGMZpmE2LaZQW-x__vY00?type=png)](https://mermaid.live/edit#pako:eNplkE9PwzAMxb-K5XOZ-r9dDpOmwaEXGEhcUCUUWm-tWJPiJGIw7buTbbBNIofIz877PTk7bHRLKNDQhyPV0G0v1yyHWoE_o2TbN_0olYWH5d39vHqdL6v_s4VWlvVmQ3yaXfTNbHYxCnh0xD0Z4EOasbBiPYAzxNCr0Vl_g6WthTe9PZEuZvCoK7CAJ7KOlYF55UszamUIrL56Ap9d33TgxlZan_lcYYBr7lsUlh0FOBAP8iBxdwir0XY0UI3Cl63k9xprtfcev-KL1sOfjbVbdyhWcmO8OtF_f-3cZVIt8UI7ZVGUZVweKSh2uEUR5eGkKJI8z5MyKpNsmgb45dtRMsmKOM_SIk6jOIr2AX4fc8NJWWRhGMZpmE2LaZQW-x__vY00)



## OOP four pillars
Enscapulation: Enscapulation is evident in the Track.java file. It sets private fields in order to prevent illegal access by outside classes.

Inheritance: Inhertance can be viewed from the Random strategy where it inherits the RandomStrategy class. We wanted to Individually each implement each strategy by
inheriting the engine strategy in order for it to be called by it's type of strategy in the controller class

Polymorphism: As such with the engine strategy, polymorphism is seen in the engine strategy file. A strategy can either be random, openai, or simply a search by artist name.
This is used in order to reduce complexity when selecting a strategy, and make it easier to call it in the controlelr class

Abstraction: Again, abstraction is seen in the RandomStrategy.java as it hides the implementation details. It is the job of its subclasses to implement 
those function. When we use its function in other classes, we do not care how it implement it, we want the the object just to return tracks in order
for the UI to read.

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




