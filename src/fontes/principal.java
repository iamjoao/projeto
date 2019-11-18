package fontes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {
    private cliente clin;
    private funcionario fun;
    private login login;
    public int valor = 0, valor1 = 0, id;
    private String modelo, marca, placa, portas, ano, malas, preco, cambio,
            pessoas, banco, autonomia, combustivel, peso, tam, km, air, ar, direcao, trava, data, cor,test;
    public principal() {
        initComponents();
//        automoveis p1 = new automoveis();
//        p1.setSize(400,300);
//        p1.setLocation(5, 5);
//        Background.removeAll();
//        Background.add(p1, BorderLayout.CENTER);
//        Background.revalidate();
//        Background.repaint();
        Veiculos.setVisible(false);
        Cadastro.setVisible(false);
        setIconImage(getIconImage());
        
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
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cadastro = new javax.swing.JPanel();
        campoModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        marcas = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoPortamalas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        caixaMarca = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        campoOcupantes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        caixaBanco = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        campoAutonomia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        caixaCombustivel = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campoTamanho = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoKilometragem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        caixaCambio = new javax.swing.JComboBox<>();
        caixaAirbag = new javax.swing.JComboBox<>();
        caixaAr = new javax.swing.JComboBox<>();
        caixaDirecao = new javax.swing.JComboBox<>();
        caixaTrava = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        campoAno = new javax.swing.JTextField();
        caixaPortas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        caixaCor = new javax.swing.JTextField();
        campoData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setBackground(new java.awt.Color(57, 64, 48));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Background.setBackground(new java.awt.Color(57, 64, 48));
        Background.setPreferredSize(new java.awt.Dimension(1300, 700));

        Menu.setBackground(new java.awt.Color(230, 255, 191));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo60px.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton1.setText("Veículos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton2.setText("Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton3.setText("Aluguel");

        jButton4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton4.setText("Entrada/Saída");

        jButton5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton5.setText("Funcionário");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton6.setText("Veículo danificado");

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
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap())
        );

        Veiculos.setBackground(new java.awt.Color(230, 255, 191));

        jButton8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton8.setText("Cadastrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marcas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout VeiculosLayout = new javax.swing.GroupLayout(Veiculos);
        Veiculos.setLayout(VeiculosLayout);
        VeiculosLayout.setHorizontalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        VeiculosLayout.setVerticalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cadastro.setBackground(new java.awt.Color(230, 255, 191));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Placa:");

        model.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        model.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        model.setText("Modelo:");

        marcas.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        marcas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        marcas.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Ano:");

        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Preço:");

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Portas:");

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Porta Malas(L):");

        jLabel12.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel12.setText("Cambio:");

        caixaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaMarcaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel13.setText("Ocupantes:");

        jLabel14.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel14.setText("Banco:");

        caixaBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Couro", "Tecido" }));
        caixaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaBancoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel15.setText("Autonomia(Kg/l):");

        campoAutonomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAutonomiaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel16.setText("Combustivel");

        caixaCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Gasolina", "Álcool", "Flex" }));
        caixaCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCombustivelActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel17.setText("Peso(Kg):");

        campoPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPesoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPesoFocusLost(evt);
            }
        });
        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });
        campoPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel18.setText("Tamanho(m):");

        jLabel19.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel19.setText("Kilometragem:");

        jLabel20.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel20.setText("AirBag");

        jLabel21.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel21.setText("ArCondicionado:");

        jLabel22.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel22.setText("Direção Hidraulica:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("Trava Elétrica:");

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Data de Inspeção:");

        caixaCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Manual", "Automático" }));
        caixaCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCambioActionPerformed(evt);
            }
        });

        caixaAirbag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));
        caixaAirbag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaAirbagActionPerformed(evt);
            }
        });

        caixaAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        caixaDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        caixaTrava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("CADASTRAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        caixaPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "2", "3", "4" }));
        caixaPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPortasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Cor:");

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.setToolTipText("");
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("LIMPAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(caixaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(caixaPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(campoPortamalas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caixaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(caixaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(campoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(campoKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaAirbag, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaAr, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaTrava, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(caixaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(caixaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(caixaPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPortamalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(campoOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaAirbag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaAr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaTrava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))))
                .addGap(42, 42, 42)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(jButton11))
                .addGap(318, 318, 318))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Veiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Veiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        limparDados();

    }//GEN-LAST:event_jButton12ActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void caixaPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaPortasActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        modelo = campoModelo.getText();
        marca = (String) caixaMarca.getSelectedItem();
        placa = campoPlaca.getText();
        ano = campoAno.getText();
        preco = campoPreco.getText();
        portas = (String)caixaPortas.getSelectedItem();
        malas = campoPortamalas.getText();
        cambio = (String) caixaCambio.getSelectedItem();
        pessoas = campoOcupantes.getText();
        banco = (String) caixaBanco.getSelectedItem();
        autonomia = campoAutonomia.getText();
        combustivel = (String) caixaCombustivel.getSelectedItem();
        peso = campoPeso.getText();
        tam = campoTamanho.getText();
        km = campoKilometragem.getText();
        air = (String) caixaAirbag.getSelectedItem();
        ar = (String) caixaAr.getSelectedItem();
        direcao = (String) caixaDirecao.getSelectedItem();
        trava = (String) caixaTrava.getSelectedItem();
        data = campoData.getText();
        cor = caixaCor.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
            Statement stm = con.createStatement();

            if("".equals(modelo)){
                JOptionPane.showMessageDialog(null,"DIGITE O MODELO DO CARRO \n","Modelo", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(marca)){
                JOptionPane.showMessageDialog(null,"SELECIONE A MARCA DO CARRO \n","Marca", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(placa)){
                JOptionPane.showMessageDialog(null,"DIGITE A PLACA DO CARRO \n","Placa", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(ano)){
                JOptionPane.showMessageDialog(null,"DIGITE O ANO DO CARRO \n","Ano", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(preco)){
                JOptionPane.showMessageDialog(null,"DIGITE PREÇO DO CARRO \n","Preço", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(portas)){
                JOptionPane.showMessageDialog(null,"SELECIONE A QUANTIDADE DE PORTAS DO CARRO \n","Portas", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(malas)){
                JOptionPane.showMessageDialog(null,"DIGITE A QUANTIDADE DE LITROS DO PORTA MALAS DO CARRO \n","Porta Malas", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(cambio)){
                JOptionPane.showMessageDialog(null,"SELECIONE A TRANSMISSÃO DO CÂMBIO \n","Câmbio", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(pessoas)){
                JOptionPane.showMessageDialog(null,"DIGITE A CAPACIDADE DE PESSOAS DO CARRO \n","Capacidade", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(banco)){
                JOptionPane.showMessageDialog(null,"SELECIONE O MATERIAL DO BANCO DO CARRO \n","Material do Banco", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(autonomia)){
                JOptionPane.showMessageDialog(null,"DIGITE A AUTONOMIA DO CARRO \n","Autonomia", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(combustivel)){
                JOptionPane.showMessageDialog(null,"SELECIONE O TIPO DE COMBUSTÍVEL DO CARRO \n","Combustível", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(peso)){
                JOptionPane.showMessageDialog(null,"DIGITE O PESO DO CARRO \n","Peso", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(tam)){
                JOptionPane.showMessageDialog(null,"DIGITE O TAMANHO DO CARRO \n","Tamanho", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(km)){
                JOptionPane.showMessageDialog(null,"DIGITE A KILOMETRAGEM DO CARRO \n","Kilometragem", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(air)){
                JOptionPane.showMessageDialog(null,"SELECIONE UMA OPÇÃO PARA O AIRBAG\n","AirBag", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(ar)){
                JOptionPane.showMessageDialog(null,"SELECIONE UMA OPÇÃO PARA O ARCONDICIONADO\n","ArCondicionado", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(direcao)){
                JOptionPane.showMessageDialog(null,"SELECIONE UMA OPÇÃO A DIRAÇÃO HIDRÁULICA\n","Direção", JOptionPane.INFORMATION_MESSAGE);
            }else if("Selecione uma opção".equals(trava)){
                JOptionPane.showMessageDialog(null,"SELECIONE UMA OPÇÃO PARA TRAVA ELÉTRICA\n","Trava Elétrica", JOptionPane.INFORMATION_MESSAGE);
            }else if("".equals(data)){
                JOptionPane.showMessageDialog(null,"DIGITE A DATA DA ÚLTIMA INSPEÇÃO DO CARRO \n","Kilometragem", JOptionPane.INFORMATION_MESSAGE);
            }else{
                int executeUpdate = stm.executeUpdate("INSERT into automovel values('"+id+"','"+preco+"','"+placa+"','"+ano+"','"+cor+"','"+modelo+"','"+marca+"'"
                    + ",'"+portas+"','"+malas+"','"+cambio+"','"+pessoas+"','"+banco+"','"+autonomia+"','"+combustivel+"','"+peso+"'"
                    + ",'"+tam+"','"+km+"','"+air+"','"+ar+"','"+direcao+"','"+trava+"','"+data+"')");
                JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!!!!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparDados();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void caixaAirbagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaAirbagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaAirbagActionPerformed

    private void caixaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaCambioActionPerformed

    private void campoPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesoKeyPressed
        // TODO add your handling code here:
        if(campoPeso.getText().equals("(EX: 950)")){
            campoPeso.setText("");
            campoPeso.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_campoPesoKeyPressed

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_campoPesoActionPerformed

    private void campoPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesoFocusLost
        // TODO add your handling code here:
        if(campoPeso.getText().equals("")){
            campoPeso.setText("(EX: 950)");
            campoPeso.setForeground(new Color(169, 169, 169));
        }
    }//GEN-LAST:event_campoPesoFocusLost

    private void campoPesoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPesoFocusGained
        // TODO add your handling code here:
        if(campoPeso.getText().equals("(EX: 950)")){
            campoPeso.setCaretPosition(0);
            campoPeso.setCaretColor(Color.BLACK);
        }
    }//GEN-LAST:event_campoPesoFocusGained

    private void caixaCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaCombustivelActionPerformed

    private void campoAutonomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAutonomiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAutonomiaActionPerformed

    private void caixaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaBancoActionPerformed

    private void caixaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaMarcaActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (valor == 0) {
            Cadastro.setVisible(true);
            valor = 1;
        }else if(valor == 1){
            Cadastro.setVisible(false);
            valor = 0;
        }

        campoPeso.setText("(EX: 950)");
        campoPeso.setForeground(new Color(169, 169, 169));

    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.consultarDados("SELECT * FROM marcas_automovel ORDER BY id ASC");
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        login = new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        fun = new funcionario();
        fun.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clin = new cliente();
        clin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(valor1 == 0){
            Veiculos.setVisible(true);
            valor1 = 1;
        }else if(valor1 == 1){
            Veiculos.setVisible(false);
            Cadastro.setVisible(false);
            valor1 = 0;
            valor = 0;
        }
        DadosLogin d = new DadosLogin();
        String cargo = d.getLogin();
        //        if(!"Gerente".equals(cargo)){
            //            jButton8.setEnabled(false);
            //        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Cadastro.setVisible(false);
        valor = 0;
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Cadastro;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Veiculos;
    private javax.swing.JComboBox<String> caixaAirbag;
    private javax.swing.JComboBox<String> caixaAr;
    private javax.swing.JComboBox<String> caixaBanco;
    private javax.swing.JComboBox<String> caixaCambio;
    private javax.swing.JComboBox<String> caixaCombustivel;
    private javax.swing.JTextField caixaCor;
    private javax.swing.JComboBox<String> caixaDirecao;
    private javax.swing.JComboBox<Object> caixaMarca;
    private javax.swing.JComboBox<String> caixaPortas;
    private javax.swing.JComboBox<String> caixaTrava;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoAutonomia;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoKilometragem;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoOcupantes;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoPortamalas;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoTamanho;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel marcas;
    private javax.swing.JLabel model;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image iconImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void limparDados(){
        campoModelo.setText("");
        caixaMarca.setSelectedItem("Selecione uma opção");
        campoPlaca.setText("");
        campoAno.setText("");
        campoPreco.setText("");
        caixaPortas.setSelectedItem("Selecione uma opção");
        campoPortamalas.setText("");
        caixaCambio.setSelectedItem("Selecione uma opção");
        campoOcupantes.setText("");
        caixaBanco.setSelectedItem("Selecione uma opção");
        campoAutonomia.setText("");
        caixaCombustivel.setSelectedItem("Selecione uma opção");
        
        campoPeso.setText("");
        
        
        campoTamanho.setText("");
        campoKilometragem.setText("");
        caixaAirbag.setSelectedItem("Selecione uma opção");
        caixaAr.setSelectedItem("Selecione uma opção");
        caixaDirecao.setSelectedItem("Selecione uma opção");
        caixaTrava.setSelectedItem("Selecione uma opção");
        campoData.setText("");
        caixaCor.setText("");
    }
  
    public final java.awt.Image getIconImage(){
        java.awt.Image ICONE = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/logo60px.png"));
        return ICONE;
    }
    public void consultarDados(String sql) 
    {
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
}
