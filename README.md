# Chess Game Controller

![GitHub last commit](https://img.shields.io/github/last-commit/Oussama-Maati/chess-java)
[![GitHub license](https://img.shields.io/github/license/Oussama-Maati/chess-java)](LICENSE.md)
![Java Version](https://img.shields.io/badge/Java-11%2B-blue)
[![GitHub issues](https://img.shields.io/github/issues/Oussama-Maati/chess-java)](https://github.com/Oussama-Maati/chess-java/issues)
[![GitHub stars](https://img.shields.io/github/stars/Oussama-Maati/chess-java)](https://github.com/Oussama-Maati/chess-java/stargazers)

A Java terminal chess game responsible for managing game logic and player interactions.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [How to Play](#how-to-play)
- [Next improvement](#next-improvement)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Chess Game is a Java application that serves as the core logic behind a chess game. This game use MVC pattern, so controller interacts with the chess model and view components to facilitate gameplay, manage player turns, and determine the game's outcome.

## Features

- Supports two-player chess games.
- Implements chess rules, including check, checkmate, and stalemate detection.
- Interactive terminal-based user interface within IntelliJ IDEA for now.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK) 11 or higher](https://www.oracle.com/java/technologies/javase-downloads.html) installed.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) installed (or any other java IDE).

## Getting Started

To get started with this project in IntelliJ IDEA, follow these steps:

1. Clone the repository using IntelliJ IDEA's built-in Git integration or by manually cloning it using Git.

2. Open IntelliJ IDEA and select "Open" from the main menu.

3. Navigate to the project directory and select it.

4. IntelliJ IDEA will automatically detect the project and configure it.

5. In the project structure, locate the `MainClassChess.java` file in the `src/main/java/Maati/chess/` directory.

6. Right-click on `MainClassChess.java` and select "Run 'MainClassChess.main()'." This will start the chess game within the IDE.

## How to Play

- The game will start, and you will see the chessboard displayed within the IntelliJ IDEA interface.
- Follow the on-screen instructions to input your moves using the GUI.
- Input the start position of your piece by clicking on the piece and then the destination position.
- The game will validate your move and continue until there is a winner or a draw.

## Next Improvement

- Bug fix
- Better input validation
- GUI

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and ensure that they are well-documented.
4. Test your changes thoroughly within IntelliJ IDEA.
5. Submit a pull request with a clear description of your changes.

## License

This project is licensed under the CC BY-NC License. See the [LICENSE](LICENSE.md) file for details.