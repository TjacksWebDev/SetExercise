[Exercise] Set Practice

Set Exercise


Patrick Stewart, Rita Repulsa, He Man and TJ Hooker are playing a friendly game of Poker.  They’ve asked you to keep track of their Poker hands.  For this exercise, you will perform CRUD operations with a Set.  Sets are very similar to ArrayLists, the main difference is that Sets only contain UNIQUE values.


Download the Git Repo here: https://github.com/tp02ga/SetExercise


For example: 

A list contains [JANE, DOE, JOHN, DOE]

As a Set, the result is [JANE, JOHN, DOE]


Note: if you haven’t been exposed to the word “CRUD” yet, it stands for:

Create

Read

Update

Delete


This is something we do as coders ALL day long. We do CRUD with data.


Recommended design


Create methods for:

Reading the PokerHands.csv file and adding them into a Set

Displaying the Poker hands on the console

Updating an item in the Set

Removing an item from the Set


TASKS:


Instantiate a new HashSet  

remember to code to the interface Set

When instantiating a HashSet, you will need to add in a Data Type, in this case, its a String

Read the file PokerHands.csv using a FileService.java file.

Add the hands into the newly created HashSet you created in Task 1.

You will only be adding the hands, don't worry about the names for now.

Remove ACE HIGH and QUEEN HIGH

You can do this one of two ways, use a for loop to remove the the strings ACE HIGH and QUEEN HIGH, or

You can also use streams to filter the string ACE HIGH and QUEEN HIGH and remove them

Do not filter these in the file reader.  Remove them after the list has been updated.

Print the updated list to the console

Update PAIR to DEUCES

Updating an item in a set is not as straightforward as the ArrayList

To update, you will need to remove the item first

Then add it back with the updated string

Print the updated list to the console




EXPECTED:


After Task 2:


--------------------------------

TWO PAIR

FLUSH

STRAIGHT

FOUR OF A KIND

QUEEN HIGH

THREE OF A KIND

ACE HIGH

KING HIGH

ROYAL FLUSH

PAIR

TWO OF A KIND


After Task 3:


--------------------------------

TWO PAIR

FLUSH

STRAIGHT

FOUR OF A KIND

THREE OF A KIND

KING HIGH

ROYAL FLUSH

PAIR

TWO OF A KIND


After Task 4:


--------------------------------

DEUCES

TWO PAIR

FLUSH

STRAIGHT

FOUR OF A KIND

THREE OF A KIND

KING HIGH

ROYAL FLUSH

TWO OF A KIND

