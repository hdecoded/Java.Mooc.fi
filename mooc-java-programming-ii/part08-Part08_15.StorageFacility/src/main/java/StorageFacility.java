import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storageUnit.get(storageUnit) == null || !this.storageUnit.containsKey(storageUnit)) {
            return new ArrayList<String>();
        }
        return this.storageUnit.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        this.storageUnit.get(storageUnit).remove(item);
        if (this.storageUnit.get(storageUnit).isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String storageUnit: this.storageUnit.keySet()){
            storageUnits.add(storageUnit);
        }

        return storageUnits;
    }
}
