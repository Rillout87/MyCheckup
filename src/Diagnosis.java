public enum Diagnosis {
    POISONING("Уголь"), //отравление
    FEVER("Аспирин"), // лихорадка
    MAIM("Зеленка"); // травма, порез

    private String drug;

    Diagnosis (String pill){
        this.drug = pill;
    }

    public String getDrug() {
        return drug;
    }
}
