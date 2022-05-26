# ClickingGame
                                           Shxpes-Clixker

## Project Description
##
### What my  application does
My JavaFX Application is a simple clicking game with two shapes. First off, the user needs to click on the "Start" button in the main page to play the game. Another page will appear with 2 shapes, in this case, a square and a circle formatted in a button. Further, the user would click those two buttons as much as they want to test their memory skill and keep the track of the  total numbers of clicks that they did on each buttons. Once they are willing to verify their estimations, they can view their results by clicking on the "View Score" button. Again, a last page will pop up with each of the two finals results regarding the square and the circle button. They can restart the game the amount of times they want by clicking on the "Restart" button.
##
### How my application was built
I did not use any particular technologies for my application, but  the JavaFX language was present in there with many of its carateristics, such as VBox, Buttons, EvemtHandlers. BootstrapFX was also part of it to bring a little touch of style to my project.
##
### Challenges encountered and features in the future
One of many challenges that I faced during the realization was to connect many different buttons with unique features to another window that will be displayed by clicking on them. I did struggle by making the shape button desired to be able to count the actual amount of clicks the user will be doing and displayed them on another window which is the last one. The "Restart" button was also difficult to make because the count needs to be reset after clicking on it and to display the window where the game is situated. I've wanted to do a timer where the game would be stopped at the end of the time and would display the actual score the user got by clicking on those two buttons, and therefore, showing them in another window. I realized that it was more difficult than my first thought. In the future, I would of like to make those two shapes move around within the acutal size of the scene like a pong game, and the user would to try to click on them as much as they can, so it would be harder.
##
## Design
##
### Brief Explanation
I used JavaFX in my entire project. Firstly, labels and buttons were in a VBox, so it would be display one on top of each other. Each buttons were ".setOnAction" and "EventHandlers", so when the buttons were pressed, something would happened, an action would occurred, such as switching windows or counting the number of clicks for each buttons. Each class was refered to a window, so it was easier for a button to refer to them. The results were in the last window, to view them, you had to click to the button where the game was displayed. You could restart the game by pressing a button in the last window referring to the previous one, so it would not be necessary to close and open the application over and over.
##
### UML and Screenshots
<img width="302" alt="UML Diagram" src="https://user-images.githubusercontent.com/105833776/170409873-d9dffcc3-7ab3-450f-84c5-42f99ba44bf9.png">
<img width="745" alt="Main Window" src="https://user-images.githubusercontent.com/105833776/170409618-e90c530c-a89e-4b08-b051-8ab0d24e8303.png">
<img width="748" alt="Game" src="https://user-images.githubusercontent.com/105833776/170409635-a1c0d16a-fccf-4e7d-a6f0-60b502ee07b9.png">
<img width="746" alt="Result Window" src="https://user-images.githubusercontent.com/105833776/170409646-0d7e69e5-d614-4c5d-86ee-e3ecbc2c5097.png">


          
