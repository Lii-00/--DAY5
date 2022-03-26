/*
题目：#20
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。

*/

class Solution {
    public boolean isValid(String s) {
        int len = s.length();       
        char[] tmp_l = new char[len];       //用于存取s字符串中的左括号
        char ch;                            //记录字符串中的某一字符
        int count = 0;                      //用于判断字符串中左括号的个数及括号的左右顺序
        for(int i = 0; i < len; i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                tmp_l[count] = ch;
                count++;
                continue;
            }else{
                if(count == 0)return false;
                if(ch == ')' && tmp_l[count-1] == '('){
                    count--;
                    continue;
                }else if(ch == ']' && tmp_l[count-1] == '['){
                    count--;
                    continue;
                }else if(ch == '}' && tmp_l[count-1] == '{'){
                    count--;
                    continue;
                }else
                    return false;
            }
        }
        if(count == 0)
            return true;
        else
            return false;
    }
}