class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) { // 쿼리의 길이만큼 반복
            for (int j = queries[i][0]; j <= queries[i][1]; j++){ 
                // 각 쿼리의 s <= i <= e의 조건을 for문을 이용해 충족
                if( j % queries[i][2] == 0) { 
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
