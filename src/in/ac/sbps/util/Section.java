/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.util;

/**
 *
 * @author mahavir.singh
 */
public enum Section {
    A("Section A"), B("Section B");
    
    private String section;
    
    private Section(String section) {
        this.section = section;
    }
    
    @Override
    public String toString() {
        return section;
    }
    
    public static Section sectionValueOf(String sClass) {
        for (Section secEnum : Section.values()) {
            if (secEnum.toString().equals(sClass)) {
                return secEnum;
            }
        }
        return null;
    }
}
