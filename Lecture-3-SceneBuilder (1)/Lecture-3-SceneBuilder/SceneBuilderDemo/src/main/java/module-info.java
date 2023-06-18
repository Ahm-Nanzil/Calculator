module scenebuilder.scenebuilderdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens scenebuilder.scenebuilderdemo to javafx.fxml;
    exports scenebuilder.scenebuilderdemo;

    opens SceneBuilderBasics to javafx.fxml;
    exports SceneBuilderBasics;

    opens Layouts to javafx.fxml;
    exports Layouts;
}