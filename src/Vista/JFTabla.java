package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class JFTabla extends javax.swing.JFrame {
    public JFTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Mostrar la tabla al ejecutar el programa
        String sql2 = "SELECT * FROM productos";
        try (Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
            PreparedStatement pstmt2 = conn2.prepareStatement(sql2)) {
            ResultSet rs = pstmt2.executeQuery();  // Ejecutar la consulta después de preparar el PreparedStatement
            DefaultTableModel modelo = (DefaultTableModel) this.JTProductos.getModel();
            modelo.setRowCount(0);  // Limpiar la tabla
            while (rs.next()) {
                Object[] fila = { rs.getString("nombre"), rs.getString("codigo"), rs.getDouble("precio"), rs.getInt("cantidad") };
                modelo.addRow(fila);
            }
            // Cerrar el ResultSet
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFNprod = new javax.swing.JTextField();
        JTFPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JTFCantidad = new javax.swing.JTextField();
        JBAgregar = new javax.swing.JButton();
        JBActualizar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProductos = new javax.swing.JTable();
        JBLeer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Datos")));

        jLabel1.setText("Nombre del producto:");

        jLabel2.setText("Código:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Cantidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFCantidad)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFNprod)
                            .addComponent(JTFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addComponent(JTFPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFNprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(JTFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        JBActualizar.setText("Actualizar");
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBSalir.setText("Salir");
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });

        JTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre:", "Código:", "Precio:", "Cantidad:"
            }
        ));
        jScrollPane2.setViewportView(JTProductos);

        JBLeer.setText("Leer");
        JBLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLeerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JBAgregar)
                        .addGap(27, 27, 27)
                        .addComponent(JBActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(JBEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JBLeer)
                        .addGap(46, 46, 46)
                        .addComponent(JBSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAgregar)
                    .addComponent(JBActualizar)
                    .addComponent(JBEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalir)
                    .addComponent(JBLeer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        String sqlInsert = "INSERT INTO productos (nombre, codigo, precio, cantidad) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
                PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert)) {

            pstmtInsert.setString(1, this.JTFNprod.getText());
            pstmtInsert.setInt(2, Integer.parseInt(this.JTFCodigo.getText()));
            pstmtInsert.setDouble(3, Double.parseDouble(this.JTFPrecio.getText()));
            pstmtInsert.setInt(4, Integer.parseInt(this.JTFCantidad.getText()));
            pstmtInsert.executeUpdate();

            JOptionPane.showMessageDialog(null, "Producto insertado con éxito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar producto: " + e.getMessage());
        }

        String sql_2 = "SELECT * FROM productos";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
             PreparedStatement pstmt = conn.prepareStatement(sql_2);
             ResultSet rs = pstmt.executeQuery()) {

            DefaultTableModel modelo = (DefaultTableModel) this.JTProductos.getModel();
            modelo.setRowCount(0);  // Limpiar la tabla

            while (rs.next()) {
                Object[] fila = { rs.getString("nombre"), rs.getInt("codigo"), rs.getDouble("precio"), rs.getInt("cantidad") };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage());
        }
        this.JTFCodigo.setText("");
        this.JTFNprod.setText("");
        this.JTFPrecio.setText("");
        this.JTFCantidad.setText("");
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        String sqlUpdate = "UPDATE productos SET nombre = ?, precio = ?, cantidad = ? WHERE codigo = ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
            PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            // Obtener los valores de los campos de la interfaz gráfica
            String nombre = this.JTFNprod.getText();
            double precio = Double.parseDouble(this.JTFPrecio.getText());
            long cantidad = Long.parseLong(this.JTFCantidad.getText());
            String codigo = this.JTFCodigo.getText();

            // Establecer los valores de los parámetros en la consulta SQL
            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setLong(3, cantidad);
            pstmt.setString(4, codigo);

            // Ejecutar la actualización
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Producto actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un producto con el código especificado");
            }

       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar producto: " + e.getMessage());
       } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los datos: " + e.getMessage());
       }

       java.awt.event.ActionEvent actionEvent = new java.awt.event.ActionEvent(evt.getSource(), java.awt.event.ActionEvent.ACTION_PERFORMED, "EnterKey");
               this.JBLeerActionPerformed(actionEvent);
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
String sql = "DELETE FROM productos WHERE codigo = ?";
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this.JTFCodigo.getText());
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Producto eliminado con éxito");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar producto: " + e.getMessage());
        }
        
        java.awt.event.ActionEvent actionEvent = new java.awt.event.ActionEvent(evt.getSource(), java.awt.event.ActionEvent.ACTION_PERFORMED, "EnterKey");
            this.JBLeerActionPerformed(actionEvent);
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBSalirActionPerformed

    private void JBLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLeerActionPerformed
        String sql2 = "SELECT * FROM productos";

        try (Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/MiBaseDeDatos", "root", "juan10");
            PreparedStatement pstmt2 = conn2.prepareStatement(sql2)) {

            ResultSet rs = pstmt2.executeQuery();  // Ejecutar la consulta después de preparar el PreparedStatement

            DefaultTableModel modelo = (DefaultTableModel) this.JTProductos.getModel();
            modelo.setRowCount(0);  // Limpiar la tabla

            while (rs.next()) {
                Object[] fila = { rs.getString("nombre"), rs.getString("codigo"), rs.getDouble("precio"), rs.getInt("cantidad") };
                modelo.addRow(fila);
            }
            // Cerrar el ResultSet
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar productos: " + e.getMessage());
        }    
    }//GEN-LAST:event_JBLeerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBLeer;
    private javax.swing.JButton JBSalir;
    private javax.swing.JTextField JTFCantidad;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFNprod;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JTable JTProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
