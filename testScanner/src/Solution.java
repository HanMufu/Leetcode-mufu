import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arr = input.split(",");
        int colNum = Integer.parseInt(arr[0]);
        int rowNum = Integer.parseInt(arr[1]);
        String[][] garden = new String[rowNum][colNum];
        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                garden[i][j] = "B";
            }
        }
        for(int i = 0; i < rowNum; i++) {
            for(int j = 0; j < colNum; j++) {
                System.out.print(garden[i][j]);
            }
            if(i != rowNum - 1) {
                System.out.println();
            }
        }

//        while(scan.hasNextLine()) {
//            String i = scan.nextLine();
//
//        }
    }
}
