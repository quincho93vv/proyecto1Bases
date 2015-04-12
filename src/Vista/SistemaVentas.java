package Vista;

import Modelo.Cliente;
import Modelo.ConnectionHandler;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SistemaVentas extends javax.swing.JFrame {
    
    String[] headClientes = {"Codigo", "Nombre", "Vendedor"};
    String[] headVendedores = {"Codigo", "Nombre", "Total vendido"};
    String[] headFacturas = {"Codigo" ,"Cliente", "Tipo","Fecha","Total"};
    String[] headProductos = {"Codigo", "Nombre", "Precio"};
    ConnectionHandler ch;
    Cliente cliente;
    
    public SistemaVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_server = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass_usuario = new javax.swing.JPasswordField();
        text_usuario = new javax.swing.JTextField();
        btn_conectar = new javax.swing.JButton();
        panel_Clientes = new javax.swing.JPanel();
        panel_edit_add_cliente = new javax.swing.JPanel();
        cliente_aceptar = new javax.swing.JButton();
        cliente_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_nombre_cliente = new javax.swing.JTextField();
        text_vendedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        text_codigo = new javax.swing.JTextField();
        btn_cli_agregar = new javax.swing.JButton();
        btn_cli_modificar = new javax.swing.JButton();
        btn_cli_borrar = new javax.swing.JButton();
        btn_cli_consulta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        panel_Vendedores = new javax.swing.JPanel();
        panel_edit_add_vendedor = new javax.swing.JPanel();
        vendedor_aceptar = new javax.swing.JButton();
        vendedor_cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        text_nombre_vendedor = new javax.swing.JTextField();
        btn_ven_agregar = new javax.swing.JButton();
        btn_ven_modificar = new javax.swing.JButton();
        btn_ven_borrar = new javax.swing.JButton();
        btn_ven_consulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Vendedores = new javax.swing.JTable();
        panel_Productos = new javax.swing.JPanel();
        panel_edit_add_productos = new javax.swing.JPanel();
        cliente_aceptar2 = new javax.swing.JButton();
        cliente_cancelar2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text_nombre_producto = new javax.swing.JTextField();
        campo_precio_producto = new javax.swing.JFormattedTextField();
        btn_pro_agregar = new javax.swing.JButton();
        btn_pro_modificar = new javax.swing.JButton();
        btn_pro_borrar = new javax.swing.JButton();
        btn_pro_consulta = new javax.swing.JButton();
        JScrollPane11 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        panel_Facturas = new javax.swing.JPanel();
        panel_add_edit_factura = new javax.swing.JPanel();
        cliente_aceptar3 = new javax.swing.JButton();
        cliente_cancelar3 = new javax.swing.JButton();
        combo_cliente_factura = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combo_tipo_factura = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btn_fac_agregar = new javax.swing.JButton();
        btn_fac_modificar = new javax.swing.JButton();
        btn_fac_borrar = new javax.swing.JButton();
        btn_fac_consulta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_facturas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto 1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setText("Conexión:");

        combo_server.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oracle", "Postgres" }));
        combo_server.setSelectedIndex(-1);

        jLabel3.setText("Usuario:");

        jLabel4.setText("Password:");

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

        btn_conectar.setText("Conectar");
        btn_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_server, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_conectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addComponent(btn_conectar)
                .addContainerGap(251, Short.MAX_VALUE))
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

        jLabel13.setText("Codigo:");

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
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel_edit_add_clienteLayout.setVerticalGroup(
            panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_clienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(text_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(text_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_edit_add_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_aceptar)
                    .addComponent(cliente_cancelar))
                .addContainerGap(24, Short.MAX_VALUE))
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

        btn_cli_consulta.setText("Consultar Clientes");
        btn_cli_consulta.setPreferredSize(new java.awt.Dimension(139, 23));
        btn_cli_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cli_consultaActionPerformed(evt);
            }
        });

        jScrollPane2.setVisible(false);
        tabla_clientes.setVisible(false);

        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            headClientes
        ));
        jScrollPane2.setViewportView(tabla_clientes);

        javax.swing.GroupLayout panel_ClientesLayout = new javax.swing.GroupLayout(panel_Clientes);
        panel_Clientes.setLayout(panel_ClientesLayout);
        panel_ClientesLayout.setHorizontalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_cli_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cli_agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cli_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_cli_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_edit_add_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        panel_ClientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cli_agregar, btn_cli_borrar, btn_cli_consulta, btn_cli_modificar});

        panel_ClientesLayout.setVerticalGroup(
            panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClientesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_edit_add_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_ClientesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btn_cli_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cli_borrar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panel_edit_add_vendedorLayout = new javax.swing.GroupLayout(panel_edit_add_vendedor);
        panel_edit_add_vendedor.setLayout(panel_edit_add_vendedorLayout);
        panel_edit_add_vendedorLayout.setHorizontalGroup(
            panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_edit_add_vendedorLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(vendedor_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendedor_cancelar)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(panel_edit_add_vendedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(text_nombre_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_edit_add_vendedorLayout.setVerticalGroup(
            panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_vendedorLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(text_nombre_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_edit_add_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendedor_aceptar)
                    .addComponent(vendedor_cancelar))
                .addGap(41, 41, 41))
        );

        btn_ven_agregar.setText("Agregar Vendedor");

        btn_ven_modificar.setText("Modificar Vendedor");

        btn_ven_borrar.setText("Eliminar Vendedor");

        btn_ven_consulta.setText("Consultar Vendedores");

        jScrollPane1.setVisible(false);
        tabla_Vendedores.setVisible(false);

        tabla_Vendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            headVendedores
        ));
        jScrollPane1.setViewportView(tabla_Vendedores);

        javax.swing.GroupLayout panel_VendedoresLayout = new javax.swing.GroupLayout(panel_Vendedores);
        panel_Vendedores.setLayout(panel_VendedoresLayout);
        panel_VendedoresLayout.setHorizontalGroup(
            panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendedoresLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_ven_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ven_agregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ven_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_ven_consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_edit_add_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addGroup(panel_VendedoresLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        panel_VendedoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_ven_agregar, btn_ven_borrar, btn_ven_consulta, btn_ven_modificar});

        panel_VendedoresLayout.setVerticalGroup(
            panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendedoresLayout.createSequentialGroup()
                .addGroup(panel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_VendedoresLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(panel_edit_add_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_VendedoresLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btn_ven_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_consulta)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ven_borrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        panel_VendedoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_ven_agregar, btn_ven_borrar, btn_ven_consulta, btn_ven_modificar});

        jTabbedPane1.addTab("Vendedores", panel_Vendedores);

        panel_edit_add_productos.setVisible(false);

        cliente_aceptar2.setText("Agregar");
        cliente_aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_aceptar2ActionPerformed(evt);
            }
        });

        cliente_cancelar2.setText("Cancelar");
        cliente_cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_cancelar2ActionPerformed(evt);
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
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_edit_add_productosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cliente_aceptar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente_cancelar2)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(panel_edit_add_productosLayout.createSequentialGroup()
                        .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_precio_producto)
                            .addComponent(text_nombre_producto))
                        .addContainerGap())))
        );
        panel_edit_add_productosLayout.setVerticalGroup(
            panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_edit_add_productosLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(text_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campo_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel_edit_add_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_aceptar2)
                    .addComponent(cliente_cancelar2))
                .addGap(41, 41, 41))
        );

        btn_pro_agregar.setText("Agregar Producto");

        btn_pro_modificar.setText("Modificar Producto");
        btn_pro_modificar.setPreferredSize(new java.awt.Dimension(139, 23));

        btn_pro_borrar.setText("Eliminar Producto");

        btn_pro_consulta.setText("Consultar Productos");
        btn_pro_consulta.setPreferredSize(new java.awt.Dimension(139, 23));

        JScrollPane11.setVisible(false);
        tabla_productos.setVisible(false);

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            headProductos
        ));
        JScrollPane11.setViewportView(tabla_productos);

        javax.swing.GroupLayout panel_ProductosLayout = new javax.swing.GroupLayout(panel_Productos);
        panel_Productos.setLayout(panel_ProductosLayout);
        panel_ProductosLayout.setHorizontalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProductosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_pro_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_pro_consulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_pro_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pro_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162)
                .addComponent(panel_edit_add_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        panel_ProductosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_pro_agregar, btn_pro_borrar, btn_pro_consulta, btn_pro_modificar});

        panel_ProductosLayout.setVerticalGroup(
            panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProductosLayout.createSequentialGroup()
                .addGroup(panel_ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ProductosLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btn_pro_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pro_borrar))
                    .addGroup(panel_ProductosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panel_edit_add_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        panel_ProductosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_pro_agregar, btn_pro_borrar, btn_pro_consulta, btn_pro_modificar});

        jTabbedPane1.addTab("Productos", panel_Productos);

        panel_add_edit_factura.setVisible(false);

        cliente_aceptar3.setText("Agregar");
        cliente_aceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_aceptar3ActionPerformed(evt);
            }
        });

        cliente_cancelar3.setText("Cancelar");
        cliente_cancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliente_cancelar3ActionPerformed(evt);
            }
        });

        combo_cliente_factura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Cliente");

        jLabel12.setText("Tipo Factura");

        combo_tipo_factura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contado", "Credito" }));
        combo_tipo_factura.setSelectedIndex(-1);

        jLabel7.setText("Total");

        javax.swing.GroupLayout panel_add_edit_facturaLayout = new javax.swing.GroupLayout(panel_add_edit_factura);
        panel_add_edit_factura.setLayout(panel_add_edit_facturaLayout);
        panel_add_edit_facturaLayout.setHorizontalGroup(
            panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_add_edit_facturaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_add_edit_facturaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_edit_facturaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cliente_aceptar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliente_cancelar3)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_edit_facturaLayout.createSequentialGroup()
                        .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_tipo_factura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo_cliente_factura, 0, 179, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_add_edit_facturaLayout.setVerticalGroup(
            panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_add_edit_facturaLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(combo_tipo_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_cliente_factura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(panel_add_edit_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente_aceptar3)
                    .addComponent(cliente_cancelar3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_fac_agregar.setText("Agregar Facturas");

        btn_fac_modificar.setText("Modificar Facturas");

        btn_fac_borrar.setText("Eliminar Facturas");

        btn_fac_consulta.setText("Consultar Facturas");
        btn_fac_consulta.setPreferredSize(new java.awt.Dimension(139, 23));

        jScrollPane3.setVisible(false);
        tabla_facturas.setVisible(false);

        tabla_facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            headFacturas
        ));
        jScrollPane3.setViewportView(tabla_facturas);

        javax.swing.GroupLayout panel_FacturasLayout = new javax.swing.GroupLayout(panel_Facturas);
        panel_Facturas.setLayout(panel_FacturasLayout);
        panel_FacturasLayout.setHorizontalGroup(
            panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FacturasLayout.createSequentialGroup()
                .addGroup(panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_fac_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_fac_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_fac_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_fac_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170)
                        .addComponent(panel_add_edit_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        panel_FacturasLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_fac_agregar, btn_fac_borrar, btn_fac_consulta, btn_fac_modificar});

        panel_FacturasLayout.setVerticalGroup(
            panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FacturasLayout.createSequentialGroup()
                .addGroup(panel_FacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btn_fac_agregar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_fac_borrar))
                    .addGroup(panel_FacturasLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panel_add_edit_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        panel_FacturasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_fac_agregar, btn_fac_borrar, btn_fac_consulta, btn_fac_modificar});

        jTabbedPane1.addTab("Facturas", panel_Facturas);

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
        text_codigo.setText(null);
        text_nombre_cliente.setText(null);
        text_vendedor.setText(null);
    }//GEN-LAST:event_cliente_cancelarActionPerformed

    private void cliente_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_aceptarActionPerformed
        try {
            cliente.insertCliente(Integer.parseInt(text_codigo.getText()),text_nombre_cliente.getText(),Integer.parseInt(text_vendedor.getText()));
            JOptionPane.showMessageDialog(null, "Cliente Agregado Exitosamente.", "Extio",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Cliente.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cliente_aceptarActionPerformed

    private void vendedor_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedor_aceptarActionPerformed

    private void vendedor_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedor_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedor_cancelarActionPerformed

    private void cliente_aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_aceptar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliente_aceptar2ActionPerformed

    private void cliente_cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_cancelar2ActionPerformed

    }//GEN-LAST:event_cliente_cancelar2ActionPerformed

    private void cliente_aceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_aceptar3ActionPerformed

    }//GEN-LAST:event_cliente_aceptar3ActionPerformed

    private void cliente_cancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliente_cancelar3ActionPerformed

    }//GEN-LAST:event_cliente_cancelar3ActionPerformed

    private void pass_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_usuarioActionPerformed

    }//GEN-LAST:event_pass_usuarioActionPerformed

    private void text_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usuarioActionPerformed

    }//GEN-LAST:event_text_usuarioActionPerformed

    private void btn_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectarActionPerformed
       try {
        String pass = new String(pass_usuario.getPassword());
        ch = new ConnectionHandler(combo_server.getSelectedIndex(), text_usuario.getText(), pass);
        cliente = new Cliente(ch.getConnection());
        JOptionPane.showMessageDialog(null, "Conexión Exitosa.", "Extio",JOptionPane.INFORMATION_MESSAGE);
       } catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error al Conectar.","Error",JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_btn_conectarActionPerformed

    private void btn_cli_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_agregarActionPerformed
        panel_edit_add_cliente.setVisible(true);
    }//GEN-LAST:event_btn_cli_agregarActionPerformed

    private void btn_cli_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_consultaActionPerformed
        panel_edit_add_cliente.setVisible(false);
        try {
            String codigoCliente = JOptionPane.showInputDialog(this, "Ingrese el codigo del cliente a consultar: \n", "Consultar Cliente", JOptionPane.QUESTION_MESSAGE);
            Object [] r = cliente.selectCliente(Integer.parseInt(codigoCliente));
            String cod = String.valueOf(r[0]);
            String nom = (String)r[1];
            String ven = String.valueOf(r[2]);
            JOptionPane.showMessageDialog(null, "Cliente: \n\nNombre : "+ nom +"\nCodigo : "+cod+"\nVendeor : "+ ven , "Cliente "+ cod,JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Consultar Cliente.","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cli_consultaActionPerformed

    private void btn_cli_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_modificarActionPerformed
        panel_edit_add_cliente.setVisible(true);
        try {
            String codigoCliente = JOptionPane.showInputDialog(this, "Ingrese el codigo del cliente a modificar: \n", "Modificar Cliente", JOptionPane.QUESTION_MESSAGE);
            Object [] r = cliente.selectCliente(Integer.parseInt(codigoCliente));
            text_codigo.setText(String.valueOf(r[0]));
            text_nombre_cliente.setText((String)r[1]);
            text_vendedor.setText(String.valueOf(r[2]));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Modificar Cliente.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cli_modificarActionPerformed

    private void btn_cli_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cli_borrarActionPerformed
        panel_edit_add_cliente.setVisible(false);
        try{
            String codigoCliente = JOptionPane.showInputDialog(this, "Ingrese el codigo del cliente a eliminar: \n", "Eliminar Cliente", JOptionPane.QUESTION_MESSAGE);
            cliente.deleteCliente(Integer.parseInt(codigoCliente));
            JOptionPane.showMessageDialog(null, "Cliente eliminado Correctamento.", "Extio",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Eliminar Cliente.","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cli_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane11;
    private javax.swing.JButton btn_cli_agregar;
    private javax.swing.JButton btn_cli_borrar;
    private javax.swing.JButton btn_cli_consulta;
    private javax.swing.JButton btn_cli_modificar;
    private javax.swing.JButton btn_conectar;
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
    private javax.swing.JFormattedTextField campo_precio_producto;
    private javax.swing.JButton cliente_aceptar;
    private javax.swing.JButton cliente_aceptar2;
    private javax.swing.JButton cliente_aceptar3;
    private javax.swing.JButton cliente_cancelar;
    private javax.swing.JButton cliente_cancelar2;
    private javax.swing.JButton cliente_cancelar3;
    private javax.swing.JComboBox combo_cliente_factura;
    private javax.swing.JComboBox combo_server;
    private javax.swing.JComboBox combo_tipo_factura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_Clientes;
    private javax.swing.JPanel panel_Facturas;
    private javax.swing.JPanel panel_Productos;
    private javax.swing.JPanel panel_Vendedores;
    private javax.swing.JPanel panel_add_edit_factura;
    private javax.swing.JPanel panel_edit_add_cliente;
    private javax.swing.JPanel panel_edit_add_productos;
    private javax.swing.JPanel panel_edit_add_vendedor;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPasswordField pass_usuario;
    private javax.swing.JTable tabla_Vendedores;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTable tabla_facturas;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField text_codigo;
    private javax.swing.JTextField text_nombre_cliente;
    private javax.swing.JTextField text_nombre_producto;
    private javax.swing.JTextField text_nombre_vendedor;
    private javax.swing.JTextField text_usuario;
    private javax.swing.JTextField text_vendedor;
    private javax.swing.JButton vendedor_aceptar;
    private javax.swing.JButton vendedor_cancelar;
    // End of variables declaration//GEN-END:variables
}
