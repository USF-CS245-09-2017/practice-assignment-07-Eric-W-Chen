# CS 245 (Spring 2019) Practice Assignment 07

Eric Chen

The linked list confused me at first because I didn't know that the head had to be set equal to null, but once I figured that out, I just set head equal to null and shifted everything over by 1. I was getting an error with the timing of the list at first as well due to a NullPointerException, however I realized that in the add function I wasn't checking to see if the list was empty. So, it was trying to assign data into something that was null. After setting the head equal to newNode if it was empty, it fixed the problem.

For the array list, I just implemented what we learned in class. However, I originally had a problem where I wasn't calling "growList" in the add function with 2 parameters, and I would get an error where it would say the growList wasn't working. However, once I saw that the test would call the add function with 2 parameters, I simply called growList inside of that function as well and fixed the problem.

See assignment details on Canvas.
