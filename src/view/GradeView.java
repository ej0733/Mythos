package view;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import jogador.DAOJogador;
import jogador.Jogador;

public class GradeView extends javax.swing.JFrame {

    private Timer timer;
    private TimerTask timerTask;
    private int cont = 0;

    public GradeView() {
        initComponents();
        daoJogador = new DAOJogador();
        jogador = IniciarSessao.getJogador();
        int grade = 0;
        int tempo = 0;
        int numJogadas = 0;
        Random random = new Random();
        //prepararPartida();
        setLocationRelativeTo(null);
    }

    public void modalidade(String modalidade1) {
        modalidade = modalidade1;
    }

    public void valorGrade(String valorGrade) {
        if (valorGrade.equals("3x3")) {
            grade = 3;
        }
        if (valorGrade.equals("4x4")) {
            grade = 4;
        }
        if (valorGrade.equals("5x5")) {
            grade = 5;
        }
    }

    public void aplicarGrade(String grade, String modalidade) {
        timer = new Timer();
        timerTask = new MeuTimer();
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 100);

        int i = 0;
        int j = 0;

        int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] num4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] num5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};

        char[] letra3 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] letra4 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};
        char[] letra5 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'v', 'W', 'X', 'Y'};

        umBT.setEnabled(true);
        doisBT.setEnabled(true);
        tresBT.setEnabled(true);
        quatroBT.setEnabled(true);
        cincoBT.setEnabled(true);
        seisBT.setEnabled(true);
        seteBT.setEnabled(true);
        oitoBT.setEnabled(true);
        noveBT.setEnabled(true);
        dezBT.setEnabled(true);
        onzeBT.setEnabled(true);
        dozeBT.setEnabled(true);
        trezeBT.setEnabled(true);
        quatorzeBT.setEnabled(true);
        quinzeBT.setEnabled(true);
        dezesseisBT.setEnabled(true);
        dezesseteBT.setEnabled(true);
        dezoitoBT.setEnabled(true);
        dezenoveBT.setEnabled(true);
        vinteBT.setEnabled(true);
        vinte1BT.setEnabled(true);
        vinte2BT.setEnabled(true);
        vinte3BT.setEnabled(true);
        vinte4BT.setEnabled(true);

        umBT.setVisible(true);
        doisBT.setVisible(true);
        tresBT.setVisible(true);
        quatroBT.setVisible(false);
        cincoBT.setVisible(false);
        seisBT.setVisible(true);
        seteBT.setVisible(true);
        oitoBT.setVisible(true);
        noveBT.setVisible(false);
        dezBT.setVisible(false);
        onzeBT.setVisible(true);
        dozeBT.setVisible(true);
        trezeBT.setVisible(false);
        quatorzeBT.setVisible(false);
        quinzeBT.setVisible(false);
        dezesseisBT.setVisible(false);
        dezesseteBT.setVisible(false);
        dezoitoBT.setVisible(false);
        dezenoveBT.setVisible(false);
        vinteBT.setVisible(false);
        vinte1BT.setVisible(false);
        vinte2BT.setVisible(false);
        vinte3BT.setVisible(false);
        vinte4BT.setVisible(false);
        vinte5BT.setVisible(false);

        if (modalidade.equals("Alfabeto")) {
            if (grade.equals("3x3")) {
                for (i = 0; i < 8; i++) {
                    j = (int) (Math.random() * 8);

                    char temp = letra3[i];

                    letra3[i] = letra3[j];

                    letra3[j] = temp;
                }

                umBT.setText(String.valueOf(letra3[0]));
                doisBT.setText(String.valueOf(letra3[1]));
                tresBT.setText(String.valueOf(letra3[2]));
                seisBT.setText(String.valueOf(letra3[3]));
                seteBT.setText(String.valueOf(letra3[4]));
                oitoBT.setText(String.valueOf(letra3[5]));
                onzeBT.setText(String.valueOf(letra3[6]));
                dozeBT.setText(String.valueOf(letra3[7]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
            }

            if (grade.equals("4x4")) {
                for (i = 0; i < 15; i++) {
                    j = (int) (Math.random() * 15);

                    char temp = letra4[i];
                    letra4[i] = letra4[j];
                    letra4[j] = temp;
                }

                umBT.setText(String.valueOf(letra4[0]));
                doisBT.setText(String.valueOf(letra4[1]));
                tresBT.setText(String.valueOf(letra4[2]));
                seisBT.setText(String.valueOf(letra4[3]));
                seteBT.setText(String.valueOf(letra4[4]));
                oitoBT.setText(String.valueOf(letra4[5]));
                onzeBT.setText(String.valueOf(letra4[6]));
                dozeBT.setText(String.valueOf(letra4[7]));
                trezeBT.setText(String.valueOf(letra4[8]));
                quatroBT.setText(String.valueOf(letra4[9]));
                noveBT.setText(String.valueOf(letra4[10]));
                quatorzeBT.setText(String.valueOf(letra4[11]));
                dezesseisBT.setText(String.valueOf(letra4[12]));
                dezesseteBT.setText(String.valueOf(letra4[13]));
                dezoitoBT.setText(String.valueOf(letra4[14]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
                trezeBT.setVisible(true);
                quatroBT.setVisible(true);
                noveBT.setVisible(true);
                quatorzeBT.setVisible(true);
                dezesseisBT.setVisible(true);
                dezesseteBT.setVisible(true);
                dezoitoBT.setVisible(true);
            }

            if (grade.equals("5x5")) {
                for (i = 0; i < 24; i++) {
                    j = (int) (Math.random() * 24);

                    char temp = letra5[i];
                    letra5[i] = letra5[j];
                    letra5[j] = temp;
                }

                umBT.setText(String.valueOf(letra5[0]));
                doisBT.setText(String.valueOf(letra5[1]));
                tresBT.setText(String.valueOf(letra5[2]));
                quatroBT.setText(String.valueOf(letra5[3]));
                cincoBT.setText(String.valueOf(letra5[4]));
                seisBT.setText(String.valueOf(letra5[5]));
                seteBT.setText(String.valueOf(letra5[6]));
                oitoBT.setText(String.valueOf(letra5[7]));
                noveBT.setText(String.valueOf(letra5[8]));
                dezBT.setText(String.valueOf(letra5[9]));
                onzeBT.setText(String.valueOf(letra5[10]));
                dozeBT.setText(String.valueOf(letra5[11]));
                trezeBT.setText(String.valueOf(letra5[12]));
                quatorzeBT.setText(String.valueOf(letra5[13]));
                quinzeBT.setText(String.valueOf(letra5[14]));
                dezesseisBT.setText(String.valueOf(letra5[15]));
                dezesseteBT.setText(String.valueOf(letra5[16]));
                dezoitoBT.setText(String.valueOf(letra5[17]));
                dezenoveBT.setText(String.valueOf(letra5[18]));
                vinteBT.setText(String.valueOf(letra5[19]));
                vinte1BT.setText(String.valueOf(letra5[20]));
                vinte2BT.setText(String.valueOf(letra5[21]));
                vinte3BT.setText(String.valueOf(letra5[22]));
                vinte4BT.setText(String.valueOf(letra5[23]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                quatroBT.setVisible(true);
                cincoBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                noveBT.setVisible(true);
                dezBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
                trezeBT.setVisible(true);
                quatorzeBT.setVisible(true);
                quinzeBT.setVisible(true);
                dezesseisBT.setVisible(true);
                dezesseteBT.setVisible(true);
                dezoitoBT.setVisible(true);
                dezenoveBT.setVisible(true);
                vinteBT.setVisible(true);
                vinte1BT.setVisible(true);
                vinte2BT.setVisible(true);
                vinte3BT.setVisible(true);
                vinte4BT.setVisible(true);
            }
        } else if (modalidade.equals("Números")) {
            if (grade.equals("3x3")) {
                for (i = 0; i < 8; i++) {
                    j = (int) (Math.random() * 8);

                    int temp = num3[i];

                    num3[i] = num3[j];

                    num3[j] = temp;
                }

                umBT.setText(String.valueOf(num3[0]));
                doisBT.setText(String.valueOf(num3[1]));
                tresBT.setText(String.valueOf(num3[2]));
                seisBT.setText(String.valueOf(num3[3]));
                seteBT.setText(String.valueOf(num3[4]));
                oitoBT.setText(String.valueOf(num3[5]));
                onzeBT.setText(String.valueOf(num3[6]));
                dozeBT.setText(String.valueOf(num3[7]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
            }

            if (grade.equals("4x4")) {
                for (i = 0; i < 15; i++) {
                    j = (int) (Math.random() * 15);

                    int temp = num4[i];
                    num4[i] = num4[j];
                    num4[j] = temp;
                }

                umBT.setText(String.valueOf(num4[0]));
                doisBT.setText(String.valueOf(num4[1]));
                tresBT.setText(String.valueOf(num4[2]));
                seisBT.setText(String.valueOf(num4[3]));
                seteBT.setText(String.valueOf(num4[4]));
                oitoBT.setText(String.valueOf(num4[5]));
                onzeBT.setText(String.valueOf(num4[6]));
                dozeBT.setText(String.valueOf(num4[7]));
                trezeBT.setText(String.valueOf(num4[8]));
                quatroBT.setText(String.valueOf(num4[9]));
                noveBT.setText(String.valueOf(num4[10]));
                quatorzeBT.setText(String.valueOf(num4[11]));
                dezesseisBT.setText(String.valueOf(num4[12]));
                dezesseteBT.setText(String.valueOf(num4[13]));
                dezoitoBT.setText(String.valueOf(num4[14]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
                trezeBT.setVisible(true);
                quatroBT.setVisible(true);
                noveBT.setVisible(true);
                quatorzeBT.setVisible(true);
                dezesseisBT.setVisible(true);
                dezesseteBT.setVisible(true);
                dezoitoBT.setVisible(true);
            }

            if (grade.equals("5x5")) {
                for (i = 0; i < 24; i++) {
                    j = (int) (Math.random() * 24);

                    int temp = num5[i];
                    num5[i] = num5[j];
                    num5[j] = temp;
                }

                umBT.setText(String.valueOf(num5[0]));
                doisBT.setText(String.valueOf(num5[1]));
                tresBT.setText(String.valueOf(num5[2]));
                quatroBT.setText(String.valueOf(num5[3]));
                cincoBT.setText(String.valueOf(num5[4]));
                seisBT.setText(String.valueOf(num5[5]));
                seteBT.setText(String.valueOf(num5[6]));
                oitoBT.setText(String.valueOf(num5[7]));
                noveBT.setText(String.valueOf(num5[8]));
                dezBT.setText(String.valueOf(num5[9]));
                onzeBT.setText(String.valueOf(num5[10]));
                dozeBT.setText(String.valueOf(num5[11]));
                trezeBT.setText(String.valueOf(num5[12]));
                quatorzeBT.setText(String.valueOf(num5[13]));
                quinzeBT.setText(String.valueOf(num5[14]));
                dezesseisBT.setText(String.valueOf(num5[15]));
                dezesseteBT.setText(String.valueOf(num5[16]));
                dezoitoBT.setText(String.valueOf(num5[17]));
                dezenoveBT.setText(String.valueOf(num5[18]));
                vinteBT.setText(String.valueOf(num5[19]));
                vinte1BT.setText(String.valueOf(num5[20]));
                vinte2BT.setText(String.valueOf(num5[21]));
                vinte3BT.setText(String.valueOf(num5[22]));
                vinte4BT.setText(String.valueOf(num5[23]));

                umBT.setVisible(true);
                doisBT.setVisible(true);
                tresBT.setVisible(true);
                quatroBT.setVisible(true);
                cincoBT.setVisible(true);
                seisBT.setVisible(true);
                seteBT.setVisible(true);
                oitoBT.setVisible(true);
                noveBT.setVisible(true);
                dezBT.setVisible(true);
                onzeBT.setVisible(true);
                dozeBT.setVisible(true);
                trezeBT.setVisible(true);
                quatorzeBT.setVisible(true);
                quinzeBT.setVisible(true);
                dezesseisBT.setVisible(true);
                dezesseteBT.setVisible(true);
                dezoitoBT.setVisible(true);
                dezenoveBT.setVisible(true);
                vinteBT.setVisible(true);
                vinte1BT.setVisible(true);
                vinte2BT.setVisible(true);
                vinte3BT.setVisible(true);
                vinte4BT.setVisible(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        restartBT = new javax.swing.JButton();
        numJogadasLB = new javax.swing.JLabel();
        labelTempoLB = new javax.swing.JLabel();
        tempoLB = new javax.swing.JLabel();
        jogadasLB = new javax.swing.JLabel();
        jogoPN = new javax.swing.JPanel();
        umBT = new javax.swing.JButton();
        doisBT = new javax.swing.JButton();
        tresBT = new javax.swing.JButton();
        quatroBT = new javax.swing.JButton();
        cincoBT = new javax.swing.JButton();
        seisBT = new javax.swing.JButton();
        seteBT = new javax.swing.JButton();
        oitoBT = new javax.swing.JButton();
        noveBT = new javax.swing.JButton();
        dezBT = new javax.swing.JButton();
        onzeBT = new javax.swing.JButton();
        dozeBT = new javax.swing.JButton();
        trezeBT = new javax.swing.JButton();
        quatorzeBT = new javax.swing.JButton();
        quinzeBT = new javax.swing.JButton();
        dezesseisBT = new javax.swing.JButton();
        dezesseteBT = new javax.swing.JButton();
        dezoitoBT = new javax.swing.JButton();
        dezenoveBT = new javax.swing.JButton();
        vinteBT = new javax.swing.JButton();
        vinte1BT = new javax.swing.JButton();
        vinte2BT = new javax.swing.JButton();
        vinte3BT = new javax.swing.JButton();
        vinte4BT = new javax.swing.JButton();
        vinte5BT = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mythos");
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        restartBT.setBackground(new java.awt.Color(140, 0, 255));
        restartBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/restart.png"))); // NOI18N
        restartBT.setBorder(null);
        restartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBTActionPerformed(evt);
            }
        });

        numJogadasLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numJogadasLB.setForeground(java.awt.Color.white);
        numJogadasLB.setText("Números de jogadas: ");

        labelTempoLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTempoLB.setForeground(java.awt.Color.white);
        labelTempoLB.setText("Tempo de jogo: ");

        tempoLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tempoLB.setForeground(java.awt.Color.white);
        tempoLB.setText("0:00");

        jogadasLB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jogadasLB.setForeground(java.awt.Color.white);
        jogadasLB.setText("0");

        jogoPN.setBackground(new java.awt.Color(255, 255, 255));
        jogoPN.setLayout(new java.awt.GridLayout(5, 5));

        umBT.setBackground(new java.awt.Color(255, 153, 102));
        umBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        umBT.setForeground(new java.awt.Color(255, 255, 255));
        umBT.setText("1");
        umBT.setToolTipText("");
        umBT.setBorder(null);
        umBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umBTActionPerformed(evt);
            }
        });
        jogoPN.add(umBT);

        doisBT.setBackground(new java.awt.Color(255, 153, 102));
        doisBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        doisBT.setForeground(new java.awt.Color(255, 255, 255));
        doisBT.setText("2");
        doisBT.setToolTipText("");
        doisBT.setBorder(null);
        doisBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisBTActionPerformed(evt);
            }
        });
        jogoPN.add(doisBT);

        tresBT.setBackground(new java.awt.Color(255, 153, 102));
        tresBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tresBT.setForeground(new java.awt.Color(255, 255, 255));
        tresBT.setText("3");
        tresBT.setToolTipText("");
        tresBT.setBorder(null);
        tresBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresBTActionPerformed(evt);
            }
        });
        jogoPN.add(tresBT);

        quatroBT.setBackground(new java.awt.Color(255, 153, 102));
        quatroBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quatroBT.setForeground(new java.awt.Color(255, 255, 255));
        quatroBT.setText("4");
        quatroBT.setToolTipText("");
        quatroBT.setBorder(null);
        quatroBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroBTActionPerformed(evt);
            }
        });
        jogoPN.add(quatroBT);

        cincoBT.setBackground(new java.awt.Color(255, 153, 102));
        cincoBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cincoBT.setForeground(new java.awt.Color(255, 255, 255));
        cincoBT.setText("5");
        cincoBT.setToolTipText("");
        cincoBT.setBorder(null);
        cincoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoBTActionPerformed(evt);
            }
        });
        jogoPN.add(cincoBT);

        seisBT.setBackground(new java.awt.Color(255, 153, 102));
        seisBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seisBT.setForeground(new java.awt.Color(255, 255, 255));
        seisBT.setText("6");
        seisBT.setToolTipText("");
        seisBT.setBorder(null);
        seisBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisBTActionPerformed(evt);
            }
        });
        jogoPN.add(seisBT);

        seteBT.setBackground(new java.awt.Color(255, 153, 102));
        seteBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seteBT.setForeground(new java.awt.Color(255, 255, 255));
        seteBT.setText("7");
        seteBT.setToolTipText("");
        seteBT.setBorder(null);
        seteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteBTActionPerformed(evt);
            }
        });
        jogoPN.add(seteBT);

        oitoBT.setBackground(new java.awt.Color(255, 153, 102));
        oitoBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oitoBT.setForeground(new java.awt.Color(255, 255, 255));
        oitoBT.setText("8");
        oitoBT.setToolTipText("");
        oitoBT.setBorder(null);
        oitoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoBTActionPerformed(evt);
            }
        });
        jogoPN.add(oitoBT);

        noveBT.setBackground(new java.awt.Color(255, 153, 102));
        noveBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        noveBT.setForeground(new java.awt.Color(255, 255, 255));
        noveBT.setText("9");
        noveBT.setToolTipText("");
        noveBT.setBorder(null);
        noveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveBTActionPerformed(evt);
            }
        });
        jogoPN.add(noveBT);

        dezBT.setBackground(new java.awt.Color(255, 153, 102));
        dezBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dezBT.setForeground(new java.awt.Color(255, 255, 255));
        dezBT.setText("10");
        dezBT.setToolTipText("");
        dezBT.setBorder(null);
        dezBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezBTActionPerformed(evt);
            }
        });
        jogoPN.add(dezBT);

        onzeBT.setBackground(new java.awt.Color(255, 153, 102));
        onzeBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        onzeBT.setForeground(new java.awt.Color(255, 255, 255));
        onzeBT.setText("11");
        onzeBT.setToolTipText("");
        onzeBT.setBorder(null);
        onzeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onzeBTActionPerformed(evt);
            }
        });
        jogoPN.add(onzeBT);

        dozeBT.setBackground(new java.awt.Color(255, 153, 102));
        dozeBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dozeBT.setForeground(new java.awt.Color(255, 255, 255));
        dozeBT.setText("12");
        dozeBT.setToolTipText("");
        dozeBT.setBorder(null);
        dozeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dozeBTActionPerformed(evt);
            }
        });
        jogoPN.add(dozeBT);

        trezeBT.setBackground(new java.awt.Color(255, 153, 102));
        trezeBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trezeBT.setForeground(new java.awt.Color(255, 255, 255));
        trezeBT.setText("13");
        trezeBT.setToolTipText("");
        trezeBT.setBorder(null);
        trezeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trezeBTActionPerformed(evt);
            }
        });
        jogoPN.add(trezeBT);

        quatorzeBT.setBackground(new java.awt.Color(255, 153, 102));
        quatorzeBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quatorzeBT.setForeground(new java.awt.Color(255, 255, 255));
        quatorzeBT.setText("14");
        quatorzeBT.setToolTipText("");
        quatorzeBT.setBorder(null);
        quatorzeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatorzeBTActionPerformed(evt);
            }
        });
        jogoPN.add(quatorzeBT);

        quinzeBT.setBackground(new java.awt.Color(255, 153, 102));
        quinzeBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quinzeBT.setForeground(new java.awt.Color(255, 255, 255));
        quinzeBT.setText("15");
        quinzeBT.setToolTipText("");
        quinzeBT.setBorder(null);
        quinzeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quinzeBTActionPerformed(evt);
            }
        });
        jogoPN.add(quinzeBT);

        dezesseisBT.setBackground(new java.awt.Color(255, 153, 102));
        dezesseisBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dezesseisBT.setForeground(new java.awt.Color(255, 255, 255));
        dezesseisBT.setText("16");
        dezesseisBT.setToolTipText("");
        dezesseisBT.setBorder(null);
        dezesseisBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezesseisBTActionPerformed(evt);
            }
        });
        jogoPN.add(dezesseisBT);

        dezesseteBT.setBackground(new java.awt.Color(255, 153, 102));
        dezesseteBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dezesseteBT.setForeground(new java.awt.Color(255, 255, 255));
        dezesseteBT.setText("17");
        dezesseteBT.setToolTipText("");
        dezesseteBT.setBorder(null);
        dezesseteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezesseteBTActionPerformed(evt);
            }
        });
        jogoPN.add(dezesseteBT);

        dezoitoBT.setBackground(new java.awt.Color(255, 153, 102));
        dezoitoBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dezoitoBT.setForeground(new java.awt.Color(255, 255, 255));
        dezoitoBT.setText("18");
        dezoitoBT.setToolTipText("");
        dezoitoBT.setBorder(null);
        dezoitoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezoitoBTActionPerformed(evt);
            }
        });
        jogoPN.add(dezoitoBT);

        dezenoveBT.setBackground(new java.awt.Color(255, 153, 102));
        dezenoveBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dezenoveBT.setForeground(new java.awt.Color(255, 255, 255));
        dezenoveBT.setText("19");
        dezenoveBT.setToolTipText("");
        dezenoveBT.setBorder(null);
        dezenoveBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dezenoveBTActionPerformed(evt);
            }
        });
        jogoPN.add(dezenoveBT);

        vinteBT.setBackground(new java.awt.Color(255, 153, 102));
        vinteBT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinteBT.setForeground(new java.awt.Color(255, 255, 255));
        vinteBT.setText("20");
        vinteBT.setToolTipText("");
        vinteBT.setBorder(null);
        vinteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinteBTActionPerformed(evt);
            }
        });
        jogoPN.add(vinteBT);

        vinte1BT.setBackground(new java.awt.Color(255, 153, 102));
        vinte1BT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinte1BT.setForeground(new java.awt.Color(255, 255, 255));
        vinte1BT.setText("21");
        vinte1BT.setToolTipText("");
        vinte1BT.setBorder(null);
        vinte1BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinte1BTActionPerformed(evt);
            }
        });
        jogoPN.add(vinte1BT);

        vinte2BT.setBackground(new java.awt.Color(255, 153, 102));
        vinte2BT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinte2BT.setForeground(new java.awt.Color(255, 255, 255));
        vinte2BT.setText("22");
        vinte2BT.setToolTipText("");
        vinte2BT.setBorder(null);
        vinte2BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinte2BTActionPerformed(evt);
            }
        });
        jogoPN.add(vinte2BT);

        vinte3BT.setBackground(new java.awt.Color(255, 153, 102));
        vinte3BT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinte3BT.setForeground(new java.awt.Color(255, 255, 255));
        vinte3BT.setText("23");
        vinte3BT.setToolTipText("");
        vinte3BT.setBorder(null);
        vinte3BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinte3BTActionPerformed(evt);
            }
        });
        jogoPN.add(vinte3BT);

        vinte4BT.setBackground(new java.awt.Color(255, 153, 102));
        vinte4BT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinte4BT.setForeground(new java.awt.Color(255, 255, 255));
        vinte4BT.setText("24");
        vinte4BT.setToolTipText("");
        vinte4BT.setBorder(null);
        vinte4BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinte4BTActionPerformed(evt);
            }
        });
        jogoPN.add(vinte4BT);

        vinte5BT.setBackground(new java.awt.Color(255, 153, 102));
        vinte5BT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vinte5BT.setForeground(new java.awt.Color(255, 255, 255));
        vinte5BT.setText("25");
        vinte5BT.setToolTipText("");
        vinte5BT.setBorder(null);
        vinte5BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vinte5BTActionPerformed(evt);
            }
        });
        jogoPN.add(vinte5BT);

        jButton1.setBackground(new java.awt.Color(255, 0, 187));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("DESISTIR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numJogadasLB, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jogadasLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(85, 85, 85)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTempoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(restartBT)
                .addGap(189, 189, 189))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jogoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numJogadasLB)
                    .addComponent(labelTempoLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jogadasLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restartBT)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(528, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jogoPN, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveBTActionPerformed
        if (grade == 4) {
            if (quatroBT.isVisible() == false) {
                quatroBT.setText(noveBT.getText());
                quatroBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                quatroBT.setVisible(true);
                contarMovimentos();
            }

            if (oitoBT.isVisible() == false) {
                oitoBT.setText(noveBT.getText());
                oitoBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }

            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(noveBT.getText());
                quatorzeBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (quatroBT.isVisible() == false) {
                quatroBT.setText(noveBT.getText());
                quatroBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                quatroBT.setVisible(true);
                contarMovimentos();
            }

            if (oitoBT.isVisible() == false) {
                oitoBT.setText(noveBT.getText());
                oitoBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }

            if (dezBT.isVisible() == false) {
                dezBT.setText(noveBT.getText());
                dezBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                dezBT.setVisible(true);
                contarMovimentos();
            }

            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(noveBT.getText());
                quatorzeBT.setIcon(noveBT.getIcon());
                noveBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_noveBTActionPerformed

    private void seisBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisBTActionPerformed
        if (umBT.isVisible() == false) {
            umBT.setText(seisBT.getText());
            umBT.setIcon(seisBT.getIcon());
            seisBT.setVisible(false);
            umBT.setVisible(true);
            contarMovimentos();
        }

        if (seteBT.isVisible() == false) {
            seteBT.setText(seisBT.getText());
            seteBT.setIcon(seisBT.getIcon());
            seisBT.setVisible(false);
            seteBT.setVisible(true);
            contarMovimentos();
        }

        if (onzeBT.isVisible() == false) {
            onzeBT.setText(seisBT.getText());
            onzeBT.setIcon(seisBT.getIcon());
            seisBT.setVisible(false);
            onzeBT.setVisible(true);
            contarMovimentos();
        }

        gameOver(grade);
    }//GEN-LAST:event_seisBTActionPerformed

    private void umBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umBTActionPerformed
        if (doisBT.isVisible() == false) {
            doisBT.setText(umBT.getText());
            doisBT.setIcon(umBT.getIcon());
            umBT.setVisible(false);
            doisBT.setVisible(true);
            contarMovimentos();
        }

        if (seisBT.isVisible() == false) {
            seisBT.setText(umBT.getText());
            seisBT.setIcon(umBT.getIcon());
            umBT.setVisible(false);
            seisBT.setVisible(true);
            contarMovimentos();
        }

        gameOver(grade);
    }//GEN-LAST:event_umBTActionPerformed

    private void doisBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisBTActionPerformed
        if (umBT.isVisible() == false) {
            umBT.setText(doisBT.getText());
            umBT.setIcon(doisBT.getIcon());
            doisBT.setVisible(false);
            umBT.setVisible(true);
            contarMovimentos();
        }

        if (tresBT.isVisible() == false) {
            tresBT.setText(doisBT.getText());
            tresBT.setIcon(doisBT.getIcon());
            doisBT.setVisible(false);
            tresBT.setVisible(true);
            contarMovimentos();
        }

        if (seteBT.isVisible() == false) {
            seteBT.setText(doisBT.getText());
            seteBT.setIcon(doisBT.getIcon());
            doisBT.setVisible(false);
            seteBT.setVisible(true);
            contarMovimentos();
        }

        gameOver(grade);
    }//GEN-LAST:event_doisBTActionPerformed

    private void tresBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresBTActionPerformed
        if (grade == 3) {
            if (doisBT.isVisible() == false) {
                doisBT.setText(tresBT.getText());
                doisBT.setIcon(tresBT.getIcon());
                tresBT.setVisible(false);
                doisBT.setVisible(true);
                contarMovimentos();
            }

            if (oitoBT.isVisible() == false) {
                oitoBT.setText(tresBT.getText());
                oitoBT.setIcon(tresBT.getIcon());
                tresBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade > 3) {
            if (doisBT.isVisible() == false) {
                doisBT.setText(tresBT.getText());
                doisBT.setIcon(tresBT.getIcon());
                tresBT.setVisible(false);
                doisBT.setVisible(true);
                contarMovimentos();
            }

            if (oitoBT.isVisible() == false) {
                oitoBT.setText(tresBT.getText());
                oitoBT.setIcon(tresBT.getIcon());
                tresBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }

            if (quatroBT.isVisible() == false) {
                quatroBT.setText(tresBT.getText());
                quatroBT.setIcon(tresBT.getIcon());
                tresBT.setVisible(false);
                quatroBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_tresBTActionPerformed

    private void quatroBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroBTActionPerformed
        if (grade == 4) {
            if (tresBT.isVisible() == false) {
                tresBT.setText(quatroBT.getText());
                tresBT.setIcon(quatroBT.getIcon());
                quatroBT.setVisible(false);
                tresBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(quatroBT.getText());
                noveBT.setIcon(quatroBT.getIcon());
                quatroBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }
        }
        if (grade == 5) {
            if (tresBT.isVisible() == false) {
                tresBT.setText(quatroBT.getText());
                tresBT.setIcon(quatroBT.getIcon());
                quatroBT.setVisible(false);
                tresBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(quatroBT.getText());
                noveBT.setIcon(quatroBT.getIcon());
                quatroBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }

            if (cincoBT.isVisible() == false) {
                cincoBT.setText(quatroBT.getText());
                cincoBT.setIcon(quatroBT.getIcon());
                quatroBT.setVisible(false);
                cincoBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_quatroBTActionPerformed

    private void cincoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoBTActionPerformed
        if (grade == 5) {
            if (quatroBT.isVisible() == false) {
                quatroBT.setText(cincoBT.getText());
                quatroBT.setIcon(cincoBT.getIcon());
                cincoBT.setVisible(false);
                quatroBT.setVisible(true);
                contarMovimentos();
            }

            if (dezBT.isVisible() == false) {
                dezBT.setText(cincoBT.getText());
                dezBT.setIcon(cincoBT.getIcon());
                cincoBT.setVisible(false);
                dezBT.setVisible(true);
                contarMovimentos();
            }
        }
        gameOver(grade);
    }//GEN-LAST:event_cincoBTActionPerformed

    private void seteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteBTActionPerformed
        if (doisBT.isVisible() == false) {
            doisBT.setText(seteBT.getText());
            doisBT.setIcon(seteBT.getIcon());
            seteBT.setVisible(false);
            doisBT.setVisible(true);
            contarMovimentos();
        }

        if (seisBT.isVisible() == false) {
            seisBT.setText(seteBT.getText());
            seisBT.setIcon(seteBT.getIcon());
            seteBT.setVisible(false);
            seisBT.setVisible(true);
            contarMovimentos();
        }

        if (oitoBT.isVisible() == false) {
            oitoBT.setText(seteBT.getText());
            oitoBT.setIcon(seteBT.getIcon());
            seteBT.setVisible(false);
            oitoBT.setVisible(true);
            contarMovimentos();
        }

        if (dozeBT.isVisible() == false) {
            dozeBT.setText(seteBT.getText());
            dozeBT.setIcon(seteBT.getIcon());
            seteBT.setVisible(false);
            dozeBT.setVisible(true);
            contarMovimentos();
        }

        gameOver(grade);
    }//GEN-LAST:event_seteBTActionPerformed

    private void oitoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoBTActionPerformed
        if (grade == 3) {
            if (tresBT.isVisible() == false) {
                tresBT.setText(oitoBT.getText());
                tresBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                tresBT.setVisible(true);
                contarMovimentos();
            }

            if (seteBT.isVisible() == false) {
                seteBT.setText(oitoBT.getText());
                seteBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                seteBT.setVisible(true);
                contarMovimentos();
            }

            if (trezeBT.isVisible() == false) {
                trezeBT.setText(oitoBT.getText());
                trezeBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade > 3) {
            if (tresBT.isVisible() == false) {
                tresBT.setText(oitoBT.getText());
                tresBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                tresBT.setVisible(true);
                contarMovimentos();
            }

            if (seteBT.isVisible() == false) {
                seteBT.setText(oitoBT.getText());
                seteBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                seteBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(oitoBT.getText());
                noveBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }

            if (trezeBT.isVisible() == false) {
                trezeBT.setText(oitoBT.getText());
                trezeBT.setIcon(oitoBT.getIcon());
                oitoBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_oitoBTActionPerformed

    private void dozeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dozeBTActionPerformed
        if (grade == 3) {
            if (onzeBT.isVisible() == false) {
                onzeBT.setText(dozeBT.getText());
                onzeBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                onzeBT.setVisible(true);
                contarMovimentos();
            }

            if (seteBT.isVisible() == false) {
                seteBT.setText(dozeBT.getText());
                seteBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                seteBT.setVisible(true);
                contarMovimentos();
            }

            if (trezeBT.isVisible() == false) {
                trezeBT.setText(dozeBT.getText());
                trezeBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade > 3) {
            if (onzeBT.isVisible() == false) {
                onzeBT.setText(dozeBT.getText());
                onzeBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                onzeBT.setVisible(true);
                contarMovimentos();
            }

            if (seteBT.isVisible() == false) {
                seteBT.setText(dozeBT.getText());
                seteBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                seteBT.setVisible(true);
                contarMovimentos();
            }

            if (trezeBT.isVisible() == false) {
                trezeBT.setText(dozeBT.getText());
                trezeBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(dozeBT.getText());
                dezesseteBT.setIcon(dozeBT.getIcon());
                dozeBT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dozeBTActionPerformed

    private void quinzeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quinzeBTActionPerformed
        if (grade == 5) {
            if (dezBT.isVisible() == false) {
                dezBT.setText(quinzeBT.getText());
                dezBT.setIcon(quinzeBT.getIcon());
                quinzeBT.setVisible(false);
                dezBT.setVisible(true);
                contarMovimentos();
            }

            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(quinzeBT.getText());
                quatorzeBT.setIcon(quinzeBT.getIcon());
                quinzeBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }

            if (vinteBT.isVisible() == false) {
                vinteBT.setText(quinzeBT.getText());
                vinteBT.setIcon(quinzeBT.getIcon());
                quinzeBT.setVisible(false);
                vinteBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_quinzeBTActionPerformed

    private void vinteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinteBTActionPerformed
        if (grade == 5) {
            if (quinzeBT.isVisible() == false) {
                quinzeBT.setText(vinteBT.getText());
                quinzeBT.setIcon(vinteBT.getIcon());
                vinteBT.setVisible(false);
                quinzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(vinteBT.getText());
                dezenoveBT.setIcon(vinteBT.getIcon());
                vinteBT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte5BT.isVisible() == false) {
                vinte5BT.setText(vinteBT.getText());
                vinte5BT.setIcon(vinteBT.getIcon());
                vinteBT.setVisible(false);
                vinte5BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinteBTActionPerformed

    private void vinte3BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinte3BTActionPerformed
        if (grade == 5) {
            if (vinte2BT.isVisible() == false) {
                vinte2BT.setText(vinte3BT.getText());
                vinte2BT.setIcon(vinte3BT.getIcon());
                vinte3BT.setVisible(false);
                vinte2BT.setVisible(true);
                contarMovimentos();
            }

            if (vinte4BT.isVisible() == false) {
                vinte4BT.setText(vinte3BT.getText());
                vinte4BT.setIcon(vinte3BT.getIcon());
                vinte3BT.setVisible(false);
                vinte4BT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(vinte3BT.getText());
                dezoitoBT.setIcon(vinte3BT.getIcon());
                vinte3BT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinte3BTActionPerformed

    private void vinte5BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinte5BTActionPerformed
        if (grade == 5) {
            if (vinteBT.isVisible() == false) {
                vinteBT.setText(vinte5BT.getText());
                vinteBT.setIcon(vinte5BT.getIcon());
                vinte5BT.setVisible(false);
                vinteBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte4BT.isVisible() == false) {
                vinte4BT.setText(vinte5BT.getText());
                vinte4BT.setIcon(vinte5BT.getIcon());
                vinte5BT.setVisible(false);
                vinte4BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinte5BTActionPerformed

    private void dezBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezBTActionPerformed
        if (grade == 5) {
            if (cincoBT.isVisible() == false) {
                cincoBT.setText(dezBT.getText());
                cincoBT.setIcon(dezBT.getIcon());
                dezBT.setVisible(false);
                cincoBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(dezBT.getText());
                noveBT.setIcon(dezBT.getIcon());
                dezBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }

            if (quinzeBT.isVisible() == false) {
                quinzeBT.setText(dezBT.getText());
                quinzeBT.setIcon(dezBT.getIcon());
                dezBT.setVisible(false);
                quinzeBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dezBTActionPerformed

    private void onzeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onzeBTActionPerformed
        if (grade == 3) {
            if (seisBT.isVisible() == false) {
                seisBT.setText(onzeBT.getText());
                seisBT.setIcon(onzeBT.getIcon());
                onzeBT.setVisible(false);
                seisBT.setVisible(true);
                contarMovimentos();
            }

            if (dozeBT.isVisible() == false) {
                dozeBT.setText(onzeBT.getText());
                dozeBT.setIcon(onzeBT.getIcon());
                onzeBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade > 3) {
            if (seisBT.isVisible() == false) {
                seisBT.setText(onzeBT.getText());
                seisBT.setIcon(onzeBT.getIcon());
                onzeBT.setVisible(false);
                seisBT.setVisible(true);
                contarMovimentos();
            }

            if (dozeBT.isVisible() == false) {
                dozeBT.setText(onzeBT.getText());
                dozeBT.setIcon(onzeBT.getIcon());
                onzeBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseisBT.isVisible() == false) {
                dezesseisBT.setText(onzeBT.getText());
                dezesseisBT.setIcon(onzeBT.getIcon());
                onzeBT.setVisible(false);
                dezesseisBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_onzeBTActionPerformed

    private void trezeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trezeBTActionPerformed
        if (grade == 3) {
            if (oitoBT.isVisible() == false) {
                oitoBT.setText(trezeBT.getText());
                oitoBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }

            if (dozeBT.isVisible() == false) {
                dozeBT.setText(trezeBT.getText());
                dozeBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade > 3) {
            if (oitoBT.isVisible() == false) {
                oitoBT.setText(trezeBT.getText());
                oitoBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                oitoBT.setVisible(true);
                contarMovimentos();
            }

            if (dozeBT.isVisible() == false) {
                dozeBT.setText(trezeBT.getText());
                dozeBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }

            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(trezeBT.getText());
                quatorzeBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(trezeBT.getText());
                dezoitoBT.setIcon(trezeBT.getIcon());
                trezeBT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_trezeBTActionPerformed

    private void quatorzeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatorzeBTActionPerformed
        if (grade == 4) {
            if (trezeBT.isVisible() == false) {
                trezeBT.setText(quatorzeBT.getText());
                trezeBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(quatorzeBT.getText());
                noveBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(quatorzeBT.getText());
                dezenoveBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (trezeBT.isVisible() == false) {
                trezeBT.setText(quatorzeBT.getText());
                trezeBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }

            if (noveBT.isVisible() == false) {
                noveBT.setText(quatorzeBT.getText());
                noveBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                noveBT.setVisible(true);
                contarMovimentos();
            }

            if (quinzeBT.isVisible() == false) {
                quinzeBT.setText(quatorzeBT.getText());
                quinzeBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                quinzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(quatorzeBT.getText());
                dezenoveBT.setIcon(quatorzeBT.getIcon());
                quatorzeBT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_quatorzeBTActionPerformed

    private void dezesseisBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezesseisBTActionPerformed
        if (grade == 4) {
            if (onzeBT.isVisible() == false) {
                onzeBT.setText(dezesseisBT.getText());
                onzeBT.setIcon(dezesseisBT.getIcon());
                dezesseisBT.setVisible(false);
                onzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(dezesseisBT.getText());
                dezesseteBT.setIcon(dezesseisBT.getIcon());
                dezesseisBT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (onzeBT.isVisible() == false) {
                onzeBT.setText(dezesseisBT.getText());
                onzeBT.setIcon(dezesseisBT.getIcon());
                dezesseisBT.setVisible(false);
                onzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(dezesseisBT.getText());
                dezesseteBT.setIcon(dezesseisBT.getIcon());
                dezesseisBT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte1BT.isVisible() == false) {
                vinte1BT.setText(dezesseisBT.getText());
                vinte1BT.setIcon(dezesseisBT.getIcon());
                dezesseisBT.setVisible(false);
                vinte1BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dezesseisBTActionPerformed

    private void dezesseteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezesseteBTActionPerformed
        if (grade == 4) {
            if (dozeBT.isVisible() == false) {
                dozeBT.setText(dezesseteBT.getText());
                dozeBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseisBT.isVisible() == false) {
                dezesseisBT.setText(dezesseteBT.getText());
                dezesseisBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dezesseisBT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(dezesseteBT.getText());
                dezoitoBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (dozeBT.isVisible() == false) {
                dozeBT.setText(dezesseteBT.getText());
                dozeBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dozeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseisBT.isVisible() == false) {
                dezesseisBT.setText(dezesseteBT.getText());
                dezesseisBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dezesseisBT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(dezesseteBT.getText());
                dezoitoBT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte2BT.isVisible() == false) {
                vinte2BT.setText(dezesseteBT.getText());
                vinte2BT.setIcon(dezesseteBT.getIcon());
                dezesseteBT.setVisible(false);
                vinte2BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dezesseteBTActionPerformed

    private void dezoitoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezoitoBTActionPerformed
        if (grade == 4) {
            if (trezeBT.isVisible() == false) {
                trezeBT.setText(dezoitoBT.getText());
                trezeBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(dezoitoBT.getText());
                dezesseteBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(dezoitoBT.getText());
                dezenoveBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (trezeBT.isVisible() == false) {
                trezeBT.setText(dezoitoBT.getText());
                trezeBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                trezeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(dezoitoBT.getText());
                dezesseteBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(dezoitoBT.getText());
                dezenoveBT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte3BT.isVisible() == false) {
                vinte3BT.setText(dezoitoBT.getText());
                vinte3BT.setIcon(dezoitoBT.getIcon());
                dezoitoBT.setVisible(false);
                vinte3BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dezoitoBTActionPerformed

    private void dezenoveBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dezenoveBTActionPerformed
        if (grade == 4) {
            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(dezenoveBT.getText());
                quatorzeBT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(dezenoveBT.getText());
                dezoitoBT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }
        }

        if (grade == 5) {
            if (quatorzeBT.isVisible() == false) {
                quatorzeBT.setText(dezenoveBT.getText());
                quatorzeBT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                quatorzeBT.setVisible(true);
                contarMovimentos();
            }

            if (dezoitoBT.isVisible() == false) {
                dezoitoBT.setText(dezenoveBT.getText());
                dezoitoBT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                dezoitoBT.setVisible(true);
                contarMovimentos();
            }

            if (vinteBT.isVisible() == false) {
                vinteBT.setText(dezenoveBT.getText());
                vinteBT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                vinteBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte4BT.isVisible() == false) {
                vinte4BT.setText(dezenoveBT.getText());
                vinte4BT.setIcon(dezenoveBT.getIcon());
                dezenoveBT.setVisible(false);
                vinte4BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_dezenoveBTActionPerformed

    private void vinte1BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinte1BTActionPerformed
        if (grade == 5) {
            if (dezesseisBT.isVisible() == false) {
                dezesseisBT.setText(vinte1BT.getText());
                dezesseisBT.setIcon(vinte1BT.getIcon());
                vinte1BT.setVisible(false);
                dezesseisBT.setVisible(true);
                contarMovimentos();
            }

            if (vinte2BT.isVisible() == false) {
                vinte2BT.setText(vinte1BT.getText());
                vinte2BT.setIcon(vinte1BT.getIcon());
                vinte1BT.setVisible(false);
                vinte2BT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinte1BTActionPerformed

    private void vinte2BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinte2BTActionPerformed
        if (grade == 5) {
            if (vinte3BT.isVisible() == false) {
                vinte3BT.setText(vinte2BT.getText());
                vinte3BT.setIcon(vinte2BT.getIcon());
                vinte2BT.setVisible(false);
                vinte3BT.setVisible(true);
                contarMovimentos();
            }

            if (vinte1BT.isVisible() == false) {
                vinte1BT.setText(vinte2BT.getText());
                vinte1BT.setIcon(vinte2BT.getIcon());
                vinte2BT.setVisible(false);
                vinte1BT.setVisible(true);
                contarMovimentos();
            }

            if (dezesseteBT.isVisible() == false) {
                dezesseteBT.setText(vinte2BT.getText());
                dezesseteBT.setIcon(vinte2BT.getIcon());
                vinte2BT.setVisible(false);
                dezesseteBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinte2BTActionPerformed

    private void vinte4BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vinte4BTActionPerformed
        if (grade == 5) {
            if (vinte3BT.isVisible() == false) {
                vinte3BT.setText(vinte4BT.getText());
                vinte3BT.setIcon(vinte4BT.getIcon());
                vinte4BT.setVisible(false);
                vinte3BT.setVisible(true);
                contarMovimentos();
            }

            if (vinte5BT.isVisible() == false) {
                vinte5BT.setText(vinte4BT.getText());
                vinte5BT.setIcon(vinte4BT.getIcon());
                vinte4BT.setVisible(false);
                vinte5BT.setVisible(true);
                contarMovimentos();
            }

            if (dezenoveBT.isVisible() == false) {
                dezenoveBT.setText(vinte4BT.getText());
                dezenoveBT.setIcon(vinte4BT.getIcon());
                vinte4BT.setVisible(false);
                dezenoveBT.setVisible(true);
                contarMovimentos();
            }
        }

        gameOver(grade);
    }//GEN-LAST:event_vinte4BTActionPerformed

    private void restartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBTActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja reiniciar a partida?", "Reiniciar", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            cont = 0;
            timer.cancel();
            jogadasLB.setText("0");
            String novaGrade = "";
            if (grade == 3) {
                novaGrade = "3x3";
            }
            if (grade == 4) {
                novaGrade = "4x4";
            }
            if (grade == 5) {
                novaGrade = "5x5";
            }
            aplicarGrade(novaGrade, modalidade);
        }
    }//GEN-LAST:event_restartBTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Deseja desistir?", "Desistir", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == 0){
            timer.cancel();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contarMovimentos() {
        jogadasLB.setText(String.valueOf(cont++));
    }

    public void jogo(String modalidade,
            String modoJogo,
            String grade,
            String tema) {
    }

    private void gameOver(int grade) {
        int aux = 0;
        switch (grade) {
            case 3:
                String[] grade3 = new String[8];
                grade3[0] = umBT.getText();
                grade3[1] = doisBT.getText();
                grade3[2] = tresBT.getText();
                grade3[3] = seisBT.getText();
                grade3[4] = seteBT.getText();
                grade3[5] = oitoBT.getText();
                grade3[6] = onzeBT.getText();
                grade3[7] = dozeBT.getText();
                if (modalidade.equals("Números")) {
                    if ((grade3[0].equals("1")) && (grade3[1].equals("2")) && (grade3[2].equals("3")) && (grade3[3].equals("4")) && (grade3[4].equals("5")) && (grade3[5].equals("6")) && (grade3[6].equals("7")) && (grade3[7].equals("8"))) {
                        aux = 1;
                    }
                } else if (modalidade.equals("Alfabeto")) {
                    if ((grade3[0].equals("A")) && (grade3[1].equals("B")) && (grade3[2].equals("C")) && (grade3[3].equals("D")) && (grade3[4].equals("E")) && (grade3[5].equals("F")) && (grade3[6].equals("G")) && (grade3[7].equals("H"))) {
                        aux = 1;
                    }
                }
            break;
                
            case 4:
                String[] grade4 = new String[15];
                grade4[0] = umBT.getText();
                grade4[1] = doisBT.getText();
                grade4[2] = tresBT.getText();
                grade4[3] = quatroBT.getText();
                grade4[4] = seisBT.getText();
                grade4[5] = seteBT.getText();
                grade4[6] = oitoBT.getText();
                grade4[7] = noveBT.getText();
                grade4[8] = onzeBT.getText();
                grade4[9] = dozeBT.getText();
                grade4[10] = trezeBT.getText();
                grade4[11] = quatorzeBT.getText();
                grade4[12] = dezesseisBT.getText();
                grade4[13] = dezesseteBT.getText();
                grade4[14] = dezoitoBT.getText();
                if (modalidade.equals("Números")) {
                    if ((grade4[0].equals("1")) && (grade4[1].equals("2")) && (grade4[2].equals("3")) && (grade4[3].equals("4")) && (grade4[4].equals("5")) && (grade4[5].equals("6")) && (grade4[6].equals("7")) && (grade4[7].equals("8")) && (grade4[8].equals("9")) && (grade4[9].equals("10")) && (grade4[10].equals("11")) && (grade4[11].equals("12")) && (grade4[12].equals("13")) && (grade4[13].equals("14")) && (grade4[14].equals("15"))) {
                        aux = 1;
                    }
                } else if (modalidade.equals("Alfabeto")) {
                    if ((grade4[0].equals("A")) && (grade4[1].equals("B")) && (grade4[2].equals("C")) && (grade4[3].equals("D")) && (grade4[4].equals("E")) && (grade4[5].equals("F")) && (grade4[6].equals("G")) && (grade4[7].equals("H")) && (grade4[8].equals("I")) && (grade4[9].equals("J")) && (grade4[10].equals("K")) && (grade4[11].equals("L")) && (grade4[12].equals("M")) && (grade4[13].equals("N")) && (grade4[14].equals("O"))) {
                        aux = 1;
                    }
                }
            break;
                
            case 5:
                String[] grade5 = new String[24];
                grade5[0] = umBT.getText();
                grade5[1] = doisBT.getText();
                grade5[2] = tresBT.getText();
                grade5[3] = quatroBT.getText();
                grade5[4] = cincoBT.getText();
                grade5[5] = seisBT.getText();
                grade5[6] = seteBT.getText();
                grade5[7] = oitoBT.getText();
                grade5[8] = noveBT.getText();
                grade5[9] = dezBT.getText();
                grade5[10] = onzeBT.getText();
                grade5[11] = dozeBT.getText();
                grade5[12] = trezeBT.getText();
                grade5[13] = quatorzeBT.getText();
                grade5[14] = quinzeBT.getText();
                grade5[15] = dezesseisBT.getText();
                grade5[16] = dezesseteBT.getText();
                grade5[17] = dezoitoBT.getText();
                grade5[18] = dezenoveBT.getText();
                grade5[19] = vinteBT.getText();
                grade5[20] = vinte1BT.getText();
                grade5[21] = vinte2BT.getText();
                grade5[22] = vinte3BT.getText();
                grade5[23] = vinte4BT.getText();
                
                if (modalidade.equals("Números")) {
                    if ((grade5[0].equals("1")) && (grade5[1].equals("2")) && (grade5[2].equals("3")) && (grade5[3].equals("4")) && (grade5[4].equals("5")) && (grade5[5].equals("6")) && (grade5[6].equals("7")) && (grade5[7].equals("8")) && (grade5[8].equals("9")) && (grade5[9].equals("10")) && (grade5[10].equals("11")) && (grade5[11].equals("12")) && (grade5[12].equals("13")) && (grade5[13].equals("14")) && (grade5[14].equals("15")) && (grade5[15].equals("16")) && (grade5[16].equals("17")) && (grade5[17].equals("18")) && (grade5[18].equals("19")) && (grade5[19].equals("20")) && (grade5[20].equals("21")) && (grade5[21].equals("22")) && (grade5[22].equals("23")) && (grade5[23].equals("24"))) {
                        aux = 1;
                    }
                } else if (modalidade.equals("Alfabeto")) {
                    if ((grade5[0].equals("A")) && (grade5[1].equals("B")) && (grade5[2].equals("C")) && (grade5[3].equals("D")) && (grade5[4].equals("E")) && (grade5[5].equals("F")) && (grade5[6].equals("G")) && (grade5[7].equals("H")) && (grade5[8].equals("I")) && (grade5[9].equals("J")) && (grade5[10].equals("K")) && (grade5[11].equals("L")) && (grade5[12].equals("M")) && (grade5[13].equals("N")) && (grade5[14].equals("O")) && (grade5[15].equals("P")) && (grade5[16].equals("Q")) && (grade5[17].equals("R")) && (grade5[18].equals("S")) && (grade5[19].equals("T")) && (grade5[20].equals("U")) && (grade5[21].equals("V")) && (grade5[22].equals("W")) && (grade5[23].equals("X"))) {
                        aux = 1;
                    }
                }  
            break;
                
            default:
            break;
        }

        if (aux == 1) {
            timer.cancel();
            JOptionPane.showMessageDialog(this, "Parabéns! Você ganhou com o tempo de " + tempoLB.getText() + " segundos e " + jogadasLB.getText() + " jogadas.", "Parabéns", JOptionPane.INFORMATION_MESSAGE);

            jogador.setNum_jogadas(Integer.parseInt(jogadasLB.getText()));
            jogador.setTempo_jogo(Integer.parseInt(tempoLB.getText()));
            daoJogador.atualizar(jogador);

            umBT.setEnabled(false);
            doisBT.setEnabled(false);
            tresBT.setEnabled(false);
            quatroBT.setEnabled(false);
            cincoBT.setEnabled(false);
            seisBT.setEnabled(false);
            seteBT.setEnabled(false);
            oitoBT.setEnabled(false);
            noveBT.setEnabled(false);
            dezBT.setEnabled(false);
            onzeBT.setEnabled(false);
            dozeBT.setEnabled(false);
            trezeBT.setEnabled(false);
            quatorzeBT.setEnabled(false);
            quinzeBT.setEnabled(false);
            dezesseisBT.setEnabled(false);
            dezesseteBT.setEnabled(false);
            dezoitoBT.setEnabled(false);
            dezenoveBT.setEnabled(false);
            vinteBT.setEnabled(false);
            vinte1BT.setEnabled(false);
            vinte2BT.setEnabled(false);
            vinte3BT.setEnabled(false);
            vinte4BT.setEnabled(false);
        }
    }

    public static void setTempo(String tempo) {
        tempoLB.setText(tempo);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModoJogo().setVisible(true);
            }
        });
    }

    private Random random;
    private int tempo;
    private int numJogadas;
    private int grade;
    private String modalidade;
    private DAOJogador daoJogador;
    private Jogador jogador;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cincoBT;
    private javax.swing.JButton dezBT;
    private javax.swing.JButton dezenoveBT;
    private javax.swing.JButton dezesseisBT;
    private javax.swing.JButton dezesseteBT;
    private javax.swing.JButton dezoitoBT;
    private javax.swing.JButton doisBT;
    private javax.swing.JButton dozeBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jogadasLB;
    private javax.swing.JPanel jogoPN;
    private javax.swing.JLabel labelTempoLB;
    private javax.swing.JButton noveBT;
    private javax.swing.JLabel numJogadasLB;
    private javax.swing.JButton oitoBT;
    private javax.swing.JButton onzeBT;
    private javax.swing.JButton quatorzeBT;
    private javax.swing.JButton quatroBT;
    private javax.swing.JButton quinzeBT;
    private javax.swing.JButton restartBT;
    private javax.swing.JButton seisBT;
    private javax.swing.JButton seteBT;
    private static javax.swing.JLabel tempoLB;
    private javax.swing.JButton tresBT;
    private javax.swing.JButton trezeBT;
    private javax.swing.JButton umBT;
    private javax.swing.JButton vinte1BT;
    private javax.swing.JButton vinte2BT;
    private javax.swing.JButton vinte3BT;
    private javax.swing.JButton vinte4BT;
    private javax.swing.JButton vinte5BT;
    private javax.swing.JButton vinteBT;
    // End of variables declaration//GEN-END:variables
}
