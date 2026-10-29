package dpvi._abstracttablemodelexample.gui.tablemodels;

import dpvi._abstracttablemodelexample.dto.Alumn;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tpm_paucasesnovescif
 */
public class TableModelAlumns extends AbstractTableModel{

    private List<Alumn> alumnList;
    private String[] columns = {"Name", "Course"};
    
    public TableModelAlumns(List<Alumn> alumnList)
    {
        this.alumnList = alumnList;
    }
    
    @Override
    public int getRowCount() {
        return alumnList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return alumnList.get(rowIndex).getName();
            case 1: 
                return alumnList.get(rowIndex).getCourse();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
       return columns[column];
    }
    
    
    
}
