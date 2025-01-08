class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        arr = list(moves)
        cntl = 0
        cntr = 0
        cnt = 0
        for i in range (len(arr)):
            if arr[i] == 'L': cntl+=1
            if arr[i] == 'R' : cntr+=1
            if arr[i] == '_' : cnt+=1
        
        if cntl>cntr: return cntl+cnt-cntr
        else : return cntr+cnt-cntl
