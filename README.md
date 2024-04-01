# Sorting Strings and Lists Within an Array

This project demonstrates sorting strings and their associated lists within a Java array.

## Problem Statement

The task is to:

1. Sort each individual string within a given array.
2. Sort the lists associated with each string.

For example, given the input array:

```java
["xL01(F]J","2pn5Mm","-5)8gF{","KWq0P]*%Q","n@,:\u003eAm@","\u003cRN_qCa7","8Qx\u0026RAON","gT~s!1s?4i{K","w\"r^d_#l$Mmp"]
```

The desired output is
 
```java
["(01FJL]x","25Mmnp",")-58Fg{","%*0KPQW]q",",:\u003e@@Amn","7\u003cCNR_aq","\u00268ANOQRx","!14?KTgiss{~","\"#$M^_dlmprw"]
```

## Approach
1. Sort Strings Individually:

Convert each string into a character array.
Use Arrays.sort() to sort the character array.
Reconstruct the sorted string from the sorted character array.
Handle Unicode Characters:

2. Replace specific Unicode characters (\u0026, \u003c, \u003e) with their corresponding escape sequences (\\uXXXX) to ensure accurate sorting.

3. Print Output:

Print the final array containing the sorted strings.

## Running the Code
1. Compile the Java code using a Java compiler.
2. Run the compiled Main class to execute the sorting process.
