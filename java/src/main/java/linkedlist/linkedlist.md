
Reverse a link list:


             1    2 -> 3 -> 4 <- 5
          n <- 1 <- 2            p
prev = null                       p   c    n

T: O(n)

5 -> 4 -> 3 -> 2 -> 1 -> null


Merge Two Sorted List:
------------------------
list1 : 1 -> 2 -> 4 -> n
                  p
list2:  1 -> 3 -> 4 -> n
                       p
null -> 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> n


dummy: n
tail: n -> 1 -> 1

dummy - 0 -> 1 -> 3 -> 4
tail - 0 -> 1 -> 3 -> 4


----------------------------
head = 1, 2, 3, 4
output: 1 4 2 3


1 -> 2 -> 3 -> 4 -> 5
          s             f

- Find the midpoint with slow and fast pointer

---------------------
  d 1 2 3 4 5
        s     f


1 2 
  s  f


{
    7 : clonedNode(7)
    13 : clonedNode(13)
    11 : 11
    10 : 10
    1 : 1
}

---------------------------------
2 4 3
5 6 4
7 0 8

int carry = 0;
while (l1 != null || l2 != null) {
    
}