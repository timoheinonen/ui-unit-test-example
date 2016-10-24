package org.zapppp;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zapppp on 24.10.2016.
 */
public class SomePanel extends JPanel {


    private SomePanelPresentationModel panelPresentationModel;

    public SomePanel(SomePanelPresentationModel panelPresentationModel) {
        this.panelPresentationModel = panelPresentationModel;
        setLayout(new MigLayout(""));

        setPreferredSize(new Dimension(800, 400));
        setBackground(Color.CYAN);

        initComponents();
        initLayout();
        bindComponents();
    }

    private void initComponents() {

    }

    private void initLayout() {

    }

    private void bindComponents() {
        //TODO: jgoodies binding
    }
}
