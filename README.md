# Building-Store

Given a rectangular grid containing houses built in some cells, find the number of empty cells at a distance of at most K to every house.

 

Task description

A retail store chain wants to expand into a new neighborhood. To maximize the number of clients, the new branch should be at a distance of no more than K from all the houses in the neighborhood. A is a matrix of size N x M, representing the neighborhood as a rectangular grid, in which each cell is either an integer 0 (an empty plot) or 1 (a house). The distance between two cells is calculated as the minimum number of cell borders (regardless of whether the cells on the way are empty or occupied) that one has to cross to move from the source to the target cell (without moving through corners). A store can be only built on an empty plot. How many suitable locations are there?

For example, given K = 2 and matrix A = [ [0, 0, 0, 0], [0, 0, 1, 0], [1, 0, 0, 1] ], houses are located in cells with coordinates (2, 3), (3, 1) and (3, 4). We can build a new store on two empty plots that are close enough to all the houses. The first possible empty plot is located at (3, 2). The distance to the first house at (2,3) is 2, the distance to the second house at (3, 1) is 1, and the third house at (3, 4) is at a distance of 2. The second possible empty plot is located at (3, 3). The distances to the first, second and third houses are respectively, 1, 2 and 1.

A[1] = 0000, A[2] = 0010, A[3] = 1001.
Cells at a distance of less than or equal to 2 from all houses are marked in yellow.

Write a function:

class Solution { public int solution(int K, int[][] A); }

which, given a positive integer K and matrix A of size N x M, returns the number of empty plots that are close enough to all the houses.

Examples:

1. Given K = 2 and A = [ [0, 0, 0, 0], [0, 0, 1, 0], [1, 0, 0, 1] ], the function should return 2, as explained above.

2. Given K = 1 and A = [ [0, 1], [0, 0] ], the function should return 2. We can build a store on empty plots at (1, 1) and (2, 2).

A[1] = 01, A[2] = 00.
Cells at a distance of less than or equal to 1 from all houses are marked in yellow.

3. Given K = 4 and A = [ [0, 0, 0, 1], [0, 1, 0, 0], [0, 0, 1, 0], [1, 0, 0, 0], [0, 0, 0, 0] ], the function should return 8. Stores can be built on the following plots: (1, 1), (1, 2), (2, 1), (2, 3), (3, 2), (3, 4), (4, 3) and (4, 4).

A[1] = 0001, A[2] = 0100, A[3] = 0010, A[4] = 1000, A[5] = 0000.
Cells at distance of less than or equal to 4 from all houses are marked in yellow.



·       K is an integer within the range [1..800];

·       N and M are integers within the range [2..400];

·       each element of matrix A is an integer within the range [0..1];

·       there is at least one house.

 
