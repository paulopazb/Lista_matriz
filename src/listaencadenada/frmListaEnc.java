
package listaencadenada;
import javax.swing.JOptionPane; 


public class frmListaEnc extends javax.swing.JFrame {

    /** Creates new form ListasEnc */
    Lista L1;

    public frmListaEnc() {
        initComponents();
        L1=new Lista();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        jLabel1.setText("LISTAS ENLAZADAS");

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        t1.setName("t1"); // NOI18N

        btnMostrar.setText("Mostar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setForeground(new java.awt.Color(51, 51, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", "", "", ""
            }
        ));
        tabla.setGridColor(new java.awt.Color(204, 255, 255));
        tabla.setMinimumSize(new java.awt.Dimension(140, 16));
        tabla.setOpaque(false);
        tabla.setPreferredSize(new java.awt.Dimension(700, 16));
        jScrollPane1.setViewportView(tabla);

        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane2.setViewportView(jta);

        jMenu2.setText("Metodos");

        jMenuItem1.setText("Leer");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("Mostrar");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnMostrar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeer)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public void leerMatriz(Matriz m)
    {
       
        int f=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas"));
        int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas"));
        m.setFila(f); 
        m.setColumna(c);
        for(int i=0;i<f;i++)
        {
            for(int j=0;j<c;j++)
            {
                int x=Integer.parseInt(JOptionPane.showInputDialog("Elemento:"));
                m.setElem(x, i, j);
            }
        }
    }
      
    public void mostrarMatriz(Matriz m)
    { 
        for(int i=0;i<m.getFila();i++)
        {
            for(int j=0;j<m.getColumna();j++)
            {
               jta.append(m.getElem(i,j)+" ");
            }
             jta.append("\n");
            
        }
         
    }
    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
        int n=Integer.parseInt(t1.getText());
        for(int i=0;i<n;i++)
        {
          Matriz m=new Matriz();
          leerMatriz(m);
          L1.insertarUltimo(m);
        }
    }//GEN-LAST:event_btnLeerActionPerformed


    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:        
        
        Nodo p=L1.Primero();
        while(p!=null)
        {  Matriz m=new Matriz();
           m=p.getElem();
           mostrarMatriz(m);
           p=p.getProx();
        }
        //Otra
       /*for(int i=1; i<=l1.getCant(); i++)
        { 
            tabla.setValueAt(l1.getElemento(i), 0, i-1);
        }*/

    }//GEN-LAST:event_btnMostrarActionPerformed

  
    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
     

    }//GEN-LAST:event_jMenuItem1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaEnc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
