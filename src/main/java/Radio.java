public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int MaxStation;
    private int MaxVolume;

    public Radio() {
        this.MaxStation = 9;
        this.MaxVolume = 100;
    }

    public Radio(int stationsCount) {
        this.MaxStation = stationsCount - 1;
    }

    public void next() {
        if (currentStation != MaxStation) {
            currentStation++; // 2 пункт про станции
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--; // 3 пункт про странции
        } else {
            currentStation = MaxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > MaxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > MaxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plus() {
        if (currentVolume != MaxVolume) {
            currentVolume++; // 2 пункт про громкость
        } else {
            currentVolume = MaxVolume;
        }
    }

    public void minus() {
        if (currentVolume != 0) {
            currentVolume--; // 3 пункт про громкость
        } else {
            currentVolume = 0;
        }
    }

}
