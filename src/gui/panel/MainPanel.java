package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import gui.listener.ToolBarListener;
import util.CenterPanel;
import util.GUIUtil;

public class MainPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static MainPanel instance = new MainPanel();
    public JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bCategory = new JButton();
    public JButton bConfig = new JButton();


    public CenterPanel workingPanel;

    private MainPanel() {

        GUIUtil.setImageIcon(bSpend, "home.png", "消费一览");
        GUIUtil.setImageIcon(bRecord, "record.png", "记一笔");
        GUIUtil.setImageIcon(bCategory, "category2.png", "消费分类");
        GUIUtil.setImageIcon(bConfig, "config.png", "设置");


        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bConfig);
        tb.setFloatable(false);

        workingPanel = new CenterPanel(0.8);

        setLayout(new BorderLayout());
        add(tb, BorderLayout.NORTH);
        add(workingPanel, BorderLayout.CENTER);

        addListener();
    }

    private void addListener(){
        ToolBarListener listener = new ToolBarListener();

        bSpend.addActionListener(listener);
        bRecord.addActionListener(listener);
        bCategory.addActionListener(listener);
        bConfig.addActionListener(listener);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(MainPanel.instance, 1);
    }
}