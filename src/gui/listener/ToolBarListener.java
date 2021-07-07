package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import gui.panel.CategoryPanel;
import gui.panel.ConfigPanel;
import gui.panel.SpendPanel;
import gui.panel.MainPanel;
import gui.panel.RecordPanel;

public class ToolBarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel p = MainPanel.instance;
        JButton b = (JButton) e.getSource();

        if (b == p.bCategory)
            p.workingPanel.show(CategoryPanel.instance);
        if (b == p.bSpend)
            p.workingPanel.show(SpendPanel.instance);
        if (b == p.bRecord)
            p.workingPanel.show(RecordPanel.instance);
        if (b == p.bConfig)
            p.workingPanel.show(ConfigPanel.instance);

    }
}