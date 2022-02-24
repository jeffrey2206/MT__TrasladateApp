/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.catering.controller;

import ec.edu.espe.catering.view.FrmCateringPlanner;
import javax.swing.JFrame;

/**
 *
 * @author Juan Diego
 */
public class FormsHandler {
    
        public static void goToMainScreen(JFrame jFrameToClose){
        FrmCateringPlanner frmCateringPlanner = new FrmCateringPlanner();
        jFrameToClose.setVisible(false);
        frmCateringPlanner.setVisible(true);
    }
    
}
