# StudentGrade-Iterator
The program defines an interface Collections that extends the functionality to iterate through objects using generics and lambda expressions. It includes a main method where a LinkedHashMap is used to store student names as keys and their corresponding scores as values.

Usage

To run the program, compile the Collections.java file and execute the generated class file.
javac Collections.java
java Collections


Features

    Iterates over entries in a LinkedHashMap.
    Filters entries based on a specified condition.
    Maps the values to an ArrayList.
    providing arguments to initilaize the use of lambda expressions



Example Output

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


Requirements

    Java Development Kit (JDK) installed.
