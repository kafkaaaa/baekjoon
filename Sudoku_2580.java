package stepbystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Back Tracking
// DFS (Depth First Search)

public class Sudoku_2580 {
	
	static int[][] sudoku = new int[9][9];
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		completeSudoku(0, 0);				
	}
			
			
	static void completeSudoku(int row, int col) {
		
		if (col == 9) {
			completeSudoku(row+1, 0);
			return;
		}
		
		if (row == 9) {
			showArr(sudoku);
			System.exit(0);
		}
		
		if (sudoku[row][col] == 0) {
			
			for (int num = 1; num <= 9; num++) {
				if (isPossible(row, col, num)) {
					sudoku[row][col] = num;
					completeSudoku(row, col+1);
				}
			}
			sudoku[row][col] = 0;
			return;
		}
		completeSudoku(row, col+1);
	}


	static boolean isPossible(int row, int col, int x) {
		
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == x) {		// check Rows
				return false;
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == x) {		// check Columns
				return false;
			}
		}
		
		int row3x3 = (row / 3) * 3;
		int col3x3 = (col / 3) * 3;
		
		for (int i = row3x3; i < row3x3 + 3; i++) {			// check 3x3 Rectangle
			for (int j = col3x3; j < col3x3 + 3; j++) {
				if (sudoku[i][j] == x) {
					return false;
				}
			}
		}
		
		return true;
	}

	
	static void showArr(int[][] array) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sb.append(sudoku[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
