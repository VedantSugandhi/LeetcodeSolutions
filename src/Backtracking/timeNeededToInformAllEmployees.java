package Backtracking;

import java.util.Arrays;

public class timeNeededToInformAllEmployees {

        public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
            int maxTime=0;
            int[] memo = new int[n];

            Arrays.fill(memo, -1);
            memo[headID] = 0;

            for(int i=0;i<n;i++){
                if(i!=headID)
                    maxTime = Math.max(maxTime,calculateTime(manager,i,informTime,memo));
            }

            return maxTime;
        }

        public int calculateTime(int[] manager, int employee, int[] informTime, int[] memo){
            if(memo[employee] !=-1)
                return memo[employee];

            int mgr = manager[employee];

            memo[employee] = calculateTime(manager, mgr, informTime, memo) + informTime[mgr];

            return memo[employee];
        }

/*
memo[-1,-1,0,-1,-1,-1]
manager = [2,2,-1,2,2,2]
informTime = [0,0,1,0,0,0]
for i = 0 calculateTime([2,2,-1,2,2,2],0,[0,0,1,0,0,0],[-1,-1,0,-1,-1,-1])
    mgr = 2
    calculateTime([2,2,-1,2,2,2],2,[0,0,1,0,0,0],[-1,-1,0,-1,-1,-1])
        returns 0
    memo[0] = 1
    returs 1;
    maxTime = 1
for i = 1 calculateTime([2,2,-1,2,2,2],1,[0,0,1,0,0,0],[1,-1,0,-1,-1,-1])
    mgr = 2
    calculateTime([2,2,-1,2,2,2],2,[0,0,1,0,0,0],[1,0,0,-1,-1,-1])
        returns 0
    memo[1] = 0
    returns 0
    maxTime = 1
for i = 3 calculateTime([2,2,-1,2,2,2],3,[0,0,1,0,0,0],[1,0,0,-1,-1,-1])
    mgr = 2
    calculateTime([2,2,-1,2,2,2],2,[0,0,1,0,0,0],[1,0,0,-1,-1,-1])
        returns 0
    memo[3] = 0 + 0
    returns 0
    maxTime = 1
for i = 4 calculateTime([2,2,-1,2,2,2],3,[0,0,1,0,0,0],[1,0,0,0,-1,-1])
    mgr = 2
    calculateTime([2,2,-1,2,2,2],2,[0,0,1,0,0,0],[1,0,0,0,-1,-1])
        returns 0
    memo[4] = 0 + 0
    returns 0
    maxTime = 1
for i = 5 calculateTime([2,2,-1,2,2,2],3,[0,0,1,0,0,0],[1,0,0,0,0,-1])
    mgr = 2
    calculateTime([2,2,-1,2,2,2],2,[0,0,1,0,0,0],[1,0,0,0,0,-1])
        returns 0
    memo[5] = 0 + 0
    returns 0
    maxTime = 1

    final memo = [1,0,0,0,0,0]
*/
}
