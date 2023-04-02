## Casino game

We'd like to model the operation of a pm_04_enum.casino supervised by computers. In the pm_04_enum.casino the tables (Table) record the current
stakes, the players sitting at the table and the current round number. There can be maximum 10 players at each table and
there may be empty tables as well. Any player can play at any table and the players take their turn in the order they sit
down. During the game the computer aided table will call upon each player to make their move. Each player (depending on
the game type) can do the following things: pass, raise etc.

There are two types of players, who use different strategies to win the game:
- a beginner (Beginner), who passes in every odd turn and raises the stakes by one in the even ones
- a robot (Robot), who passes in every turn

Every player knows which table they're sitting at. 

You have to implement the following functions for a table:
1. A new player joins a table (addPlayer). When it happens, the player will register the table as well.
2. Start a new game (newGame). The stake and the round counter will be reset.
3. Process a round (processRound). Every player sitting at the table will make a move and the table
will print the current stake at the end of the round.
4. Query the current round number (getRoundNumber)
5. Raise the stake (raise)

And the following function for a player:
1. Make a move (makeMove). The player can ask the table about the state of the round counter and optionally raise the stake.

#### Tasks:
1. Aggregation  
Implement the Table and Player classes. Create a Main class as well, which contains the main method. The main method
should create a table and three players, sit the 3 players down at the table and process 3 rounds.
Write tests to verify the behaviour!

2. Collections  
Implement the Beginner and Robot classes, which are subclasses of Player. At each move the players should print their
type and the current round number. To print the type you should override the toString() method. Make sure that you cannot
instantiate the Player class. Write tests to verify the behaviour of the different Player types!

3. Static members  
Modify the Player class, so that every player has their own identifier (incremental numbers).
Players' toString() method returns this identifier with the Player's type (e.g. "Beginner 14")

4. _Optional_ - Exception handling  
Create a new exception class called NoPlayerException! The table should throw this exception in the processRound() method,
if there are no players sitting there. Write tests to verify the behaviour!

5. _Optional_ - Finalize  
Implement the finalize() method of the Player class: print the identifier of the player object and the returned value of
the toString() method. In the main method set the table reference to null, then start the garbage collector (System.gc())!
Run the application and check the behaviour.
## License

Copyright © Progmasters (QTC Kft.), 2018.
All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed, publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft. This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s students and for no other purposes by any parties other than QTC Kft.
This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.
