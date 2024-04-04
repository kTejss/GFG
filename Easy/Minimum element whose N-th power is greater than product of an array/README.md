<h2><a href="https://www.geeksforgeeks.org/problems/minimum-element-whose-n-th-power-is-greater-than-product-of-an-array4640/1?page=8&category=Mathematical&difficulty=Easy&sortBy=submissions">Minimum element whose N-th power is greater than product of an array</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of N<strong> </strong>numbers. the task is to find minimum positive integer which can be assigned to every array element such that product of all elements of this new array is strictly greater than product of all elements of the initial array.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> Arr[] = {4, 2, 1, 10, 6}
<strong>Output :</strong> 4

</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> Arr[] = {3, 2, 1, 4}
<strong>Output :</strong> 3</span></pre>
<pre><span style="font-size: 18px;"><strong>Explanation:
</strong>Here we have an array [3, 2, 1, 4]
Product of elements of initial
array 3*2*1*4 = 24.
If x = 3 then 3*3*3*3 = 81, if x = 2 
then 2*2*2*2 =16. So minimal element = 3.
</span></pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;">&nbsp;</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>findMin()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return the minimum required element. The driver code takes care of the printing.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(n * log(logn))<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>2 ≤ N ≤ 10<sup>6</sup><br>1 ≤ A[i] ≤ 10<sup>6</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematical</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;