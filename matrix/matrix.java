package matrix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class matrix {

	public matrix() throws IOException {

		                          // +++++++++++ HERE IS MY CONSTRUCTION ++++++++++++++++++ \\

		int numb, option;

		option = displayaskmatrices(
				"Hello! welcome!!\nThis program work with matrices from files\nYou have to pick up a file and than choose an operation to be done.\nOBS: You can QUIT the program whatever time you want\nBy choosing the option QUIT.\n\nNow choose one of the file bellow (1 - 5) Let's work!!!\n\n1 - InvalidFile.txt\n2 - InvalidFile2.txt\n3 - Matrix1.txt\n4 - Matrix2.txt\n5 - QUIT");
		// this method is to ask which file would you like to work with and here is
		// where you have the option 1 - 5
		// however the file 3 and 4 are the most important

		numb = displayshowchoice(option); // ( Switch method )
		// this method is to print your matrix ( you choice in the method above) on the
		// screen meanwhile it's inside the array

		numb = displayoperation(
				"Please choose one of the operation bellow (1-6) :\n\n1 - Add two matrices\n2 - Subtract two matrices\n3 - Multiply a matrix by an Integer\n4 - Multiply two matrices\n5 - Scalar Division a matrix by an Integer\n6 - QUIT");
		// here is where the program goingt to ask you which operation the user  would like to do!

		if (option == 3) {
			numb = displayshowoperationfile1(numb); // if the choice in the method displayaskmatrices(); was file 3 this method will be called (switch method )
		}

		if (option == 4) {
			numb = displayshowoperationfile2(numb); // if the choice in the method displayaskmatrices(); was file 4 this method will be called and  must skip the method above
													// ( Switch method )
		}

		// Ask if do you want to continue the program
		askuserinput();

		                 // *****************************************************************************\\

	}

	public int askuserinput() {

		int number = 0; // variable to store the input
		boolean valid = false;  // inicializing the boolean to use the do/while loop!

		Scanner myScanner = new Scanner(System.in); // reading the input 

		do { // inicialing the do/while loop

			try {
				System.out.println("Would you like to continue?");
				System.out.println("If YES enter ( 1 ) ");
				System.out.println("If NOT enter ( 2 ) ");
				// numb = myScanner.nextInt();
				number = myScanner.nextInt();
				// saving input enter
				if (number > 2) {
					
					System.out.println("Sorry - must be 1 to 2");

					
				}

				else if (number == 1) {
					new matrix();
					

				}

				else if (number == 2) {
					System.out.println("Thank you");
					
                    System.exit(0); // stop the program
				} else if (number < 1) {
				
					System.out.println("Sorry - must be 1 to 2");

					
				}

				else {

					
				}

			} catch (Exception e) {  // checking if the user don't enter letters.

				System.out.println("Unfurtunately you are not allowed to use letters!");
				System.out.println("Please try again");
				System.out.println("____________________________ ");
				System.out.println(" ");

				//valid = false;
			}

		} while (!valid); // validating the looop
		return number; // return the input
	}

	public int displayshowoperationfile2(int option) throws IOException {

		Scanner myScanner = new Scanner(System.in);

		switch (option) {

		case 1:

			int[][] m1, m2;

			m1 = Matrix2A();
			m2 = Matrix2B();
			add(m1, m2);

			break;

		case 2:
			int[][] n1, n2;
			n1 = Matrix2A();
			n2 = Matrix2B();
			subtract(n1, n2);

			break;
		case 3:
			int[][] m7;
			m7 = Matrix2A();
			escalarmultiplication(m7);

			break;

		case 4:
			int[][] m5, m6;
			m5 = Matrix2A();
			m6 = Matrix2B();
			multiplication(m5, m6);

			break;

		case 5:

			int[][] m9;
			m9 = Matrix2A();
			escalardivision(m9);

			break;

		case 6:
			asktoexit();

			break;

		default:
			System.out.println("Undefined content!");

			break;

		}
		return option;

	}

	// This method is working with swtich and each case(1-5) call each method:
	// operation add(); Subtract(); Multiplication();... and so on.
	// This method working with the Matrix A and B from the file called matrix2.txt
	// This method is called from the displaysoperation();
	// OBS : This method only work if your choice was number 4 in the method called
	// displayaskmatrices();
	public int displayshowoperationfile1(int option) throws IOException {

		Scanner myScanner = new Scanner(System.in);

		switch (option) {

		case 1:

			int[][] m1, m2;

			m1 = Matrix1A();
			m2 = Matrix1B();
			add(m1, m2);

			break;

		case 2:
			int[][] n1, n2;

			n1 = Matrix1A();
			n2 = Matrix1B();
			subtract(n1, n2);

			break;
		case 3:
			int[][] m7;
			m7 = Matrix1A();
			escalarmultiplication(m7);

			break;

		case 4:
			int[][] m5, m6;
			m5 = Matrix1A();
			m6 = Matrix1B();
			multiplication(m5, m6);

			break;

		case 5:

			int[][] m9;
			m9 = Matrix1A();
			escalardivision(m9);

			break;

		case 6:
			asktoexit();
			break;

		default:
			System.out.println("Undefined content!");

			break;

		}
		return option;

	}

	// This method is working with swtich and each case(1-5) call each method:
	// operation add(); Subtract(); Multiplication();... and so on.
	// This method working with the Matrix A and B from the file called matrix1.txt
	// This method is called from the displaysoperation();
	// OBS : This method only work if your choice was number 3 in the method called
	// displayaskmatrices();
	public int[][] escalardivision(int[][] numbersA) throws IOException {

		System.out.println("Please enter a integer number to make the Scalar Division of Matrix A");
		double number; // declaring variable number for user input
		Scanner myScanner = new Scanner(System.in);

		number = myScanner.nextInt();

		double[][] scalarDivision = new double[numbersA.length][numbersA.length];
		// stored the size of Matrix A
		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				
				scalarDivision[i][j] = 1 / number * numbersA[i][j];
				// number 1 divide by user input integer number multiply by matrix A
			}

		}

		System.out.println("Your anwser is around: ");

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				System.out.print(String.format("%.2f", scalarDivision[i][j]) + "\t");

			}

			System.out.println();
		}
		System.out.println(" ");
		System.out.println("I also saved your anwser in the file called answer.txt ");
		System.out.println(" ");

		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("answer.txt", true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}// to write in the file answer.txt
		
		for (int i = 0; i < scalarDivision.length; i++) {
			for (int j = 0; j < scalarDivision[i].length; j++) { // LOOP TO READ THE ANSWER AND PRINT TO THE FILE
				myWriter.write(scalarDivision[i][j] + " ");
			}
			myWriter.write(System.lineSeparator());
		}
		myWriter.write("\n");// skip the line
		myWriter.close(); // close the file. otherwise mywriter doesn't work.
		
		
		return numbersA;

	}

	// This method is to make the Scalar Division of Matrix A according to your
	// choice of the file from the method called displayaskmatrices();.
	// Also printing and saving the operation into the file called answer.txt
	public int[][] escalarmultiplication(int[][] numbersA) throws IOException { 
		// method array with matrix A stored

		System.out.println("Please enter a integer number to make the Scalar Multiplication of Matrix A!");
		int number; // variable to store the integer number 
		Scanner myScanner = new Scanner(System.in); // reading input

		number = myScanner.nextInt(); // validating 

		int[][] scalarMultiplication = new int[numbersA.length][numbersA.length];
		//                                     // stored the size of Matrix A

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				
				// addition[i][j] = numbersA[i][j] numbersB[i][j];
				scalarMultiplication[i][j] = number * numbersA[i][j];
			}

		}
  // ****** LOOP TO PRINT IN THE SCREEN THE ANSWER!!
		System.out.println("Your anwser is: ");

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				System.out.print(scalarMultiplication[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println(" ");
		System.out.println("I also saved your anwser in the file called answer.txt ");
		System.out.println(" ");
		
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("answer.txt", true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}// to write in the file answer.txt
		
		for (int i = 0; i < scalarMultiplication.length; i++) {
			for (int j = 0; j < scalarMultiplication[i].length; j++) { // LOOP TO READ THE ANSWER AND PRINT TO THE FILE
				myWriter.write(scalarMultiplication[i][j] + " ");
			}
			myWriter.write(System.lineSeparator());
		}
		myWriter.write("\n"); // skip the line
		myWriter.close(); // close the file. otherwise mywriter doesn't work.
		
		
		return numbersA;

	}

	// This method is to make the Scalar Multiplication of Matrix A according to
	// your choice of the file from the method called displayaskmatrices();.
	// Also printing and saving the operation into the file called answer.txt
	public int[][] multiplication(int[][] numbersA, int[][] numbersB) throws IOException {


		int[][] multiplication = new int[numbersA.length][numbersB.length];

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {
				
				for (int k =0; k < numbersA[i].length; k++) {
				
				multiplication[i][j]= multiplication[i][j] + numbersA[i][k] * numbersB[k][j]; 
				
				// System.out.println(i + ",  "+ j +",  " +  k+ ",  " + numbersA[i][k]+ ",  " + numbersB[k][j]+",  " + multiplication[i][j]);
				}

			}
			

			
		}

		System.out.println("Your anwser is: ");

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				System.out.print(multiplication[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println(" ");
		System.out.println("I also saved your anwser in the file called answer.txt ");
		System.out.println(" ");

		
		
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("answer.txt", true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < multiplication.length; i++) {
			for (int j = 0; j < multiplication[i].length; j++) {
				myWriter.write(multiplication[i][j] + " ");
			}
			myWriter.write(System.lineSeparator());
		}
		myWriter.write("\n");
		myWriter.close();
		
		
		return numbersB;

	}

	// This method is to make the multiplication of Matrix A and Matrix B according
	// to your choice of the file from the method called displayaskmatrices();.
	// Also printing and saving the operation into the file called answer.txt
	public int[][] subtract(int[][] numbersA, int[][] numbersB) throws IOException {

		int[][] addition = new int[numbersA.length][numbersB.length];
		 // stored in a array the size of Matrix A and Matrix B 
		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				addition[i][j] = numbersA[i][j] - numbersB[i][j];

			}

		}

		System.out.println("Your anwser is: ");

		for (int i = 0; i < numbersA.length; i++) {

			for (int j = 0; j < numbersA[i].length; j++) {

				System.out.print(addition[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println(" ");
		System.out.println("I also saved your anwser in the file called answer.txt ");
		System.out.println(" ");

		
		
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("answer.txt", true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < addition.length; i++) {
			for (int j = 0; j < addition[i].length; j++) {
				myWriter.write(addition[i][j] + " ");
			}
			myWriter.write(System.lineSeparator());
		}
		myWriter.write("\n");
		myWriter.close();
		
		
		return numbersB;

	}

	// This method is to make the subtraction of Matrix A and Matrix B according to
	// your choice of the file from the method called displayaskmatrices();.
	// Also printing and saving the operation into the file called answer.txt
	public int[][] add(int[][] numbersA, int[][] numbersB) throws IOException {

		int[][] addition = new int[numbersA.length][numbersB.length];
		 // stored in a array the size of Matrix A and Matrix B 
		for (int i = 0; i < numbersA.length; i++) {
			//(initialize; condition; increment);
			for (int j = 0; j < numbersA[i].length; j++) {
				//(initialize; condition; increment);
				addition[i][j] = numbersA[i][j] + numbersB[i][j];
               //  adding MatrixA and Matrix B
			}

		}
		 // ***** PRINTING IN THE SCREEN *****|\\
		System.out.println("Your anwser is: ");

		for (int i = 0; i < numbersA.length; i++) {
			//(initialize; condition; increment);
			for (int j = 0; j < numbersA[i].length; j++) {
				//(initialize; condition; increment);
				System.out.print(addition[i][j] + "\t");

			}

			System.out.println();
		}
		System.out.println(" ");
		System.out.println("I also saved your anwser in the file called answer.txt ");
		System.out.println(" ");

		
		
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter("answer.txt", true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for (int i = 0; i < addition.length; i++) {
			for (int j = 0; j < addition[i].length; j++) {
				myWriter.write(addition[i][j] + " ");
			   
			}
			myWriter.write(System.lineSeparator());

		}
		myWriter.write("\n");
		myWriter.close();
		
		
		return numbersB;

	}

	// This method is to make the addition of Matrix A and Matrix B according to
	// your choice of the file from the method called displayaskmatrices();.
	// Also printing and saving the operation into the file called answer.txt
	public int[][] Matrix2B() {

		BufferedReader reader; // decalring bufferedReader to read from file.
		String cha = ""; // variable to store the value
		int numbersB[][] = null; // declaring the variable for array


		try {
			reader = new BufferedReader(new FileReader("matrix2.txt")); // reading from file
			try {

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				reader.readLine();
				reader.readLine();
				reader.readLine(); // to skip the @ characters inside the file ( The only way the i could figure out how )
				reader.readLine();
				reader.readLine();
				cha = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] splited = cha.split(" ");
			int nRows = Integer.parseInt(splited[0]);// start to reading from 0 the Rows in the Matrix2.txt (3x3)
			int nCols = Integer.parseInt(splited[1]);// start to reading from 1 the cols in the matrix2.txt (3x3)


			numbersB = new int[nRows][nCols];

			for (int i = 0; i < numbersB.length; i++) {
				//(initialize; condition; increment);
				try {
					cha = reader.readLine();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				splited = cha.split(" ");

				for (int j = 0; j < numbersB[i].length; j++) {
					numbersB[i][j] = Integer.parseInt(splited[j]);

				}
			}
			 // ***** PRINTING IN THE SCREEN *****|\\

			System.out.println("Matrix B: ");

			for (int i = 0; i < numbersB.length; i++) {
				//(initialize; condition; increment);
				for (int j = 0; j < numbersB[i].length; j++) {
					//(initialize; condition; increment);
					System.out.print(numbersB[i][j] + "\t");

				}

				System.out.println();

			}
			System.out.println("__________________________________________");
			System.out.println("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numbersB;

	}

	// This method is where the program is reading the Matrix B from the file
	// matrix2.txt and printing.
	// Using Array.
	public int[][] Matrix2A() {

		BufferedReader reader; // decalring bufferedReader to read from file.
		String cha = ""; // variable to store the value
		int numbersA[][] = null; // declaring the variable for array


		try {
			reader = new BufferedReader(new FileReader("matrix2.txt")); // reading from file.
			try {

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				cha = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] splited = cha.split(" ");
			int nRows = Integer.parseInt(splited[0]);// start to reading from 0 the Rows in the Matrix2.txt (3x3)
			int nCols = Integer.parseInt(splited[1]);// start to reading from 1 the cols in the matrix2.txt (3x3)

			numbersA = new int[nRows][nCols]; // declaring the variables nRows and nCols as the size of the matrix.

			for (int i = 0; i < numbersA.length; i++) {
				//(initialize; condition; increment);
				try {
					cha = reader.readLine();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				splited = cha.split(" ");

				for (int j = 0; j < numbersA[i].length; j++) {
					numbersA[i][j] = Integer.parseInt(splited[j]);
					// these 2 loops above are to store in a array all the values \\
				}
			}

			System.out.println("Matrix A: ");

			for (int i = 0; i < numbersA.length; i++) {
				//(initialize; condition; increment);
				for (int j = 0; j < numbersA[i].length; j++) {
					//(initialize; condition; increment);
					System.out.print(numbersA[i][j] + "\t");

				}

				System.out.println();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numbersA;

	}

	// This method is where the program is reading the Matrix A from the file
	// matrix2.txt and printing.
	// Using Array.
	public int[][] Matrix1B() {
		BufferedReader reader; // decalring bufferedReader to read from file.
		String cha = ""; // variable to store the value
		int numbersB[][] = null;// declaring the variable for array

		try {
			reader = new BufferedReader(new FileReader("matrix1.txt")); // validating the buffered reader to read from file matrix.txt
			try {

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				reader.readLine();
				reader.readLine();
				reader.readLine(); // to skip the @ characters inside the file ( The only way the i could figure out how )
				reader.readLine();
				// reader.readLine();
				cha = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] splited = cha.split(" ");
			int nRows = Integer.parseInt(splited[0]);// start to reading from 0 the Rows in the Matrix1.txt (2x2)
			int nCols = Integer.parseInt(splited[1]);// start to reading from 1 the cols in the matrix1.txt (2x2)

			numbersB = new int[nRows][nCols]; // declaring the variables nRows and nCols as the size of the matrix.


			for (int i = 0; i < numbersB.length; i++) { //(initialize; condition; increment);

				try {
					cha = reader.readLine();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				splited = cha.split(" ");

				for (int j = 0; j < numbersB[i].length; j++) {
					numbersB[i][j] = Integer.parseInt(splited[j]);
					
					// these 2 loops above are to store in a array all the values \\
				}
			}
			System.out.println("");
			System.out.println("Matrix B: ");

			for (int i = 0; i < numbersB.length; i++) {
				//(initialize; condition; increment);
				for (int j = 0; j < numbersB[i].length; j++) {
					//(initialize; condition; increment);
					System.out.print(numbersB[i][j] + "\t");

					 // this loop is to print in the screen \\
					
				}

				System.out.println();

			}
			System.out.println("__________________________________________");
			System.out.println("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numbersB;

	}

	// This method is where the program is reading the Matrix B from the file
	// matrix1.txt and printing.
	// Using Array.
	public int[][] Matrix1A() {
		BufferedReader reader;// decalring bufferedReader to read from file.
		String cha = ""; // variable to store the value
		int numbersA[][] = null; // declaring the variable for array

		try {
			reader = new BufferedReader(new FileReader("matrix1.txt")); // validating the bufferedreader to read from file matrix.txt
			try {

			} catch (Exception e) {
				
				e.printStackTrace();
			}
			try {
				cha = reader.readLine(); //
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			String[] splited = cha.split(" ");
			int nRows = Integer.parseInt(splited[0]); // start to reading from 0 the first Rows in the Matrix1.txt (2x2)
			int nCols = Integer.parseInt(splited[1]); // start to reading from 1 the cols in the matrix1.txt (2x2)

			numbersA = new int[nRows][nCols]; // declaring the variables nRows and nCols as the size of the matrix.

			for (int i = 0; i < numbersA.length; i++) { //(initialize; condition; increment);

				try {
					cha = reader.readLine();

				} catch (IOException e) {
				
					e.printStackTrace();
				}
				splited = cha.split(" ");

				for (int j = 0; j < numbersA[i].length; j++) { // (initialize; condition; increment);
					numbersA[i][j] = Integer.parseInt(splited[j]);

					// these 2 loops above are to store in a array all the values \\
					
				}
			}

			System.out.println("Matrix A: ");
            
			
			for (int i = 0; i < numbersA.length; i++) {
            // (initialize; condition; increment);
				for (int j = 0; j < numbersA[i].length; j++) {
					// (initialize; condition; increment);
					
					 // this loop is to print in the screen \\
					
					
					System.out.print(numbersA[i][j] + "\t");
					
				}

				System.out.println();
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		return numbersA;

	}
	// This method is where the program is reading the Matrix A from the file
	// matrix1.txt and printing.
	// Using Array.
	public int InvalidFile2() {

		System.out.println(" ");
		System.out.println("This file is not validate ");
		System.out.println("The size of matrices doesn't match 2x3 ");
		System.out.println(" ");

		askuserinput(); // if user choice was invalidfile2(); this method will be called to ask if the user would like to continue or finish the program.

		return 0;

	}

	public int InvalidFile() {

		System.out.println(" ");
		System.out.println("This file is not validate ");
		System.out.println("There is a character inside the Matrix! Is not possible make any operation! ");

		System.out.println(" ");

		askuserinput(); // if user choice was invalidfile1(); this method will be called to ask if the user would like to continue or finish the program.

		return 0;

	}

	public int displayshowchoice(int option) {

		Scanner myScanner = new Scanner(System.in);

		switch (option) {

		case 1: // if your choice was number 1 in the displayaskmatrices(); it should run the method inside the case 1!!!

			InvalidFile();

			break;

		case 2: // if your choice was number 2 in the displayaskmatrices(); it should run the method inside the case 2!!!

			InvalidFile2();

			break;

		case 3: // if your choice was number 3 in the displayaskmatrices(); it should run the methods inside the case 3!!!
			System.out.println("Great, Your choice was file number " + option); // also confirmed you choice by printing out the option variable
			System.out.println(" ");
			System.out.println("This File is validate :");
			System.out.println("Great, The size of Matrix A and Matrix B match 2x2");
			System.out.println(" ");
			Matrix1A(); // this method read the first array in the file matrix.txt (2x2) and store it in a array and print it out.
			Matrix1B(); // this method read the second array in the file matrix.txt (2x2) and store it in a array and print it out.
			break;

		case 4: // if your choice was number 4 in the displayaskmatrices(); it should run the methods inside the case 4!!!

			System.out.println("Great, Your choice was file number " + option); // also confirmed you choice by printing out the option variable
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("This File is validate");
			System.out.println("Great, The size of Matrix A and Matrix B match 3x3");
			System.out.println(" ");
			Matrix2A();// this method read the First array in the file matrix2.txt (3x3) and store it in a array and print it out.
			Matrix2B();// this method read the second array in the file matrix2.txt (3x3) and store it in a array and print it out.


			break;

		case 5: // if your choice was number 5 in the displayaskmatrices(); it should run the method inside the case 5!!!


			asktoexit(); // method to QUIT the program.

			break;

		default: // if you answer is none of the number above should print out this message
			System.out.println("Undefined content!");

			break;

		}
		return option; // return input choice

	}
	// This method is where according to your choice from the method displaymatrices
	// is going to work with.
	// Wich case(1-5) inside the method is going to call the MatrixA and Matrix B
	// from the files matrix1.txt and matrix2.txt
	// and using array to save the Matrices otherwhise I won't be able to work with
	// them.
	public int displayoperation(String prompt) {

		int numb = 0;// variable to store the input
		boolean valid = false; // inicializing the boolean to use the do/while loop!


		Scanner myScanner = new Scanner(System.in); // reading the input 

		do { // inicialing the do/while loop

			try {
				System.out.println(prompt); // prompt the menu of operations

				numb = myScanner.nextInt();
				// saving input enter

				if (numb > 6) { // now with 6 option / if input is bigger than 6 valid false;
					// not good
					System.out.println("Sorry - must be 1 to 6");
					System.out.println(" ");
					System.out.println("Let's try Again: ");
					System.out.println("_______________________");
					System.out.println(" ");
					valid = false;
				}

				else if (numb < 1) { // if input is less tha 1 valide false;
					// not good
					System.out.println("Sorry - must be 1 to 5");
					System.out.println(" ");
					System.out.println("Let's try Again: ");
					System.out.println("_______________________");
					System.out.println(" ");
					valid = false;
				}

				else {
					// OK
					valid = true; // will stop the loop
				}

			} catch (Exception e) { // checking if the user don't enter letters.


				System.out.println("Unfurtunately you are not allowed to use letters!");
				System.out.println("Please try again");
				System.out.println("____________________________ ");
				System.out.println(" ");

				valid = false; // no good
			}

		} while (!valid); // validating the looop
		return numb; // return the input
	}
	// This method is where the program will ask the user input to choice which
	// operation he want to make.
	// Checking the validation as well to make sure that the user enter the right
	// choice

	public int displayaskmatrices(String prompt) {

		int numb = 0; // variable to store the input
		boolean valid = false; // inicializing the boolean to use the do/while loop!

		Scanner myScanner = new Scanner(System.in); // reading the input 

		do { // inicialing the do/while loop

			try {
				System.out.println(prompt); // inicialing the do/while loop
				numb = myScanner.nextInt();
				// saving input enter

				if (numb > 5) {
					// not good
					System.out.println("Sorry - must be 1 to 5");
					System.out.println(" ");
					System.out.println("Let's try Again: ");
					System.out.println("_______________________");
					System.out.println(" ");
					valid = false;
				} else if (numb < 1) {
					// not good
					System.out.println("Sorry - must be 1 to 5");
					System.out.println(" ");
					System.out.println("Let's try Again: ");
					System.out.println("_______________________");
					System.out.println(" ");
					valid = false;
				}

				else {
					// OK
					valid = true; // will stop the loop
				}

			} catch (Exception e) { // checking if the user don't enter letters.

				System.out.println("Unfurtunately you are not allowed to use letters!");
				System.out.println("Please try again");
				System.out.println("____________________________ ");
				System.out.println(" ");

				valid = false; // no good
			}

		} while (!valid); // validating the looop
		return numb; // return the input

	}
	// This method is to work on the user input number make sure that the user is
	// going to enter the right option,
	// and than go inside the Switch method called displayshowchoice.

	public int asktoexit() {

		int numb = 0;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Thank you very much see you next time!");

		numb = myScanner.nextInt();

		return numb;
	}
	// This method is to QUIT the program/ The word QUIT is prompt inside the
	// methods displaymatrices and displayoperation
	// This method is being called from 2 methods named
	// displayshowoperationfile1(case 6) and displayshowoperationfile1(case 6).

	public static void main(String[] args) throws IOException {

		new matrix();
		// calling the class
	}

}
