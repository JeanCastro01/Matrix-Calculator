

# Matrix Calculator

Welcome to the Matrix Calculator! This project allows users to perform various matrix operations, including addition, subtraction, multiplication, and scalar operations. The calculator reads matrices from text files and outputs results to a file.

## Features

### Minimum Requirements
- **Add Two Matrices**
- **Subtract Two Matrices**
- **Scalar Multiplication of a Matrix**
- **Multiply Two Matrices**
- **Quit Program**

### Optional (Distinction Work)
- **Scalar Division**
- **Calculate the Reciprocal (Inverse) of a 2x2 Matrix**

## Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Basic understanding of matrix operations**

### Installation

1. **Clone the Repository**

   ```sh
   git clone https://github.com/yourusername/matrix-calculator.git
   ```

2. **Navigate to the Project Directory**

   ```sh
   cd matrix-calculator
   ```

3. **Compile the Code**

   Ensure you have JDK installed and run:

   ```sh
   javac matrix.java
   ```

4. **Run the Program**

   ```sh
   java matrix
   ```

## Usage

Upon running the program, you will be prompted to:

1. **Choose a File**: Select from a list of available matrix files.
2. **Choose an Operation**: Select the matrix operation you wish to perform.

   The available operations are:
   - Add Two Matrices
   - Subtract Two Matrices
   - Scalar Multiplication of a Matrix
   - Multiply Two Matrices
   - Scalar Division (Optional)
   - Reciprocal (Inverse) of a 2x2 Matrix (Optional)
   - Quit the Program

3. **View Results**: The results will be displayed on the screen and saved in `answer.txt`.

### Sample Input and Output

**Example Input:**
```
1 - Add Two Matrices
2 - Subtract Two Matrices
3 - Scalar Multiplication of a Matrix
4 - Multiply Two Matrices
5 - Scalar Division
6 - QUIT
```

**Example Output:**
```
Matrix A:
1 2
3 4

Matrix B:
5 6
7 8

Result of Addition:
6 8
10 12

Results saved in answer.txt
```

## File Format

Matrices should be stored in text files with the following format:

```
<Number of Rows> <Number of Columns>
<Matrix Values>
```

For example, a 2x2 matrix would be stored as:

```
2 2
1 2
3 4
```

## Contributing

Feel free to submit issues or pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or support, please contact [your-email@example.com](mailto:your-email@example.com).

---

Feel free to customize the README with any additional information or specific details related to your project.
