- We start by adding a class called Node to create the BST.

- We then make a class for the BST to store all the functions to build the tree.

- The first function creates a node and makes data used for the node.

-  The second function inserts a node to the tree, this is shown in the main to create the tree. 

- The function "FindNode" finds a node in the tree the user wants to find, and returns nothing if it isnt there.

- The height function returns the height of the tree.

- The two functions minVal and maxVal returns the minimum and maximum node values in the tree.

- The nthLargest function returns the nth largest element in the tree, n being whatever the user types in for the variable.

- The next three functions do the tree traversals, being inOrder, postOrder, and preOrder.
    - inOrder sorts the elements in order.
    - postOrder sorts the elements from the root, to the left of the tree and then the right.
    - preOrder sorts the elements from the left, to the right, to the root of the tree.

- The two functions are for advanced searches, with depth first searches and breadth first searches.

- The delete function deletes an element from the tree.
    - The findMin function is used for the delete function.

- Main:
    - creates a BST.
    - creates a node.
    - inserts multiple roots.
    - Prints values:
        - inOrder
        - postOrder
        - preOrder
        - minVal
        - maxVal
        - Nth Largest
        - Depth First Search
        - Breadth First Search
        - deletes an element and reorganises it.