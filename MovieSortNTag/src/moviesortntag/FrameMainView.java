/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameMainView.java
 *
 * Created on Oct 3, 2010, 4:48:22 AM
 */

package moviesortntag;

/**
 *
 * @author andi
 */
public class FrameMainView extends javax.swing.JFrame {

    /** Creates new form FrameMainView */
    public FrameMainView() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListMovieFiles = new javax.swing.JList();
        ButtonBrowseFiles = new javax.swing.JButton();
        TextFieldMoviePath = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListMovieResult = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ListMovieFiles.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListMovieFiles.setName("ListMovieFiles"); // NOI18N
        jScrollPane1.setViewportView(ListMovieFiles);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(moviesortntag.MovieSortNTagApp.class).getContext().getActionMap(FrameMainView.class, this);
        ButtonBrowseFiles.setAction(actionMap.get("selectFolder")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(moviesortntag.MovieSortNTagApp.class).getContext().getResourceMap(FrameMainView.class);
        ButtonBrowseFiles.setText(resourceMap.getString("ButtonBrowseFiles.text")); // NOI18N
        ButtonBrowseFiles.setName("ButtonBrowseFiles"); // NOI18N
        ButtonBrowseFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBrowseFilesMouseClicked(evt);
            }
        });

        TextFieldMoviePath.setText(resourceMap.getString("TextFieldMoviePath.text")); // NOI18N
        TextFieldMoviePath.setName("TextFieldMoviePath"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        ListMovieResult.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListMovieResult.setName("ListMovieResult"); // NOI18N
        jScrollPane2.setViewportView(ListMovieResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonBrowseFiles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(TextFieldMoviePath, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextFieldMoviePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonBrowseFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBrowseFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBrowseFilesMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_ButtonBrowseFilesMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton ButtonBrowseFiles;
    protected javax.swing.JList ListMovieFiles;
    protected javax.swing.JList ListMovieResult;
    protected javax.swing.JTextField TextFieldMoviePath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
