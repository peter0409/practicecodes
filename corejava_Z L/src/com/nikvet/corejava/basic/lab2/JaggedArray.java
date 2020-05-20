package com.nikvet.corejava.basic.lab2;

public class JaggedArray {

		/**
		 * Initalizing Array with values
		 * @return 2D Array
		 */
		public static String[][] initArray() {
			
			//declaring 2D Array
			String[][] studentsTutorial = new String[5][];
			studentsTutorial[0] = new String[4];
			studentsTutorial[1] = new String[4];
			studentsTutorial[2] = new String[3];
			studentsTutorial[3] = new String[3];
			studentsTutorial[4] = new String[4];
			
			//initializing Array First Row with titles
			studentsTutorial[0][0] = "Student Name";
			studentsTutorial[0][1] = "Tutorial1";
			studentsTutorial[0][2] = "Tutorial2";
			studentsTutorial[0][3] = "Tutorial3";
			
			//initializing Array Second Row with Values
			studentsTutorial[1][0] = "Tony";
			studentsTutorial[1][1] = "Java";
			studentsTutorial[1][2] = "C";
			studentsTutorial[1][3] = "C++";
			
			//initializing Array Third Row with Values
			studentsTutorial[2][0] = "Thomas";
			studentsTutorial[2][1] = "Java";
			studentsTutorial[2][2] = "Unix";
			
			//initializing Array Fourth Row with Values
			studentsTutorial[3][0] = "Dinil";
			studentsTutorial[3][1] = "Linux";
			studentsTutorial[3][2] = "Oracle";
			
			//initializing Array Fifth Row with Values
			studentsTutorial[4][0] = "Delvin";
			studentsTutorial[4][1] = "RDBMS";
			studentsTutorial[4][2] = "C#";
			studentsTutorial[4][3] = "Oracle";

			return studentsTutorial;
		}

		public static void main(String[] args) {
			String[][] studentsTutorial = initArray();
			
			//print only tutorials attended by Delvin
			System.out.print("Tutorials Attended by Delvin are: \n");
			for(int i = 1; i < 4; i++) {
				System.out.print(studentsTutorial[4][i] + ", ");
			}
			
			
		}

	}


