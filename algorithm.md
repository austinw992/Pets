File: Perfect Pet\
Author: Austin Wang\
Date Created: November 13 2020\
Purpose: Practice constructing abstract data type and inheritance from an abstract class\

Goal: Create a pet of your choice that can be interactive\

Inputs: User create pet or interact with current saved pet\

Outputs: Program will save the pet that can be reloaded for future interaction\

NOTES: Number of attributes. attributes are list of values. increase and decrease the value. create abstract data type. pet class is also abstract. User Interface.

Pet Class:
1. represents the type of pet
2. actions user can take with the pet 
3. user creates a pet
4. user saves the pet
	a. object serialization to save
5. user loads the pet
	a. object deserialization to load the pet
6. user interacts with pet

Attributes Class:
1. characteristics of the pet
2. list of values
3. values are integers
4. get the value from other subclass attributes
5. increase the value (append or increment)
6. decrease the value (decrement)
7. check the value of the subclass attributes

Hunger Class:
1. value of hungry
2. value of starved
3. get the value of hungry
4. increase hungry
5. decrease hungry

Thirst Class:
1. value of parched
2. value of quenced
3. get thirsty
4. increase thirsty
5. decrease thirsty

Play Class:
1. command to throw
2. command to catch
3. get the command

Happy Class:
1. value of happiness
2. value of joy
3. get happiness
4. increase happiness
5. decrease happiness

Panda Class:
1. Feed the pet through Hunger Class
2. Give water through Thirst Class
3. Play with the pet
4. menu of what can be done with the pet


