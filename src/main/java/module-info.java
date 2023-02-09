module dev.achilles.passwordgenfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.datatransfer;
    requires java.desktop;

    opens dev.achilles.passwordgenfx to javafx.fxml;
    exports dev.achilles.passwordgenfx;
}