/*
0 0 
1 1
9  9 
35 8 
36 9  9 
37 10 1
38 11 2
39 12 3
40    4
41    5
...
44    
45    9
46    1
47    2


135  9
----
%8
24 0
25 1
26 2
27
28
29
30
31
32  0





*/
public class Solution3 {
    public int addDigits(int num) {
        return num - (num - 1) / 9 * 9;
    }
}