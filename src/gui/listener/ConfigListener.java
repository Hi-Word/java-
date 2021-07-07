package gui.listener;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import gui.panel.ConfigPanel;
import service.ConfigService;
import util.GUIUtil;

public class ConfigListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ConfigPanel p = ConfigPanel.instance;
        if(!GUIUtil.checkNumber(p.tfBudget, "����Ԥ��"))
            return;


        ConfigService cs= new ConfigService();
        cs.update(ConfigService.budget,p.tfBudget.getText());

        JOptionPane.showMessageDialog(p, "�����޸ĳɹ�");

    }

}