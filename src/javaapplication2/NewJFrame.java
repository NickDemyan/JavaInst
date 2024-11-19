package javaapplication2;
import java.awt.event.KeyEvent;

public class NewJFrame extends javax.swing.JFrame {

    NewJPanel njp= new NewJPanel();
    
    public NewJFrame(){
        super("Контрольная Работа");
        initComponents();
        setLocationRelativeTo(null);
        njp.setSize(900, 900);
        add(njp);
    }
   
    
    @SuppressWarnings("unchecked")

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      switch (evt.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-15);
                }
            break;
            
            case KeyEvent.VK_LEFT: 
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-20);;
                }
            break;   
            case KeyEvent.VK_UP:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()+10);
                }
            break;
            case KeyEvent.VK_DOWN:
                if (njp.getMyX()>0){
                    njp.setMyX(njp.getMyX()-23);
                }
                break;
                default:
                    throw new AssertionError();
                    }
            njp.repaint();
    }//GEN-LAST:event_formKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
               new NewJFrame().setVisible(true);
           } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
