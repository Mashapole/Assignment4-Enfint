MULTITHREADING HOMEWORK. SIMULATING A ROBOT’S RACE 

 

Create a Java console program that simulates a robots race. (If you wish,  you can  

make a Swing app, of course).  

The simulation must follow these simple rules:  

The race has a fixed length of 100-200 units and goes until all robots have finished. 

You have 10 robots competing in a race.  

Each robot has a name and number and keeps its current speed that can be changed from 1 (lowest) to 4 (highest).  

Name of a robot might be not unique but combination of its name and its number have to be unique.  

All robots start to go simultaneously, so you have to use parallel threads in any way (create and keep threads manually or use executors and thread pools).  

All robots start with random speed from 1 to 4.  

Robots do their moves each second moving with current speed (if it is 1 robot moves forward by 1 unit, if it is 4 – robot moves forward by 4 units (moving change its position).   

What is the most important, each robot change its speeds every second step, to a random value from 1 to 4. This value will be a robot speed for the next move.  

Robot, which position in current step becomes equal or greater than race length finishes the race. You have to save the time in seconds that this robot spent to finish the race.  

When race starts program should print:  

1. Information about starting a race and start time of the race.  

    e.g.  “New race started at 12:22:02” 

When race ends program should print:  

1. Information about time at that race has ended. 

      e.g., “Race finished at 12:23:03” 

2. A list in which robots be in order of their arrival, 

   each string must contain robot’s name, number and amount of time to end the race, 

   for example:  

Robot 1 finished in 10.01 seconds 

Robot 2 finished in 12.22 seconds 

… 

Robot N finished in N.NN seconds 
