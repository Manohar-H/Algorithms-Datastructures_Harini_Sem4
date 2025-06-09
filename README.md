## Algorithms and Data Structures – Assignments Repository

This repository is created to track my Java learning journey through assignments given by Mr. Kennedy Azupwah. These assignments help me apply the concepts I am learning and understand how well I have picked them up.

Each assignment is added here in a folder like `Assignment-1`, `Assignment-2`, and so on — based on what’s assigned during the semester.

---

### Assignment-1

**Average Temperature Calculator**

#### Features:
- Take the number of days as input from the user
- Input the temperature for each day
- Calculate the average temperature
- Display how many days had temperatures above the average

#### Concepts:
- Arrays
- Loops (`for`, enhanced for)
- Data types like `int` and `double`
- User input via `Scanner`
- Conditional statements

The code file: `Assignment-1/TemperatureAnalysis.java`

---

### Assignment-2

**Movie Theatre Seat Booking System**

#### Features:
This program simulates a movie theatre with a 5x5 seating grid. It allows users to:
- View the current seating chart
- Reserve a seat (and get suggestions if the seat is taken)
- Cancel a reservation

Seats are represented using a 2D array (`char[][]`), where:
- `'O'` means the seat is **available**
- `'X'` means the seat is **reserved**

The menu runs in a loop and takes input via `Scanner`. It validates user entries and prints friendly messages to guide the user through booking or canceling.

#### Concepts:
- 2D arrays
- Switch statements
- Input validation
- Simple real-world logic implementation

The code file: `Assignment-2/MovieTheatre.java`

---

### Assignment-3  
**Linked List Node Deletion**

In this assignment, we implemented a custom singly linked list in Java and focused on writing a `delete(int position)` method that handles different deletion scenarios gracefully:

#### Features:
- **Delete from beginning** (position `0`)
- **Delete from the end** (position `size - 1`)
- **Delete from any valid middle position**
- **Handle invalid positions** (negative or beyond the current list size)

The logic ensures:
- The `head` and `tail` are updated correctly
- Memory is managed safely (nodes unlinked properly)
- The size of the list is accurately tracked

#### Concepts:
- Class creation and object-oriented design (`Node` class and `SingleLinkedListTest_Harini` class)
- Conditional checks and control flow
- List traversal and pointer manipulation
- Edge case handling

The code file: `Assignment-3/SingleLinkedListTest_Harini.java`  

---

### More Assignments will be added here as they come.

This repo is mostly for practicing writing clean, understandable code — no AI-generated stuff — just solid Java.

I Like keeping a track of what we are learning and this README helps me keep notes on what I have been working on and how. 

---
