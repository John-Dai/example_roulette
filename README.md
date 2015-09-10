# example_roulette
Program to refactor that plays a game of roulette
John Dai (rd122), Ted Yavuzkurt (tdy)

1. The refactored code is easier to read and understand, as well as simpler to extend its functionality such as adding bet types. Using abstract classes allows abstraction, making the code much simpler to read by eliminating if trees.

2. The refactored has more classes and uses polymorphism which could make it more complex. There are more files which need to be opened.

3. We created extra classes such as BetList which might not have been essential but makes adding new features easier.

4. We prefer our refactored code because it is clearer to read and extend.

In order to extend the functionality (add a new bet) a new subclass of Bet is created, the abstract functions are implemented, and an instance of the new subclass is added to the BetList class.