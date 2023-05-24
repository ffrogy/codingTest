class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a)+Integer.toString(b);
        String str2 = Integer.toString(b)+Integer.toString(a);
        
        int intA = Integer.parseInt(str1);
        int intB = Integer.parseInt(str2);
        
        if(intA>intB){
            answer = intA;
        } else {
            answer = intB;
        }
        
        
        return answer;
    }
}
