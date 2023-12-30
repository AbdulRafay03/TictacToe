# Tic Tac Toe Game with GUI

## Project Overview

This project implements the classic Tic Tac Toe game with a graphical user interface (GUI) in Java using Java Swing. It incorporates various programming concepts such as 2D arrays, recursion, stacks, backtracking, and the Minimax algorithm. The development environment used for this project is NetBeans.

## Game Rules

- The Tic Tac Toe game follows the classic rules.
- Only one user can play at a time against the bot.
- The user and the bot take turns making moves.
- The game continues until a winner is determined or the board is filled.

## Difficulty Levels

### Easy

- The bot in easy difficulty picks a random position to place its marker.
- The bot's move is independent of the user's move.
- This mode gives the user a higher probability of winning.

### Hard

- In hard difficulty, the bot makes its move based on the assumption that the user is playing an optimal game of Tic Tac Toe.
- It utilizes the Minimax algorithm to generate its move.
- It's designed to make it nearly impossible for the user to win against the bot in hard mode.

## Implementation Details

- The game is implemented with Java Swing for the graphical user interface.
- Concepts such as 2D arrays are used to represent the game board.
- Recursion is employed in certain aspects of the game logic.
- The Minimax algorithm is utilized for the hard difficulty level.

## How to Run

1. Open the project in NetBeans.
2. Build and run the project.
3. Choose the difficulty level.
4. The GUI will appear, allowing the user to make moves against the bot.

## Future Enhancements

- Improve the GUI for a more visually appealing experience.
- Implement additional difficulty levels or customization options.
- Add features such as a score tracker and game history.
