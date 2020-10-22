public class Cell extends Helper6 {
    private String namaCell, key;
    private boolean isOpen;

    Cell(String namaCell, String key) {
        this.namaCell = namaCell;
        this.key = key;
        isOpen = false;
    }

    public String getNamaCell() {
        return namaCell;
    }

    public void setNamaCell(String namaCell) {
        this.namaCell = namaCell;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getKey() {
        return key;
    }

    public void openDoor(String key) {
        if (key.equals(getKey())) {
            if (isOpen() == true) {
                setOpen(false);
            }
            else {
                setOpen(true);
            }
        }
        else {
            println("Tdk punya akses");
        }
    }
}
