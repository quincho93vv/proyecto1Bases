package Vista;

import Modelo.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SistemaVentas extends javax.swing.JFrame {

    String[] headClientes = {"Codigo", "Nombre", "Vendedor"};
    String[] headVendedores = {"Codigo", "Nombre", "Total vendido"};
    String[] headFacturas = {"Codigo", "Cliente", "Tipo", "Fecha", "Total"};
    String[] headProductos = {"Codigo", "Nombre", "Precio"};
    String[] headDetalles = {"Producto", "Factura", "Cantidad", "Total"};
    String msj = "agregado";
    ConnectionHandler ch;
    Cliente cliente;
    Vendedor vendedor;
    Factura factura;
    Producto producto;
    Detalle detalle;

    public SistemaVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_conectar1 = new javax.swing.JPanel();
        cs = new javax.swing.JComboBox();
        pu = new javax.swing.JPasswordField();
        tu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panel_codigo = new javax.swing.JPanel();
        combo_codigo = new javax.swing.JComboBox();
        panel_cons_det = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        combo_cons_fact = new javax.swing.JComboBox();
        combo_cons_prod = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_conectar = new javax.swing.JButton();
        panel_conectar = new javax.swing.JPanel();
        combo_server = new javax.swing.JComboBox();
        pass_usuario = new javax.swing.JPasswordField();
        text_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_Clientes = new javax.swing.JPanel();
        panel_edit_add_cliente = new javax.swing.JPanel();
        cliente_aceptar = new javax.swing.JButton();
        cliente_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_nombre_cliente = new javax.swing.JTextField();
        combo_vendedor = new javax.swing.JComboBox();
        btn_cli_agregar = new javax.swing.JButton();
        btn_cli_modificar = new javax.swing.JButton();
        btn_cli_borrar = new javax.swing.JButton();
        btn_cli_consulta = new javax.swing.JButton();
        todo_cliente = new javax.swing.JButton();
        panel_Vendedores = new javax.swing.JPanel();
        panel_edit_add_vendedor = new javax.swing.JPanel();
        vendedor_aceptar = new javax.swing.JButton();
        vendedor_cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        text_nombre_vendedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        text_total_vendido = new javax.swing.JTextField();
        btn_ven_agregar = new javax.swing.JButton();
        btn_ven_modificar = new javax.swing.JButton();
        btn_ven_borrar = new javax.swing.JButton();
        btn_ven_consulta = new javax.swing.JButton();
        todo_vendedor = new javax.swing.JButton();
        panel_Productos = new javax.swing.JPanel();
        panel_edit_add_productos = new javax.swing.JPanel();
        producto_aceptar = new javax.swing.JButton();
        producto_cancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text_nombre_producto = new javax.swing.JTextField();
        text_precio_producto = new javax.swing.JFormattedTextField();
        btn_pro_agregar = new javax.swing.JButton();
        btn_pro_modificar = new javax.swing.JButton();
        btn_pro_borrar = new javax.swing.JButton();
        btn_pro_consulta = new javax.swing.JButton();
        todo_producto = new javax.swing.JButton();
        panel_Facturas = new javax.swing.JPanel();
        panel_edit_add_factura = new javax.swing.JPanel();
        factura_aceptar = new javax.swing.JButton();
        factura_cancelar = new javax.swing.JButton();
        combo_cliente_factura = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_tipo_factura = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();
        btn_fac_agregar = new javax.swing.JButton();
        btn_fac_modificar = new javax.swing.JButton();
        btn_fac_borrar = new javax.swing.JButton();
        btn_fac_consulta = new javax.swing.JButton();
        todo_factura = new javax.swing.JButton();
        panel_Detalles = new javax.swing.JPanel();
        btn_det_agregar = new javax.swing.JButton();
        btn_det_consulta = new javax.swing.JButton();
        btn_det_modificar = new javax.swing.JButton();
        btn_det_borrar = new javax.swing.JButton();
        todo_detalles = new javax.swing.JButton();
        panel_edit_add_detalle = new javax.swing.JPanel();
        combo_facturas_detalle = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        combo_productos_detalle = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_total_detalle = new javax.swing.JTextPane();
        detalle_aceptar = new javax.swing.JButton();
        detalle_cancelar = new javax.swing.JButton();
        combo_cantidad = new javax.swing.JComboBox();

        cs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oracle", "Postgres" }));
        cs.setSelectedIndex(-1);
        combo_server.setSelectedIndex(-1);

        pu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puActionPerformed(evt);
            }
        });

        tu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuActionPerformed(evt);
            }
        });

        jLabel13.setText("Password:");

        jLabel14.setText("Conexión:");

        jLabel15.setText("Usuario:");

        javax.swing.GroupLayout panel_conectar1Layout = new javax.swing.GroupLayout(panel_conectar1);
        panel_conectar1.setLayout(panel_conectar1Layout);
        panel_conectar1Layout.setHorizontalGroup(
            panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conectar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_conectar1Layout.setVerticalGroup(
            panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conectar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(panel_conectar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_codigoLayout = new javax.swing.GroupLayout(panel_codigo);
        panel_codigo.setLayout(panel_codigoLayout);
        panel_codigoLayout.setHorizontalGroup(
            panel_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_codigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_codigo, 0, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_codigoLayout.setVerticalGroup(
            panel_codigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_codigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setText("Producto");

        jLabel22.setText("Factura");

        combo_cons_fact.setSelectedIndex(-1);

        combo_cons_prod.setSelectedIndex(-1);

        javax.swing.GroupLayout panel_cons_detLayout = new javax.swing.GroupLayout(panel_cons_det);
        panel_cons_det.setLayout(panel_cons_detLayout);
        panel_cons_detLayout.setHorizontalGroup(
            panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cons_detLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_cons_fact, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_cons_prod, 0, 183, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_cons_detLayout.setVerticalGroup(
            panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cons_detLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_cons_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_cons_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(combo_cons_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto 1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido");

        btn_conectar.setText("Conectar");
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });

        combo_server.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oracle", "Postgres" }));
        combo_server.setSelectedIndex(-1);
        combo_server.setSelectedIndex(-1);

        pass_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_usuarioActionPerformed(evt);
            }
        });

        text_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        jLabel2.setText("Conexión:");

        jLabel3.setText("Usuario:");

        javax.swing.GroupLayout panel_conectarLayout = new javax.swing.GroupLayout(panel_conectar);
        panel_conectar.setLayout(panel_conectarLayout);
        panel_conectarLayout.setHorizontalGroup(
            panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_server, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_conectarLayout.setVerticalGroup(
            panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_conectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panel_conectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(panel_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(panel_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btn_conectar)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", panel_inicio);

        panel_edit_add_cliente.setVisible(false);

        cliente_aceptar.setText("Agregar");
        cliente_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_aceptarActionPerformed(evt);
            }
        });

        cliente_cancelar.setText("Cancelar");
        cliente_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_cancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Vendedor:");

        jLabel6.setText("Nombre:");

        combo_vendedor.setSelectedIndex(-1);

        javax.swing.GroupLayout panel_edit_add_clienteLayout = new javax.swing.GroupLayout(panel_edit_add_cliente);
        panel_edit_add_cliente.setLayout(panel_edit_add_clienteLayout);
        panel_edit_add_clienteLayout.setHorizontalGroup(
            panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_clienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_edit_add_clienteLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cliente_aceptar)
                        .addGap(18, 18, 18)
                        .addComponent(cliente_cancelar))
                    .addGroup(panel_edit_add_clienteLayout.createSequentialGroup()
                        .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_vendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel_edit_add_clienteLayout.setVerticalGroup(
            panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_clienteLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combo_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_aceptar)
                    .addComponent(cliente_cancelar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btn_cli_agregar.setText("Agregar Cliente");
        btn_cli_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_agregarActionPerformed(evt);
            }
        });

        btn_cli_modificar.setText("Modificar Cliente");
        btn_cli_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_modificarActionPerformed(evt);
            }
        });

        btn_cli_borrar.setText("Eliminar Cliente");
        btn_cli_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_borrarActionPerformed(evt);
            }
        });

        btn_cli_consulta.setText("Consultar Cliente");
        btn_cli_consulta.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_cli_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_consultaActionPerformed(evt);
            }
        });

        todo_cliente.setText("Todos los clientes");
        todo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todo_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ClientesLayout = new javax.swing.GroupLayout(panel_Clientes);
        panel_Clientes.setLayout(panel_ClientesLayout);
        panel_ClientesLayout.setHorizontalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cli_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cli_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cli_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cli_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(todo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_edit_add_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        panel_ClientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cli_agregar, btn_cli_borrar, btn_cli_consulta, btn_cli_modificar});

        panel_ClientesLayout.setVerticalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ClientesLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_cli_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_borrar)
                        .addGap(18, 18, 18)
                        .addComponent(todo_cliente))
                    .addGroup(panel_ClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_edit_add_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panel_ClientesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_cli_agregar, btn_cli_borrar, btn_cli_consulta, btn_cli_modificar});

        jTabbedPane1.addTab("Clientes", panel_Clientes);

        panel_edit_add_vendedor.setVisible(false);

        vendedor_aceptar.setText("Agregar");
        vendedor_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedor_aceptarActionPerformed(evt);
            }
        });

        vendedor_cancelar.setText("Cancelar");
        vendedor_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedor_cancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel17.setText("Total Vendido");

        javax.swing.GroupLayout panel_edit_add_vendedorLayout = new javax.swing.GroupLayout(panel_edit_add_vendedor);
        panel_edit_add_vendedor.setLayout(panel_edit_add_vendedorLayout);
        panel_edit_add_vendedorLayout.setHorizontalGroup(
            panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_vendedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_nombre_vendedor)
                    .addComponent(text_total_vendido))
                .addContainerGap())
            .addGroup(panel_edit_add_vendedorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(vendedor_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendedor_cancelar)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panel_edit_add_vendedorLayout.setVerticalGroup(
            panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_vendedorLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(text_nombre_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(text_total_vendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendedor_aceptar)
                    .addComponent(vendedor_cancelar))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        btn_ven_agregar.setText("Agregar Vendedor");
        btn_ven_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven_agregarActionPerformed(evt);
            }
        });

        btn_ven_modificar.setText("Modificar Vendedor");
        btn_ven_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven_modificarActionPerformed(evt);
            }
        });

        btn_ven_borrar.setText("Eliminar Vendedor");
        btn_ven_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven_borrarActionPerformed(evt);
            }
        });

        btn_ven_consulta.setText("Consultar Vendedor");
        btn_ven_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven_consultaActionPerformed(evt);
            }
        });

        todo_vendedor.setText("Todos los vendedores");
        todo_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todo_vendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_VendedoresLayout = new javax.swing.GroupLayout(panel_Vendedores);
        panel_Vendedores.setLayout(panel_VendedoresLayout);
        panel_VendedoresLayout.setHorizontalGroup(
            panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendedoresLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todo_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ven_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ven_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ven_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ven_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_edit_add_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        panel_VendedoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_ven_agregar, btn_ven_borrar, btn_ven_consulta, btn_ven_modificar});

        panel_VendedoresLayout.setVerticalGroup(
            panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendedoresLayout.createSequentialGroup()
                .addGroup(panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_VendedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_edit_add_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_VendedoresLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_ven_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_consulta)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_borrar)))
                .addGap(18, 18, 18)
                .addComponent(todo_vendedor)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        panel_VendedoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ven_agregar, btn_ven_borrar, btn_ven_consulta, btn_ven_modificar});

        jTabbedPane1.addTab("Vendedores", panel_Vendedores);

        panel_edit_add_productos.setVisible(false);

        producto_aceptar.setText("Agregar");
        producto_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_aceptarActionPerformed(evt);
            }
        });

        producto_cancelar.setText("Cancelar");
        producto_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producto_cancelarActionPerformed(evt);
            }
        });

        jLabel9.setText("Precio");

        jLabel10.setText("Producto");

        javax.swing.GroupLayout panel_edit_add_productosLayout = new javax.swing.GroupLayout(panel_edit_add_productos);
        panel_edit_add_productos.setLayout(panel_edit_add_productosLayout);
        panel_edit_add_productosLayout.setHorizontalGroup(
            panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_productosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_precio_producto)
                    .addComponent(text_nombre_producto))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_productosLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(producto_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto_cancelar)
                .addGap(64, 64, 64))
        );
        panel_edit_add_productosLayout.setVerticalGroup(
            panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_productosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(text_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(text_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(producto_aceptar)
                    .addComponent(producto_cancelar))
                .addGap(56, 56, 56))
        );

        btn_pro_agregar.setText("Agregar Producto");
        btn_pro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_agregarActionPerformed(evt);
            }
        });

        btn_pro_modificar.setText("Modificar Producto");
        btn_pro_modificar.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_pro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_modificarActionPerformed(evt);
            }
        });

        btn_pro_borrar.setText("Eliminar Producto");
        btn_pro_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_borrarActionPerformed(evt);
            }
        });

        btn_pro_consulta.setText("Consultar Producto");
        btn_pro_consulta.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_pro_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pro_consultaActionPerformed(evt);
            }
        });

        todo_producto.setText("Todos los Productos");
        todo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todo_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ProductosLayout = new javax.swing.GroupLayout(panel_Productos);
        panel_Productos.setLayout(panel_ProductosLayout);
        panel_ProductosLayout.setHorizontalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProductosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todo_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pro_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btn_pro_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btn_pro_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btn_pro_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_edit_add_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        panel_ProductosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_pro_agregar, btn_pro_borrar, btn_pro_consulta, btn_pro_modificar});

        panel_ProductosLayout.setVerticalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProductosLayout.createSequentialGroup()
                .addGroup(panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ProductosLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_pro_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_borrar))
                    .addGroup(panel_ProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_edit_add_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(todo_producto)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panel_ProductosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_pro_agregar, btn_pro_borrar, btn_pro_consulta, btn_pro_modificar});

        jTabbedPane1.addTab("Productos", panel_Productos);

        panel_edit_add_factura.setVisible(false);

        factura_aceptar.setText("Agregar");
        factura_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factura_aceptarActionPerformed(evt);
            }
        });

        factura_cancelar.setText("Cancelar");
        factura_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factura_cancelarActionPerformed(evt);
            }
        });

        combo_cliente_factura.setSelectedIndex(-1);

        jLabel11.setText("Cliente");

        jLabel12.setText("Tipo Factura");

        combo_tipo_factura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contado", "Credito" }));
        combo_tipo_factura.setSelectedIndex(-1);

        jLabel7.setText("Total");

        javax.swing.GroupLayout panel_edit_add_facturaLayout = new javax.swing.GroupLayout(panel_edit_add_factura);
        panel_edit_add_factura.setLayout(panel_edit_add_facturaLayout);
        panel_edit_add_facturaLayout.setHorizontalGroup(
            panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_facturaLayout.createSequentialGroup()
                .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_edit_add_facturaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_cliente_factura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_tipo_factura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_edit_add_facturaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(factura_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factura_cancelar)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        panel_edit_add_facturaLayout.setVerticalGroup(
            panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_facturaLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(combo_tipo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combo_cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_aceptar)
                    .addComponent(factura_cancelar))
                .addContainerGap())
        );

        btn_fac_agregar.setText("Agregar Factura");
        btn_fac_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fac_agregarActionPerformed(evt);
            }
        });

        btn_fac_modificar.setText("Modificar Factura");
        btn_fac_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fac_modificarActionPerformed(evt);
            }
        });

        btn_fac_borrar.setText("Eliminar Factura");
        btn_fac_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fac_borrarActionPerformed(evt);
            }
        });

        btn_fac_consulta.setText("Consultar Factura");
        btn_fac_consulta.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_fac_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fac_consultaActionPerformed(evt);
            }
        });

        todo_factura.setText("Todas las facturas");
        todo_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todo_facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_FacturasLayout = new javax.swing.GroupLayout(panel_Facturas);
        panel_Facturas.setLayout(panel_FacturasLayout);
        panel_FacturasLayout.setHorizontalGroup(
            panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FacturasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todo_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_fac_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btn_fac_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btn_fac_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btn_fac_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(panel_edit_add_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        panel_FacturasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_fac_agregar, btn_fac_borrar, btn_fac_consulta, btn_fac_modificar});

        panel_FacturasLayout.setVerticalGroup(
            panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FacturasLayout.createSequentialGroup()
                .addGroup(panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_edit_add_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_fac_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_borrar)))
                .addGap(18, 18, 18)
                .addComponent(todo_factura)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        panel_FacturasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_fac_agregar, btn_fac_borrar, btn_fac_consulta, btn_fac_modificar});

        jTabbedPane1.addTab("Facturas", panel_Facturas);

        btn_det_agregar.setText("Agregar Detalle");
        btn_det_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_agregarActionPerformed(evt);
            }
        });

        btn_det_consulta.setText("Consultar Detalle");
        btn_det_consulta.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_det_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_consultaActionPerformed(evt);
            }
        });

        btn_det_modificar.setText("Modificar Detalle");
        btn_det_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_modificarActionPerformed(evt);
            }
        });

        btn_det_borrar.setText("Eliminar Detalle");
        btn_det_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_det_borrarActionPerformed(evt);
            }
        });

        todo_detalles.setText("Todos los Detalles");
        todo_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todo_detallesActionPerformed(evt);
            }
        });

        panel_edit_add_detalle.setVisible(false);

        combo_facturas_detalle.setSelectedIndex(-1);

        jLabel16.setText("Factura");

        jLabel18.setText("Producto");

        jLabel19.setText("Cantidad");

        combo_productos_detalle.setSelectedIndex(-1
        );

        jLabel20.setText("Total");

        jScrollPane1.setViewportView(text_total_detalle);

        detalle_aceptar.setText("Agregar");
        detalle_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalle_aceptarActionPerformed(evt);
            }
        });

        detalle_cancelar.setText("Cancelar");
        detalle_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalle_cancelarActionPerformed(evt);
            }
        });

        combo_cantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"  }));
        combo_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_edit_add_detalleLayout = new javax.swing.GroupLayout(panel_edit_add_detalle);
        panel_edit_add_detalle.setLayout(panel_edit_add_detalleLayout);
        panel_edit_add_detalleLayout.setHorizontalGroup(
            panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_detalleLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(52, 52, 52)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_edit_add_detalleLayout.createSequentialGroup()
                        .addComponent(detalle_aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detalle_cancelar))
                    .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(combo_facturas_detalle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_productos_detalle, 0, 228, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panel_edit_add_detalleLayout.setVerticalGroup(
            panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_detalleLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_facturas_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(combo_productos_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(combo_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detalle_aceptar)
                    .addComponent(detalle_cancelar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_DetallesLayout = new javax.swing.GroupLayout(panel_Detalles);
        panel_Detalles.setLayout(panel_DetallesLayout);
        panel_DetallesLayout.setHorizontalGroup(
            panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DetallesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(todo_detalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_det_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_det_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_det_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_det_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(panel_edit_add_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel_DetallesLayout.setVerticalGroup(
            panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DetallesLayout.createSequentialGroup()
                .addGroup(panel_DetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_DetallesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_edit_add_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DetallesLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn_det_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_det_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_det_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_det_borrar)
                        .addGap(18, 18, 18)
                        .addComponent(todo_detalles)))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalles", panel_Detalles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cliente_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_cancelarActionPerformed
        text_nombre_cliente.setText(null);
        combo_vendedor.setSelectedIndex(-1);
        panel_edit_add_cliente.setVisible(false);
    }//GEN-LAST:event_cliente_cancelarActionPerformed

    private void cliente_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_aceptarActionPerformed

        try {
            boolean cond = true;
            int codigo = cliente.size() + 1;
            msj = "agregado";
            if (cliente_aceptar.getText().equals("Modificar")) {
                cond = false;
                codigo = cliente.getCod();
                msj = "modificado";
            }

            validaPanelCliente();
            cliente.insertOrUpdateCliente(cond, codigo, text_nombre_cliente.getText(), combo_vendedor.getSelectedIndex() + 1);
            JOptionPane.showMessageDialog(null, "Cliente " + msj + " Exitosamente.", "Extio", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al " + msj + " Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        cliente_cancelar.doClick();
    }//GEN-LAST:event_cliente_aceptarActionPerformed

    private void vendedor_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor_aceptarActionPerformed
        try {
            boolean cond = true;
            int codigo = vendedor.size() + 1;
            msj = "agregado";
            if (vendedor_aceptar.getText().equals("Modificar")) {
                cond = false;
                codigo = vendedor.getCod();
                msj = "modificado";
            }
            validaPanelVendedor();
            vendedor.insertOrUpdateVendedor(cond, codigo, text_nombre_vendedor.getText(), Float.parseFloat(text_total_vendido.getText()));
            JOptionPane.showMessageDialog(null, "Vendedor " + msj + " Exitosamente.", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al " + msj + " Vendedor.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        vendedor_cancelar.doClick();
    }//GEN-LAST:event_vendedor_aceptarActionPerformed

    private void vendedor_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor_cancelarActionPerformed
        // TODO add your handling code here:
        panel_edit_add_vendedor.setVisible(false);
        text_nombre_vendedor.setText(null);
        text_total_vendido.setText(null);
    }//GEN-LAST:event_vendedor_cancelarActionPerformed

    private void producto_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_aceptarActionPerformed
        // TODO add your handling code here:

        try {
            boolean cond = true;
            int codigo = producto.size() + 1;
            msj = "agregado";
            if (producto_aceptar.getText().equals("Modificar")) {
                cond = false;
                codigo = producto.getCod();
                msj = "modificado";
            }
            validaPanelProducto();
            producto.insertOrUpdateProducto(cond, codigo, text_nombre_producto.getText(), Float.parseFloat(text_precio_producto.getText()));
            JOptionPane.showMessageDialog(null, "Producto " + msj + " Exitosamente.", "Extio", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al " + msj + " Producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        producto_cancelar.doClick();
    }//GEN-LAST:event_producto_aceptarActionPerformed

    private void producto_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producto_cancelarActionPerformed
        panel_edit_add_productos.setVisible(false);
        text_nombre_producto.setText(null);
        text_precio_producto.setText(null);
    }//GEN-LAST:event_producto_cancelarActionPerformed

    private void factura_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factura_aceptarActionPerformed

        try {
            boolean cond = true;
            int codigo = factura.size() + 1;
            msj = "agregado";
            DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
            Date date = new Date();
            if (factura_aceptar.getText().equals("Modificar")) {
                cond = false;
                codigo = factura.getCod();
                msj = "modificado";
            }
            validaPanelProducto();
            factura.insertOrUpdateFactura(cond, codigo, String.valueOf(combo_tipo_factura.getSelectedIndex()), new java.sql.Date(date.getTime()), Float.parseFloat(text_total.getText()), combo_cliente_factura.getSelectedIndex() + 1);
            JOptionPane.showMessageDialog(null, "Factura " + msj + " Exitosamente.", "Extio", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al " + msj + " Factura.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        factura_cancelar.doClick();
    }//GEN-LAST:event_factura_aceptarActionPerformed

    private void factura_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factura_cancelarActionPerformed
        panel_edit_add_factura.setVisible(false);
        combo_tipo_factura.setSelectedIndex(-1);
        text_total.setText(null);
        combo_cliente_factura.setSelectedIndex(-1);
    }//GEN-LAST:event_factura_cancelarActionPerformed

    private void pass_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_usuarioActionPerformed

    }//GEN-LAST:event_pass_usuarioActionPerformed

    private void text_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usuarioActionPerformed

    }//GEN-LAST:event_text_usuarioActionPerformed

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed
        if (btn_conectar.getText().equals("Desconectar")) {
            ch.CloseConnection();
            ch = null;
            combo_server.enable();
            text_usuario.setEditable(true);
            text_usuario.setText(null);
            pass_usuario.setEditable(true);
            pass_usuario.setText(null);
            btn_conectar.setText("Conectar");
            combo_server.setSelectedIndex(-1);
        } else {
            try {
                String pass = new String(pass_usuario.getPassword());
                ch = new ConnectionHandler(combo_server.getSelectedIndex(), text_usuario.getText(), pass);
                cliente = new Cliente(ch.getConnection());
                vendedor = new Vendedor(ch.getConnection());
                factura = new Factura(ch.getConnection());
                producto = new Producto(ch.getConnection());
                detalle = new Detalle(ch.getConnection());
                JOptionPane.showMessageDialog(null, "Conexión Exitosa.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                combo_server.disable();
                text_usuario.setEditable(false);
                pass_usuario.setEditable(false);
                btn_conectar.setText("Desconectar");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al Conectar.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btn_conectarActionPerformed

    private void btn_cli_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_agregarActionPerformed
        if (isConnected()) {
            panel_edit_add_cliente.setVisible(true);
            cliente_aceptar.setText("Agregar");
            try {
                cargaCombo(combo_vendedor, vendedor.selectTodoVendedor());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_cli_agregarActionPerformed

    private void btn_cli_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_consultaActionPerformed
        if (isConnected()) {
            panel_edit_add_cliente.setVisible(false);
            try {
                cargaCombo(combo_codigo, cliente.selectTodoCliente());
                int codigoCliente = JOptionPane.showConfirmDialog(this, panel_codigo, "Consultar Cliente", JOptionPane.OK_CANCEL_OPTION);
                if (codigoCliente == JOptionPane.OK_OPTION) {
                    Object[] r = cliente.selectCliente(combo_codigo.getSelectedIndex() + 1);
                    String cod = String.valueOf(r[0]);
                    String nom = (String) r[1];
                    String ven = String.valueOf(r[2]);
                    JOptionPane.showMessageDialog(null, "Cliente: \n\nNombre : " + nom + "\nCodigo : " + cod + "\nVendeor : " + ven, "Cliente " + cod, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Consultar Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_cli_consultaActionPerformed

    private void btn_cli_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_modificarActionPerformed
        if (isConnected()) {
            cliente_aceptar.setText("Modificar");
            try {
                cargaCombo(combo_codigo, cliente.selectTodoCliente());
                int codigoCliente = JOptionPane.showConfirmDialog(this, panel_codigo, "Modificar Cliente", JOptionPane.OK_CANCEL_OPTION);
                if (codigoCliente == JOptionPane.OK_OPTION) {
                    Object[] r = cliente.selectCliente(combo_codigo.getSelectedIndex() + 1);
                    cliente.setCod((int) r[0]);
                    text_nombre_cliente.setText((String) r[1]);
                    cargaCombo(combo_vendedor, vendedor.selectTodoVendedor());
                    combo_vendedor.setSelectedIndex((int) r[2] - 1);
                    panel_edit_add_cliente.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_cli_modificarActionPerformed

    private void btn_cli_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_borrarActionPerformed
        if (isConnected()) {
            panel_edit_add_cliente.setVisible(false);
            try {
                cargaCombo(combo_codigo, cliente.selectTodoCliente());
                int codigoCliente = JOptionPane.showConfirmDialog(this, panel_codigo, "Borrar Cliente", JOptionPane.OK_CANCEL_OPTION);
                if (codigoCliente == JOptionPane.OK_OPTION) {
                    cliente.deleteCliente(combo_codigo.getSelectedIndex() + 1);
                    JOptionPane.showMessageDialog(null, "Cliente eliminado Correctamento.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_cli_borrarActionPerformed

    private void btn_fac_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fac_agregarActionPerformed
        if (isConnected()) {
            panel_edit_add_factura.setVisible(true);
            factura_aceptar.setText("Agregar");
            try {
                cargaCombo(combo_cliente_factura, cliente.selectTodoCliente());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_fac_agregarActionPerformed

    private void btn_ven_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven_agregarActionPerformed
        // TODO add your handling code here:
        if (isConnected()) {
            panel_edit_add_vendedor.setVisible(true);
            vendedor_aceptar.setText("Agregar");
        }

    }//GEN-LAST:event_btn_ven_agregarActionPerformed

    private void btn_pro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_agregarActionPerformed
        if (isConnected()) {
            panel_edit_add_productos.setVisible(true);
            producto_aceptar.setText("Agregar");
        }
    }//GEN-LAST:event_btn_pro_agregarActionPerformed

    private void btn_ven_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven_consultaActionPerformed
        if (isConnected()) {
            panel_edit_add_vendedor.setVisible(false);
            try {
                cargaCombo(combo_codigo, vendedor.selectTodoVendedor());
                int codigoVendedor = JOptionPane.showConfirmDialog(this, panel_codigo, "Consultar Vendedor", JOptionPane.OK_CANCEL_OPTION);
                if (codigoVendedor == JOptionPane.OK_OPTION) {
                    Object[] r = vendedor.selectVendedor(combo_codigo.getSelectedIndex() + 1);
                    String cod = String.valueOf(r[0]);
                    String nom = (String) r[1];
                    String ven = String.valueOf(r[2]);
                    JOptionPane.showMessageDialog(null, "Vendedor: \n\nCodigo : " + cod + "\nNombre : " + nom + "\nTotal Vendido : " + ven, "Vendedor " + cod, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Consultar Vendedor.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ven_consultaActionPerformed

    private void btn_ven_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven_modificarActionPerformed
        if (isConnected()) {
            vendedor_aceptar.setText("Modificar");
            try {
                cargaCombo(combo_codigo, vendedor.selectTodoVendedor());
                int codigoVendedor = JOptionPane.showConfirmDialog(this, panel_codigo, "Modificar Vendedor", JOptionPane.OK_CANCEL_OPTION);
                if (codigoVendedor == JOptionPane.OK_OPTION) {
                    Object[] r = vendedor.selectVendedor(combo_codigo.getSelectedIndex() + 1);
                    vendedor.setCod((int) r[0]);
                    text_nombre_vendedor.setText((String) r[1]);
                    text_total_vendido.setText(String.valueOf(r[2]));
                    panel_edit_add_vendedor.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar Vendedor.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ven_modificarActionPerformed

    private void btn_ven_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven_borrarActionPerformed
        if (isConnected()) {
            panel_edit_add_vendedor.setVisible(false);
            try {
                cargaCombo(combo_codigo, vendedor.selectTodoVendedor());
                int codigoVendedor = JOptionPane.showConfirmDialog(this, panel_codigo, "Eliminar Vendedor", JOptionPane.OK_CANCEL_OPTION);
                if (codigoVendedor == JOptionPane.OK_OPTION) {
                    vendedor.deleteVendedor(combo_codigo.getSelectedIndex() + 1);
                    JOptionPane.showMessageDialog(null, "Vendedor eliminado Correctamento.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Vendedor.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ven_borrarActionPerformed

    private void btn_pro_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_borrarActionPerformed
        if (isConnected()) {
            panel_edit_add_productos.setVisible(false);
            try {
                cargaCombo(combo_codigo, producto.selectTodoProducto());
                int codigoProducto = JOptionPane.showConfirmDialog(this, panel_codigo, "Consultar Producto", JOptionPane.OK_CANCEL_OPTION);
                if (codigoProducto == JOptionPane.OK_OPTION) {
                    producto.deleteProducto(combo_codigo.getSelectedIndex() + 1);
                    JOptionPane.showMessageDialog(null, "Producto eliminado Correctamento.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_pro_borrarActionPerformed

    private void btn_fac_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fac_borrarActionPerformed
        if (isConnected()) {
            panel_edit_add_factura.setVisible(false);
            try {
                cargaComboFac(combo_codigo, factura.selectTodoFactura());
                int codigoFactura = JOptionPane.showConfirmDialog(this, panel_codigo, "Eliminar Factura", JOptionPane.OK_CANCEL_OPTION);
                if (codigoFactura == JOptionPane.OK_OPTION) {
                    factura.deleteFactura(combo_codigo.getSelectedIndex()+1);
                    JOptionPane.showMessageDialog(null, "Factura eliminado Correctamento.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Factura.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_fac_borrarActionPerformed

    private void btn_pro_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_consultaActionPerformed
        if (isConnected()) {
            try {
                cargaCombo(combo_codigo, producto.selectTodoProducto());
                int codigoProducto = JOptionPane.showConfirmDialog(this, panel_codigo, "Consultar Producto", JOptionPane.OK_CANCEL_OPTION);
                if (codigoProducto == JOptionPane.OK_OPTION) {
                    Object[] r = producto.selectProducto(combo_codigo.getSelectedIndex() + 1);
                    String cod = String.valueOf(r[0]);
                    String nom = (String) r[1];
                    String pre = String.valueOf(r[2]);
                    JOptionPane.showMessageDialog(null, "Producto: \n\nCodigo : " + cod + "\nNombre : " + nom + "\nPrecio : " + pre, "Producto " + cod, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Consultar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_pro_consultaActionPerformed

    private void btn_pro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pro_modificarActionPerformed
        if (isConnected()) {
            producto_aceptar.setText("Modificar");
            try {
                cargaCombo(combo_codigo, producto.selectTodoProducto());
                int codigoProducto = JOptionPane.showConfirmDialog(this, panel_codigo, "Modificar Producto", JOptionPane.OK_CANCEL_OPTION);
                if (codigoProducto == JOptionPane.OK_OPTION) {
                    Object[] r = producto.selectProducto(combo_codigo.getSelectedIndex() + 1);
                    producto.setCod((int) r[0]);
                    text_nombre_producto.setText((String) r[1]);
                    text_precio_producto.setText(String.valueOf(r[2]));
                    panel_edit_add_productos.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar Producto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_pro_modificarActionPerformed

    private void btn_fac_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fac_modificarActionPerformed
        if (isConnected()) {
            factura_aceptar.setText("Modificar");
            try {
                cargaComboFac(combo_codigo, factura.selectTodoFactura());
                int codigoFactura = JOptionPane.showConfirmDialog(this, panel_codigo, "Modificar Factura", JOptionPane.OK_CANCEL_OPTION);
                if (codigoFactura == JOptionPane.OK_OPTION) {
                    Object[] r = factura.selectFactura(combo_codigo.getSelectedIndex() + 1);
                    factura.setCod((int) r[0]);
                    combo_tipo_factura.setSelectedIndex(Integer.parseInt((String) r[1]));
                    text_total.setText(String.valueOf(r[3]));
                    cargaCombo(combo_cliente_factura, cliente.selectTodoCliente());
                    combo_cliente_factura.setSelectedIndex((int) r[4] - 1);
                    panel_edit_add_factura.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar factura.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_fac_modificarActionPerformed

    private void btn_fac_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fac_consultaActionPerformed
        if (isConnected()) {
            try {
                cargaComboFac(combo_codigo, factura.selectTodoFactura());
                int codigoFactura = JOptionPane.showConfirmDialog(this, panel_codigo, "Consultar Factura", JOptionPane.OK_CANCEL_OPTION);
                if (codigoFactura == JOptionPane.OK_OPTION) {
                    Object[] r = factura.selectFactura(combo_codigo.getSelectedIndex() + 1);
                    String codigo = String.valueOf(r[0]);
                    String tipo = r[1].equals("0") ? "Contado" : "Credito";
                    String fecha = (String) r[2].toString();
                    String total = String.valueOf(r[3]);
                    String cliente = String.valueOf(r[4]);
                    JOptionPane.showMessageDialog(null, "Factura: \n\nCodigo : " + codigo + "\nTipo : " + tipo + "\nFecha : " + fecha + "\nTotal : " + total + "\nCliente : " + cliente, "Producto " + tipo, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Consultar Factura.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_fac_consultaActionPerformed

    private void puActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puActionPerformed

    private void tuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuActionPerformed

    private void todo_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todo_vendedorActionPerformed
        if (isConnected()) {
            try {
                cargaTabla(headVendedores, vendedor.selectTodoVendedor());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_todo_vendedorActionPerformed

    private void todo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todo_clienteActionPerformed
        if (isConnected()) {
            try {
                cargaTabla(headClientes, cliente.selectTodoCliente());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_todo_clienteActionPerformed

    private void todo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todo_productoActionPerformed
        if (isConnected()) {
            try {
                cargaTabla(headProductos, producto.selectTodoProducto());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_todo_productoActionPerformed

    private void todo_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todo_facturaActionPerformed
        if (isConnected()) {
            try {
                cargaTabla(headFacturas, factura.selectTodoFactura());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_todo_facturaActionPerformed

    private void btn_det_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_agregarActionPerformed
        // TODO add your handling code here:
        if (isConnected()) {
            panel_edit_add_detalle.setVisible(true);
            factura_aceptar.setText("Agregar");
            try {
                cargaComboFac(combo_facturas_detalle, factura.selectTodoFactura());
                cargaCombo(combo_productos_detalle, producto.selectTodoProducto());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_det_agregarActionPerformed

    private void btn_det_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_consultaActionPerformed
        if (isConnected()) {
            try {
                cargaCombo(combo_cons_prod, producto.selectTodoProducto());
                cargaCombo(combo_cons_fact, factura.selectTodoFactura());
                int codigoDetalle = JOptionPane.showConfirmDialog(this, panel_cons_det, "Consultar Detalle", JOptionPane.OK_CANCEL_OPTION);
                if (codigoDetalle == JOptionPane.OK_OPTION) {
                    Object[] r = detalle.selectDetalle(combo_cons_prod.getSelectedIndex() + 1, combo_cons_fact.getSelectedIndex() + 1);
                    String producto_det = String.valueOf(r[0]);
                    String factura_det = String.valueOf(r[1]);
                    String cantidad = String.valueOf(r[2]);
                    String total_detalle = String.valueOf(r[3]);
                    JOptionPane.showMessageDialog(null, "Detalle: \n\nProducto : " + producto_det + "\nFactura : " + factura_det + "\nCantidad : " + cantidad + "\nTotal : " + total_detalle, "Detalle " + producto_det, JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Consultar Detalle.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_det_consultaActionPerformed

    private void btn_det_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_modificarActionPerformed
        if (isConnected()) {
            detalle_aceptar.setText("Modificar");
            try {
                cargaCombo(combo_cons_prod, producto.selectTodoProducto());
                cargaCombo(combo_cons_fact, factura.selectTodoFactura());
                int codigoDetalle = JOptionPane.showConfirmDialog(this, panel_cons_det, "Modificar Detalle", JOptionPane.OK_CANCEL_OPTION);
                if (codigoDetalle == JOptionPane.OK_OPTION) {
                    Object[] r = detalle.selectDetalle(combo_cons_prod.getSelectedIndex() + 1, combo_cons_fact.getSelectedIndex() + 1);
                    cargaComboFac(combo_facturas_detalle, factura.selectTodoFactura());
                    cargaCombo(combo_productos_detalle, producto.selectTodoProducto());
                    combo_productos_detalle.setSelectedIndex((int) r[0] - 1);
                    combo_facturas_detalle.setSelectedIndex((int) r[1] - 1);
                    combo_cantidad.setSelectedIndex((int) r[2] - 1);
                    text_total_detalle.setText(String.valueOf((float) r[3]));
                    panel_edit_add_detalle.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar detalle.", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_det_modificarActionPerformed

    private void btn_det_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_det_borrarActionPerformed
        if (isConnected()) {
            panel_edit_add_detalle.setVisible(false);
            try {
                cargaCombo(combo_cons_prod, producto.selectTodoProducto());
                cargaCombo(combo_cons_fact, factura.selectTodoFactura());
                int codigoDetalle = JOptionPane.showConfirmDialog(this, panel_cons_det, "Eliminar Detalle", JOptionPane.OK_CANCEL_OPTION);
                if (codigoDetalle == JOptionPane.OK_OPTION) {
                    detalle.deleteDetalle(combo_cons_prod.getSelectedIndex() + 1, combo_cons_fact.getSelectedIndex() + 1);
                    JOptionPane.showMessageDialog(null, "Detalle eliminado Correctamento.", "Extio", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Detalle.", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_det_borrarActionPerformed

    private void todo_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todo_detallesActionPerformed
        if (isConnected()) {
            try {
                cargaTabla(headDetalles, detalle.selectTodoDetalle());
            } catch (SQLException ex) {
                Logger.getLogger(SistemaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_todo_detallesActionPerformed

    private void detalle_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalle_aceptarActionPerformed
        try {
            boolean cond = true;
            msj = "agregado";
            if (detalle_aceptar.getText().equals("Modificar")) {
                cond = false;
                msj = "modificado";
            }
            validaPanelProducto();
            detalle.insertOrUpdateDetalle(cond, combo_productos_detalle.getSelectedIndex() + 1, combo_facturas_detalle.getSelectedIndex() + 1, combo_cantidad.getSelectedIndex() + 1, Float.parseFloat(text_total_detalle.getText()));
            JOptionPane.showMessageDialog(null, "Detalle " + msj + " Exitosamente.", "Extio", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al " + msj + " Detalle.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        detalle_cancelar.doClick();
    }//GEN-LAST:event_detalle_aceptarActionPerformed

    private void detalle_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalle_cancelarActionPerformed
        panel_edit_add_detalle.setVisible(false);
        combo_facturas_detalle.setSelectedIndex(-1);
        combo_productos_detalle.setSelectedIndex(-1);
        combo_cantidad.setSelectedIndex(-1);
        text_total_detalle.setText(null);
    }//GEN-LAST:event_detalle_cancelarActionPerformed

    private void combo_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_cantidadActionPerformed
        // TODO add your handling code here:

        //text_total_detalle.setText((combo_cantidad.getSelectedIndex()+1)*);
    }//GEN-LAST:event_combo_cantidadActionPerformed

    public boolean validaPanelCliente() {
        return text_nombre_cliente.getText().isEmpty()
                || combo_vendedor.getSelectedIndex() == -1;
    }

    public boolean validaPanelVendedor() {
        return text_nombre_vendedor.getText().isEmpty();
    }

    public boolean validaPanelFactura() {
        return combo_tipo_factura.getSelectedIndex() == -1 || combo_cliente_factura.getSelectedIndex() == -1;
    }

    public boolean validaPanelProducto() {
        return text_nombre_producto.getText().isEmpty() || text_precio_producto.getText().isEmpty();
    }

    private void cargaCombo(javax.swing.JComboBox x, Object[][] o) {
        Object[] mod = new Object[o.length];
        if (x != combo_facturas_detalle && x != combo_cons_fact) {
            for (int i = 0; i < o.length; i++) {
                mod[i] = ("" + o[i][0] + " " + o[i][1]);
            }
            x.setModel(new DefaultComboBoxModel(mod));
        } else {
            for (int i = 0; i < o.length; i++) {
                mod[i] = ("" + o[i][0]);
            }
            x.setModel(new DefaultComboBoxModel(mod));
        }
    }
    
    private void cargaComboFac(javax.swing.JComboBox x, Object[][] o) {
        Object[] mod = new Object[o.length];
            for (int i = 0; i < o.length; i++) {
                mod[i] = ("" + o[i][0]);
            }
            x.setModel(new DefaultComboBoxModel(mod));
        
    }

    private void cargaTabla(String[] cn, Object[][] o) {
        String[] col_name = cn;
        if (o != null) {
            Consultas c = new Consultas();
            c.getTabla_consultas().setModel(new DefaultTableModel(o, col_name));
        }
    }

    public boolean isConnected() {
        if (ch != null) {
            return true;
        } else {
            int result = JOptionPane.showConfirmDialog(null, panel_conectar1,
                    "Conectar", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                combo_server.setSelectedIndex(cs.getSelectedIndex());
                text_usuario.setText(tu.getText());
                pass_usuario.setText(pu.getText());
                btn_conectar.doClick();
            } else {
                JOptionPane.showMessageDialog(this, "No se ha conectado debe loguearse para realizar esta opercaion.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cli_agregar;
    private javax.swing.JButton btn_cli_borrar;
    private javax.swing.JButton btn_cli_consulta;
    private javax.swing.JButton btn_cli_modificar;
    private javax.swing.JButton btn_conectar;
    private javax.swing.JButton btn_det_agregar;
    private javax.swing.JButton btn_det_borrar;
    private javax.swing.JButton btn_det_consulta;
    private javax.swing.JButton btn_det_modificar;
    private javax.swing.JButton btn_fac_agregar;
    private javax.swing.JButton btn_fac_borrar;
    private javax.swing.JButton btn_fac_consulta;
    private javax.swing.JButton btn_fac_modificar;
    private javax.swing.JButton btn_pro_agregar;
    private javax.swing.JButton btn_pro_borrar;
    private javax.swing.JButton btn_pro_consulta;
    private javax.swing.JButton btn_pro_modificar;
    private javax.swing.JButton btn_ven_agregar;
    private javax.swing.JButton btn_ven_borrar;
    private javax.swing.JButton btn_ven_consulta;
    private javax.swing.JButton btn_ven_modificar;
    private javax.swing.JButton cliente_aceptar;
    private javax.swing.JButton cliente_cancelar;
    private javax.swing.JComboBox combo_cantidad;
    private javax.swing.JComboBox combo_cliente_factura;
    private javax.swing.JComboBox combo_codigo;
    private javax.swing.JComboBox combo_cons_fact;
    private javax.swing.JComboBox combo_cons_prod;
    private javax.swing.JComboBox combo_facturas_detalle;
    private javax.swing.JComboBox combo_productos_detalle;
    private javax.swing.JComboBox combo_server;
    private javax.swing.JComboBox combo_tipo_factura;
    private javax.swing.JComboBox combo_vendedor;
    private javax.swing.JComboBox cs;
    private javax.swing.JButton detalle_aceptar;
    private javax.swing.JButton detalle_cancelar;
    private javax.swing.JButton factura_aceptar;
    private javax.swing.JButton factura_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_Clientes;
    private javax.swing.JPanel panel_Detalles;
    private javax.swing.JPanel panel_Facturas;
    private javax.swing.JPanel panel_Productos;
    private javax.swing.JPanel panel_Vendedores;
    private javax.swing.JPanel panel_codigo;
    private javax.swing.JPanel panel_conectar;
    private javax.swing.JPanel panel_conectar1;
    private javax.swing.JPanel panel_cons_det;
    private javax.swing.JPanel panel_edit_add_cliente;
    private javax.swing.JPanel panel_edit_add_detalle;
    private javax.swing.JPanel panel_edit_add_factura;
    private javax.swing.JPanel panel_edit_add_productos;
    private javax.swing.JPanel panel_edit_add_vendedor;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPasswordField pass_usuario;
    private javax.swing.JButton producto_aceptar;
    private javax.swing.JButton producto_cancelar;
    private javax.swing.JPasswordField pu;
    private javax.swing.JTextField text_nombre_cliente;
    private javax.swing.JTextField text_nombre_producto;
    private javax.swing.JTextField text_nombre_vendedor;
    private javax.swing.JFormattedTextField text_precio_producto;
    private javax.swing.JTextField text_total;
    private javax.swing.JTextPane text_total_detalle;
    private javax.swing.JTextField text_total_vendido;
    private javax.swing.JTextField text_usuario;
    private javax.swing.JButton todo_cliente;
    private javax.swing.JButton todo_detalles;
    private javax.swing.JButton todo_factura;
    private javax.swing.JButton todo_producto;
    private javax.swing.JButton todo_vendedor;
    private javax.swing.JTextField tu;
    private javax.swing.JButton vendedor_aceptar;
    private javax.swing.JButton vendedor_cancelar;
    // End of variables declaration//GEN-END:variables
}
