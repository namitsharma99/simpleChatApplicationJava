# simpleChatApplicationJava

Here's a brief console flow to understand how the chat application code works. Please note S, P1 and P2 denote the respective console screens for the server (or a common chat viewer), person1 and person2.



S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>



P1:
<<<<<<<<<<<<<<< Player 1 >>>>>>>>>>>>>>

Hey player 1 Please enter your message for server - 



P2:
<<<<<<<<<<<<<<< Player 2 >>>>>>>>>>>>>>

Hey player 2 Please enter your message for server - 



S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>

Player accepted!

Player accepted!



P1:
<<<<<<<<<<<<<<< Player 1 >>>>>>>>>>>>>>

Hey player 1 Please enter your message for server - 

Player1 here

Hey player 1 Please enter your message for server - 



S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>

Player accepted!

Player accepted!

Player Input: Player1 here



P2:
<<<<<<<<<<<<<<< Player 2 >>>>>>>>>>>>>>

Hey player 2 Please enter your message for server - 

Player2 here

Hey player 2 Please enter your message for server - 



S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>

Player accepted!

Player accepted!

Player Input: Player1 here

Player Input: Player2 here



P1:
<<<<<<<<<<<<<<< Player 1 >>>>>>>>>>>>>>

Hey player 1 Please enter your message for server - 

Player1 here

Hey player 1 Please enter your message for server - 

q

Player 1 no longer available!




S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>

Player accepted!

Player accepted!

Player Input: Player1 here

Player Input: Player2 here

Player Input: q

ERROR: No input from player!




P2:
<<<<<<<<<<<<<<< Player 2 >>>>>>>>>>>>>>

Hey player 2 Please enter your message for server - 

Player2 here

Hey player 2 Please enter your message for server - 

q

Player 2 no longer available!




S:
<<<<<<<<<<<<<<< SERVER >>>>>>>>>>>>>>

Player accepted!

Player accepted!

Player Input: Player1 here

Player Input: Player2 here

Player Input: q

ERROR: No input from player!

Player Input: q

ERROR: No input from player!



When a person gives 'q' or 'Q' in the input, the connection breaks off.

You can use this basic functionality to incorporate more persons in the chat room or to create a backend for GUI based chat application.


