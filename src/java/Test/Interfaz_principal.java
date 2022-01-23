package Test;

import java.awt.Color;
import java.util.Random;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Interfaz_principal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Interfaz_principal() {
        initComponents();
        jPanel7.setBackground(new Color(0,0,0,105));
        jPanel8.setBackground(new Color(255,255,255,50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nombre_usuario = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button_envio = new javax.swing.JButton();
        jRadioRetiro = new javax.swing.JRadioButton();
        jRadioDeposito = new javax.swing.JRadioButton();
        total_pago = new javax.swing.JTextField();
        ingreso1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        botonregistrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        textcntra_r = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        text_saldo_inicial = new javax.swing.JTextField();
        textcorreo_r = new javax.swing.JTextField();
        textcntra_r2 = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textcorreo = new javax.swing.JTextField();
        textcntra = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botoniniciar = new javax.swing.JButton();
        label_registro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jFrame1.setBackground(new java.awt.Color(0, 0, 0));
        jFrame1.setUndecorated(true);
        jFrame1.getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(180, 256));
        jPanel10.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CUENTA DE USUARIO");
        jPanel10.add(jLabel9);
        jLabel9.setBounds(20, 50, 170, 20);

        nombre_usuario.setBackground(new java.awt.Color(204, 204, 204));
        nombre_usuario.setForeground(new java.awt.Color(0, 51, 255));
        nombre_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_usuario.setText("CUENTA DE USUARIO");
        nombre_usuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel10.add(nombre_usuario);
        nombre_usuario.setBounds(20, 160, 170, 20);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/1)LOGIN.png"))); // NOI18N
        jPanel10.add(jLabel25);
        jLabel25.setBounds(20, 70, 170, 80);

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/1485477118-rotation-right_78579.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setBorderPainted(false);
        regresar.setOpaque(true);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel10.add(regresar);
        regresar.setBounds(40, 210, 127, 40);

        jPanel11.setBackground(new java.awt.Color(13, 12, 12));
        jPanel11.setMinimumSize(new java.awt.Dimension(5, 280));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11);
        jPanel11.setBounds(10, 0, 3, 280);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(20, 60, 200, 280);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SALDO:");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(30, 10, 100, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SELECCIONE");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(30, 80, 110, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VALOR:");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(30, 160, 100, 20);

        button_envio.setBackground(new java.awt.Color(0, 0, 0));
        button_envio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_envio.setForeground(new java.awt.Color(255, 255, 255));
        button_envio.setText("Enviar");
        jPanel7.add(button_envio);
        button_envio.setBounds(80, 230, 150, 30);

        jRadioRetiro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioRetiro);
        jRadioRetiro.setForeground(new java.awt.Color(0, 0, 0));
        jRadioRetiro.setSelected(true);
        jRadioRetiro.setText("Retiro");
        jRadioRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioRetiroActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioRetiro);
        jRadioRetiro.setBounds(50, 110, 108, 30);

        jRadioDeposito.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioDeposito);
        jRadioDeposito.setForeground(new java.awt.Color(0, 0, 0));
        jRadioDeposito.setText("Deposito");
        jRadioDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDepositoActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioDeposito);
        jRadioDeposito.setBounds(160, 110, 110, 30);

        total_pago.setEditable(false);
        total_pago.setBackground(new java.awt.Color(255, 255, 255));
        total_pago.setForeground(new java.awt.Color(0, 0, 0));
        total_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_pagoActionPerformed(evt);
            }
        });
        jPanel7.add(total_pago);
        total_pago.setBounds(50, 40, 220, 30);

        ingreso1.setBackground(new java.awt.Color(255, 255, 255));
        ingreso1.setForeground(new java.awt.Color(0, 0, 0));
        ingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso1ActionPerformed(evt);
            }
        });
        jPanel7.add(ingreso1);
        ingreso1.setBounds(50, 190, 220, 30);

        jPanel8.add(jPanel7);
        jPanel7.setBounds(210, 50, 300, 300);

        jPanel9.add(jPanel8);
        jPanel8.setBounds(1, 1, 530, 370);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/red-and-black-gradient-colored-texture-vector.jpg"))); // NOI18N
        jPanel9.add(jLabel24);
        jLabel24.setBounds(-140, -100, 710, 530);

        jFrame1.getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 570, 390);

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setUndecorated(true);
        jFrame2.setResizable(false);
        jFrame2.getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jSeparator3.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator3.setForeground(new java.awt.Color(255, 34, 44));
        jPanel5.add(jSeparator3);
        jSeparator3.setBounds(50, 140, 200, 10);

        jLabel12.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel12.setText("SALDO INICIAL");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 320, 220, 20);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel13.setText("CORREO ELECTRÓNICO");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 80, 220, 20);

        jSeparator4.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator4.setForeground(new java.awt.Color(255, 34, 44));
        jPanel5.add(jSeparator4);
        jSeparator4.setBounds(50, 380, 200, 10);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/3)arroba.png"))); // NOI18N
        jLabel14.setText("jLabel1");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(10, 110, 34, 32);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/bagofmoney_5108.png"))); // NOI18N
        jPanel5.add(jLabel15);
        jLabel15.setBounds(10, 350, 40, 32);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/1)LOGIN.png"))); // NOI18N
        jPanel5.add(jLabel16);
        jLabel16.setBounds(0, 0, 260, 70);

        botonregistrar.setBackground(new java.awt.Color(255, 34, 44));
        botonregistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonregistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonregistrar.setText("REGISTER");
        botonregistrar.setBorder(null);
        botonregistrar.setBorderPainted(false);
        botonregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrarActionPerformed(evt);
            }
        });
        jPanel5.add(botonregistrar);
        botonregistrar.setBounds(30, 400, 220, 30);

        jLabel17.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel17.setText("CONTRASEÑA");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 160, 220, 20);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/2)candado.png"))); // NOI18N
        jPanel5.add(jLabel20);
        jLabel20.setBounds(10, 190, 40, 32);

        jSeparator5.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator5.setForeground(new java.awt.Color(255, 34, 44));
        jPanel5.add(jSeparator5);
        jSeparator5.setBounds(50, 220, 200, 10);

        jLabel21.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel21.setText("REPETIR CONTRASEÑA");
        jPanel5.add(jLabel21);
        jLabel21.setBounds(10, 240, 220, 20);

        textcntra_r.setBackground(new java.awt.Color(225, 225, 225));
        textcntra_r.setBorder(null);
        textcntra_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcntra_rActionPerformed(evt);
            }
        });
        jPanel5.add(textcntra_r);
        textcntra_r.setBounds(50, 190, 200, 30);

        jSeparator6.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator6.setForeground(new java.awt.Color(255, 34, 44));
        jPanel5.add(jSeparator6);
        jSeparator6.setBounds(50, 300, 200, 10);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/2)candado.png"))); // NOI18N
        jPanel5.add(jLabel22);
        jLabel22.setBounds(10, 270, 40, 32);

        text_saldo_inicial.setBackground(new java.awt.Color(225, 225, 225));
        text_saldo_inicial.setBorder(null);
        text_saldo_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_saldo_inicialActionPerformed(evt);
            }
        });
        jPanel5.add(text_saldo_inicial);
        text_saldo_inicial.setBounds(50, 350, 200, 30);

        textcorreo_r.setBackground(new java.awt.Color(225, 225, 225));
        textcorreo_r.setBorder(null);
        textcorreo_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcorreo_rActionPerformed(evt);
            }
        });
        jPanel5.add(textcorreo_r);
        textcorreo_r.setBounds(50, 110, 200, 30);

        textcntra_r2.setBackground(new java.awt.Color(225, 225, 225));
        textcntra_r2.setBorder(null);
        textcntra_r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcntra_r2ActionPerformed(evt);
            }
        });
        jPanel5.add(textcntra_r2);
        textcntra_r2.setBounds(50, 270, 200, 30);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(180, 20, 270, 440);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Registro");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SOAP");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel18)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(0, 0, 220, 490);

        jFrame2.getContentPane().add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator1.setForeground(new java.awt.Color(255, 34, 44));
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(50, 140, 200, 10);

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel6.setText("CONTRASEÑA");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 160, 220, 20);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel7.setText("CORREO ELECTRÓNICO");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 80, 220, 20);

        jSeparator2.setBackground(new java.awt.Color(255, 34, 44));
        jSeparator2.setForeground(new java.awt.Color(255, 34, 44));
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(50, 220, 200, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/3)arroba.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 110, 34, 32);

        textcorreo.setBackground(new java.awt.Color(225, 225, 225));
        textcorreo.setBorder(null);
        textcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcorreoActionPerformed(evt);
            }
        });
        jPanel3.add(textcorreo);
        textcorreo.setBounds(50, 110, 200, 30);

        textcntra.setBackground(new java.awt.Color(225, 225, 225));
        textcntra.setBorder(null);
        textcntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcntraActionPerformed(evt);
            }
        });
        jPanel3.add(textcntra);
        textcntra.setBounds(50, 190, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/2)candado.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 190, 40, 32);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/Recursos/1)LOGIN.png"))); // NOI18N
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 260, 70);

        botoniniciar.setBackground(new java.awt.Color(255, 34, 44));
        botoniniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botoniniciar.setForeground(new java.awt.Color(255, 255, 255));
        botoniniciar.setText("LOGIN");
        botoniniciar.setBorder(null);
        botoniniciar.setBorderPainted(false);
        jPanel3.add(botoniniciar);
        botoniniciar.setBounds(20, 250, 220, 30);

        label_registro.setForeground(new java.awt.Color(51, 51, 51));
        label_registro.setText("Si eres nuevo registrate aquí?");
        jPanel3.add(label_registro);
        label_registro.setBounds(10, 290, 240, 16);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(180, 20, 270, 310);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Login");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SOAP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 220, 360);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textcntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcntraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcntraActionPerformed

    private void textcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcorreoActionPerformed

    private void botonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonregistrarActionPerformed

    private void textcntra_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcntra_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcntra_rActionPerformed

    private void jRadioRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioRetiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioRetiroActionPerformed

    private void jRadioDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioDepositoActionPerformed

    private void ingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingreso1ActionPerformed

    private void total_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_pagoActionPerformed

    private void text_saldo_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_saldo_inicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_saldo_inicialActionPerformed

    private void textcorreo_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcorreo_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcorreo_rActionPerformed

    private void textcntra_r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcntra_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcntra_r2ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

    public JButton getBotoniniciar() {
        return botoniniciar;
    }

    public void setBotoniniciar(JButton botoniniciar) {
        this.botoniniciar = botoniniciar;
    }

    public JButton getBotonregistrar() {
        return botonregistrar;
    }

    public void setBotonregistrar(JButton botonregistrar) {
        this.botonregistrar = botonregistrar;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JButton getButton_envio() {
        return button_envio;
    }

    public void setButton_envio(JButton button_envio) {
        this.button_envio = button_envio;
    }

    public JTextField getIngreso1() {
        return ingreso1;
    }

    public void setIngreso1(JTextField ingreso1) {
        this.ingreso1 = ingreso1;
    }

    public JFrame getjFrame1() {
        return jFrame1;
    }

    public void setjFrame1(JFrame jFrame1) {
        this.jFrame1 = jFrame1;
    }

    public JFrame getjFrame2() {
        return jFrame2;
    }

    public void setjFrame2(JFrame jFrame2) {
        this.jFrame2 = jFrame2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JRadioButton getjRadioDeposito() {
        return jRadioDeposito;
    }

    public void setjRadioDeposito(JRadioButton jRadioDeposito) {
        this.jRadioDeposito = jRadioDeposito;
    }

    public JRadioButton getjRadioRetiro() {
        return jRadioRetiro;
    }

    public void setjRadioRetiro(JRadioButton jRadioRetiro) {
        this.jRadioRetiro = jRadioRetiro;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JSeparator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JSeparator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JSeparator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JSeparator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JSeparator getjSeparator6() {
        return jSeparator6;
    }

    public void setjSeparator6(JSeparator jSeparator6) {
        this.jSeparator6 = jSeparator6;
    }

    public JLabel getLabel_registro() {
        return label_registro;
    }

    public void setLabel_registro(JLabel label_registro) {
        this.label_registro = label_registro;
    }

    public JLabel getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(JLabel nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public JButton getRegresar() {
        return regresar;
    }

    public void setRegresar(JButton regresar) {
        this.regresar = regresar;
    }

    public JTextField getText_saldo_inicial() {
        return text_saldo_inicial;
    }

    public void setText_saldo_inicial(JTextField text_saldo_inicial) {
        this.text_saldo_inicial = text_saldo_inicial;
    }

    public JPasswordField getTextcntra() {
        return textcntra;
    }

    public void setTextcntra(JPasswordField textcntra) {
        this.textcntra = textcntra;
    }

    public JPasswordField getTextcntra_r() {
        return textcntra_r;
    }

    public void setTextcntra_r(JPasswordField textcntra_r) {
        this.textcntra_r = textcntra_r;
    }

    public JPasswordField getTextcntra_r2() {
        return textcntra_r2;
    }

    public void setTextcntra_r2(JPasswordField textcntra_r2) {
        this.textcntra_r2 = textcntra_r2;
    }

    public JTextField getTextcorreo() {
        return textcorreo;
    }

    public void setTextcorreo(JTextField textcorreo) {
        this.textcorreo = textcorreo;
    }

    public JTextField getTextcorreo_r() {
        return textcorreo_r;
    }

    public void setTextcorreo_r(JTextField textcorreo_r) {
        this.textcorreo_r = textcorreo_r;
    }

    public JTextField getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(JTextField total_pago) {
        this.total_pago = total_pago;
    }



    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoniniciar;
    private javax.swing.JButton botonregistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_envio;
    private javax.swing.JTextField ingreso1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioDeposito;
    private javax.swing.JRadioButton jRadioRetiro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label_registro;
    private javax.swing.JLabel nombre_usuario;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField text_saldo_inicial;
    private javax.swing.JPasswordField textcntra;
    private javax.swing.JPasswordField textcntra_r;
    private javax.swing.JPasswordField textcntra_r2;
    private javax.swing.JTextField textcorreo;
    private javax.swing.JTextField textcorreo_r;
    private javax.swing.JTextField total_pago;
    // End of variables declaration//GEN-END:variables
}