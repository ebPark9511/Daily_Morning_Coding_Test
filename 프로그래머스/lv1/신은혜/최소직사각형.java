package 프로그래머스.lv1.신은혜;

class Solution {
    
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
               maxH=Math.max(maxH,sizes[i][0]);
               maxW=Math.max(maxW,sizes[i][1]);
            }
            else{
                maxH=Math.max(maxH,sizes[i][1]);
                maxW=Math.max(maxW,sizes[i][0]);
            }
        }
        
        return maxW*maxH;
    }
}