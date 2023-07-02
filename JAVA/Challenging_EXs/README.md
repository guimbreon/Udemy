# Challeging Exercises

Here are the best exercises from the course (according to me of course)


## Table of Contents
- [Coding Exercise 24](#coding-exercise-24)
- [Coding Exercise 29](#coding-exercise-29)


## [Coding Exercise 24](../Section6/src/CodingExercise24.java):

Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print "Invalid Value".

To print the number as words, follow these steps:

1. Extract the last digit of the given number using the remainder operator. 
2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
3. Remove the last digit from the number.
4. Repeat Steps 2 through 4 until the number is 0.

The logic above is correct, but in its current state, the words will be printed in reverse order. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four". To overcome this problem, write a second method called reverse.

The method reverse should have one int parameter and return the reversed number (int). For example, if the number passed is 234, then the reversed number would be 432. The method  reverse should also reverse negative numbers.

Use the method reverse within the method numberToWords in order to print the words in the correct order.

Another thing to keep in mind is any reversed number with leading zeroes (e.g. the reversed number for 100 is 001). The logic above for the method numberToWords will print "One", but that is incorrect. It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.

The method getDigitCount should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.
For example, if the number has a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).

Example Input/Output - getDigitCount method

* getDigitCount(0); should return 1 since there is only 1 digit

* getDigitCount(123); should return 3

* getDigitCount(-12); should return -1 since the parameter is negative

* getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

* reverse(-121); should  return -121

* reverse(1212); should return  2121

* reverse(1234); should return 4321

* reverse(100); should return 1

Example Input/Output - numberToWords method

* numberToWords(123); should print "One Two Three".

* numberToWords(1010); should print "One Zero One Zero".

* numberToWords(1000); should print "One Zero Zero Zero".

* numberToWords(-12); should print "Invalid Value" since the parameter is negative.


HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example, 100 reversed becomes 1, but the method numberToWords should print "One Zero Zero". To get the number of zeroes, check the difference between the digit count from the original number and the reversed number. 

NOTE: When printing words, each word can be in its own line. For example, numberToWords(123); can be:

One
Two
Three

They don't have to be separated by a space.

NOTE: The methods numberToWords, getDigitCount, reverse should be defined as public static like we have been doing so far in the course.
NOTE: In total, you have to write 3 methods.

NOTE: Do not add a main method to the solution code.

## [Coding Exercise 29](../Section6/src/CodingExercise29.java)

Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

1. Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.

The second parameter should be named height of type double. This parameter represents the height of the wall.

The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.

The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.


Examples of input/output:

*getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid

*getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.

*getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.



2. Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.

Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).

This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.


Examples of input/output:

*getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid

*getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.

*getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.


3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.

Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.


Examples of input/output:

*getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

*getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

*getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .

Do your best to help Bob.


NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it into an int before returning the value from the methods.

NOTE: All methods should be defined as public static like we have been doing so far in the course.

NOTE: Do not add the main method to the solution code.

