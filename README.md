# TowersOfHanoi
TowersOfHanoi Project
Compile and run the JSS implementation of the
Tower of Hanoi. You should have three pegs (from left to right peg0, peg1, and
peg2). Disks however are (from the smallest to the largest) disk1, disk2, ..., diskn.
All the desks are stacked on peg0 initially. It is asked to move all disks from peg0
to peg2. The output for the program with 3 disks is:
Move one disk from 0 to 2
Move one disk from 0 to 1
Move one disk from 2 to 1
Move one disk from 0 to 2
Move one disk from 1 to 0
Move one disk from 1 to 2
Move one disk from 0 to 2

b) Revise your implementation to include stepwise states of the tower
Initially:
peg0: 3 2 1
peg1: 0 0 0
peg2: 0 0 0
Step 1: Move disk1 from peg0 to peg2 resulting
peg0: 3 2 0
peg1: 0 0 0
peg2: 1 0 0
Step 2: Move disk2 from peg0 to peg1 resulting
peg0: 3 0 0
peg1: 2 0 0
peg2: 1 0 0
Step 3: Move disk1 from peg2 to peg1 resulting
peg0: 3 0 0
peg1: 2 1 0
peg2: 0 0 0
Step 4: Move disk3 from peg0 to peg2 resulting
peg0: 0 0 0
peg1: 2 1 0
peg2: 3 0 0
Step 5: Move disk1 from peg1 to peg0 resulting
peg0: 1 0 0
peg1: 2 0 0
peg2: 3 0 0
Step 6: Move disk2 from peg1 to peg2 resulting
peg0: 1 0 0
peg1: 0 0 0
peg2: 3 2 0
Step 7: Move disk1 from peg0 to peg2 resulting
peg0: 0 0 0
peg1: 0 0 0
peg2: 3 2 1
