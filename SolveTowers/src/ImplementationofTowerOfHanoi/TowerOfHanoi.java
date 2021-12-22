package ImplementationofTowerOfHanoi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TowerOfHanoi {
    private final int totalDisks;
    // Declare a field step to keep the number of steps in the process.
    private int step = 1 ;
    // Declare a list to store the pegs that it can represent the pegs, which will let it printed easily.
    private final List<LinkedList<Integer>> pegs = new ArrayList<>(3);

    //  Sets up the puzzle with the specified number of disks.
    public TowerOfHanoi(int disks) {
        totalDisks = disks;
    //For loop to initialize the list of peg.
        for (int i = 0; i < 3; i++) {
            pegs.add(new LinkedList<>());
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial call to moveTower to solve the puzzle.
    //  Moves the disks from tower 1 to tower 3 using tower 2.
    //-----------------------------------------------------------------
    //Method Solve
    public void solve()
    {
        //Add disks on the peg0.
        //Pegs numbered from 0 to 2 while passing the actual parameters.
        //Actual parameters for start, end and temp.
        LinkedList<Integer> peg0 = pegs.get(0);
        peg0.add(3);
        peg0.add(2);
        peg0.add(1);
        System.out.println("Initially:");
        printState();
        moveTower(totalDisks,0,2,1);
    }

    //-----------------------------------------------------------------
    //  Moves the specified number of disks from one tower to another
    //  by moving a subtower of n-1 disks out of the way, moving one
    //  disk, then moving the subtower back. Base case of 1 disk.
    //-----------------------------------------------------------------
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if (numDisks == 1)
            moveOneDisks(numDisks, start, end);
        else
        {
            moveTower(numDisks-1,start,temp,end);
            moveOneDisks(numDisks,start,end);
            moveTower(numDisks-1,temp,end,start);
        }
    }

    //-----------------------------------------------------------------
    //  Prints instructions to move one disk from the specified start
    //  tower to the specified end tower.
    //-----------------------------------------------------------------
    //In moveOneDisks, it gets the count step and prints step number with the message.
    private void moveOneDisks(int numDisks,int start,int end)
    {
        System.out.println("Step " + step++ + ": Move disk" + numDisks + " from peg" + start + " to peg" +end +" resulting");
        pegs.get(end).add(pegs.get(start).removeLast());
        printState();
    }

    //This is a method to print the state of the towers.
    private void printState(){
        int i = 0;
        for(LinkedList<Integer> peg : pegs){
            System.out.print("peg" + i++ + ": ");
            for(int j = 0; j < 3; j++){
                try{
                    System.out.print(peg.get(j) + " ");
                }
                catch (Exception e){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
