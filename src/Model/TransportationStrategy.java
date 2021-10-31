/*
Author: Zegher Vereecke
 */

package Model;

//Dit is de context.
class TransportationStrategy {


    private Transportmethod strategy;

    public TransportationStrategy (){
        this.strategy = new Auto();
    }

    public Transportmethod getStrategy() {
        return strategy;
    }

    public void setStrategy(Transportmethod strategy) {
        this.strategy = strategy;
    }


}
