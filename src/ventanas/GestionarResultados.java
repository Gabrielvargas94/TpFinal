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
        
        initComponents();
        
        verNombre();
        if(param3!=null){
            vaciarVentana();
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
        jButton1.setBounds(625, 258, 100, 30);

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(150, 258, 90, 30);

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setText("Menu P.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(48, 258, 90, 30);

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
        jLabel5.setBounds(274, 294, 490, 30);

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel6.setText("Participantes:");
        add(jLabel6);
        jLabel6.setBounds(10, 140, 160, 30);

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel7.setText("Par. 1: Nombre Participante 1");
        add(jLabel7);
        jLabel7.setBounds(20, 160, 170, 40);

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel8.setText("Par. 2: Nombre Participante 2");
        add(jLabel8);
        jLabel8.setBounds(20, 200, 160, 40);

        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(660, 171, 20, 20);

        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        add(jCheckBox2);
        jCheckBox2.setBounds(660, 210, 20, 21);

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Asistencia");
        add(jLabel9);
        jLabel9.setBounds(630, 134, 80, 40);

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3);
        jCheckBox3.setBounds(390, 170, 20, 21);
        add(jCheckBox4);
        jCheckBox4.setBounds(390, 210, 20, 20);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner1);
        jSpinner1.setBounds(179, 170, 40, 20);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner2);
        jSpinner2.setBounds(230, 170, 40, 20);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner3);
        jSpinner3.setBounds(280, 170, 40, 20);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner4);
        jSpinner4.setBounds(330, 170, 40, 20);

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner5);
        jSpinner5.setBounds(380, 170, 40, 20);

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner6);
        jSpinner6.setBounds(430, 170, 40, 20);

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner7);
        jSpinner7.setBounds(480, 170, 40, 20);

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner8);
        jSpinner8.setBounds(530, 170, 40, 20);

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner9);
        jSpinner9.setBounds(580, 170, 40, 20);

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner10);
        jSpinner10.setBounds(180, 210, 40, 20);

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner11);
        jSpinner11.setBounds(230, 210, 40, 20);

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner12);
        jSpinner12.setBounds(280, 210, 40, 20);

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner13);
        jSpinner13.setBounds(330, 210, 40, 20);

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner14);
        jSpinner14.setBounds(380, 210, 40, 20);

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner15);
        jSpinner15.setBounds(430, 210, 40, 20);

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner16);
        jSpinner16.setBounds(480, 210, 40, 20);

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner17);
        jSpinner17.setBounds(530, 210, 40, 20);

        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        add(jSpinner18);
        jSpinner18.setBounds(580, 210, 40, 20);

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1er Set");
        add(jLabel10);
        jLabel10.setBounds(170, 134, 50, 40);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("2do Set");
        add(jLabel11);
        jLabel11.setBounds(230, 134, 40, 40);

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3er Set");
        add(jLabel12);
        jLabel12.setBounds(280, 134, 40, 40);

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("4to Set");
        add(jLabel13);
        jLabel13.setBounds(330, 134, 40, 40);

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("5to Set");
        add(jLabel14);
        jLabel14.setBounds(330, 134, 140, 40);

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("6to Set");
        add(jLabel15);
        jLabel15.setBounds(430, 134, 40, 40);

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("7mo Set");
        add(jLabel16);
        jLabel16.setBounds(478, 134, 42, 40);

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("8vo Set");
        add(jLabel17);
        jLabel17.setBounds(530, 134, 40, 40);

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("9no Set");
        add(jLabel18);
        jLabel18.setBounds(580, 134, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_general.jpg"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cantSets = GestionarFixtureGestor.getCantSets(compAux);
        Boolean empatePermitido = GestionarFixtureGestor.getEmpatePermitido(compAux);
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
                int set1participante1 = (int) jSpinner1.getValue();
                int set1participante2 = (int) jSpinner10.getValue();
                int set2participante1 = (int) jSpinner2.getValue();
                int set2participante2 = (int) jSpinner11.getValue();
                int set3participante1 = (int) jSpinner3.getValue();
                int set3participante2 = (int) jSpinner12.getValue();
                int set4participante1 = (int) jSpinner4.getValue();
                int set4participante2 = (int) jSpinner13.getValue();
                int set5participante1 = (int) jSpinner5.getValue();
                int set5participante2 = (int) jSpinner14.getValue();
                int set6participante1 = (int) jSpinner6.getValue();
                int set6participante2 = (int) jSpinner15.getValue();
                int set7participante1 = (int) jSpinner7.getValue();
                int set7participante2 = (int) jSpinner16.getValue();
                int set8participante1 = (int) jSpinner8.getValue();
                int set8participante2 = (int) jSpinner17.getValue();
                int set9participante1 = (int) jSpinner9.getValue();
                int set9participante2 = (int) jSpinner18.getValue();
                
                if(set1participante1 == set1participante2 ||
                        set2participante1 == set2participante2 ||
                        set3participante1 == set3participante2 ||
                        set4participante1 == set4participante2 ||
                        set5participante1 == set5participante2 ||
                        set6participante1 == set6participante2 ||
                        set7participante1 == set7participante2 ||
                        set8participante1 == set8participante2 ||
                        set9participante1 == set9participante2){
                    cadenaError += "No se permite empate por sets.\n";
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
            }
            else{
                V.get().alerta();
                JOptionPane.showMessageDialog(null,cadenaError,"Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(asispar1 == true && asispar2 == false){
            indiceGanador = 0;
            ResultadoAux unResultado = new ResultadoAux(0, 0, 0, asispar1, asispar2, indiceGanador);
            listaResultadosAux.add(unResultado);
            if("".equals(cadenaError)){
                GestionarFixtureGestor.gestionarFixture(compAux, rondaAux, partidoAux, listaResultadosAux);
                JOptionPane.showMessageDialog(null, "Resultado guardado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(asispar1 == false && asispar2 == true){
            indiceGanador = 1;
            ResultadoAux unResultado = new ResultadoAux(0, 0, 0, asispar1, asispar2, indiceGanador);
            listaResultadosAux.add(unResultado);
            if("".equals(cadenaError)){
                GestionarFixtureGestor.gestionarFixture(compAux, rondaAux, partidoAux, listaResultadosAux);
                JOptionPane.showMessageDialog(null, "Resultado guardado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }
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

    private void crearYLlenarVentana(){
        String formaPuntuacion = compAux.getFormaPuntuacion();
        int cantSets = GestionarFixtureGestor.getCantSets(compAux);
        
        jLabel7.setText("Par. 1:" + partidoAux.getParticipante1());
        jLabel8.setText("Par. 2:" + partidoAux.getParticipante2());
        
        
        
        
        // AGREGADO
        // Buscar resultados de la BD, si los hubiera
        ArrayList<ResultadoAux> resultadosAnteriores=
                gestor.GestionarFixtureGestor.getResultados(partidoAux);
        
        
        if("Puntuacion".equals(formaPuntuacion)) {
            jLabel5.setText("Observacion: Si Desea Realizar Empate, ponga la misma puntuacion en ambos.");
            jLabel5.setVisible(true);
            jLabel14.setVisible(true);
            jLabel14.setText("Puntuacion");
            jSpinner5.setVisible(true);
            jSpinner14.setVisible(true);
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
            repaint();
        }
        else if ("Sets".equals(formaPuntuacion)) {
            if(cantSets == 1){
                jLabel5.setVisible(false);
                jLabel14.setVisible(false);
                jLabel14.setText("5to Set");
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jSpinner5.setVisible(false);
                jSpinner14.setVisible(false);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(false);
                jSpinner3.setVisible(false);
                jSpinner4.setVisible(false);
                jSpinner6.setVisible(false);
                jSpinner7.setVisible(false);
                jSpinner8.setVisible(false);
                jSpinner9.setVisible(false);
                jSpinner10.setVisible(true);
                jSpinner11.setVisible(false);
                jSpinner12.setVisible(false);
                jSpinner13.setVisible(false);
                jSpinner15.setVisible(false);
                jSpinner16.setVisible(false);
                jSpinner17.setVisible(false);
                jSpinner18.setVisible(false);
                jLabel10.setVisible(true);
                jLabel11.setVisible(false);
                jLabel12.setVisible(false);
                jLabel13.setVisible(false);
                jLabel15.setVisible(false);
                jLabel16.setVisible(false);
                jLabel17.setVisible(false);
                jLabel18.setVisible(false);
                repaint();
            }
            else if(cantSets == 3){
                jLabel5.setVisible(false);
                jLabel14.setVisible(false);
                jLabel14.setText("5to Set");
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jSpinner5.setVisible(false);
                jSpinner14.setVisible(false);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(true);
                jSpinner3.setVisible(true);
                jSpinner4.setVisible(false);
                jSpinner6.setVisible(false);
                jSpinner7.setVisible(false);
                jSpinner8.setVisible(false);
                jSpinner9.setVisible(false);
                jSpinner10.setVisible(true);
                jSpinner11.setVisible(true);
                jSpinner12.setVisible(true);
                jSpinner13.setVisible(false);
                jSpinner15.setVisible(false);
                jSpinner16.setVisible(false);
                jSpinner17.setVisible(false);
                jSpinner18.setVisible(false);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(false);
                jLabel15.setVisible(false);
                jLabel16.setVisible(false);
                jLabel17.setVisible(false);
                jLabel18.setVisible(false);
                repaint();
            }
            else if(cantSets == 5){
                jLabel5.setVisible(false);
                jLabel14.setVisible(true);
                jLabel14.setText("5to Set");
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jSpinner5.setVisible(true);
                jSpinner14.setVisible(true);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(true);
                jSpinner3.setVisible(true);
                jSpinner4.setVisible(true);
                jSpinner6.setVisible(false);
                jSpinner7.setVisible(false);
                jSpinner8.setVisible(false);
                jSpinner9.setVisible(false);
                jSpinner10.setVisible(true);
                jSpinner11.setVisible(true);
                jSpinner12.setVisible(true);
                jSpinner13.setVisible(true);
                jSpinner15.setVisible(false);
                jSpinner16.setVisible(false);
                jSpinner17.setVisible(false);
                jSpinner18.setVisible(false);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel15.setVisible(false);
                jLabel16.setVisible(false);
                jLabel17.setVisible(false);
                jLabel18.setVisible(false);
                repaint();
            }
            else if(cantSets == 7){
                jLabel5.setVisible(false);
                jLabel14.setVisible(true);
                jLabel14.setText("5to Set");
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jSpinner5.setVisible(true);
                jSpinner14.setVisible(true);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(true);
                jSpinner3.setVisible(true);
                jSpinner4.setVisible(true);
                jSpinner6.setVisible(true);
                jSpinner7.setVisible(true);
                jSpinner8.setVisible(false);
                jSpinner9.setVisible(false);
                jSpinner10.setVisible(true);
                jSpinner11.setVisible(true);
                jSpinner12.setVisible(true);
                jSpinner13.setVisible(true);
                jSpinner15.setVisible(true);
                jSpinner16.setVisible(true);
                jSpinner17.setVisible(false);
                jSpinner18.setVisible(false);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
                jLabel17.setVisible(false);
                jLabel18.setVisible(false);
                repaint();
            }
            else if(cantSets == 9){
                jLabel5.setVisible(false);
                jLabel14.setVisible(true);
                jLabel14.setText("5to Set");
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jSpinner5.setVisible(true);
                jSpinner14.setVisible(true);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(true);
                jSpinner3.setVisible(true);
                jSpinner4.setVisible(true);
                jSpinner6.setVisible(true);
                jSpinner7.setVisible(true);
                jSpinner8.setVisible(true);
                jSpinner9.setVisible(true);
                jSpinner10.setVisible(true);
                jSpinner11.setVisible(true);
                jSpinner12.setVisible(true);
                jSpinner13.setVisible(true);
                jSpinner15.setVisible(true);
                jSpinner16.setVisible(true);
                jSpinner17.setVisible(true);
                jSpinner18.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);
                jLabel12.setVisible(true);
                jLabel13.setVisible(true);
                jLabel15.setVisible(true);
                jLabel16.setVisible(true);
                jLabel17.setVisible(true);
                jLabel18.setVisible(true);
                repaint();
            }
            repaint();
        }
        else if ("Resultado Final".equals(formaPuntuacion)) {
            jLabel5.setText("Observacion: Si desea gestionar un empate marque ambas casillas o ninguna.");
            jLabel5.setVisible(true);
            jLabel14.setVisible(true);
            jLabel14.setText("Ganador");
            jCheckBox3.setVisible(true);
            jCheckBox4.setVisible(true);
            jSpinner5.setVisible(false);
            jSpinner14.setVisible(false);
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
            repaint();
        }
    }
    
    private void vaciarVentana(){
        jLabel7.setText("Par. 1:" + partidoAux.getParticipante1());
        jLabel8.setText("Par. 2:" + partidoAux.getParticipante2());
        
        
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
        repaint();
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
