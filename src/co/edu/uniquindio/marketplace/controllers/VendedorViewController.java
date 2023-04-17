package co.edu.uniquindio.marketplace.controllers;

import co.edu.uniquindio.marketplace.MainApp;
import co.edu.uniquindio.marketplace.model.Categoria;
import co.edu.uniquindio.marketplace.model.Estado;
import co.edu.uniquindio.marketplace.model.Producto;
import co.edu.uniquindio.marketplace.model.Vendedor;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class VendedorViewController {

    ModelFactoryController modelFactoryController;
    @FXML
    private Button btnCrear;
    @FXML
    private Button btnCrear1;

    @FXML
    private TableColumn<Producto, Categoria> columCategoria;

    @FXML
    private TableColumn<Producto, Estado> columEstado;

    @FXML
    private TableColumn<Producto,String> columNombre;

    @FXML
    private TableColumn<Producto, String> columPrecio;

    @FXML
    private Pane imagenVendedor;

    @FXML
    private TableView<Producto> tblListaProductos;
    @FXML
    private TableColumn<Producto, Categoria> columCategoria1;

    @FXML
    private TableColumn<Producto, Estado> columEstado1;

    @FXML
    private TableColumn<Producto,String> columNombre1;

    @FXML
    private TableColumn<Producto, String> columPrecio1;

    @FXML
    private Pane imagenVendedor1;

    @FXML
    private TableView<Producto> tblListaProductos1;
    @FXML
    private LoginViewController loginViewController;

//    @FXML
//    void OnTab0() {
//
//        modelFactoryController = ModelFactoryController.getInstance();
//
//            //inicializar datos en el tabla
//            llenarTabla(modelFactoryController.getMarketplace().getVendedores().get(0).getProductos());
//            this.columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
//            this.columPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
//            this.columCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
//            this.columEstado.setCellValueFactory(new PropertyValueFactory<>("estado" ));
//            tblListaProductos.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> {
//                    try {
//                        abrirVentanaInfo((Producto) newValue);
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
//
//        }


    @FXML
    void OnTab10(ActionEvent event) {

    }

    @FXML
    void OnTab5(ActionEvent event) {

    }

    @FXML
    void OnTab6(ActionEvent event) {

    }

    @FXML
    void OnTab7(ActionEvent event) {

    }

    @FXML
    void OnTab8(ActionEvent event) {

    }

    @FXML
    void OnTab9(ActionEvent event) {

    }

    @FXML
    void Ontab3(ActionEvent event) {

    }

    @FXML
    void Ontab4(ActionEvent event) {

    }


//    @FXML
//    void OnTab2() {
//        //inicializar datos en el tabla
//        llenarTabla(modelFactoryController.getMarketplace().getVendedores().get(1).getProductos());
//        this.columNombre1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
//        this.columPrecio1.setCellValueFactory(new PropertyValueFactory<>("precio"));
//        this.columCategoria1.setCellValueFactory(new PropertyValueFactory<>("categoria"));
//        this.columEstado1.setCellValueFactory(new PropertyValueFactory<>("estado" ));
//        tblListaProductos.getSelectionModel().selectedItemProperty()
//                .addListener((observable, oldValue, newValue) -> {
//                    try {
//                        abrirVentanaInfo((Producto) newValue);
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                });
//
//    }

        @FXML
    void initialize() {

        modelFactoryController = ModelFactoryController.getInstance();

            //inicializar datos en el tabla
            llenarTabla(modelFactoryController.getMarketplace().getVendedores().get(0).getProductos());
            this.columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            this.columPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
            this.columCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
            this.columEstado.setCellValueFactory(new PropertyValueFactory<>("estado" ));
            tblListaProductos.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> {
                    try {
                        abrirVentanaInfo((Producto) newValue);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            llenarTabla(modelFactoryController.getMarketplace().getVendedores().get(1).getProductos());
            this.columNombre1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            this.columPrecio1.setCellValueFactory(new PropertyValueFactory<>("precio"));
            this.columCategoria1.setCellValueFactory(new PropertyValueFactory<>("categoria"));
            this.columEstado1.setCellValueFactory(new PropertyValueFactory<>("estado" ));
            tblListaProductos1.getSelectionModel().selectedItemProperty()
                    .addListener((observable, oldValue, newValue) -> {
                        try {
                            abrirVentanaInfo((Producto) newValue);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });


        }

    @FXML
    void OnCrearProducto(ActionEvent event)throws IOException {

                FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/co/edu/uniquindio/marketplace/views/Crear-producto.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 350);
                Stage stage = new Stage();
                stage.setTitle("CREAR PRODUCTO");
                stage.setScene(scene);
                stage.show();
    }
    @FXML
    private void llenarTabla(List<Producto> productos) {
        tblListaProductos.setItems(FXCollections.observableArrayList(productos));
        tblListaProductos.refresh();
    }
    @FXML
    private void abrirVentanaInfo(Producto producto) throws IOException {

        if (producto != null) {

            FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/co/edu/uniquindio/marketplace/views/Producto-info.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 350);
            Stage stage = new Stage();
            stage.setTitle("INFORMARCION PRODUCTO");
            stage.setScene(scene);
            stage.show();
        }
    }


}

