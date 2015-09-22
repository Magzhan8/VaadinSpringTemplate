/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaadinspringtemplate.ui;


import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadinspringtemplate.hibernate.HibernateUtil;

/**
 *
 * @author m.zhaksygeldy
 */
public class MyUI extends UI{
    HibernateUtil hibernateUtil;
    @Override
    protected void init(VaadinRequest request) {
        hibernateUtil=new HibernateUtil();
        VerticalLayout layout=new VerticalLayout();
        hibernateUtil.getSessionFactory();
        layout.addComponent(new Label("Hello World"));
        setContent(layout);
    }
    
}
