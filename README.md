# Timer_centralpark
timer, beautiful timer with hidden sound play feature

![image](https://user-images.githubusercontent.com/105649203/202902288-1b346973-7904-4bbe-a09d-13f80fc4f4de.png)

the design stood like this its not about the design here is trying to have a fully functional timer engine

yea well this is a Timer started from sleep(1000ms) to now assured results by taking system time and checkin every millisec.
nano sec would make cpu work to much, at least my 5600x 

Anyways Pause works fine, threads seems to be under control, tho possibly some non garbage collected locks remain maybe in background. 
Im gonna check those details sometime, like what did gc take and what not. tho for this project seems fine to use setDeamon. 

So in this project i acomplished actualy the keeping threads in control without they keep runing or maybe run twice if click to fast. 

code looks pretty

tho there is one bug lasting , its when u type a new time, 0 minutes and some seconds, it will count 1 min on it. will fix
 
its a small steps for human kind


