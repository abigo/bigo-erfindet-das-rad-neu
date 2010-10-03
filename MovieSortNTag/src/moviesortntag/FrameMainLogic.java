/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.ListModel;
import javax.swing.filechooser.FileView;

/**
 *
 * @author andi
 */
public class FrameMainLogic extends FrameMainView {

    public FrameMainLogic()
    {
        super.ButtonBrowseFiles.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {
                buttonSelectFolderMouseClicked();
            }
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
        });

        super.ListMovieFiles.addPropertyChangeListener(new PropertyChangeListener() {

            public void propertyChange(PropertyChangeEvent arg0) {
                System.out.print("Property changed!");
            }
        });

        super.setVisible(true);
    }

    public void buttonSelectFolderMouseClicked()
    {
        JFileChooser fileChooser = new JFileChooser("/media");

        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //fileChooser.setFileView(new FileView() {});
        fileChooser.showOpenDialog(this);
        File dir = fileChooser.getSelectedFile();

        String[] files = Helper.getFileNames((Helper.getMovieFiles(dir.getAbsolutePath())));


        ListModel listData = new DefaultListModel();

//        for(int i=0;i<files.length;i++)
//        {
//            listModel.addlistModelElement(files[i]);
//        }

        super.ListMovieFiles.setListData(files);
    }

}
