class Currency {

        private int id;
        private String code;
        private String nameShort;
        private String nameFull;

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public int getId() {
            return id;
        }

        public String getCode() {
            return code;
        }

        @Override
        public String toString() {
            return id + " " + code;
        }
    }
