/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.translate.controller;

import ec.edu.espe.translate.view.FrmTranslateApp;
import javax.swing.JFrame;

/**
 *
 * @author Juan Diego
 */
public class FormsHandler {
    
        public static void goToMainScreen(JFrame jFrameToClose){
        FrmTranslateApp frmCateringPlanner = new FrmTranslateApp();
        jFrameToClose.setVisible(false);
        frmCateringPlanner.setVisible(true);
    }
    
}
