# Project2
The main objective for this project is to create a class called Bulb that will represent a light bulb.t should have instance variables for the manufacturer (String), part number (String), wattage (int) and lumens (int). Get and Set methods should be included. Override the equals and toString methods from class Object.
List of Bulbs
Create a class called BulbNode which has fields for the data (a Bulb) and next (BulbNode) instance variables. Include a one-argument constructor which takes a Bulb as a parameter. (For hints, see the PowerPoint on "Static vs. Dynamic Structures”.)
public BulbNode (Bulb b) { . . }
The instance variables should have protected access. There will not be any get and set methods for the two instance variables.
Create an abstract linked list class called BulbList. This should be a linked list with head node as described in lecture. Modify it so that the data type in the nodes is Bulb. The no-argument constructor should create an empty list with first and last pointing to an empty head node, and length equal to zero. Include an append method in this class.
Create two more linked list classes that extend the abstract class BulbList: One called UnsortedBulbList and one called SortedBulbList, each with appropriate no-argument constructors. Each of these classes should have a method called add(Bulb) that will add a new node to the list. In the case of the UnsortedBulbList it will add it to the end of the list by calling the append method in the super class. In the case of the SortedBulbList it will insert the node in the proper position to keep the list sorted by wattage.
Instantiate two linked lists, and for every Bulb read from the file, add it to the unsorted and sorted lists using the add method. You will end up with the first list having the Bulbs from the input file in the order they were read, and in the second list the Bulbs will be in sorted order.
Display the unsorted and sorted Bulbs in a GUI with a GridLayout of one row and two columns. Put the unsorted Bulbs in the left column, and the sorted Bulbs in the right column.
The input file
There will be an input file provided on Blackboard which contains information about bulbs, one per line, with the manufacturer, part number, wattage and lumens separated by commas, such as:
Phillips,1237DF2,100,1200
