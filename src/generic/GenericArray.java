package generic;

public class GenericArray<Q extends Number> {
    private Q[] someArray;

    public GenericArray(Q[] someArray) {
        this.someArray = someArray;
    }

    public MinMax<Q> getMinMax(){
        return new MinMax<>(someArray[0], someArray[someArray.length-1]);
    }
}
