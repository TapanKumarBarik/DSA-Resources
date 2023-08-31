## Overview

Whenever we are thinking of a solution to a problem, there can be **N** number of solutions. For instance, any problem can be solved in multiple different ways. But the Question that arises here is, how can we recognize the most efficient solution if we have a set of different solutions?

To answer this question let us understand **What is Time Complexity?** Through this article we shall also cover the different notations to calculate time complexity.

Let us consider a simple example to understand what we we are trying to figure out. Let us say we want to find square of a number. Now to check that let us suppose we have two approaches. The first approach towards this problem would be to simply use the mathematical operator **\*** to find the square.

On the other hand, the second approach towards finding the solution would be to run a loop of **'n'** times which starts with the number **'n'** and then we gradually keep adding **'n'** to it everytime. Now it is clearly understood that if we execute both the approach, both will take different time to execute and give output. And in this case, the first approach will take less time and hence is said to be the efficient way.

## Takeaways

**Time complexity** can be defined as the amount of time taken by an algorithm to execute each statement of code of an algorithm till its completion with respect to the function of the length of the input

## What is Time Complexity?

To answer this question first we must keep in mind that for number of problems that must be solved using an algorithm, there can be infinte number of solutions. And it then becomes important to do the analysis of algorithms to find the most efficient solution for solving that problem.

Now to know which solution is the most efficient one, the concept of space and time complexity of algorithms comes into picture.

The Space and Time complexity can be defined as a measurement scale for algorithms where we compare the algorithms on the basis of their Space (i.e. the amount of memory it utilises ) and the Time complexity (i.e. the number of operations it runs to find the solution).

There can more than one way to solve the problem in programming, but knowing how which of the algorithm works efficiently and hence, can add value to the way we do programming .

So, in order to dive deep to find the effectiveness of the program, we must know how to evaluate them using the Space and Time complexity. This use of Space and Time complexity can help us make the program behave according to the required optimal conditions, which in some way makes us an efficient programmers too. As with this module we are focussing more on the Time Complexity domain let us take a look at the definition of the same.

**Time Complexity Definition:** The Time complexity can be defined as the amount of time taken by an algorithm to execute each statement of code of an algorithm till its completion with respect to the function of the length of the input.

The **Time complexity** of algorithms is most commonly expressed using the big **O** notation. It's an asymptotic notation to represent the time complexity. We will study about it in detail in the next tutorial.

The **Time Complexity** can also be elaborated by estimating the counts of the number of elementary steps that are performed by any algorithm to finish the execution. As we saw in above example where we shared the two approaches to find a square of a number, then with the first approach the time taken will remain constant while for the second it varies with respect to the **'n'** that runs on the loop to give an output.

It should also be noted that as the algorithm's performance varies with respect to the multiple types of input data, so we usually we also keep a check for the worst-case scenario for an algorithm so that we are well aware of the maximum time taken for any input size.

Summing up above points, we can concude that the time complexity is explained as the number of operations an algorithm performs in order to complete a task with respect to the size of the input. And to find out which algorithm must be considered as the most efficient one, we pick the one which takes the smallest number of operations in terms of the time complexity.

## Asymptotic Notations

Now we shall we understanding the Notations of Time Complexity. There are major 3 notations which we will hear about.

- **Big O(expression)** : The **Big-O** notation is used to define if the set of functions is going to grow slower than or at the same rate with respect to the expression. This is how we define the worst case of an algorithm's time complexity. This also elaborates on the the maximum amount of time required by an algorithm considering all input values.
- **Omega(expression)** The Omega notation is used to define if the set of functions is going to grow faster than or at the same rate with respect to the expression. This is how we define the best case of an algorithm's time complexity. This also elaborates on the the minimum amount of time required by an algorithm considering all input values.
- **Theta(expression)** The Theta notation is used to define consist if the set of functions is going to lie in both **O(expression)** and **Omega(expression)**. This is how we define the average case of an algorithm's time complexity. This also elaborates average bound of an algorithm.

**NOTE:**

We can understand that when we do something with every item in one dimension its considered linear, in two dimensions its considered quadratic, and keep dividing the sample space in half is considered logarithmic.

## Time Complexity of Sorting Algorithms

The Time complexity of sorting algorithms can be elaborated as the best posiible way to pick out the best sorting technique in a situation. Understanding the time complexities with respect to the sorting algorithms can help us in picking up the best sorting technique, listed below are few of them:

1. **The Time Complexity of Insertion Sort:** The time complexity of **Insertion Sort** is **Ω(n)** in its best case possible and **O(n^2)** in its worst case possible. It has been observed that for very small **'n'** ,the Insertion Sort is faster than more efficient algorithms such as Quick sort or Merge Sort.
2. **The Time Complexity of Merge Sort:** The time complexity of **Merge Sort** is **Ω(nlogn)** in its best case possible and **O(nlogn)** in its worst case possible. This can be explained as in merge sort implements the same number of sorting steps for all kinds of cases. Out of all the sorting technique, the merge sort has the most stable time complexity for all kinds of cases because the steps which are executed for all kinds of cases are same.
3. **The Time Complexity of Quick Sort:** The time complexity of **Quick Sort** is **Ω(nlogn)** in its best case possible and **O(n^2)** in its worst case possible. As we know [QuickSort](https://www.scaler.com/topics/data-structures/quick-sort-algorithm/) is a Divide and Conquer algorithm where the element is picked as a pivot and partitions are made on the given array around the picked pivot. This makes it the fastest of the sorting algorithms as due to its performance in best case and alos in average cases are said to of **O(nlogn)** .
4. **The Time Complexity of Bubble Sort:** The time complexity of **Bubble Sort** is **Ω(n)** in its best case possible and **O(n^2)** in its worst case possible. As is widely known that the The Time Complexity of Bubble Sort is a reliable sorting algorithm as runs through the list repeatedly, compares adjacent elements, and swaps them if they are out of order. This process is repeated until the list is sorted and hence, this is also considered the simplest sorting algorithm.

## Time Complexity of Searching Algorithms

The **Time complexity** of searching algorithms can be elaborated as checking for an element or retrieving an element from any data structure where it was once stored. Understanding the time complexities with respect to the searching algorithms can help us in picking up the best searching technique and analyse which of them is faster, listed below are few of them:

1. **The Time Complexity of Linear Search:** The Time Complexity of **Linear Search** has the best case defined by **Ω(1)** and the worst case defined by **O(n)** . Here we can see that the Linear Search follows the sequential access.
2. **The Time Complexity of Binary Search:** The Time Complexity of **Binary Search** has the best case defined by **Ω(1)** and the worst case defined by **O(log n)** . Binary Search is the faster of the two searching algorithms. However, for smaller arrays, linear search does a better job.

### Example to demonstrate the Time complexity of searching algorithms:

let us dive deep into this following example to understand more on the Time complexity of searching algorithms. Here we shall be comparing two different algorithms which were used to solve a problem. Now the problem that we are talking here is searching.

Let us assume here that we have a sorted array in ascending order and we need to search for a particular element in this array. Now to solve this problem we have two algorithms:

```
1. Linear Search.
2. Binary Search.
```

Consider an array which contains five elements, and we have to find the number **24** in the array.

<pre><div class="code-box_snippetContainer__cJ6zK"><pre><code class="language-bash"><span>const array = [3, 7, 11, 21, 24];
</span>const search_value = 24;
</code></pre><button type="button" class="btn-icon cursor code-box_copyIcon__nChUJ" data-for="copy" data-tip="Copied" data-place="left" data-effect="solid" data-event="click" data-scroll-hide="true" data-iscapture="true" currentitem="false"><svg fill="currentColor" class="code-box_copy_icon__87vHM" version="1.1" xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32"><path d="M25.629 27.591v-18.051h-14.127v18.051h14.127zM25.629 7.005q1.026 0 1.811 0.755t0.785 1.781v18.051q0 1.026-0.785 1.811t-1.811 0.785h-14.127q-1.026 0-1.811-0.785t-0.785-1.811v-18.051q0-1.026 0.785-1.781t1.811-0.755h14.127zM21.766 1.813v2.596h-15.455v18.051h-2.536v-18.051q0-1.026 0.755-1.811t1.781-0.785h15.455z"></path></svg><div class="__react_component_tooltip t7407ba07-2832-4974-a491-121193b54de8 place-top type-dark" id="copy" data-id="tooltip"></div></button></div></pre>

Now when we search via the [Linear search algorithm](https://www.scaler.com/topics/data-structures/linear-search-algorithm/), it will compare each element of the array to the specific **search_value** . Now when the **search_value** is found, it shall return true. Seems simple right!

Now let’s analyse the count of the number of operations that it needs to performs to return its output. We find the answer to this as **5** as it compares every element of the array one by one. We can now say that by **linear search** it uses five operations (the maximum number of operations) to find the given element. This is also the worst case of an algorithm in the case of **Linear search**.

Summing up, The **Linear search** takes 'n' (where n is the size of the array) number of operations in its worst case.

Now Let’s examine the [Binary search algorithm](https://www.scaler.com/topics/data-structures/binary-search-algorithm/) by diving deep into a simple example.

<pre><div class="code-box_snippetContainer__cJ6zK"><pre><code class="language-bash"><span>const array = [3, 7, 11, 21, 24, 36, 47, 61, 99];
</span>const search_value = 21;
</code></pre><button type="button" class="btn-icon cursor code-box_copyIcon__nChUJ" data-for="copy" data-tip="Copied" data-place="left" data-effect="solid" data-event="click" data-scroll-hide="true" data-iscapture="true" currentitem="false"><svg fill="currentColor" class="code-box_copy_icon__87vHM" version="1.1" xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32"><path d="M25.629 27.591v-18.051h-14.127v18.051h14.127zM25.629 7.005q1.026 0 1.811 0.755t0.785 1.781v18.051q0 1.026-0.785 1.811t-1.811 0.785h-14.127q-1.026 0-1.811-0.785t-0.785-1.811v-18.051q0-1.026 0.785-1.781t1.811-0.755h14.127zM21.766 1.813v2.596h-15.455v18.051h-2.536v-18.051q0-1.026 0.755-1.811t1.781-0.785h15.455z"></path></svg><div class="__react_component_tooltip t95acce50-bffb-49dd-9f1b-f590a9848922 place-top type-dark" id="copy" data-id="tooltip"></div></button></div></pre>

Now for the given array , if we were to find the **search_value** then by the binary search algorithm we first check the middle of the array. Now as middle of array is **24**, we then check **24>21** so we start searching left, then by searching elements to the left we see that we will find the number say **7**, then as **7<21** then we start searching to the desired element and once we see **21**, then we compare **21=21**.

We see that when we count number of operations binary search took to find the desired element was four operations. This justify that there is a logarithmic approach for the binary search.

<pre><div class="code-box_snippetContainer__cJ6zK"><pre><code class="language-bash"><span>number of operations = </span><span>log</span><span>(10) = 4(approx)
</span><span></span><span>for</span><span> base 2
</span></code></pre><button type="button" class="btn-icon cursor code-box_copyIcon__nChUJ" data-for="copy" data-tip="Copied" data-place="left" data-effect="solid" data-event="click" data-scroll-hide="true" data-iscapture="true" currentitem="false"><svg fill="currentColor" class="code-box_copy_icon__87vHM" version="1.1" xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32"><path d="M25.629 27.591v-18.051h-14.127v18.051h14.127zM25.629 7.005q1.026 0 1.811 0.755t0.785 1.781v18.051q0 1.026-0.785 1.811t-1.811 0.785h-14.127q-1.026 0-1.811-0.785t-0.785-1.811v-18.051q0-1.026 0.785-1.781t1.811-0.755h14.127zM21.766 1.813v2.596h-15.455v18.051h-2.536v-18.051q0-1.026 0.755-1.811t1.781-0.785h15.455z"></path></svg><div class="__react_component_tooltip t13ccaa25-2645-4ac0-bd51-c81c559a9efc place-top type-dark" id="copy" data-id="tooltip"></div></button></div></pre>

Standard representation when we search through binary search algorithm can be represented as ,

For an array of size **n** , the number of operations performed by the Binary Search is: **log(n)**

## How to Compare Algorithms?

When we want to find out what are the parameters to compare algorithms in the time complexity domain, listed below are the three points which must be evaluated to compare the algorithms:

**1. The Execution Time:** The execution time can be one of the measure but majorly this also gets manipulated to the particular computer we are using so this measure can be one of the aspect but not the only aspect to define and compare algorithms.

**2. The number of statements executed:** The number of statements executed can too vary with respect to which expertise the programmer is having as well as the number of statements varies with the programming language. Again, this measure can be one of the aspect but not the only aspect to define and compare algorithms.

**3. The Ideal solution:** When we want to the express the running time of a given algorithm with respect to the function of the input size lets say , **'f(n)'** . Now to compare these different functions corresponding to running times we see that this type of comparison are independent of machine time, programming style, etc.

## Conclusion

1. The **Time complexity** can be defined as the amount of time taken by an algorithm to execute each statement of code of an algorithm till its completion with respect to the function of the length of the input.
2. The three important asymptotic notations of **Time complexity** are:
   **O** : This notations defines if functions grow slower than or at the same rate with respect to the expression.
   **Ω** : This notations defines if functions grow faster than or at the same rate with respect to the expression.
   **Θ** : This notations defines if functions' growth lie in both **O** and **Ω**.
3. The different types of Time complexity of sorting algorithms are:
   - **The Time Complexity of **Insertion Sort** :** The time complexity of Insertion Sort is **Ω(n)** in its best case possible and **O(n^2)** in its worst case possible.
   - **The Time Complexity of **Merge Sort** :** The time complexity of Merge Sort is **Ω(nlogn)** in its best case possible and **O(nlogn)** in its worst case possible.
   - **The Time Complexity of **Quick Sort**:** The time complexity of Quick Sort is **Ω(nlogn)** in its best case possible and **O(n^2)** in its worst case possible.
   - **The Time Complexity of **Bubble Sort** :** The time complexity of Bubble Sort is **Ω(n)** in its best case possible and **O(n^2)** in its worst case possible.
4. The **Time complexity** of searching algorithms can be elaborated as checking for an element or retrieving an element from any data structure where it was once stored.
5. The different types of **Time complexity** of searching algorithms are:
   a. **The Time Complexity of **Linear Search**:** The Time Complexity of Linear Search has the best case defined by **Ω(1)** and the worst case defined by **O(n)**.
   b. **The Time Complexity of **Binary Search**:** The Time Complexity of Binary Search has the best case defined by **Ω(1)** and the worst case defined by **O(log n)**.
