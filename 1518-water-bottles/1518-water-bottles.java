class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drink=numBottles;
        int empty=numBottles;

        while(empty>=numExchange){
            int newDrink=empty/numExchange;
            drink += newDrink;
            empty=(empty%numExchange)+newDrink;
        }
      return drink;
    }
}