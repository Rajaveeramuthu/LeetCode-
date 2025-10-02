class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full=numBottles;
        int empty=0;
        int drunk=0;

        while(full>0){
            drunk +=full;
            empty +=full;
            full=0;
        

        while(empty >=numExchange){
            empty -= numExchange;
            full +=1;
            numExchange +=1;
        }
        }
        return drunk;
    }
}