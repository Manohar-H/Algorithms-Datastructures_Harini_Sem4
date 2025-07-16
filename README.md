# Algorithms and Data Structures – Assignment Repository

This repository is created to track my Java learning journey through assignments given by Mr. Kennedy Azupwah. These assignments help me apply the concepts I am learning and understand how well I have picked them up.

Each assignment is added here in a folder like `Assignment-1`, `Assignment-2`, and so on — based on what’s assigned during the semester.

---

## Assignment-1

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

#### The code file: 
`Assignment-1/TemperatureAnalysis.java`

---

## Assignment-2

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

#### The code file: 
`Assignment-2/MovieTheatre.java`

---

## Assignment-3  
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

#### The code file: 
`Assignment-3/SingleLinkedListTest_Harini.java`  

---

## Assignment-4

**Undo/Redo System Using Linked List and Generics**

This assignment implements a command-line based undo/redo functionality using a custom doubly linked list.

#### Features:
-	Add new states (of any datatype using generics)
-	Undo to previous state
-	Redo to next state
-	Discards redo history after a new state is added
-	Interactive CLI with add, undo, redo, and exit commands
-	Gracefully handles edge cases (e.g., no undo/redo possible)

#### Concepts:
-	Java Generics
-	Custom Doubly Linked List
-	Encapsulation with Node<T> and HistoryManager<T> classes
-	Object references and bidirectional traversal
-	Exception handling and user prompts
-	Modular code and CLI interaction via Scanner

#### The code files:
- `Assignment-4/src/history/Node.java`
- `Assignment-4/src/history/HistoryManager.java`
- `Assignment-4/src/history/Main.java`

---

## Assignment 5 - Animal Shelter

**Animal Shelter – FIFO Adoption System**

This program simulates an animal shelter that operates on a strict “first in, first out” basis. The shelter only handles dogs and cats. When adopting, a user can:
•	Take the oldest animal (either dog or cat)
•	Choose to adopt the oldest dog
•	Choose to adopt the oldest cat

Users cannot pick a specific animal, only the oldest by type or overall.

#### Features:

- `enqueue(Animal animal)`: Add a new dog or cat to the shelter
- `dequeueAny()`: Adopt the oldest animal (dog or cat)
- `dequeueDog()`: Adopt the oldest dog
- `dequeueCat()`: Adopt the oldest cat

#### Concepts:
- Inheritance (Animal superclass, Dog and Cat subclasses)
- Queues for type-specific and total order handling
- Object-oriented design and clean encapsulation
- LinkedList and FIFO behavior
- instanceof for runtime type checking

#### The code files:
1. `Assignment-5/src/animalshelter/Animal.java`
2. `Assignment-5/src/animalshelter/Dog.java`
3. `Assignment-5/src/animalshelter/Cat.java`
4. `Assignment-5/src/animalshelter/AnimalShelter.java`
5. `Assignment-5/src/animalshelter/Main.java`

---

## Author:
### Harini Manohar
###### **Software Development | Cohort 12 | Semester 2**