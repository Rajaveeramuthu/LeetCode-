class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;   
        int empty = numBottles;  
        while (empty >= numExchange) {
            empty -= numExchange;  // exchange-க்கு கொடுக்கிறோம்
            drunk++;               // அந்த full bottle குடித்தோம்
            empty++;               // குடித்த bottle -> empty
            numExchange++;         // exchange requirement +1
        }

        return drunk;
    }
}
