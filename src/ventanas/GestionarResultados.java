/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import gestor.GestionarFixtureGestor;
import gestor.GestorCD;
import modelo.CompetenciaAux;
import modelo.PartidoAux;
import modelo.RondaAux;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventObject;
import javax.swing.*;
import javax.swing.table.*;
import modelo.Resultado;
import modelo.ResultadoAux;

/**
 *
 * @author GabrielV
 */
public class GestionarResultados extends javax.swing.JPanel {
    CompetenciaAux compAux;
    RondaAux rondaAux;
    PartidoAux partidoAux;
    ArrayList<ResultadoAux> resultadosAnteriores;
    int cantSets;
    Boolean empatePermitido;
   
    /**
     * Creates new form GestionarResultados
     * @param param
     * @param param2
     * @param param3
     */
    public GestionarResultados(CompetenciaAux param, RondaAux param2, PartidoAux param3) {
        
        compAux=param;
        rondaAux=param2;
        partidoAux=param3;
        
        // AGREGADO
        // Buscar resultados de la BD, si los hubiera
        resultadosAnteriores = gestor.GestionarFixtureGestor.getResultados(partidoAux);
        cantSets = (int) GestionarFixtureGestor.getCantSets(compAux);
        empatePermitido = GestionarFixtureGestor.getEmpatePermitido(compAux);
        
        
        initComponents();
        
        
        verNombre();
        if(param3!=null){
            crearVentana();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        jSpinner17 = new javax.swing.JSpinner();
        jSpinner18 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gestionar Resultados:");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 55);

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(625, 268, 100, 30);

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(150, 268, 90, 30);

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setText("Menu P.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(48, 268, 90, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sports logo released.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(660, 539, 130, 50);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 23)); // NOI18N
        jLabel3.setText("Nombre Competencia");
        add(jLabel3);
        jLabel3.setBounds(240, 90, 480, 40);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 23)); // NOI18N
        jLabel1.setText("Competencia Seleccionada:");
        add(jLabel1);
        jLabel1.setBounds(55, 90, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Observacion: Si Desea Realizar Empate, ponga la misma puntuacion en ambos.");
        jLabel5.setVisible(false);
        add(jLabel5);
        jLabel5.setBounds(274, 314, 490, 40);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel6.setText("Participantes:");
        add(jLabel6);
        jLabel6.setBounds(10, 140, 160, 30);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel7.setText("Par. 1: Nombre Participante 1");
        add(jLabel7);
        jLabel7.setBounds(10, 160, 180, 60);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel8.setText("Par. 2: Nombre Participante 2");
        add(jLabel8);
        jLabel8.setBounds(10, 210, 170, 50);

        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(740, 171, 20, 40);

        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(739, 220, 21, 40);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Asistencia");
        add(jLabel9);
        jLabel9.setBounds(700, 134, 100, 40);
        add(jCheckBox3);
        jCheckBox3.setBounds(430, 170, 20, 40);
        add(jCheckBox4);
        jCheckBox4.setBounds(430, 220, 20, 40);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner1);
        jSpinner1.setBounds(179, 170, 50, 40);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner2);
        jSpinner2.setBounds(240, 170, 50, 40);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner3);
        jSpinner3.setBounds(300, 170, 50, 40);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner4);
        jSpinner4.setBounds(360, 170, 50, 40);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner5);
        jSpinner5.setBounds(420, 170, 50, 40);

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner6);
        jSpinner6.setBounds(480, 170, 50, 40);

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner7);
        jSpinner7.setBounds(540, 170, 50, 40);

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner8);
        jSpinner8.setBounds(600, 170, 50, 40);

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner9);
        jSpinner9.setBounds(660, 170, 50, 40);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner10);
        jSpinner10.setBounds(180, 220, 50, 40);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner11);
        jSpinner11.setBounds(240, 220, 50, 40);

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner12);
        jSpinner12.setBounds(300, 220, 50, 40);

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner13);
        jSpinner13.setBounds(363, 220, 47, 40);

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner14);
        jSpinner14.setBounds(420, 220, 50, 40);

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner15);
        jSpinner15.setBounds(480, 220, 50, 40);

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner16);
        jSpinner16.setBounds(540, 220, 50, 40);

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner17);
        jSpinner17.setBounds(600, 220, 50, 40);

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner18);
        jSpinner18.setBounds(660, 220, 50, 40);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1er Set");
        add(jLabel10);
        jLabel10.setBounds(180, 134, 50, 40);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("2do Set");
        add(jLabel11);
        jLabel11.setBounds(240, 134, 50, 40);

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3er Set");
        add(jLabel12);
        jLabel12.setBounds(300, 134, 50, 40);

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("4to Set");
        add(jLabel13);
        jLabel13.setBounds(360, 134, 50, 40);

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("5to Set");
        add(jLabel14);
        jLabel14.setBounds(360, 140, 160, 30);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("6to Set");
        add(jLabel15);
        jLabel15.setBounds(480, 134, 50, 40);

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("7mo Set");
        add(jLabel16);
        jLabel16.setBounds(538, 134, 50, 40);

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("8vo Set");
        add(jLabel17);
        jLabel17.setBounds(600, 134, 50, 40);

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("9no Set");
        add(jLabel18);
        jLabel18.setBounds(660, 134, 50, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_general.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<ResultadoAux> listaResultadosAux = new ArrayList<>();
        int indiceGanador = 0;
        Boolean asispar1 = jCheckBox1.isSelected();
        Boolean asispar2 = jCheckBox2.isSelected();
        String cadenaError = "";
        String formaPuntuacion = compAux.getFormaPuntuacion();
        
        if(asispar1 == false && asispar2 == false){
            cadenaError += "Debe haber presente al menos un Participante\n";
        }
        else if(asispar1==true && asispar2 ==true){
            if("Sets".equals(formaPuntuacion)){
                ArrayList<Integer> listaSets = new ArrayList<>();
                int contador1 = 0;
                int contador2 = 0;
                int unNumero = 0;
                int set1participante1 = 0;
                int set1participante2 = 0;
                int set2participante1 = 0;
                int set2participante2 = 0;
                int set3participante1 = 0;
                int set3participante2 = 0;
                int set4participante1 = 0;
                int set4participante2 = 0;
                int set5participante1 = 0;
                int set5participante2 = 0;
                int set6participante1 = 0;
                int set6participante2 = 0;
                int set7participante1 = 0;
                int set7participante2 = 0;
                int set8participante1 = 0;
                int set8participante2 = 0;
                int set9participante1 = 0;
                int set9participante2 = 0;
                
                
                if(cantSets >= 1){
                    set1participante1 = (int) jSpinner1.getValue();
                    set1participante2 = (int) jSpinner10.getValue();
                    if(set1participante1 != 0 && set1participante2 != 0){
                        if(set1participante1 == set1participante2){
                            if(!cadenaError.contains("No se permite empate por sets.")){
                                cadenaError+= "No se permite empate por sets.\n";
                            }
                        }
                    }
                }
                if(cantSets >= 3){
                    set2participante1 = (int) jSpinner2.getValue();
                    set2participante2 = (int) jSpinner11.getValue();
                    set3participante1 = (int) jSpinner3.getValue();
                    set3participante2 = (int) jSpinner12.getValue();
                    if(((set2participante1 != 0) && (set2participante2 != 0)) || ((set3participante1 != 0) && (set3participante2 != 0))){
                        if(set2participante1 == set2participante2 || set3participante1 == set3participante2){
                            if(!cadenaError.contains("No se permite empate por sets.")){
                                cadenaError+= "No se permite empate por sets.\n";
                            }
                        }
                    }
                }
                if(cantSets >= 5){
                    set4participante1 = (int) jSpinner4.getValue();
                    set4participante2 = (int) jSpinner13.getValue();
                    set5participante1 = (int) jSpinner5.getValue();
                    set5participante2 = (int) jSpinner14.getValue();
                    if(((set4participante1 != 0) && (set4participante2 != 0)) || ((set5participante1 != 0) && (set5participante2 != 0))){
                        if(set4participante1 == set4participante2 || set5participante1 == set5participante2){
                            if(!cadenaError.contains("No se permite empate por sets.")){
                                cadenaError+= "No se permite empate por sets.\n";
                            }
                        }
                    }
                }
                if(cantSets >= 7){
                    set6participante1 = (int) jSpinner6.getValue();
                    set6participante2 = (int) jSpinner15.getValue();
                    set7participante1 = (int) jSpinner7.getValue();
                    set7participante2 = (int) jSpinner16.getValue();
                    if(((set6participante1 != 0) && (set6participante2 != 0)) || ((set7participante1 != 0) && (set7participante2 != 0))){
                        if(set6participante1 == set6participante2 || set7participante1 == set7participante2){
                            if(!cadenaError.contains("No se permite empate por sets.")){
                                cadenaError+= "No se permite empate por sets.\n";
                            }
                        }
                    }
                }
                if(cantSets >= 9){
                    set8participante1 = (int) jSpinner8.getValue();
                    set8participante2 = (int) jSpinner17.getValue();
                    set9participante1 = (int) jSpinner9.getValue();
                    set9participante2 = (int) jSpinner18.getValue();
                    if(((set8participante1 != 0) && (set8participante2 != 0)) || ((set9participante1 != 0) && (set9participante2 != 0))){
                        if(set8participante1 == set8participante2 || set9participante1 == set9participante2){
                            if(!cadenaError.contains("No se permite empate por sets.")){
                                cadenaError+= "No se permite empate por sets.\n";
                            }
                        }
                    }
                }
                // Se guardan los valor de los sets en listaSets.
                listaSets.add(set1participante1);
                listaSets.add(set1participante2);
                if (cantSets >= 3) {
                    listaSets.add(set2participante1);
                    listaSets.add(set2participante2);
                    listaSets.add(set3participante1);
                    listaSets.add(set3participante2);
                }
                if (cantSets >= 5) {
                    listaSets.add(set4participante1);
                    listaSets.add(set4participante2);
                    listaSets.add(set5participante1);
                    listaSets.add(set5participante2);
                }
                if (cantSets >= 7) {
                    listaSets.add(set6participante1);
                    listaSets.add(set6participante2);
                    listaSets.add(set7participante1);
                    listaSets.add(set7participante2);
                }
                if (cantSets == 9) {
                    listaSets.add(set8participante1);
                    listaSets.add(set8participante2);
                    listaSets.add(set9participante1);
                    listaSets.add(set9participante2);
                }
                // Se recorre la listaSets y se compara los resultados para guardar el indice.
                for (int i=0; i<(cantSets*2); i+=2) {
                    int PP1 = listaSets.get(i);
                    int PP2 = listaSets.get(i+1);
                    if(PP1 > PP2){
                        contador1 += 1;
                    }
                    else{
                        contador2 += 1;
                    }
                    if(i == (cantSets*2)-1){
                        if(contador1>contador2){
                            indiceGanador = 0;
                        }
                        else{
                            indiceGanador = 1;
                        }
                    }
                    if("".equals(cadenaError)){
                        unNumero = i/2;
                        ResultadoAux unResultado = new ResultadoAux(unNumero, PP1, PP2, asispar1, asispar2, indiceGanador);
                        listaResultadosAux.add(unResultado);
                    }
                    
                }
            }
            else if ("Puntuacion".equals(formaPuntuacion)){
                int PP1 = (int) jSpinner5.getValue();
                int PP2 = (int) jSpinner14.getValue();
                
                if(PP1>PP2){
                    indiceGanador = 0;
                }
                else if (PP2>PP1){
                    indiceGanador = 1;
                }
                else if(PP1 == PP2){
                    if(empatePermitido == false){
                        cadenaError += "La competencia no permite empate.\n";
                    }
                    else{
                        indiceGanador = 2;
                    }
                }
                
                if("".equals(cadenaError)){
                    ResultadoAux unResultado = new ResultadoAux(0, PP1, PP2, asispar1, asispar2, indiceGanador);
                    listaResultadosAux.add(unResultado);
                }
            }
            else{
                Boolean ganador1 =(Boolean)jCheckBox3.isSelected();
                Boolean ganador2 =(Boolean)jCheckBox4.isSelected();
                
                if(ganador1 == true && ganador2 == false){
                    indiceGanador = 0;
                }
                else if(ganador2 == true && ganador1 == false){
                    indiceGanador = 1;
                }
                else{
                    if(empatePermitido == false){
                        cadenaError += "La competencia no permite empate.\n";
                    }
                    else{
                        indiceGanador = 2;
                    }
                }
                if("".equals(cadenaError)){
                    ResultadoAux unResultado = new ResultadoAux(0, 0, 0, asispar1, asispar2, indiceGanador);
                    listaResultadosAux.add(unResultado);
                }
            }
            if("".equals(cadenaError)){
                GestionarFixtureGestor.gestionarFixture(compAux, rondaAux, partidoAux, listaResultadosAux);
                JOptionPane.showMessageDialog(null, "Resultado guardado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                finVentana();
            }
        }
        else if(asispar1 == true && asispar2 == false){
            indiceGanador = 0;
            ResultadoAux unResultado = new ResultadoAux(0, 0, 0, asispar1, asispar2, indiceGanador);
            listaResultadosAux.add(unResultado);
            if("".equals(cadenaError)){
                GestionarFixtureGestor.gestionarFixture(compAux, rondaAux, partidoAux, listaResultadosAux);
                JOptionPane.showMessageDialog(null, "Resultado guardado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                finVentana();
            }
        }
        else if(asispar1 == false && asispar2 == true){
            indiceGanador = 1;
            ResultadoAux unResultado = new ResultadoAux(0, 0, 0, asispar1, asispar2, indiceGanador);
            listaResultadosAux.add(unResultado);
            if("".equals(cadenaError)){
                GestionarFixtureGestor.gestionarFixture(compAux, rondaAux, partidoAux, listaResultadosAux);
                JOptionPane.showMessageDialog(null, "Resultado guardado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                finVentana();
            }
        }
        if(!("".equals(cadenaError))){
            Error(cadenaError);
        }
        else{
            finVentana();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        V.get().remove(this);
        V.get().gestionarResultadosVolver();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        V.get().integrantes(this);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        V.get().remove(this);
        V.get().gestionarResultadosSalir();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if(jCheckBox1.isSelected() == true && jCheckBox2.isSelected() == true){
            crearYLlenarVentana();
        }
        else {
            vaciarVentana();
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        if(jCheckBox1.isSelected() == true && jCheckBox2.isSelected() == true){
            crearYLlenarVentana();
        }
        else {
            vaciarVentana();
        }
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void Error(String cadenaError){
        V.get().alerta();
        JOptionPane.showMessageDialog(null,cadenaError,"Error", JOptionPane.INFORMATION_MESSAGE);
    }
    private void finVentana(){
        V.get().remove(this);
        V.get().mostrarFixtureVolver(compAux);
    }
    private void crearYLlenarVentana(){
        String formaPuntuacion = compAux.getFormaPuntuacion();
        jLabel7.setText("Par. 1:" + partidoAux.getParticipante1());
        jLabel8.setText("Par. 2:" + partidoAux.getParticipante2());
        
        if("Puntuacion".equals(formaPuntuacion)) {
            
            if(!resultadosAnteriores.isEmpty()){
                ResultadoAux result = resultadosAnteriores.get(0);
                jSpinner5.setValue(result.getPuntajeP0());
                jSpinner14.setValue(result.getPuntajeP1());
            }
            jLabel5.setText("Observacion: Si Desea Realizar Empate, ponga la misma puntuacion en ambos.");
            jLabel5.setVisible(true);
            jLabel14.setVisible(true);
            jLabel14.setText("Puntuacion");
            jSpinner5.setVisible(true);
            jSpinner14.setVisible(true);
            repaint();
        }
        else if ("Sets".equals(formaPuntuacion)) {
            jLabel14.setText("5to Set");
            ResultadoAux set1 = null;
            ResultadoAux set2 = null;
            ResultadoAux set3 = null;
            ResultadoAux set4 = null;
            ResultadoAux set5 = null;
            ResultadoAux set6 = null;
            ResultadoAux set7 = null;
            ResultadoAux set8 = null;
            ResultadoAux set9 = null;
            
            if(!resultadosAnteriores.isEmpty()){
                
                set1 = resultadosAnteriores.get(0);
                Boolean asisP0 = set1.getAsistenciaP0();
                Boolean asisP1 = set1.getAsistenciaP1();
                if(asisP0 == true && asisP1 == true){
                    if(cantSets >= 3){
                        set2 = resultadosAnteriores.get(1);
                        set3 = resultadosAnteriores.get(2);
                    }
                    if(cantSets >= 5){
                        set4 = resultadosAnteriores.get(3);
                        set5 = resultadosAnteriores.get(4);
                    }
                    if(cantSets >= 7){
                        set6 = resultadosAnteriores.get(5);
                        set7 = resultadosAnteriores.get(6);
                    }
                    if(cantSets >= 9){
                        set8 = resultadosAnteriores.get(7);
                        set9 = resultadosAnteriores.get(8);
                    }
                }
            }
            
            if(cantSets >= 1){
                if(set1 != null){
                    jSpinner1.setValue(set1.getPuntajeP0());
                    jSpinner10.setValue(set1.getPuntajeP1()); 
                }
                jSpinner1.setVisible(true);
                jSpinner10.setVisible(true);
                jLabel10.setVisible(true);
            }
            if(cantSets >= 3){
                if(set2 != null && set3 != null){
                    jSpinner2.setValue(set2.getPuntajeP0());
                    jSpinner3.setValue(set3.getPuntajeP0());
                    jSpinner11.setValue(set2.getPuntajeP1());
                    jSpinner12.setValue(set3.getPuntajeP1());  
                }
                jSpinner2.setVisible(true);
                jSpinner3.setVisible(true);
                jSpinner11.setVisible(true);
                jSpinner12.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
            }
            if(cantSets >= 5){
                if(set4 != null && set5 != null){
                    jSpinner4.setValue(set4.getPuntajeP0());
                    jSpinner5.setValue(set5.getPuntajeP0());
                    jSpinner13.setValue(set4.getPuntajeP1());
                    jSpinner14.setValue(set5.getPuntajeP1());
                }
                jSpinner4.setVisible(true);
                jSpinner5.setVisible(true);
                jSpinner13.setVisible(true);
                jSpinner14.setVisible(true);
                jLabel13.setVisible(true);
                jLabel14.setVisible(true);
            }
            if(cantSets >= 7){
                if(set6 != null && set7 != null){
                    jSpinner6.setValue(set6.getPuntajeP0());
                    jSpinner7.setValue(set7.getPuntajeP0());
                    jSpinner15.setValue(set6.getPuntajeP1());
                    jSpinner16.setValue(set7.getPuntajeP1());
                }
                jSpinner6.setVisible(true);
                jSpinner7.setVisible(true);
                jSpinner15.setVisible(true);
                jSpinner16.setVisible(true);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
            }
            if(cantSets >= 9){
                if(set8 != null && set9 != null){
                    jSpinner8.setValue(set8.getPuntajeP0());
                    jSpinner9.setValue(set9.getPuntajeP0());
                    jSpinner17.setValue(set8.getPuntajeP1());
                    jSpinner18.setValue(set9.getPuntajeP1());
                }
                jSpinner8.setVisible(true);
                jSpinner9.setVisible(true);
                jSpinner17.setVisible(true);
                jSpinner18.setVisible(true);
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
            }
            repaint();
        }
        else if ("Resultado Final".equals(formaPuntuacion)) {
            if(!resultadosAnteriores.isEmpty()){
                ResultadoAux result = resultadosAnteriores.get(0);
                if(result.getIndiceParticipante() == 0){
                    jCheckBox3.setSelected(true);
                }
                else if(result.getIndiceParticipante() == 1){
                    jCheckBox4.setSelected(true);
                }
                else if(result.getIndiceParticipante() == 2){
                    jCheckBox3.setSelected(true);
                    jCheckBox4.setSelected(true);
                }
            }
            jLabel5.setText("Observacion: Si desea gestionar un empate marque ambas casillas o ninguna.");
            jLabel5.setVisible(true);
            jLabel14.setVisible(true);
            jLabel14.setText("Ganador");
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);            
            repaint();
        }
    }
    
    private void crearVentana(){
        jLabel7.setText("Par. 1:" + partidoAux.getParticipante1());
        jLabel8.setText("Par. 2:" + partidoAux.getParticipante2());
        
        vaciarVentana();
        
        if(!resultadosAnteriores.isEmpty()){
            ResultadoAux asistencia = resultadosAnteriores.get(0);
            jCheckBox1.setSelected(asistencia.getAsistenciaP0());
            jCheckBox2.setSelected(asistencia.getAsistenciaP1());
            if(asistencia.getAsistenciaP0() == true && asistencia.getAsistenciaP1() == true){
                crearYLlenarVentana();
            }
        }
        repaint();
    }
    
    private void vaciarVentana(){
            jLabel5.setVisible(false);
            jLabel14.setVisible(false);
            jSpinner5.setVisible(false);
            jSpinner14.setVisible(false);
            jCheckBox3.setVisible(false);
            jCheckBox4.setVisible(false);
            jSpinner1.setVisible(false);
            jSpinner2.setVisible(false);
            jSpinner3.setVisible(false);
            jSpinner4.setVisible(false);
            jSpinner6.setVisible(false);
            jSpinner7.setVisible(false);
            jSpinner8.setVisible(false);
            jSpinner9.setVisible(false);
            jSpinner10.setVisible(false);
            jSpinner11.setVisible(false);
            jSpinner12.setVisible(false);
            jSpinner13.setVisible(false);
            jSpinner15.setVisible(false);
            jSpinner16.setVisible(false);
            jSpinner17.setVisible(false);
            jSpinner18.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            jLabel17.setVisible(false);
            jLabel18.setVisible(false);
    }
    
    private void verNombre(){
    
     jLabel3.setVisible(true);
     jLabel3.setText(compAux.getNombre());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    // End of variables declaration//GEN-END:variables
}
