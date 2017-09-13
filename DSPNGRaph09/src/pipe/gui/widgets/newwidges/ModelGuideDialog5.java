package pipe.gui.widgets.newwidges;

import org.jdom.Element;
import pipe.DSPNModules.AverageQueueLengthModule;
import pipe.DSPNModules.ThroughputModule;
import pipe.gui.ApplicationSettings;
import pipe.views.PipeApplicationView;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by hanson on 2017/8/22.
 * 第六步，补全链路的信息
 */
public class ModelGuideDialog5 extends JDialog {
    private PipeApplicationView gf;
    private DefaultListModel listModelBefore ,listModelAfter;
    private Map<String, VLInfo> infoMap ;
    private GuideModel nowModel;
    ArrayList<Element> arr = null;
    /** Creates new form ModelGuideDialog1 */
    public ModelGuideDialog5(Frame parent, boolean modal, GuideModel guideModel,ArrayList<Element> arr) {
        super(parent, modal);
        gf = (PipeApplicationView) parent;
        nowModel = guideModel;
        this.arr = arr;
        //这里就是 先备份一下 备份到一个 map里面 但是呢 原来的 nowVo.getPriorityQueue()里面 还不能删除
        this.infoMap  = new LinkedHashMap<String, VLInfo>();
        for(int i=0; i<nowModel.getVlList().size(); i++)
        {
            VLInfo info = nowModel.getVlList().remove();
            infoMap.put(info.getVlId(), info);
            nowModel.getVlList().add(info); //remove了  又add回来
        }
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonDone = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonPrevStep = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();



        listModelBefore = new DefaultListModel();
        System.out.println("listModelBefore"+nowModel.getVlList().size());
        int size = nowModel.getVlList().size();
        for(int i=0; i<size; i++)
        {
            VLInfo info = nowModel.getVlList().remove();
            listModelBefore.addElement(info.getVlId());
            nowModel.getVlList().add(info);
        }
       /* listModelBefore.addElement("RT1");
        listModelBefore.addElement("RT2");
        listModelBefore.addElement("RT3");*/

        listModelAfter = new DefaultListModel();

        jListBefore = new javax.swing.JList(listModelBefore);
        jListAfter = new javax.swing.JList(listModelAfter);

        jPanel3 = new javax.swing.JPanel();
        jLabelTips = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("建模向导");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("第七步");

        jLabel2.setText("  设置每个SPM中VL的排列顺序");

        //jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_guide.png"))); // NOI18N
        //jLabel3.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jButtonDone.setText("生成模型");
        jButtonDone.setFocusable(false);
        jButtonDone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDone.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jButtonCancel.setText("取消");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonPrevStep.setText("上一步");
        jButtonPrevStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrevStepActionPerformed(evt);
            }
        });

        /*jListBefore.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "RT1", "RT2", "RT3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });*/
        jListBefore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListBeforeMouseClicked(evt);
            }
        });

        jListAfter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAfterMouseClicked(evt);
            }
        });
        /* jListBefore.addListSelectionListener(new ListSelectionListener() {

         @Override
         public void valueChanged(ListSelectionEvent e) {
            // TODO Auto-generated method stub


            String str=(String)jListBefore.getSelectedValue();
            System.out.println("|"+str+"|");

         }

        });*/


        jListBefore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListBeforeKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListBefore);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane2.setViewportView(jListAfter);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
        );

        jLabelTips.setText("<html>点击左侧选项到右侧<br/>右侧选项从上至下依次排列VL</html>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTips, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(298, Short.MAX_VALUE)
                                .addComponent(jButtonPrevStep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancel)
                                .addGap(8, 8, 8))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCancel)
                                        .addComponent(jButtonDone)
                                        .addComponent(jButtonPrevStep))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        doClose(RET_CANCEL);
    }

    private void jButtonPrevStepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        doClose(RET_CANCEL);
        ModelGuideDialog4 guiDialog =  new ModelGuideDialog4(ApplicationSettings.getApplicationView(), true, nowModel);
        // ModelGuideDialog3 guiDialog =  new ModelGuideDialog3(CreateGui.getApp(), true, nowVo);
        guiDialog.pack();
        guiDialog.setLocationRelativeTo(null);
        guiDialog.setVisible(true);
    }

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        int listModelAfterSize = listModelAfter.getSize();
        if(listModelAfterSize< nowModel.getVlList().size())
        {
            JOptionPane.showMessageDialog(this, "请确认每个SPM中虚链路的排列顺序", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        for(int i=0; i<listModelAfterSize; i++)
        {
            String key = (String) listModelAfter.get(i);
            VLInfo info1 = infoMap.get(key);
            nowModel.getVlList().add(info1);
            nowModel.getVlList().remove();
        }


//     System.out.println(listModelAfter.get(0)+">"+listModelAfter.get(1)+">"+listModelAfter.get(2));

        //1、根据 nowModel生成一个文件 xxxxx.xml /2、然后把它读出来 就ok了
        // 1、生成这个xml文件
        //new ModelFactory();
        String path = ModelFactory2.buildModel(nowModel,arr);

        AverageQueueLengthModule.setGuideModel(nowModel);
        ThroughputModule.setGuideModel(nowModel);
        AverageQueueLengthModule.setGuideModel(nowModel);

        File filePath = new File(path);
        doClose(RET_OK);
        ImportProgressBarDialog ipbd = new ImportProgressBarDialog(ApplicationSettings.getApplicationView(),false);
        ipbd.pack();
        ipbd.setLocationRelativeTo(null);
        ipbd.setVisible(true);
        //2、启动线程从文档中读出数据
        new Progress(ipbd,gf,filePath).start();

    }

    private void jListBeforeKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
    }

    private void jListBeforeMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
           // System.out.print("选中");
            //System.out.println(jListBefore.getSelectedValue());
            String item = (String) jListBefore.getSelectedValue();
            int index = jListBefore.getSelectedIndex();
           // System.out.println(index);
            if(index>=0)
            {
                listModelBefore.remove(index);
                listModelAfter.addElement(item);
            }
        }

    }

    private void jListAfterMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            System.out.print("选中");
            System.out.println(jListAfter.getSelectedValue());
            String item = (String) jListAfter.getSelectedValue();

            int index = jListAfter.getSelectedIndex();System.out.println(index);
            if(index>=0)
            {
                listModelAfter.remove(index);
                listModelBefore.addElement(item);
            }
        }

    }

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModelGuideDialog1 dialog = new ModelGuideDialog1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonPrevStep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTips;
    private javax.swing.JList jListAfter;
    private javax.swing.JList jListBefore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration
    private int returnStatus = RET_CANCEL;

    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if OK button has been pressed */
    public static final int RET_OK = 1;

}


class Progress extends Thread{//自定义类progress
    private final int []progressValue = {6,12,27,34,51,67,81,90,100};
    private ImportProgressBarDialog jDialog;
    private JProgressBar progressBar;
    private PipeApplicationView gf;
    private File filePath;
    public Progress(ImportProgressBarDialog jDialog,PipeApplicationView gf,File filePath )
    {
        this.jDialog = jDialog;
        this.progressBar = jDialog.getjProgressBar1();
        this.gf=gf;
        this.filePath=filePath;
    }

    public void run()
    {
        for(int i=0;i<progressValue.length;i++)
        {
            try
            {
                Thread.sleep(200);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            progressBar.setValue(progressValue[i]);  //进度值
        }
        progressBar.setIndeterminate(false);
        //progressBar.setIndeterminate(true);   //不确定进度的进度条
        jDialog.setVisible(false);
        //从文档中读出来数据
        gf.createNewTab(filePath, false);
    }
}