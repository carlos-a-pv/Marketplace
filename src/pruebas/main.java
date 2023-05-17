
        import javafx.application.Application;
        import javafx.stage.FileChooser;
        import javafx.stage.Stage;

        import java.io.File;

        public class main extends Application {

        @Override
        public void start(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();

        // Establece el título de la ventana del explorador de archivos
        fileChooser.setTitle("Seleccionar archivo");

        // Establece el directorio inicial del explorador de archivos
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

        // Agrega filtros de extensión de archivo si es necesario
        // fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos de texto", "*.txt"));

        // Muestra el cuadro de diálogo del explorador de archivos
        File selectedFile = fileChooser.showOpenDialog(primaryStage);

        if (selectedFile != null) {
        // Realiza acciones con el archivo seleccionado
        System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
        }
        }

        public static void main(String[] args) {
        launch(args);
        }
        }