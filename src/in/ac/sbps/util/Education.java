/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.util;

/**
 *
 * @author mahavir.singh
 */
public enum Education {
    MCA("M.C.A."), MSC("M.Sc."), BED("B.Ed."), BSC("B.Sc.");
    
    private String education;
    
    private Education(String education) {
        this.education = education;
    }
}
