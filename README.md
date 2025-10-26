# NumberQuest

NumberQuest is a simple and interactive Java-based number guessing game where the player’s mission is to guess a hidden number within a custom range and a limited number of attempts. The game provides helpful hints to guide the player — indicating whether the guess is too high, too low, or very close to the secret number. Designed as an engaging logic-based console game, NumberQuest demonstrates the use of loops, conditional statements, user input handling, and random number generation in Java. It offers a fun and interactive way to explore fundamental programming concepts while improving problem-solving and analytical thinking skills.

## Features

- Customizable range: Players set the minimum and maximum numbers.
- Limited attempts: Choose how many chances to guess the number.
- Hints: The game provides feedback if the guess is close to the hidden number.
- Replayable: Play multiple times with different ranges and difficulty levels.

---

## How to Play

```bash
# Compile the program
javac NumberQuest.java

# Run the program
java NumberQuest

# Sample Gameplay

** Welcome to NumberQuest! **
Your mission: Guess the hidden number and complete the quest!
Enter the minimum number for your quest: 1
Enter the maximum number for your quest: 20
How many chances will you take to find the hidden number? 5

Great! The number is somewhere between 1 and 20.
Can you find it in 5 attempts? Let the quest begin!

Attempt 1: Your guess? 10
Too low! Keep trying.

Attempt 2: Your guess? 15
You're very close!
Too high! Keep trying.

Attempt 3: Your guess? 14
Congratulations! You completed the NumberQuest in 3 tries!
