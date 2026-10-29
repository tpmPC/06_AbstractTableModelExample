/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dpvi._abstracttablemodelexample.logic;

import dpvi._abstracttablemodelexample.dto.Alumn;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tpm_paucasesnovescif
 */
public class BusinessLogic {
    
    public List<Alumn> alumnsList = new ArrayList<>();
    
    public BusinessLogic()
    {
        alumnsList = new ArrayList<>();
        alumnsList.add(new Alumn("Pere", "ASIX2"));
        alumnsList.add(new Alumn("Joan", "DAM2"));
        alumnsList.add(new Alumn("Marc", "DAM1"));
    }
    
    public List<Alumn> getAlumnsList()
    {
        return alumnsList;
    }
    
    
    
    
}
