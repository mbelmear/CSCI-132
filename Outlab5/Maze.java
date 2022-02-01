package Outlab5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Maze {
    public String[][] maze;//making 2d array
    public int startX, startY;
    public Maze(String fileName) {

        this.maze = createMaze(fileName);

        startX = -1;
        startY = -1;
        int handX = -1, handY = -1;

        for (int x = 0; x < maze[0].length; x++){//checking to see where the starting point is on the left or right
            if (maze[0][x].equals(".")){
                startX = x;
                startY = 0;
                handX = startX-1;
                handY = startY;
                break;
            }
            if (maze[maze.length -1][x].equals(".")){
                startX = x;
                startY = maze.length -1;
                handX = startX+1;
                handY = startY;
                break;
            }
        }

        for (int y = 0; y < maze.length; y++){//checking to see where the starting point is on the top or bottom
            if (maze[y][0].equals(".")){
                startX = 0;
                startY = y;
                handX = startX;
                handY = startY+1;
                break;
            }
            if (maze[y][maze[y].length -1].equals(".")){
                startX = maze[y].length - 1;
                startY = y;
                handX = startX;
                handY = startY-1;
                break;
            }
        }

        if (startX != -1 && startY != -1){
           solve(startX, startY, handX, handY, false);
        }



    }

    public void solve(int xLoc, int yLoc, int handX, int handY, boolean visitedStart) {//method to get through the maze
        printMaze(xLoc, yLoc);
        if (visitedStart && xLoc == startX && yLoc == startY) {
            System.out.println("Died of hunger!!!!");
            return;
        }
        if (this.maze[yLoc][xLoc].equals("F")) {
            return;
        } else {
            maze[yLoc][xLoc] = "X";
        }
        if (this.maze[handY][handX].equals("#")){//if the agents hand is on the wall, keep moving forward until there is a wall blocking his path
            //rotate left
            int newHandX = handX;
            int newHandY = handY;
            if (handX == xLoc + 1){
                newHandY = yLoc - 1;
                newHandX = xLoc;
            }else if (handX == xLoc - 1){
                newHandY = yLoc + 1;
                newHandX = xLoc;
            }else if (handY == yLoc + 1){
                newHandY = yLoc;
                newHandX = xLoc + 1;
            }else if (handY == yLoc - 1){
                newHandY = yLoc;
                newHandX = xLoc - 1;
            }
            solve(xLoc, yLoc, newHandX, newHandY, visitedStart);

        }
        else if (this.maze[handY][handX].equals(".")||this.maze[handY][handX].equals("F")||this.maze[handY][handX].equals("X")) { //otherwise keep going unless the agent hits the finish and mark his path with an X
            int newHandX = handX;
            int newHandY = handY;
            int newXLoc = handX;
            int newYLoc = handY;
            boolean newVisitedStart = xLoc == startX && yLoc == startY || visitedStart;
            if (handX == xLoc + 1) {
                newHandY = newYLoc + 1;
                newHandX = newXLoc;
            } else if (handX == xLoc - 1) {
                newHandY = newYLoc - 1;
                newHandX = newXLoc;
            } else if (handY == yLoc + 1) {
                newHandY = newYLoc;
                newHandX = newXLoc - 1;
            } else if (handY == yLoc - 1) {
                newHandY = newYLoc;
                newHandX = newXLoc + 1;
            }
            solve(newXLoc, newYLoc, newHandX, newHandY, newVisitedStart);
        }
        /*
        if maze[handX][handY] == dot, then turn agent right and move forward.

        if maze[handX][handY] == wall and theres a dot in front, move forward.

        if theres a wall in front and maze[handX][handY]==wall, then turn left and dont move

         */
    }

    public String[][] createMaze(String fileName) {//method that parses maze from a text file as a 2d array
        //TODO:: parse maze from text file into 2d string array
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(fileName)));
        } catch (Exception e) {
            return null;
        }
        ArrayList<String[]> maze = new ArrayList<String[]>();
        while (sc.hasNextLine()) {
            String currLine = sc.nextLine();
            ArrayList<String> currMazeLine = new ArrayList<String>(Arrays.asList(currLine.split(" ")));
            currMazeLine.remove(0); // Remove empty string at start of list

            String[] currMazeLineArr = new String[currMazeLine.size()];
            currMazeLineArr = currMazeLine.toArray(currMazeLineArr);
            maze.add(currMazeLineArr);
        }

        String[][] mazeArr = new String[maze.size()][];

        mazeArr = maze.toArray(mazeArr);

        return mazeArr;
    }

    public void printMaze(int xLoc, int yLoc) {//printing the maze as a 2d array
        //TODO:: string representation of our maze
        // turn this.maze into a string and return it

        for (int y = 0; y < this.maze.length; y++){
            for (int x = 0; x < this.maze[y].length; x++){
                String currentCell = this.maze[y][x];
                if(y == yLoc && x == xLoc){
                    currentCell = "O";
                }
                System.out.print(currentCell + " ");//separating each character in the maze by an empty space
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {//calling our methods and solving different mazes
        System.out.println("MAZE 1:");
        Maze m = new Maze("mazes/mazes/maze1.txt");
        System.out.println("MAZE 2:");
        m = new Maze("mazes/mazes/maze2.txt");
        System.out.println("MAZE 3:");
        m = new Maze("mazes/mazes/maze3.txt");
        System.out.println("MAZE 4:");
        m = new Maze("mazes/mazes/maze4.txt");
        System.out.println("MAZE 5:");
        m = new Maze("mazes/mazes/maze5.txt");
        System.out.println("MAZE 6:");
        m = new Maze("mazes/mazes/maze6.txt");
        System.out.println("MAZE 7:");
        m = new Maze("mazes/mazes/maze7.txt");

    }


}
