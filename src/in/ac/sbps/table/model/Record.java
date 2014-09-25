/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.sbps.table.model;

/**
 *
 * @author mahavir.singh
 */
public class Record {

    static String[] headers = {"Record Number", "Batch Number", "Reserved"};
    static int counter;
    String[] data;

    public Record() {
        data = new String[]{"" + (counter++), "" + System.currentTimeMillis(),
            "Reserved"};
    }

    public String getValueAt(int i) {
        return data[i];
    }

    public static String getColumnName(int i) {
        return headers[i];
    }

    public static int getColumnCount() {
        return headers.length;
    }
}
