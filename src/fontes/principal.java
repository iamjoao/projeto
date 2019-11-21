package fontes;

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
    private aluguel aluguel;
    private String dado;  
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
        caixaCombinacao();
        Veiculos.setVisible(false);
        Cadastro.setVisible(false);
        setIconImage(getIconImage());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton7 = new javax.swing.JButton();
        Veiculos = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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
        campoCor = new javax.swing.JTextField();
        campoData = new javax.swing.JFormattedTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 64, 48));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(960, 500));
        setMinimumSize(new java.awt.Dimension(960, 500));
        setPreferredSize(new java.awt.Dimension(940, 500));
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo60px.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton1.setText("Veículos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton2.setText("Cliente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton3.setText("Aluguel");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton4.setText("Entrada/Saída");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton5.setText("Funcionário");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton6.setText("Veículo danificado");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton7.setText("Sair");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
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
            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        Veiculos.setBackground(new java.awt.Color(230, 255, 191));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton8.setText("Cadastrar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carros", "Placa"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout VeiculosLayout = new javax.swing.GroupLayout(Veiculos);
        Veiculos.setLayout(VeiculosLayout);
        VeiculosLayout.setHorizontalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(VeiculosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VeiculosLayout.setVerticalGroup(
            VeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        Background.add(Veiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 500));

        Cadastro.setBackground(new java.awt.Color(230, 255, 191));
        Cadastro.setMaximumSize(new java.awt.Dimension(1252, 500));
        Cadastro.setMinimumSize(new java.awt.Dimension(0, 500));

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

        jLabel15.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel15.setText("Autonomia:");

        jLabel16.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel16.setText("Combustivel");

        caixaCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Gasolina", "Álcool", "Flex" }));

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
        jLabel20.setText("AirBag:");

        jLabel21.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel21.setText("ArCondicionado:");

        jLabel22.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel22.setText("Direção Hidraulica:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("Trava Elétrica:");

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Data de Inspeção:");

        caixaCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Manual", "Automático" }));

        caixaAirbag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        caixaAr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        caixaDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        caixaTrava.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Sim", "Não" }));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("CADASTRAR");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        caixaPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "2", "3", "4" }));

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

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("LIMPAR");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setText("ALTERAR");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton13MouseExited(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setText("EXCLUIR");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton14MouseExited(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
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
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 30, Short.MAX_VALUE))
                    .addGroup(CadastroLayout.createSequentialGroup()
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
                                .addComponent(campoPortamalas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caixaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(campoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(caixaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caixaAirbag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoKilometragem)
                            .addComponent(caixaAr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixaDirecao, 0, 136, Short.MAX_VALUE)
                            .addComponent(campoTamanho)
                            .addComponent(campoPeso)
                            .addComponent(caixaTrava, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoData)
                            .addComponent(campoCor)
                            .addComponent(caixaCombustivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(caixaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(caixaPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(campoPortamalas))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(campoKilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(caixaAirbag, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(caixaAr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(caixaDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(caixaTrava, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(caixaCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(caixaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CadastroLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(campoAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Background.add(Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 620, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        inserirDados();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void campoPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesoKeyPressed
        // TODO add your handling code here:
        if(campoPeso.getText().equals("(EX: 950)")){
            campoPeso.setText("");
            campoPeso.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_campoPesoKeyPressed

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        limparDados();
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        if (valor == 0) {
            // ALTERAÇÃO DE COR DO PAINEL
            Veiculos.setBackground(new Color(92, 140, 20));
            
            Cadastro.setVisible(true);
            valor = 1;
        }else if(valor == 1){
            // ALTERAÇÃO DE COR DO PAINEL
            Veiculos.setBackground(new Color(230, 255, 191));
            
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
       
        if(valor1 == 0){
            // ALTERAÇÃO DE COR DO BOTÃO:
            Menu.setBackground(new Color(92, 140, 20));
        
            Veiculos.setVisible(true);
            valor1 = 1;
        }else if(valor1 == 1){
            // ALTERAÇÃO DE COR DO BOTÃO:
            Menu.setBackground(new Color(230, 255, 191));
            Veiculos.setBackground(new Color(230, 255, 191));
            
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
        // TODO add your handling code here:;
        int linha = jTable1.getSelectedRow(); // retorna a linha selecionada pelo usuario
        dado = (jTable1.getValueAt(linha,0).toString()); 
        this.consultarDadoscarros("SELECT * FROM automovel WHERE marca = '" + dado + "'");
    }//GEN-LAST:event_jTable1MouseClicked

//  ALTERAÇÃO DE CORES QUANDO O CURSOR DO MOUSE ENTRAR NO BOTÃO:
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jButton8.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        jButton11.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        jButton12.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton12MouseEntered

//  ALTERAÇÃO DE CORES QUANDO O CURSOR DO MOUSE SAIR DO BOTÃO:
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        jButton8.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        jButton11.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        jButton12.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        aluguel = new aluguel();
        aluguel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        Veiculos.setBackground(new Color(92, 140, 20));
        Cadastro.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        valor = 1;
        valor = 0;
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
                    campoModelo.setText(res.getString("modelo"));
                    caixaMarca.setSelectedItem("marca");
                    campoPlaca.setText(res.getString("placa"));
                    campoAno.setText(res.getString("ano"));
                    campoPreco.setText(res.getString("preco"));
                    caixaPortas.setSelectedItem("portas");
                    campoPortamalas.setText(res.getString("litroPortaMalas"));
                    caixaCambio.setSelectedItem("cambio");
                    campoOcupantes.setText(res.getString("capacidadePessoas"));
                    caixaBanco.setSelectedItem("banco");
                    campoAutonomia.setText(res.getString("autonomia"));
                    campoKilometragem.setText(res.getString("kilometragem"));
                    caixaAirbag.setSelectedItem("airbag");
                    caixaAr.setSelectedItem("arCondicionado");
                    caixaDirecao.setSelectedItem("direcaoHidraulica");
                    caixaTrava.setSelectedItem("travaEletrica");
                    campoData.setText(res.getString("dataInspecao"));
                    campoCor.setText(res.getString("cor"));
                    caixaCombustivel.setSelectedItem("combustivel");
                    campoPeso.setText(res.getString("peso"));
                    campoTamanho.setText(res.getString("tamanho"));
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseEntered
        // ALTERAÇÃO DE CORES NA ENTRADA:
        jButton13.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton13MouseEntered

    private void jButton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseExited
        // ALTERAÇÃO DE CORES NA SAÍDA:
        jButton13.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton13MouseExited

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        alterarDados();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void caixaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaMarcaActionPerformed

    private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseEntered
        // ALTERAÇÃO DE CORES NA ENTRADA:
        jButton14.setBackground(new Color(137, 202, 40));
    }//GEN-LAST:event_jButton14MouseEntered

    private void jButton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseExited
        // ALTERAÇÃO DE CORES NA SAÍDA:
        jButton14.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jButton14MouseExited

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        excluirDados();
    }//GEN-LAST:event_jButton14ActionPerformed
    
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
    private javax.swing.JComboBox<String> caixaDirecao;
    private javax.swing.JComboBox<Object> caixaMarca;
    private javax.swing.JComboBox<String> caixaPortas;
    private javax.swing.JComboBox<String> caixaTrava;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoAutonomia;
    private javax.swing.JTextField campoCor;
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
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel marcas;
    private javax.swing.JLabel model;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image iconImage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void caixaCombinacao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
            Statement stm = con.createStatement();
           
            ResultSet res = stm.executeQuery("SELECT * FROM marcas_automovel");
            caixaMarca.removeAllItems();
            while(res.next()){
                caixaMarca.addItem(res.getString("marcas"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void inserirDados(){
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
        cor = campoCor.getText();
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
    }
    public void alterarDados(){
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
        cor = campoCor.getText();
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
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
                String sql = ("UPDATE automovel SET modelo = '"+modelo+"', marca='"+marca+"',placa='"+placa+"',ano='"+ano+"',preco='"+preco+"',"
                        + "portas='"+portas+"',litroPortaMalas='"+malas+"',cambio='"+cambio+"',capacidadePessoas='"+pessoas+"',banco='"+banco+"',"
                        + "autonomia='"+autonomia+"',kilometragem='"+km+"',airbag='"+air+"',arCondicionado='"+ar+"',direcaoHidraulica='"+direcao+"',"
                        + "travaEletrica='"+trava+"',dataInspecao='"+data+"',cor='"+cor+"',combustivel='"+combustivel+"',"
                        + "peso='"+peso+"',tamanho='"+tam+"' WHERE placa = '" + placa + "'");
                PreparedStatement atualizar = con.prepareStatement(sql);
                atualizar.executeUpdate();
                JOptionPane.showMessageDialog(null,"Alteração efetuada com sucesso!!!!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
              
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
        if(!"".equals(campoPeso)){
          campoPeso.setText("(EX: 950)");
          campoPeso.setForeground(new Color(169, 169, 169)); 
        }
        campoTamanho.setText("");
        campoKilometragem.setText("");
        caixaAirbag.setSelectedItem("Selecione uma opção");
        caixaAr.setSelectedItem("Selecione uma opção");
        caixaDirecao.setSelectedItem("Selecione uma opção");
        caixaTrava.setSelectedItem("Selecione uma opção");
        campoData.setText("");
        campoCor.setText("");
    } 
    public void excluirDados(){
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
        cor = campoCor.getText();
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "");
                String sql = ("DELETE FROM automovel WHERE placa = '" + placa + "'");
                PreparedStatement atualizar = con.prepareStatement(sql);
                atualizar.executeUpdate();
                JOptionPane.showMessageDialog(null,"Exclusão efetuada com sucesso!!!!","Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public final java.awt.Image getIconImage(){
        java.awt.Image ICONE = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/logo60px.png"));
        return ICONE;
    }
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

}
