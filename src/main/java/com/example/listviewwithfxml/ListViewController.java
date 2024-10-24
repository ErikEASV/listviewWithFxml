package com.example.listviewwithfxml;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListViewController {

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField newItemField;

    // Add a new item to the ListView when the Add button is clicked
    @FXML
    private void handleAddItem() {
        String newItem = newItemField.getText();
        if (!newItem.isEmpty()) {
            listView.getItems().add(newItem);
            newItemField.clear(); // Clear the text field after adding
        }
    }

    // Remove the selected item from the ListView when the Remove button is clicked
    @FXML
    private void handleRemoveItem() {
        String selectedItem = listView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            listView.getItems().remove(selectedItem);
        }
    }
}
