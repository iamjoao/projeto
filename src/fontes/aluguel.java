package fontes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class aluguel extends javax.swing.JFrame {
    private principal prin;
    private cliente clin;
    private funcionario fun;
    private entradasaida es;
    private danificado dani;
    private login login;
    private String dado, dados1, datasaida, dataentrada, horsaida, horentrada, automovel, cliente, placa, danificado;
    private int valor = 0, valor1 = 0, id;
    public aluguel() {
        initComponents();
        Alugar.setVisible(false);
        model23.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Veiculos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Alugar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        marcas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        model1 = new javax.swing.JLabel();
        model2 = new javax.swing.JLabel();
        model3 = new javax.swing.JLabel();
        model4 = new javax.swing.JLabel();
        model5 = new javax.swing.JLabel();
        model6 = new javax.swing.JLabel();
        model7 = new javax.swing.JLabel();
        model8 = new javax.swing.JLabel();
        model9 = new javax.swing.JLabel();
        model10 = new javax.swing.JLabel();
        model11 = new javax.swing.JLabel();
        model12 = new javax.swing.JLabel();
        model13 = new javax.swing.JLabel();
        model14 = new javax.swing.JLabel();
        model15 = new javax.swing.JLabel();
        model16 = new javax.swing.JLabel();
        model17 = new javax.swing.JLabel();
        model18 = new javax.swing.JLabel();
        model19 = new javax.swing.JLabel();
        model20 = new javax.swing.JLabel();
        model21 = new javax.swing.JLabel();
        model22 = new javax.swing.JLabel();
        model23 = new javax.swing.JLabel();
        model24 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Dsaida = new javax.swing.JFormattedTextField();
        Dentrada = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Hsaida = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        Hentrada = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 500));
        setMinimumSize(new java.awt.Dimension(960, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Background.setBackground(new java.awt.Color(57, 64, 48));
        Background.setMaximumSize(new java.awt.Dimension(960, 500));
        Background.setMinimumSize(new java.awt.Dimension(960, 500));
        Background.setPreferredSize(new java.awt.Dimension(960, 500));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(230, 255, 191));
        Menu.setPreferredSize(new java.awt.Dimension(180, 500));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo60px.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton1.setText("Veículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton2.setText("Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton3.setText("Aluguel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton4.setText("Entrada/Saída");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton5.setText("Funcionário");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton6.setText("Veículo danificado");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton7.setText("Sair");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(55, 55, 55))
        );

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 500));

        Veiculos.setBackground(new java.awt.Color(230, 255, 191));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marcas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carros", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout VeiculosLayout = new javax.swing.GroupLayout(Veiculos);
        Veiculos.setLayout(VeiculosLayout);
        VeiculosLayout.setHorizontalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculosLayout.createSequentialGroup()
                .addGroup(VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        VeiculosLayout.setVerticalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );

        Background.add(Veiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 170, 500));

        Alugar.setBackground(new java.awt.Color(230, 255, 191));
        Alugar.setMaximumSize(new java.awt.Dimension(1252, 500));
        Alugar.setMinimumSize(new java.awt.Dimension(0, 500));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("Placa:");

        model.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model.setText("Modelo:");

        marcas.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        marcas.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("Ano:");

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setText("Preço:");

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setText("Portas:");

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel11.setText("Porta Malas:");

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel12.setText("Cambio:");

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setText("Ocupantes:");

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel14.setText("Banco:");

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel15.setText("Autonomia:");

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel16.setText("Combustivel");

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel17.setText("Peso(Kg):");

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel18.setText("Tamanho(m):");

        jLabel19.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel19.setText("Kilometragem:");

        jLabel20.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel20.setText("AirBag:");

        jLabel21.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel21.setText("ArCondicionado:");

        jLabel22.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel22.setText("Direção Hidraulica:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("Trava Elétrica:");

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Data de Inspeção:");

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Cor:");

        jLabel23.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel23.setText("Danificado");

        jButton8.setText("ALUGAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        model1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model1.setForeground(new java.awt.Color(255, 0, 0));

        model2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model2.setForeground(new java.awt.Color(255, 0, 0));
        model2.setText("Modelo:");

        model3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model3.setForeground(new java.awt.Color(255, 0, 0));
        model3.setText("Modelo:");

        model4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model4.setForeground(new java.awt.Color(255, 0, 0));
        model4.setText("Modelo:");

        model5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model5.setForeground(new java.awt.Color(255, 0, 0));
        model5.setText("Modelo:");

        model6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model6.setForeground(new java.awt.Color(255, 0, 0));
        model6.setText("Modelo:");

        model7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model7.setForeground(new java.awt.Color(255, 0, 0));
        model7.setText("Modelo:");

        model8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model8.setForeground(new java.awt.Color(255, 0, 0));
        model8.setText("Modelo:");

        model9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model9.setForeground(new java.awt.Color(255, 0, 0));
        model9.setText("Modelo:");

        model10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model10.setForeground(new java.awt.Color(255, 0, 0));
        model10.setText("Modelo:");

        model11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model11.setForeground(new java.awt.Color(255, 0, 0));
        model11.setText("Modelo:");

        model12.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model12.setForeground(new java.awt.Color(255, 0, 0));
        model12.setText("Modelo:");

        model13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model13.setForeground(new java.awt.Color(255, 0, 0));
        model13.setText("Modelo:");

        model14.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model14.setForeground(new java.awt.Color(255, 0, 0));
        model14.setText("Modelo:");

        model15.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model15.setForeground(new java.awt.Color(255, 0, 0));
        model15.setText("Modelo:");

        model16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model16.setForeground(new java.awt.Color(255, 0, 0));
        model16.setText("Modelo:");

        model17.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model17.setForeground(new java.awt.Color(255, 0, 0));
        model17.setText("Modelo:");

        model18.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model18.setForeground(new java.awt.Color(255, 0, 0));
        model18.setText("Modelo:");

        model19.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model19.setForeground(new java.awt.Color(255, 0, 0));
        model19.setText("Modelo:");

        model20.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model20.setForeground(new java.awt.Color(255, 0, 0));
        model20.setText("Modelo:");

        model21.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model21.setForeground(new java.awt.Color(255, 0, 0));
        model21.setText("Modelo:");

        model22.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model22.setForeground(new java.awt.Color(255, 0, 0));
        model22.setText("Modelo:");

        model23.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model23.setForeground(new java.awt.Color(255, 0, 0));

        model24.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model24.setText("CLIENTE:");

        jLabel24.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel24.setText("Data do Aluguel:");

        try {
            Dsaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Dsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsaidaActionPerformed(evt);
            }
        });

        try {
            Dentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Dentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DentradaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel25.setText("Data da Devolução:");

        jLabel26.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel26.setText("Horário do Aluguel:");

        try {
            Hsaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Hsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HsaidaActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel27.setText("Horário da Devolução:");

        try {
            Hentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Hentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HentradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlugarLayout = new javax.swing.GroupLayout(Alugar);
        Alugar.setLayout(AlugarLayout);
        AlugarLayout.setHorizontalGroup(
            AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlugarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlugarLayout.createSequentialGroup()
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(model10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(model11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(model5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(AlugarLayout.createSequentialGroup()
                                    .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(model16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model18, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model22, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(AlugarLayout.createSequentialGroup()
                                    .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Hentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Hsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(7, 7, 7))))
                        .addGap(33, 33, 33))
                    .addGroup(AlugarLayout.createSequentialGroup()
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addComponent(model24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(AlugarLayout.createSequentialGroup()
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Dsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AlugarLayout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Dentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(161, 161, 161))))
        );
        AlugarLayout.setVerticalGroup(
            AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlugarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AlugarLayout.createSequentialGroup()
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(AlugarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AlugarLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(model17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addComponent(model12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(model13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(model14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(model15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(AlugarLayout.createSequentialGroup()
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AlugarLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(model24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        Background.add(Alugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 610, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        prin = new principal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clin = new cliente();
        clin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        if (valor == 0) {
//            Funcionarios.setVisible(true);
//            valor = 1;
//        }else if(valor == 1){
//            Funcionarios.setVisible(false);
//            Cadastro.setVisible(false);
//            valor = 0;
//            valor1 = 0;
//        }
        fun = new funcionario();
        fun.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:;
        int linha = jTable1.getSelectedRow(); // retorna a linha selecionada pelo usuario
        dado = jTable1.getValueAt(linha,0).toString();
        this.consultarDadoscarros("SELECT * FROM automovel WHERE marca = '" + dado + "'");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        Alugar.setVisible(true);
        Veiculos.setBackground(new Color(92, 140, 20));
        valor = 1;
        valor = 0;
        this.consultarDadosCliente("SELECT * FROM cliente ");
        int linha = jTable2.getSelectedRow(); // retorna a linha selecionada pelo usuario
        dado = (jTable2.getValueAt(linha,1).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM automovel");
            while(res.next()){
                //                int masc = res.getInt("marca");
                if (res.getString("placa") == null ? dado == null : res.getString("placa").equals(dado)) {
                    model1.setText(res.getString("modelo"));
                    model2.setText(res.getString("marca"));
                    model3.setText(res.getString("placa"));
                    model4.setText(res.getString("ano"));
                    model5.setText(res.getString("preco"));
                    model6.setText(res.getString("portas"));
                    model7.setText(res.getString("litroPortaMalas"));
                    model8.setText(res.getString("cambio"));
                    model9.setText(res.getString("capacidadePessoas"));
                    model10.setText(res.getString("banco"));
                    model11.setText(res.getString("autonomia"));
                    model12.setText(res.getString("kilometragem"));
                    model13.setText(res.getString("airbag"));
                    model14.setText(res.getString("arCondicionado"));
                    model15.setText(res.getString("direcaoHidraulica"));
                    model16.setText(res.getString("travaEletrica"));
                    model17.setText(res.getString("dataInspecao"));
                    model18.setText(res.getString("cor"));
                    model19.setText(res.getString("combustivel"));
                    model20.setText(res.getString("peso"));
                    model21.setText(res.getString("tamanho"));
                    model22.setText(res.getString("danificado"));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here
        if(valor == 0){
            Veiculos.setVisible(true);
            valor = 1;
        }else if(valor == 1){
            Veiculos.setVisible(false);
            Alugar.setVisible(false);
            valor = 0;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.consultarDados("SELECT * FROM marcas_automovel ORDER BY id ASC");// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        model23.setText("");
        model23.setVisible(true);
        int linha = jTable3.getSelectedRow();
        model23.setText(jTable3.getValueAt(linha,0).toString());
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        inserirDados();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void DsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DsaidaActionPerformed

    private void DentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DentradaActionPerformed

    private void HsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HsaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HsaidaActionPerformed

    private void HentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HentradaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        es = new entradasaida();
        es.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dani = new danificado();
        dani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alugar;
    private javax.swing.JPanel Background;
    private javax.swing.JFormattedTextField Dentrada;
    private javax.swing.JFormattedTextField Dsaida;
    private javax.swing.JFormattedTextField Hentrada;
    private javax.swing.JFormattedTextField Hsaida;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Veiculos;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel marcas;
    private javax.swing.JLabel model;
    private javax.swing.JLabel model1;
    private javax.swing.JLabel model10;
    private javax.swing.JLabel model11;
    private javax.swing.JLabel model12;
    private javax.swing.JLabel model13;
    private javax.swing.JLabel model14;
    private javax.swing.JLabel model15;
    private javax.swing.JLabel model16;
    private javax.swing.JLabel model17;
    private javax.swing.JLabel model18;
    private javax.swing.JLabel model19;
    private javax.swing.JLabel model2;
    private javax.swing.JLabel model20;
    private javax.swing.JLabel model21;
    private javax.swing.JLabel model22;
    private javax.swing.JLabel model23;
    private javax.swing.JLabel model24;
    private javax.swing.JLabel model3;
    private javax.swing.JLabel model4;
    private javax.swing.JLabel model5;
    private javax.swing.JLabel model6;
    private javax.swing.JLabel model7;
    private javax.swing.JLabel model8;
    private javax.swing.JLabel model9;
    // End of variables declaration//GEN-END:variables
    public void consultarDados(String sql) {
        try
        {
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/projeto","root","");
             PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
             banco.execute(); 
             ResultSet dados = banco.executeQuery(sql);

             DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
             model.setNumRows(0);

             while(dados.next())
             {
                 
                 model.addRow(new Object[] 
                 { 
                    dados.getString("marcas")
                    
                 }); 
            } 
            banco.close();
            con.close();
        }
        catch (SQLException e)
        {
              System.out.println("Erro: " +e);
        }
    }
    public void consultarDadoscarros(String sql){
        try
        {
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/projeto","root","");
             PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
             banco.execute(); 
             ResultSet dados = banco.executeQuery(sql);

             DefaultTableModel model =(DefaultTableModel) jTable2.getModel();
             model.setNumRows(0);

             while(dados.next())
             {
                 model.addRow(new Object[] 
                 { 
                    dados.getString("modelo"),
                    dados.getString("placa")
                      
                 });
            } 
            banco.close();
            con.close();
        }
        catch (SQLException e)
        {
              System.out.println("Erro: " +e);
        }
    }
    public void consultarDadosCliente(String sql){
        try
        {
             Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/projeto","root","");
             PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
             banco.execute(); 
             ResultSet dados = banco.executeQuery(sql);

             DefaultTableModel model =(DefaultTableModel) jTable3.getModel();
             model.setNumRows(0);

             while(dados.next())
             {
                 model.addRow(new Object[] 
                 { 
                    dados.getString("nome"),
                    dados.getString("cpf")
                 }); 
            } 
            banco.close();
            con.close();
        }
        catch (SQLException e)
        {
              System.out.println("Erro: " +e);
        }
    }
    public void limparDados(){
        model1.setText("");
        model2.setText("");
        model3.setText("");
        model4.setText("");
        model5.setText("");
        model6.setText("");
        model7.setText("");
        model8.setText("");
        model9.setText("");
        model10.setText("");
        model11.setText("");
        model12.setText("");
        model13.setText("");
        model14.setText("");
        model15.setText("");
        model16.setText("");
        model17.setText("");
        model18.setText("");
        model19.setText("");
        model20.setText("");
        model21.setText("");
        model22.setText("");
        model23.setText("");
        Dsaida.setText("");
        Dentrada.setText("");
        Hsaida.setText("");
        Hentrada.setText("");
    }
    public void inserirDados(){
        datasaida = Dsaida.getText();
        dataentrada = Dentrada.getText();
        horentrada = Hsaida.getText();
        horsaida = Hentrada.getText();
        automovel = model1.getText();
        placa = model3.getText();
        danificado = model22.getText();
        int linha = jTable2.getSelectedRow(); // retorna a linha selecionada pelo usuario
        dado = (jTable3.getValueAt(linha,1).toString());
        cliente = (jTable3.getValueAt(linha, 0).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
            Statement stm = con.createStatement();
            
            if("  /  /    ".equals(datasaida)){
                JOptionPane.showMessageDialog(null,"DIGITE A DATA DO ALUGUEL \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if("  /  /    ".equals(dataentrada)){
                JOptionPane.showMessageDialog(null,"SELECIONE A DATA DA DEVOLUÇÃO \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if("  :  ".equals(horentrada)){
                JOptionPane.showMessageDialog(null,"DIGITE O HORARIO DO ALUGUEL \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if("  :  ".equals(horsaida)){
                JOptionPane.showMessageDialog(null,"SELECIONE O HORARIO DA DEVOLUÇÃO \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if("Sim".equals(danificado)){
                JOptionPane.showMessageDialog(null,"AUTOMÓVEL DANIFICADO \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if(model23.getText().equals("")){
                JOptionPane.showMessageDialog(null,"ESCOLHA O CLIENTE \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else if(model1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"ESCOLHA O AUTOMÓVEL \n","Aluguel", JOptionPane.INFORMATION_MESSAGE);
            }else{
                int executeUpdate = stm.executeUpdate("INSERT into aluguel values('"+id+"','"+datasaida+"','"+horsaida+"','"+dataentrada+"','"+horentrada+"','"+automovel+"','"+placa+"','"+cliente+"','"+dado+"')");
                JOptionPane.showMessageDialog(null,"Aluguel efetuado com sucesso!!!!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparDados();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na locação do carro!!!!","Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
