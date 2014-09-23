/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.util;

/**
 *
 * @author mahavir.singh
 */
public enum SClass {
    XII("12th"), XI("11th"), X("10th"), IX("9th");
    
    private String sClass;
    
    private SClass(String sClass) {
        this.sClass = sClass;
    }
    
    /**
    @Override
    public String toString() {
        return sClass;
    }*/
    
    public static String enumToString(SClass classEnum) {
        return classEnum.sClass;
    }
    
    public static SClass classValueOf(String sClass) {
        for (SClass sEnum : SClass.values()) {
            if (sEnum.sClass.equals(sClass)) {
                return sEnum;
            }
        }
        return null;
    }
}
