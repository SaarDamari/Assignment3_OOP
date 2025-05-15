# 🐉 Dungeons & Dragons – Object-Oriented Dungeon Crawler

A multi-level, single-player Dungeons & Dragons–inspired console game built in Java, applying advanced object-oriented design patterns and principles.

This project was developed as part of a university Object-Oriented Software Design (OOSD) course assignment.

---

## 📜 Game Overview

The player is trapped in a dungeon and must battle their way through waves of enemies across multiple levels. Using strategy, abilities, and unique character skills, the player must defeat all enemies in each level to progress, and ultimately escape the dungeon.

The game is fully text-based and runs in the command line. Gameplay involves movement, combat, leveling up, and managing special abilities.

---

## 🎮 Gameplay Features

- ✅ Multi-level dungeon system
- ✅ Three player classes: Warrior, Rogue, Mage (+ optional: Hunter)
- ✅ Multiple enemy types: Monsters & Traps (including Bosses)
- ✅ Combat system with attack/defense rolls
- ✅ Special abilities with resource management (cooldown, mana, energy)
- ✅ Player level-up progression mechanics
- ✅ Observer/Callback-based CLI architecture
- ✅ Board visualization printed after every move

---

## 🧙 Character Classes

Each player class has unique stats and a special ability:

| Class   | Example         | Ability               | Resource     |
|---------|-----------------|-----------------------|--------------|
| Warrior | Jon Snow        | Avenger's Shield      | Cooldown     |
| Rogue   | Arya Stark      | Fan of Knives         | Energy       |
| Mage    | Melisandre      | Blizzard              | Mana         |
| Hunter  | Ygritte (bonus) | Shoot                 | Arrows       |

---

## 👾 Enemies

Enemy types include:

- Monsters (e.g. Lannister Soldier, The Mountain, Night’s King)
- Traps (static enemies with visibility cycles)
- Bosses (enhanced monsters with special abilities, e.g. Cersei)

Each enemy has its own health, attack, defense, vision range, and experience yield.

---

## 🧱 Board Layout

- # : Wall (blocked)
- . : Empty tile (walkable)
- @ : Player
- X : Dead player
- Other ASCII characters represent enemies

Each level is represented by a text file (e.g. level1.txt) in a specified directory.

---

## 🕹 Controls (CLI)

The player interacts via keyboard inputs:

| Key | Action                |
|-----|------------------------|
| w   | Move Up               |
| s   | Move Down             |
| a   | Move Left             |
| d   | Move Right            |
| e   | Cast Special Ability  |
| q   | Wait / Do Nothing     |

After each action, the board and status will update.

---

## 🧪 Testing

This project includes unit tests covering:

- Player class logic and leveling
- Enemy AI behavior and movement
- Combat mechanics
- Special ability execution
- Game board parsing and validation

Tests were written following TDD methodology to ensure both correctness and robustness.

---

## 🧰 Technologies Used

- Java 17
- JUnit 5
- OOP Design Patterns:
  - Visitor
  - Observer
  - Factory
  - Inheritance and Polymorphism

---

## 📂 How to Run

1. Compile the project or use the provided JAR (if available).
2. Run from the command line:

```bash
java -jar hw3.jar <path-to-levels-directory>
