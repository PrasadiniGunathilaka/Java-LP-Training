package prototype_design_pattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<PhoneType, Phone> phones = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    private void initialize() {
       SmartPhone smartPhone = new SmartPhone();
       smartPhone.setSimType("Dual");
       smartPhone.setModel("Samsung");
       smartPhone.setMemoryCapacity("128GB");

        CellPhone cellPhone = new CellPhone();
        cellPhone.setSimType("Single Sim");
        cellPhone.setModel("Nokia");
        cellPhone.setSize("100");

        phones.put(PhoneType.SMARTPHONE, smartPhone);
        phones.put(PhoneType.CELLPHONE, cellPhone);
    }

    public Phone getPhone(PhoneType itemType) {
        Phone phone = null;
        try {
            phone = (Phone) phones.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return phone;
    }

}
