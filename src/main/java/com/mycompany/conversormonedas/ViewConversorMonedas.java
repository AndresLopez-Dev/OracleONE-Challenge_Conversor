package com.mycompany.conversormonedas;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ViewConversorMonedas extends javax.swing.JFrame {

    public ViewConversorMonedas() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void convertir(){
        String moneda1 = jcbSelectMoneda.getSelectedItem().toString();
        String moneda2 = jcbMonedaAconvertir.getSelectedItem().toString();
        
        String tipoMoneda1 = seleccionarMonedas(moneda1);
        String tipoMoneda2 = seleccionarMonedas(moneda2);
        
        double cantAcambiar = Double.parseDouble(txtCantMoneda.getText());
        
        ApiGet convertimos = new ApiGet();
        convertimos.equibalencia(tipoMoneda1, tipoMoneda2);
        
        double monedaConvert = convertimos.cambio(cantAcambiar);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(); 
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(6);
        String monedaConvertida = decimalFormat.format(monedaConvert);
        txtMonedaConvertida.setText(monedaConvertida);
        
        System.out.println("View..."+tipoMoneda2);
        System.out.println("View..."+monedaConvertida);
    }
    
    public String seleccionarMonedas(String moneda){
        
        String tipoMoneda = null;
        
        switch(moneda){
            case "Peso Colombiano (COP)":
                tipoMoneda = "COP";
                break;
            case "USA Dolar (USD)":
                tipoMoneda = "USD";
                break;
            case "Euro (EUR)":
                tipoMoneda = "EUR";
                break;
            case "Libra esterlina (GBP)":
                tipoMoneda = "GBP";
                break;
        }
        return tipoMoneda;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCovensorMoneda = new javax.swing.JLabel();
        jcbSelectMoneda = new javax.swing.JComboBox<>();
        txtCantMoneda = new javax.swing.JTextField();
        jcbMonedaAconvertir = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMonedaConvertida = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCovensorMoneda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCovensorMoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCovensorMoneda.setText("Conversor de Monedas");

        jcbSelectMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Colombiano (COP)", "USA Dolar (USD)", "Euro (EUR)", "Libra esterlina (GBP)" }));
        jcbSelectMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectMonedaActionPerformed(evt);
            }
        });

        txtCantMoneda.setMargin(new java.awt.Insets(2, 8, 4, 6));
        txtCantMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantMonedaActionPerformed(evt);
            }
        });

        jcbMonedaAconvertir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Colombiano (COP)", "USA Dolar (USD)", "Euro (EUR)", "Libra esterlina (GBP)" }));
        jcbMonedaAconvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMonedaAconvertirActionPerformed(evt);
            }
        });

        jLabel2.setText("⇊");
        jLabel2.setToolTipText("");

        txtMonedaConvertida.setMargin(new java.awt.Insets(2, 8, 4, 6));
        txtMonedaConvertida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonedaConvertidaActionPerformed(evt);
            }
        });

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCovensorMoneda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMonedaAconvertir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantMoneda)
                            .addComponent(jcbSelectMoneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMonedaConvertida)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCovensorMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbSelectMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbMonedaAconvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonedaConvertida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvertir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMonedaConvertidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonedaConvertidaActionPerformed
        
    }//GEN-LAST:event_txtMonedaConvertidaActionPerformed

    private void jcbSelectMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectMonedaActionPerformed

    private void txtCantMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantMonedaActionPerformed

    private void jcbMonedaAconvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMonedaAconvertirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMonedaAconvertirActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        convertir();
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbMonedaAconvertir;
    private javax.swing.JComboBox<String> jcbSelectMoneda;
    private javax.swing.JLabel lblCovensorMoneda;
    private javax.swing.JTextField txtCantMoneda;
    private javax.swing.JTextField txtMonedaConvertida;
    // End of variables declaration//GEN-END:variables
}
