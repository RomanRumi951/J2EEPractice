package com.practice.hackerrank;

public class CatAndMouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int catA, int catB, int mouse) {
		if ((catA == mouse && catB == mouse) || catA == catB) {
			return "Mouse C";
		} else if (catA == mouse || catB == mouse) {
			return catA == mouse ? "Cat A" : "Cat B";
		} else if (catA != catB)
			return calculateMousePosition(catA, catB, mouse);
		return "";
	}

	static String calculateMousePosition(int catA, int catB, int mouse) {
		if ((mouse > catA && mouse > catB))
			return catA > catB ? "Cat A" : "Cat B";
		else if (mouse < catA && mouse < catB)
			return catA > catB ? "Cat B" : "Cat A";
		else if ((catA < mouse && mouse < catB) || (catA > mouse && catB < mouse)) {
			float midPosition = (float) (catA + catB) / 2;
			if (mouse - midPosition > 0) {
				return catA > catB ? "Cat A" : "Cat B";
			} else if (mouse - midPosition < 0) {
				return catA < catB ? "Cat A" : "Cat B";
			} else {
				return "Mouse C";
			}
		}
		return "";
	}

	public static void main(String[] args) {
//		int arr[][] = {{22,75,70}, {33,86,59}, {47,29,89}, {18,19,82}, {84,17,18}, {100,11,55}, {37,57,75}, {47,30,6}, {40,68,50}, {26,37,31}, {93,49,20}, {84,78,31}, {80,57,86}, {57,94,55}, {21,80,4}, {1,68,67}, {74,91,23}, {85,66,80}, {21,95,58}, {86,69,77}, {31,2,46}, {45,94,99}, {7,66,36}, {63,34,33}, {75,92,65}, {90,45,54}, {12,9,10}, {43,56,51}, {92,20,56}, {97,12,67}, {17,38,86}, {85,94,20}, {6,81,53}, {77,27,54}, {62,25,37}, {56,70,63}, {49,32,16}, {4,61,39}, {92,30,61}, {41,59,81}, {100,66,83}, {16,16,16}, {81,70,30}, {11,33,22}, {35,98,18}, {43,62,48}, {84,54,69}, {73,72,86}, {34,82,49}, {16,83,62}, {57,50,53}, {36,49,88}, {5,80,42}, {20,86,47}, {43,40,41}, {72,12,42}, {16,43,29}, {11,35,23}, {12,63,37}, {84,78,55}, {17,90,78}, {28,10,84}, {39,96,67}, {22,84,53}, {49,77,63}, {77,82,55}, {17,53,35}, {79,31,55}, {7,56,31}, {2,7,4}, {99,82,60}, {20,17,18}, {1,98,49}, {91,66,13}, {95,23,1}, {87,59,73}, {10,10,56}, {61,54,59}, {62,94,78}, {49,29,37}, {87,79,83}, {72,1,42}, {42,34,38}, {52,82,98}, {29,12,43}, {81,50,97}, {80,17,43}, {88,38,40}, {41,55,84}, {48,91,69}, {11,74,23}, {84,68,76}, {4,51,80}, {51,85,39}, {37,74,55}, {15,65,54}, {57,14,56}, {43,61,56}, {9,79,35}, {4,44,44}} ;
//		for (int row = 0; row<arr.length; row++) {
//			System.out.println(catAndMouse(arr[row][0], arr[row][1], arr[row][2]));
//		}
		
		System.out.println(catAndMouse(16, 16, 16));
	}

}
