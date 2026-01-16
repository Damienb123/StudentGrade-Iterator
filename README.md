# StudentGrade-Iterator

This project demonstrates a Java program for managing collections of student scores, providing functionalities such as iterating over entries, filtering based on conditions, and mapping the entries to a list of student names.

# Table of Contents

1. [Overview](#Overview)
2. [Main Features](#Main-Features)
3. [Installation](#Installation)
4. [Usage](#Usage)
5. [Schema](#Schema)
    - Models
6. [Example Output](#Example-Output)
7. [Contributing](#Contribution)


## Overview

A Iteractions public class is created. The main method demonstrates the usage of a LinkedHashMap to store student names and their respective scores. The program includes functionalities to:

- Iterate through all entries.
- Filter and display passing scores (>= 75).
- Filter and display failing scores (< 75).
- Map student names to a list.

## Features

- Iterate Over Entries: Display all student names and their scores.
- Filter Passing Scores: Display student names and scores for scores greater than or equal to 75.
- Filter Failing Scores: Display student names and scores for scores less than 75.
- Map Student Names: Create a list of all student names.

## Installation

To run this project, you need to have Java installed on your system.

1. Clone the repository:
```
git clone https://github.com/yourusername/StudentGrade-Iterator.git
```

2. Navigate to the project directory:
```
cd StudentGradeIterator
```

3. Compile the Java file:
```
javac Iteration.java
```

4. Run the program:
```
java Iterations.java
```

## Usage

The program will print the following to the console:
- All entries in the HighestScore map.
- Entries with scores greater than or equal to 75.
- Entries with scores less than 75.
- A list of all student names.

## Schema

### Models

HighestScore Entry Model
| Property | Type | Description |
| --- | --- | --- |
| name | String | The name of the student. |
| score | Integer | The score of the student. |

Request Model
| Property | Type | Description |
| --- | --- | --- |
| action | String | The action to be preformed. |
| filter | Integer(optional) | The score threshold for filtering. |

Response Model
| Property | Type | Description |
| --- | --- | --- |
| message | String | The result message of the action. |
| filteredScores | Array of Objects | The list of filtered student scores. |
| Students | Array of Strings | The list of student names. |

## Example Output
```
Iterating over entries: 
Smith: 98
Alice: 87
Jeremy: 77
Trevor: 44
Steffany: 34

Filtered entries (scores >= 75) 
Passing scores
Smith: 98
Alice: 87
Jeremy: 77

Filtered entries (scores <= 75) 
Failing scores
Trevor: 44
Steffany: 34

Students: [Smith, Alice, Jeremy, Trevor, Steffany]
```

## Contributing 
Contributions are welcome! Please fork this repository and submit a pull request with your changes.
