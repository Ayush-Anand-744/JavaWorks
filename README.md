# JAVA 
## ASSIGNMENT-1:
### CALCULATOR_ASSIGNMENT_1 Class
#### Methods

-->
ADDITION

Parameters: double First, double Second

Description: Adds two numbers and returns the result.

-->
SUBSTRACTION

Parameters: double First, double Second

Description: Subtracts the second number from the first and returns the result.

-->
MULTIPLICATION

Parameters: double First, double Second

Description: Multiplies two numbers and returns the result.

-->
DIVISION

Parameters: double First, double Second

Description: Divides the first number by the second and returns the result.

-->
POWER

Parameters: double First, double Second

Description: Raises the first number to the power of the second number using Math.pow and returns the result.

-->
MEAN

Parameters: None

Description: Takes user input for a set of numbers until "end" is entered, calculates the mean, and returns the result.

-->
VAR

Parameters: None

Description: Takes user input for an array of numbers, calculates the variance, and returns the result.

### INPUT_ASSIGNMENT_1 Class
#### Methods

-->
INPUT_NUMBERS

Parameters: None

Description: Takes user input for two numbers and returns them as an array.

### MAIN_1_ASSIGNMENT_1 Class
#### Main Method

-->
Description: Allows the user to choose from various mathematical operations including addition, subtraction, multiplication, division, mean calculation, squaring, square root, and variance calculation. It utilizes the CALCULATOR_ASSIGNMENT_1 class for performing calculations and the INPUT_ASSIGNMENT_1 class to get user input.

### PART_2_ASSIGNMENT_1 Class
#### Methods

-->
GetData

Parameters: None

Description: Reads a line of data from the user using BufferedReader and prints the parsed integer value.

-->
Main Method

Description: Creates an instance of PART_2_ASSIGNMENT_1 and calls the GetData method to demonstrate basic data input functionality


## ASSIGNMENT-2:
### INPUT_ASSIGNMENT_2 Class
#### int[] INPUT_DATA()

-->
This method within the INPUT_ASSIGNMENT_2 class is responsible for taking user input to create an integer array. It prompts the user to enter the size of the array and then populates the array with user-provided integer values. The method returns the populated array.

### MAIN_2_ASSIGNMENT_2 Class

-->
public static void main(String[] args)
The MAIN_2_ASSIGNMENT_2 class serves as the entry point for the program. It creates instances of INPUT_ASSIGNMENT_2 and PARTS_ASSIGNMENT_2 to perform various operations on the input array.

=> It instantiates an INPUT_ASSIGNMENT_2 object to obtain user input for the array.
=> It then creates a PARTS_ASSIGNMENT_2 object to perform operations on the array, including displaying even and odd numbers, finding the index with the smallest distance between adjacent elements, and creating an ArrayList.
=> The results are printed to the console.

### PARTS_ASSIGNMENT_2 Class

-->
#### void PART1(int[] Data)

-->
This method takes an integer array (Data) as input and separates its elements into two arrays: one for even numbers and another for odd numbers. It prints the original array, even numbers, and odd numbers to the console.

#### int PART2(int[] Data)

-->
The PART2 method accepts an integer array (Data) as input and calculates the differences between adjacent elements. It identifies the index of the first number with the smallest distance to its next neighbor (excluding zero differences). The method returns this index.

#### ArrayList<Integer> PART3()

-->
This method utilizes the Scanner class to take user input for the size and values of an ArrayList. It prompts the user to enter the number of elements and the corresponding data. The method returns an ArrayList containing the entered values.
