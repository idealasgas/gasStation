public class GasStation {
    public String adress;
    public String company;
    private float money;

    public Warehouse[] warehouses;
    public FuelColumn[] fuelColumns;
    public FuelSupplySystem fuelSupplySystem;
    public Simulation simulation;
    public Operator[] operators;

    private boolean fillInTheWarehouse(Party[] parties){
        return true;
    }

    public void startABit() {
        return;
    }

    public int findFreeColumn() {
        int numberOfColumn = 1;
        return numberOfColumn;
    }
}
