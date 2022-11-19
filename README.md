# Timer_centralpark
timer, beautiful timer with hidden sound play feature

yea well this is a Timer started from sleep(1000ms) to now assured results by taking system time and checkin every millisec.
nano sec would make cpu work to much, at least my 5600x 

Anyways Pause works fine, threads seems to be under control, tho possibly some non garbage collected locks remain maybe in background. 
Im gonna check those details sometime, like what did gc take and what not. tho for this project seems fine to use setDeamon. 

So in this project i acomplished actualy the holding threads in control without they keep runing or maybe run twice if click to fast. 

its a small steps for human kind but its a clockwork with stable actions right and bless you all
 
