package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Album;

public class InventoryController {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TextField albumNameField, artistField, totalField, availableField;

    @FXML
    private TableColumn<Album, String> albumNameColumn, artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn, availableColumn, rentedColumn;

    private final ObservableList<Album> albums = FXCollections.observableArrayList();

    public void initialize() {
        albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        tableView.setItems(albums);
    }

    public void handleAdd() {
        try {
            String albumName = albumNameField.getText();
            String artist = artistField.getText();
            int available = Integer.parseInt(availableField.getText());
            int total = Integer.parseInt(totalField.getText());

            albums.add(new Album(albumName, artist, total, available, 0));

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Album \"" + albumName + "\" berhasil ditambahkan!");
            alert.showAndWait();

            clearFields();
        } catch (Exception e) {
            showError("Silahkan Cek data yang anda masukkan");
        }
    }

    public void handleDelete() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albums.remove(selectedAlbum);
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Album berhasil dihapus!");
            alert.showAndWait();
        } else {
            showError("Pilih album untuk dihapus!");
        }
    }

    public void handleUpdate() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();

                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Album berhasil diupdate!");
                alert.showAndWait();
            } catch (Exception e) {
                showError("Data tidak valid!");
            }
        } else {
            showError("Pilih album untuk diupdate!");
        }
    }

    public void handleRent() {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            tableView.refresh();

            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Album berhasil disewa!");
            alert.showAndWait();
        } else {
            showError("Album tidak tersedia!");
        }
    }

    private void clearFields() {
        albumNameField.clear();
        artistField.clear();
        totalField.clear();
        availableField.clear();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }
}
