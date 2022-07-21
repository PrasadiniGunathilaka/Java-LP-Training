package prototype_design_pattern;

public class PhoneMain {
	public static void main(String[] args) {
        Registry registry = new Registry();

        SmartPhone smartPhone = (SmartPhone) registry.getPhone(PhoneType.SMARTPHONE);
        System.out.println(smartPhone);

        SmartPhone smartPhone1 = (SmartPhone) registry.getPhone(PhoneType.SMARTPHONE);
        System.out.println(smartPhone1);
        smartPhone1.setMemoryCapacity("64GB");
        System.out.println(smartPhone1);
    }

}
