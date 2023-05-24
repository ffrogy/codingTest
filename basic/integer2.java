class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = Integer.toString(a)+Integer.toString(b);
        
        int intA = Integer.parseInt(str);
        int mul = 2*a*b;
        
        if(intA>mul){
            answer = intA;
        } else if(intA<mul){
            answer = mul;
        } else {
            answer = intA;
        }
        return answer;
    }
}
