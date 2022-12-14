# Timer_centralpark
timer, beautiful timer with hidden sound play feature

![image](https://user-images.githubusercontent.com/105649203/202902288-1b346973-7904-4bbe-a09d-13f80fc4f4de.png)
![image](https://user-images.githubusercontent.com/105649203/203039202-00b5fb1b-d470-43b2-9d82-5bdfeaecbaeb.png)


the design some are questioning :) here Im trying to have a fully functional timer engine

yea well this is a Timer started from sleep(1000ms) to now assured results by taking system time and checkin every millisec.
nano sec would make the cpu work to much, at least my 5600x 

So in this project i acomplished actualy the keeping threads in control without they stay runing or maybe run twice if click to fast. 

the hidden soundplay function works like this:  if u type the two letters 'jj' in the left so the minutes field, and then press the buttons, 
you will be able to start the music and stop it, and also to bounce it like a cue button. 

code looks pretty

tho there is one bug lasting , its when u type a new time, 0 minutes and some seconds, it will count 1 min on it ^^. will fix it 
 

