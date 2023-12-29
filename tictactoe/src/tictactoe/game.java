/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import static java.awt.Color.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import javax.swing.SpinnerModel;

/**
 *
 * @author USER
 */
public class game extends javax.swing.JFrame {

    boolean playerturn = true;
    Stack<Integer> movesx = new Stack<Integer>();
    Stack<Integer> movesy = new Stack<Integer>();
    private ArrayList<GameMove> availableGameMoves;
    private static GameMove computersGameMove;
    static boolean hardgame = false;
    boolean g_end = false;
    //flag 1 for player flag 0  for pc
    /**
     * Creates new form game
     */
    static Tictactoe t;

    class GameMove {

        private int x;
        private int y;

        public GameMove(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public game(Tictactoe t, boolean hardgame) {
        this.hardgame = hardgame;

        this.t = t;
        for (int i = 0; i < t.board.length; i++) {
            for (int j = 0; j < t.board.length; j++) {
                t.board[i][j] = -1;
            }
        }

        initComponents();
        if (hardgame) {
            jLabel1.setText("Hard Game");
        } else {
            jLabel1.setText("Easy Game");
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

        jLabel1 = new javax.swing.JLabel();
        but2 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        turn = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        undo = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        number = new javax.swing.JSpinner();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setPreferredSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Hard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, -1));

        but2.setBackground(new java.awt.Color(51, 51, 51));
        but2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but2MouseClicked(evt);
            }
        });
        getContentPane().add(but2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 80, 70));

        but1.setBackground(new java.awt.Color(51, 51, 51));
        but1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        but1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but1MouseClicked(evt);
            }
        });
        getContentPane().add(but1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 80, 70));

        but3.setBackground(new java.awt.Color(51, 51, 51));
        but3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but3MouseClicked(evt);
            }
        });
        getContentPane().add(but3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 80, 70));

        but4.setBackground(new java.awt.Color(51, 51, 51));
        but4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but4MouseClicked(evt);
            }
        });
        getContentPane().add(but4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 70));

        but5.setBackground(new java.awt.Color(51, 51, 51));
        but5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but5MouseClicked(evt);
            }
        });
        getContentPane().add(but5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 80, 70));

        but6.setBackground(new java.awt.Color(51, 51, 51));
        but6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but6MouseClicked(evt);
            }
        });
        getContentPane().add(but6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 80, 70));

        but7.setBackground(new java.awt.Color(51, 51, 51));
        but7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but7MouseClicked(evt);
            }
        });
        getContentPane().add(but7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 80, 70));

        but8.setBackground(new java.awt.Color(51, 51, 51));
        but8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but8MouseClicked(evt);
            }
        });
        getContentPane().add(but8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 80, 70));

        but9.setBackground(new java.awt.Color(51, 51, 51));
        but9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        but9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                but9MouseClicked(evt);
            }
        });
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        getContentPane().add(but9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 80, 70));

        turn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        turn.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 280, 100));

        l1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("O");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 40, 50));

        l2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("O");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 50));

        l3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("O");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 40, 50));

        l4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("O");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 40, 50));

        l5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("O");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 40, 50));

        l6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("O");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 40, 50));

        l7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("O");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 40, 50));

        l8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText("O");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 40, 50));

        l9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setText("O");
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 40, 50));

        undo.setBackground(new java.awt.Color(51, 51, 51));
        undo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        undo.setForeground(new java.awt.Color(255, 255, 255));
        undo.setText("Undo");
        undo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        undo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                undoMouseClicked(evt);
            }
        });
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        getContentPane().add(undo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 100, 70));

        Exit.setBackground(new java.awt.Color(51, 51, 51));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 100, 70));

        number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 100, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/background (1).png"))); // NOI18N
        background.setText("jLabel5");
        background.setMaximumSize(new java.awt.Dimension(1000, 750));
        background.setMinimumSize(new java.awt.Dimension(1000, 750));
        background.setPreferredSize(new java.awt.Dimension(1000, 750));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean gameend(int symbol) {
        if (t.board[0][0] == symbol && t.board[0][1] == symbol && t.board[0][2] == symbol) {
            System.out.println("1aaaa");
            if (symbol == 1) {
                l1.setForeground(BLUE);
                l2.setForeground(BLUE);
                l3.setForeground(BLUE);
                turn.setText("You Win");

            } else {
                l1.setForeground(RED);
                l2.setForeground(RED);
                l3.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[1][0] == symbol && t.board[1][1] == symbol && t.board[1][2] == symbol) {

            if (symbol == 1) {
                l4.setForeground(BLUE);
                l5.setForeground(BLUE);
                l6.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l4.setForeground(RED);
                l5.setForeground(RED);
                l6.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[2][0] == symbol && t.board[2][1] == symbol && t.board[2][2] == symbol) {
            System.out.println("2aaaa");

            if (symbol == 1) {
                l7.setForeground(BLUE);
                l8.setForeground(BLUE);
                l9.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l7.setForeground(RED);
                l8.setForeground(RED);
                l9.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;
        } else if (t.board[0][0] == symbol && t.board[1][0] == symbol && t.board[2][0] == symbol) {
            System.out.println("3aaaa");

            if (symbol == 1) {
                l1.setForeground(BLUE);
                l4.setForeground(BLUE);
                l7.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l1.setForeground(RED);
                l4.setForeground(RED);
                l7.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[0][1] == symbol && t.board[1][1] == symbol && t.board[2][1] == symbol) {
            System.out.println("4aaaa");

            if (symbol == 1) {
                l2.setForeground(BLUE);
                l5.setForeground(BLUE);
                l8.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l2.setForeground(RED);
                l5.setForeground(RED);
                l8.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[0][2] == symbol && t.board[1][2] == symbol && t.board[2][2] == symbol) {

            if (symbol == 1) {
                l3.setForeground(BLUE);
                l6.setForeground(BLUE);
                l9.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l3.setForeground(RED);
                l6.setForeground(RED);
                l9.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[0][0] == symbol && t.board[1][1] == symbol && t.board[2][2] == symbol) {
            System.out.println("5aaaa");

            if (symbol == 1) {
                l1.setForeground(BLUE);
                l5.setForeground(BLUE);
                l9.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l1.setForeground(RED);
                l5.setForeground(RED);
                l9.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;

        } else if (t.board[0][2] == symbol && t.board[1][1] == symbol && t.board[2][0] == symbol) {
            System.out.println("6aaaa");

            if (symbol == 1) {
                l3.setForeground(BLUE);
                l5.setForeground(BLUE);
                l7.setForeground(BLUE);
                turn.setText("You Win");
            } else {
                l3.setForeground(RED);
                l5.setForeground(RED);
                l7.setForeground(RED);
                turn.setText("Computer Win");
            }
            return true;
        } else if (t.board[0][0] != -1 && t.board[0][1] != -1 && t.board[0][2] != -1 && t.board[1][0] != -1
                && t.board[1][1] != -1 && t.board[1][1] != -1 && t.board[1][2] != -1
                && t.board[2][0] != -1 && t.board[2][1] != -1 && t.board[2][2] != -1) {
            System.out.println("7aaaa");
            turn.setText("draw");

            return true;

        } else {

            return false;
        }
    }

    private void but1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but1MouseClicked
        if (playerturn == true) {
            but1.setVisible(false);
            l1.setVisible(true);
            l1.setText("O");
            l9.setForeground(WHITE);
            t.board[0][0] = 1;
            playerturn = false;
            movesx.push(0);
            movesy.push(0);
            System.out.println(movesx);
            System.out.println(movesy);
            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but1MouseClicked

    private void but2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but2MouseClicked
        if (playerturn == true) {
            but2.setVisible(false);
            l2.setVisible(true);
            l2.setText("O");
            l9.setForeground(WHITE);
            t.board[0][1] = 1;
            movesx.push(0);
            movesy.push(1);
            System.out.println(movesx);
            System.out.println(movesy);
            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but2MouseClicked

    private void but5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but5MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but5.setVisible(false);
            l5.setVisible(true);
            l5.setText("O");
            l9.setForeground(WHITE);
            t.board[1][1] = 1;
            playerturn = false;
            movesx.push(1);
            movesy.push(1);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but5MouseClicked

    private void but4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but4MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but4.setVisible(false);
            l4.setVisible(true);
            l4.setText("O");
            t.board[1][0] = 1;
            playerturn = false;
            l9.setForeground(WHITE);
            movesx.push(1);
            movesy.push(0);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but4MouseClicked

    private void but3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but3MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but3.setVisible(false);
            l3.setVisible(true);
            l3.setText("O");
            l9.setForeground(WHITE);
            t.board[0][2] = 1;
            playerturn = false;
            movesx.push(0);
            movesy.push(2);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but3MouseClicked

    private void but6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but6MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but6.setVisible(false);
            l6.setVisible(true);
            l6.setText("O");
            l9.setForeground(WHITE);
            t.board[1][2] = 1;
            playerturn = false;
            movesx.push(1);
            movesy.push(2);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but6MouseClicked

    private void but7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but7MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but7.setVisible(false);
            l7.setVisible(true);
            l9.setForeground(WHITE);
            l7.setText("O");
            t.board[2][0] = 1;
            playerturn = false;
            movesx.push(2);
            movesy.push(0);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but7MouseClicked

    private void but8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but8MouseClicked
        // TODO add your handling code here:

        but8.setVisible(false);
        l8.setVisible(true);
        l8.setText("O");
        l9.setForeground(WHITE);
        t.board[2][1] = 1;
        playerturn = false;
        movesx.push(2);
        movesy.push(1);
        System.out.println(movesx);
        System.out.println(movesy);

        if (!gameend(1)) {
            computerTurn();
        }
    }//GEN-LAST:event_but8MouseClicked

    private void but9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_but9MouseClicked
        // TODO add your handling code here:
        if (playerturn == true) {
            but9.setVisible(false);
            l9.setVisible(true);
            l9.setText("O");
            l9.setForeground(WHITE);

            t.board[2][2] = 1;
            playerturn = false;
            movesx.push(2);
            movesy.push(2);
            System.out.println(movesx);
            System.out.println(movesy);

            if (!gameend(1)) {
                computerTurn();
            }
        }
    }//GEN-LAST:event_but9MouseClicked

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_but9ActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new startpage(t).setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked

    private void undoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_undoMouseClicked
        // TODO add your handling code here:
        int n = (int) number.getValue();
        System.out.println(movesx);
        System.out.println(movesy);
        if (n > 9 || n < 1 || n > movesx.size()) {
            undo.setForeground(red);
        } else {
            undo.setForeground(white);

            for (int i = 1; i <= n; i++) {
                int x = movesx.pop();
                int y = movesy.pop();

                switch (x) {
                    case 0:
                        switch (y) {
                            case 0:
                                but1.setVisible(true);
                                l1.setVisible(false);
                                l1.setText(" ");
                                t.board[0][0] = -1;
                                break;
                            case 1:
                                but2.setVisible(true);
                                l2.setVisible(false);
                                l2.setText(" ");
                                t.board[0][1] = -1;
                                break;
                            case 2:
                                System.out.println("dddfdaa");
                                but3.setVisible(true);
                                l3.setVisible(false);
                                l3.setText(" ");
                                t.board[0][2] = -1;

                                break;
                        }
                        break;

                    case 1:
                        switch (y) {
                            case 0:
                                but4.setVisible(true);
                                l4.setVisible(false);
                                l4.setText(" ");
                                t.board[1][0] = -1;
                                break;
                            case 1:
                                but5.setVisible(true);
                                l5.setVisible(false);
                                l5.setText(" ");
                                t.board[1][1] = -1;
                                break;
                            case 2:
                                but6.setVisible(true);
                                l6.setVisible(false);
                                l6.setText(" ");
                                t.board[1][2] = -1;
                                break;
                        }
                        break;
                    case 2:
                        switch (y) {
                            case 0:
                                but7.setVisible(true);
                                l7.setVisible(false);
                                l7.setText(" ");
                                t.board[2][0] = -1;
                                break;
                            case 1:
                                but8.setVisible(true);
                                l8.setVisible(false);
                                l8.setText(" ");
                                t.board[2][1] = -1;
                                break;
                            case 2:

                                but9.setVisible(true);
                                l9.setVisible(false);
                                l9.setText("");
                                t.board[2][2] = -1;
                                break;
                        }
                        break;
                    default:
                }
               
            }
            l1.setForeground(WHITE);
            l2.setForeground(WHITE);
            l3.setForeground(WHITE);
            l4.setForeground(WHITE);
            l5.setForeground(WHITE);
            l6.setForeground(WHITE);
            l7.setForeground(WHITE);
            l8.setForeground(WHITE);
            l9.setForeground(WHITE);
            if (n%2==0) {
                playerturn = true;
                turn.setText("Your turn");
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                computerTurn();
            }
        }
    }//GEN-LAST:event_undoMouseClicked

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undoActionPerformed

    public void hard() {
        System.out.println("entered hardd function");

        System.out.println("hard while loop");

        minimax(0, 1);
        makemove(Integer.toString(computersGameMove.x), Integer.toString(computersGameMove.y));

    }

    private boolean checkend(int x) {

        if ((t.board[0][0] == t.board[1][1] && t.board[0][0] == t.board[2][2] && t.board[0][0] == x)
                || (t.board[0][2] == t.board[1][1] && t.board[0][2] == t.board[2][0] && t.board[0][2] == x)) {
            // System.out.println("X Diagonal Win");
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if (((t.board[i][0] == t.board[i][1] && t.board[i][0] == t.board[i][2] && t.board[i][0] == x)
                    || (t.board[0][i] == t.board[1][i] && t.board[0][i] == t.board[2][i]
                    && t.board[0][i] == x))) {
                // System.out.println("X Row or Column win");
                return true;
            }
        }
        return false;
    }

    public int minimax(int depth, int turn) {
        if (checkend(0)) {
            return +10;
        }
        if (checkend(1)) {
            return -10;
        }

        ArrayList<GameMove> gameMovesAvailable = getAvailableGameMoves();
        if (gameMovesAvailable.isEmpty()) {
            return 0;
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < gameMovesAvailable.size(); ++i) {

            GameMove gameMove = gameMovesAvailable.get(i);

            if (turn == 1) {
                t.board[gameMove.x][gameMove.y] = 0;
                int currentScore = minimax(depth + 1, 2);
                max = Math.max(currentScore, max);

                if (currentScore >= 0) {
                    if (depth == 0) {
                        computersGameMove = gameMove;
                    }
                } else if (currentScore == 1) {
                    resetGameMove(gameMove);
                    break;
                }
                if (i == availableGameMoves.size() - 1 && max > 0) {
                    if (depth == 0) {
                        computersGameMove = gameMove;
                    }
                }
            } else if (turn == 2) {
                t.board[gameMove.x][gameMove.y] = 1;
                int currentScore = minimax(depth + 1, 1);
                min = Math.min(currentScore, min);
                if (min <= -10) {
                    resetGameMove(gameMove);
                    break;
                }
            }
            resetGameMove(gameMove);
        }
        return (turn == 1) ? max : min;
    }

    public ArrayList<GameMove> getAvailableGameMoves() {

        availableGameMoves = new ArrayList<GameMove>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t.board[i][j] == -1) {
                    availableGameMoves.add(new GameMove(i, j));
                }
            }
        }
        return availableGameMoves;
    }

    public void resetGameMove(GameMove move) {
        t.board[move.getX()][move.getY()] = -1;
    }

    private void computerTurn() {
        System.out.println(hardgame);
        if (hardgame == true) {
            hard();
            if (!gameend(0)) {
                playerturn = true;
            }
        } else {
           
            Random rand = new Random();
            int i1;
            int i2;

            i1 = rand.nextInt(3);
            i2 = rand.nextInt(3);
            System.out.println(i1);
            System.out.println(i2);
            if (t.board[i1][i2] == -1) {

                makemove(Integer.toString(i1), Integer.toString(i2));
                if (!gameend(0)) {
                    playerturn = true;
                }
//            System.out.println("ddd");
            } else {
                computerTurn();
            }

        }
    }

    public void print() {
        System.out.println(t.board[0][0] + "|" + t.board[0][1] + "|" + t.board[0][2]);
        System.out.println("-+-+-");
        System.out.println(t.board[1][0] + "|" + t.board[1][1] + "|" + t.board[1][2]);
        System.out.println("-+-+-");
        System.out.println(t.board[2][0] + "|" + t.board[2][1] + "|" + t.board[2][2]);
    }

    private void makemove(String position1, String position2) {
        System.out.println("hhh");
        movesx.push(parseInt(position1));
        movesy.push(parseInt(position2));
        switch (position1) {
            case "0":
                switch (position2) {
                    case "0":
                        but1.setVisible(false);
                        l1.setVisible(true);
                        l9.setForeground(WHITE);
                        l1.setText("X");
                        t.board[0][0] = 0;

                        break;
                    case "1":
                        but2.setVisible(false);
                        l2.setVisible(true);
                        l2.setText("X");
                        l9.setForeground(WHITE);
                        t.board[0][1] = 0;
                        playerturn = false;
                        break;
                    case "2":
                        but3.setVisible(false);
                        l3.setVisible(true);
                        l3.setText("X");
                        l9.setForeground(WHITE);
                        t.board[0][2] = 0;
                        playerturn = false;

                        break;
                }
                break;

            case "1":
                switch (position2) {
                    case "0":
                        but4.setVisible(false);
                        l4.setVisible(true);
                        l4.setText("X");
                        l9.setForeground(WHITE);
                        t.board[1][0] = 0;
                        playerturn = false;
                        break;
                    case "1":
                        but5.setVisible(false);
                        l5.setVisible(true);
                        l5.setText("X");
                        l9.setForeground(WHITE);
                        t.board[1][1] = 0;
                        playerturn = false;
                        break;
                    case "2":
                        but6.setVisible(false);
                        l6.setVisible(true);
                        l6.setText("X");
                        l9.setForeground(WHITE);
                        t.board[1][2] = 0;
                        playerturn = false;
                        break;
                }
                break;
            case "2":
                switch (position2) {
                    case "0":
                        but7.setVisible(false);
                        l7.setVisible(true);
                        l7.setText("X");
                        l9.setForeground(WHITE);
                        t.board[2][0] = 0;
                        playerturn = false;
                        break;
                    case "1":
                        but8.setVisible(false);
                        l8.setVisible(true);
                        l8.setText("X");
                        l9.setForeground(WHITE);
                        t.board[2][1] = 0;
                        playerturn = false;
                        break;
                    case "2":

                        but9.setVisible(false);
                        l9.setVisible(true);
                        l9.setText("X");
                        l9.setForeground(WHITE);
                        t.board[2][2] = 0;
                        playerturn = false;
                        break;
                }
                break;
            default:
        }
    }

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
            java.util.logging.Logger.getLogger(game.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game(t, hardgame).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel background;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JSpinner number;
    private javax.swing.JLabel turn;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables
}