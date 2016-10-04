import java.util.Scanner;

public class Rule30 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int x = number + 2;
		int[][] grid = new int[x][x];
		int middle = x / 2;
		for(int i = 0; i < x; i++) {
			grid[i][0] = 0;
		}
		grid[middle][0] = 1;
		x = x - 1;
		for(int j = 1; j < x; j++) {
			System.out.print(grid[j][0]);
		}
		System.out.println();
		generateGrid(grid, x);
	}

	public static void generateGrid(int[][] grid, int x){
		for(int posX = 1; posX < x - 1; posX++) {
			for(int posY = 1; posY < x; posY++) {
				if((grid[posY - 1][posX - 1] == 1) && (grid[posY][posX - 1] == 1) && (grid[posY + 1][posX - 1] == 1)) {
                        grid[posY][posX] = 0;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 1) && (grid[posY][posX - 1] == 1) && (grid[posY + 1][posX - 1] == 0)) {
                        grid[posY][posX] = 0;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 1) && (grid[posY][posX - 1] == 0) && (grid[posY + 1][posX - 1] == 1)) {
                        grid[posY][posX] = 0;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 1) && (grid[posY][posX - 1] == 0) && (grid[posY + 1][posX - 1] == 0)) {
                        grid[posY][posX] = 1;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 0) && (grid[posY][posX - 1] == 1) && (grid[posY + 1][posX - 1] == 1)) {
                        grid[posY][posX] = 1;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 0) && (grid[posY][posX - 1] == 1) && (grid[posY + 1][posX - 1] == 0)) {
                        grid[posY][posX] = 1;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 0) && (grid[posY][posX - 1] == 0) && (grid[posY + 1][posX - 1] == 1)) {
                        grid[posY][posX] = 1;
                        System.out.print(grid[posY][posX]);
                } else if((grid[posY - 1][posX - 1] == 0) && (grid[posY][posX - 1] == 0) && (grid[posY + 1][posX - 1] == 0)) {
                        grid[posY][posX] = 0;
                        System.out.print(grid[posY][posX]);
                }
			} 
			System.out.println();
		}
	}
}