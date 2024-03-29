/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 29/03/2012, 01:15:30 PM
 */

package Formularios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import javax.swing.*;
import Interface.Fabrica;
import Interface.IControladorCasas;
import Interface.IControladorClientes;
import com.sun.java.swing.plaf.nimbus.*;
import de.javasoft.plaf.synthetica.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 *
 * @author Santiago
 * 
 * 
 */


public class Main extends javax.swing.JFrame {
    public  boolean tieneFondo;

    /** Creates new form Main */
    
    
    public Main() {
        //vemos si tomamos el fondo del usuario o del tema

        this.setIconImage (new ImageIcon("images/icono2.gif").getImage());

        //por las dudas si se le apaga la pc en algun momento
        File fi = new File("/db/Base.lck");
        try{
            fi.delete();
        }catch(Exception e){
        }

        

        Properties prop = new Properties();
        FileInputStream fis;
        String fondo = "8";

        try{
            fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            fondo = prop.getProperty("fondo");
            fis.close();

            if (fondo.equals("1"))
                tieneFondo=true;
            else
                tieneFondo=false;
        }catch(Exception e){

        }

        Fabrica f = new Fabrica();
        IControladorCasas icc = f.getIControladorCasas();


        try {
            icc.ingresarLugar("Shangrila");
            icc.ingresarLugar("San J. de Carrasco");
            icc.ingresarLugar("Lagomar");
            icc.ingresarLugar("Solymar");
            icc.ingresarLugar("Lomas de Solymar");
            icc.ingresarLugar("Pinar");
            icc.ingresarLugar("Parque de Carrasco");
            icc.ingresarLugar("Parque de Solymar");
            icc.ingresarLugar("Montes de Solymar");
            icc.ingresarLugar("Pinares de Solymar");
            icc.ingresarLugar("Medanos de Solymar");
        }
        catch(Exception exc){}

        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//para iniciar el jframe maximizado
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                /*if (JOptionPane.showConfirmDialog(null, "Esta seguro?") == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    Fabrica fab = new Fabrica();
                    IControladorClientes icc = fab.getIControladorClientes();
                    icc.cerrarEm();
                    dispose();
                }*/
                Fabrica fab = new Fabrica();
                IControladorClientes icc = fab.getIControladorClientes();
                icc.cerrarEm();
                dispose();
            }
        });

        this.jMenu1.setSize(52, 20);
        this.jMenu2.setSize(55, 20);
        this.jMenu3.setSize(52, 20);
        this.jMenu4.setSize(52, 20);
        this.jMenu5.setSize(80, 20);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = (tieneFondo) ? new Fondo(): new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemClienteAlta = new javax.swing.JMenuItem();
        jMenuItemClienteConsulta = new javax.swing.JMenuItem();
        jMenuItemClienteModificar = new javax.swing.JMenuItem();
        jMenuItemClienteBaja = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemPropiedadAlta = new javax.swing.JMenuItem();
        jMenuItemPropiedadConsulta = new javax.swing.JMenuItem();
        jMenuItemPropiedadModificar = new javax.swing.JMenuItem();
        jMenuItemPropiedadBaja = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Inmobilaria Los Lagos");

        jMenu4.setText("Archivo");
        jMenu4.setMaximumSize(new java.awt.Dimension(52, 32767));

        jMenuItem3.setText("Exportar Pdf");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenu7.setText("Configuración");

        jMenu6.setText("Apariencia");

        jMenuItem11.setText("Negro");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem8.setText("Borde negro");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem7.setText("Verde");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem6.setText("Azul");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem5.setText("Gris");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem4.setText("Celeste");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem12.setText("Naranja");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem14.setText("Sistema");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenu7.add(jMenu6);

        jMenu8.setText("Fondo");

        jMenuItem17.setText("Cargar Fondo");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Quitar Fondo");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenu7.add(jMenu8);

        jMenu4.add(jMenu7);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Clientes");
        jMenu1.setPreferredSize(new java.awt.Dimension(52, 19));

        jMenuItemClienteAlta.setText("Alta");
        jMenuItemClienteAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteAltaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClienteAlta);

        jMenuItemClienteConsulta.setText("Consulta");
        jMenuItemClienteConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClienteConsulta);

        jMenuItemClienteModificar.setText("Modificar");
        jMenuItemClienteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClienteModificar);

        jMenuItemClienteBaja.setText("Baja");
        jMenuItemClienteBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteBajaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemClienteBaja);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Propiedades");
        jMenu2.setPreferredSize(new java.awt.Dimension(69, 19));

        jMenuItemPropiedadAlta.setText("Alta");
        jMenuItemPropiedadAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropiedadAltaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPropiedadAlta);

        jMenuItemPropiedadConsulta.setText("Consulta");
        jMenuItemPropiedadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropiedadConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPropiedadConsulta);

        jMenuItemPropiedadModificar.setText("Modificar");
        jMenuItemPropiedadModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropiedadModificarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPropiedadModificar);

        jMenuItemPropiedadBaja.setText("Baja");
        jMenuItemPropiedadBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropiedadBajaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPropiedadBaja);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Solicitudes");
        jMenu5.setPreferredSize(new java.awt.Dimension(60, 19));

        jMenuItem9.setText("Alta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem1.setText("Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem13.setText("Modificar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem10.setText("Baja");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Ayuda");
        jMenu3.setPreferredSize(new java.awt.Dimension(52, 19));

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem16.setText("Acerca de LosLagosV1.0");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // #############################################
    // ############### CLIENTES ####################
    // #############################################
    
    // Crear Cliente
    private void jMenuItemClienteAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteAltaActionPerformed
        ClienteInfo ifClienteAlta = new ClienteInfo();
        this.jDesktopPane1.add(ifClienteAlta);
        ifClienteAlta.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteAltaActionPerformed

    // Consultar Clientes
    private void jMenuItemClienteConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteConsultaActionPerformed
        ClienteLista ifClienteLista = new ClienteLista("ConsultarCliente");
        this.jDesktopPane1.add(ifClienteLista);
        ifClienteLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteConsultaActionPerformed

    // Modificar Cliente
    private void jMenuItemClienteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteModificarActionPerformed
        ClienteLista ifClienteLista = new ClienteLista("ModificarCliente");
        this.jDesktopPane1.add(ifClienteLista);
        ifClienteLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteModificarActionPerformed

    // Baja Cliente
    private void jMenuItemClienteBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteBajaActionPerformed
        ClienteLista ifClienteLista = new ClienteLista("BajaCliente");
        this.jDesktopPane1.add(ifClienteLista);
        ifClienteLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteBajaActionPerformed

    
    
    // #############################################
    // ############### PROPIEDADES #################
    // #############################################
    
    // Alta Propiedad
    private void jMenuItemPropiedadAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropiedadAltaActionPerformed
        PropiedadInfo ifPropiedadAlta = new PropiedadInfo();
        this.jDesktopPane1.add(ifPropiedadAlta);
        ifPropiedadAlta.setVisible(true);
    }//GEN-LAST:event_jMenuItemPropiedadAltaActionPerformed

    // Modificar Propiedad
    private void jMenuItemPropiedadModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropiedadModificarActionPerformed
        PropiedadLista ifPropLista = new PropiedadLista("ModificarPropiedad");
        this.jDesktopPane1.add(ifPropLista);
        ifPropLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemPropiedadModificarActionPerformed

    // Baja Propiedad
    private void jMenuItemPropiedadBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropiedadBajaActionPerformed
        PropiedadLista ifPropLista = new PropiedadLista("BajaPropiedad");
        this.jDesktopPane1.add(ifPropLista);
        ifPropLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemPropiedadBajaActionPerformed

    // Consulta Propiedad
    private void jMenuItemPropiedadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropiedadConsultaActionPerformed
        PropiedadLista ifPropLista = new PropiedadLista("ConsultarPropiedad");
        this.jDesktopPane1.add(ifPropLista);
        ifPropLista.setVisible(true);
    }//GEN-LAST:event_jMenuItemPropiedadConsultaActionPerformed

    
    
    // Alta Solicitud
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        SolicitudInfo ifSolAlta = new SolicitudInfo();
        this.jDesktopPane1.add(ifSolAlta);
        ifSolAlta.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    // Baja Solicitud
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        SolicitudLista ifSolLista = new SolicitudLista("BajaSolicitud");
        this.jDesktopPane1.add(ifSolLista);
        ifSolLista.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    // Modificar Solicitud
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        SolicitudLista ifSolLista = new SolicitudLista("ModificarSolicitud");
        this.jDesktopPane1.add(ifSolLista);
        ifSolLista.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    // Consultar Solicitud
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SolicitudLista ifSolLista = new SolicitudLista("ConsultarSolicitud");
        this.jDesktopPane1.add(ifSolLista);
        ifSolLista.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    //Exportar Datos
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ExportarDatos a = new ExportarDatos();
        this.jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        try {

            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel()); //TODO NEGRO
            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","1");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        try {

            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel()); //NEGRO TITULO

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","2");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try {

            UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());//VERDE

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","3");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel()); //AZUL

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","4");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         try {

            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());//GRIS

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","5");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
       try {

            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());//CELESTE

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","6");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
         try {

           UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());//NARANJA

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","7");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
      try {

           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Sistema Operativo

            this.dispose();
            new Main().setVisible(true);

            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("apariencia","8");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Acerca a = new Acerca();
        this.jDesktopPane1.add(a);
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        String path = abrirImagen();
        if (path.equals(""))
            return;
        File f = new File("images/fondo.png");

        try{
            f.delete();
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("fondo","1");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();
        }catch(Exception e){
            System.out.print("no se pudo borrar?");
        }
        copiarArchivos(path,"images/fondo.png");
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
       File f = new File("images/fondo.png");

        try{
            f.delete();
            Properties prop = new Properties();
            FileInputStream fis = new FileInputStream("config.xml");
            prop.loadFromXML(fis);
            prop.setProperty("fondo","0");
            prop.storeToXML(new FileOutputStream("config.xml"), null);
            fis.close();
        }catch(Exception e){
            System.out.print("no se pudo borrar?");
        }
        

        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

      public String abrirImagen(){
            JFileChooser chooser = new JFileChooser();
            chooser.setMultiSelectionEnabled(false);
            chooser.setFileFilter(new FiltroJPG());
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setToolTipText("Ingrese el nombre y ubicacion del archivo para exportar a pdf");

            int e = chooser.showOpenDialog(null);

            String path = "";
            if (e == JFileChooser.APPROVE_OPTION){
                if (chooser.getSelectedFile() != null) {
                    path = chooser.getSelectedFile().getPath();

                }
            }else if (e == JFileChooser.CANCEL_OPTION)
                return "";

            return path;
    }

      public void copiarArchivos(String Origen, String Destino){
            File origen = new File(Origen);
            File destino = new File(Destino);

            try {
                    InputStream in = new FileInputStream(origen);
                    OutputStream out = new FileOutputStream(destino);

                    byte[] buf = new byte[1024];
                    int len;

                    while ((len = in.read(buf)) > 0) {
                            out.write(buf, 0, len);
                    }
                    in.close();
                    out.close();
            } catch (IOException ioe){
                    ioe.printStackTrace();
            }

      }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws ClassNotFoundException {
        try {
            
            Properties prop = new Properties();
            FileInputStream fis;
            String ap = "8";
            try {
                fis = new FileInputStream("config.xml");
                prop.loadFromXML(fis);
                ap = prop.getProperty("apariencia");
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                if (ap.equals("1")) {
                    UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel()); //NEGRO
                } else if (ap.equals("2")) {
                    UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel()); //BORDE NEGRO
                } else if (ap.equals("3")) {
                    UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel()); //VERDE
                } else if (ap.equals("4")) {
                    UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel()); //AZUL
                } else if (ap.equals("5")) {
                    UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel()); //GRIS
                } else if (ap.equals("6")) {
                    UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel()); //CELESTE
                } else if (ap.equals("7")) {
                    UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel()); //NARANJA
                } else if (ap.equals("8")) {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //Sistema Operativo
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            
            java.awt.EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    new Main().setVisible(true);
                }
            });
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemClienteAlta;
    private javax.swing.JMenuItem jMenuItemClienteBaja;
    private javax.swing.JMenuItem jMenuItemClienteConsulta;
    private javax.swing.JMenuItem jMenuItemClienteModificar;
    private javax.swing.JMenuItem jMenuItemPropiedadAlta;
    private javax.swing.JMenuItem jMenuItemPropiedadBaja;
    private javax.swing.JMenuItem jMenuItemPropiedadConsulta;
    private javax.swing.JMenuItem jMenuItemPropiedadModificar;
    // End of variables declaration//GEN-END:variables

}
