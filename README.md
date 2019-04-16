# The Minesweeper Game
Create new project called MineSweeper 
Group members include Tigran, Miguel and Alexander 

Our Group Decided to split the Project into 4 Parts: into 4 week iterations 

## Week 1

**Difficulty Class**
1. The first task was to design a _difficulty class_ that contains various configurations that are linked to different ranks (difficulties). 

2. We designed a form that would display two JLabels "Minesweeper Game" & "Choose Rank" as well as JButtons "Beginner" & "Intermediate" & "Advanced"  

3.  So now when the user opens the application, they can choose the rank they want to play the game in. 

**Main Class**

1. We developed a _Main.Java Class_ that would instantiates the _Difficulty class_

**Game Class**

1. We created the _game class_, as this would be called when any rank is chosen by the user. 

2. The _game class_ is the class that controls the general parameters of the game. Depending on the rank chosen the will decide on the number of mines and the size of the game grid -- this amount of bombs per difficulty will be defined later in a class called _Cell class_

**Cell Class** 

1. The _cell class_ defines the parameters of the cell and the actions that are to be performed when a user clicks on the cell
  1a. Either when a bomb appears from the random generator that will be defined in the _Game class_ 
  1b. Or is an empty cell occurs with no bomb --> a number will tell the users how bombs are surronding that specific clicked cell 

2.  Here we define the parameter for each rank by defining the amount of bombs that will be used for each rank 

3. In order to define the ranks we are using enum. 


# Week 2
# Week 3 
# Week 4 

