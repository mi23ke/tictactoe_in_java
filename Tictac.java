//Author: Mike Urbano
import java.io.*;
import java.util.*;

public class Tictac{
  public static void main(String args[]) throws IOException
  {
    char board[][] = new char[3][3];
    File input = new File("input.txt");
    Scanner lineScanner = new Scanner(input);
    while(lineScanner.hasNextLine()){
      Scanner charScan = new Scanner(lineScanner.nextLine());
      charScan.useDelimiter(" ");
       for(int i=0; i<3; i++){
          for(int j=0; j<3; j++){
            board[i][j] = charScan.next().charAt(0);
             System.out.print(String.valueOf(board[i][j]) + ' ');
          }
          System.out.println(' ');
       }
       char result = checkBoard(board);
       //System.out.println("The winner is: " + checkBoard(board));
       if( (Character.valueOf(result).compareTo(Character.valueOf('N'))) == 0 )
          System.out.println("There is no winner." + "\n");
       else System.out.println("The winner is: " + result + "\n");
     }
    //System.out.println("The winner is: " + checkBoard(board));
  }
  //function to check if there is a winner
  public static char checkBoard(char[][] board){
    char winner = 'N', player;
    boolean winCond = false;
    //check each row for a winner
    for(int i=0; i<3; i++){
      player = board[i][0];
      for(int j=1; j<3; j++){
        if( (Character.valueOf(player).compareTo(Character.valueOf(board[i][j])) ) == 0){
          winCond = true;
          }
        else {
          winCond = false;
          break;}
      }
      if (winCond == true){
        System.out.println("Player won by horizontal match.");
        return player;
      }
    }
   //check each column for a winner
    for(int j=0; j<3; j++){
      player = board[0][j];
      for(int i=1; i<3; i++){
        if( (Character.valueOf(player).compareTo(Character.valueOf(board[i][j])) ) == 0){
          winCond = true;
          }
        else {
          winCond = false;
          break; }
      }
      if (winCond == true){
        System.out.println("Player won by verticle match.");
        return player;
      }
    }
    //check forward diag
    player = board[0][0];
    for(int i=1; i<3; i++){
      if( (Character.valueOf(player).compareTo(Character.valueOf(board[i][i])) ) == 0){
        winCond=true;
      }
      else{
        winCond=false;
        break;
      }
    }
    if (winCond == true){
      System.out.println("Player won by forward diag match.");
      return player;
    }
    //check backward diag
    player = board[0][2];
    for(int i=1,j=1; i<3&&j>=0; i++,j--){
      if( (Character.valueOf(player).compareTo(Character.valueOf(board[i][j])) ) == 0){
        winCond = true;
      }
      else{
        winCond=false;
        break;
      }
    }
    if (winCond == true){
      System.out.println("Player won by backward diag match.");
      return player;
    }
    //if there is no winner, return N
    return 'N';
  }

}
