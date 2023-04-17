# Revature-Coding-Challenge 2023-04-17
###Java:

Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

Examples

arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]


Notes

Notice that num is also included in the returned array.

###JavaAcript:

In a board game, a piece may advance 1-6 tiles forward depending on the number rolled on a six-sided die. If you advance your piece onto the same tile as another player's piece, both of you earn a bonus.

Can you reach your friend's tile number in the next roll? Create a function that takes your position a and your friend's position b and returns a boolean representation of whether it's possible to earn a bonus on any die roll.

Examples

possibleBonus(3, 7) ➞ true

possibleBonus(1, 9) ➞ false

possibleBonus(5, 3) ➞ false

Notes


	
You cannot move backward (which is why example #3 doesn't work).
	
If you are already on the same tile, return false, as you would be advancing away.
	
Expect only positive integer inputs.
